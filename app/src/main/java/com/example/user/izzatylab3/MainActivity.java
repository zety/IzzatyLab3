package com.example.user.izzatylab3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.view.View;
import android.widget.GridView;

import static com.example.user.izzatylab3.R.id.parent;
import static com.example.user.izzatylab3.R.styleable.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = (GridView) findViewById(R.id.gridView);
        gridView.setAdapter(new ImageAdapter(this));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

                Intent i = new Intent(getApplicationContext(), FullImageActivity.class);

                i.putExtra("id", position);
                startActivity(i);

            }
        });
    }
}
