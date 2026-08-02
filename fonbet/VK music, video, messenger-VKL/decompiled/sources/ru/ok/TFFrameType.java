package ru.ok;

import ru.ok.gl.tf.Tensorflow;

/* loaded from: classes9.dex */
public enum TFFrameType {
    BIG(Tensorflow.FRAME_WIDTH, Tensorflow.FRAME_HEIGHT),
    NORMAL(128, 224),
    SMALL(96, 160),
    SKY(144, 256),
    ORIGINAL(1080, 1920);

    public final int frameHeight;
    public final int frameWidth;

    TFFrameType(int i, int i2) {
        this.frameWidth = i;
        this.frameHeight = i2;
    }
}
