package ru.ok.tensorflow.ssd.anchor;

/* loaded from: classes9.dex */
public class Anchor {
    public final float centerX;
    public final float centerY;
    public final float height;
    public final float width;

    public Anchor(float f, float f2, float f3, float f4) {
        this.centerY = f;
        this.centerX = f2;
        this.height = f3;
        this.width = f4;
    }
}
