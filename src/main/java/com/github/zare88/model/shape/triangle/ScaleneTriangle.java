package com.github.zare88.model.shape.triangle;

import com.github.zare88.model.shape.Triangle;

public class ScaleneTriangle extends Triangle {
    public ScaleneTriangle(int x, int y, int z) {
        super(x, y, z);
    }

    @Override
    public String name() {
        return "Scalene Triangle";
    }
}
