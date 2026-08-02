package ru.ok.gl.util;

import android.graphics.Bitmap;

/* loaded from: classes9.dex */
public class FrameHolder {
    private Bitmap bitmap;
    private int height;
    private int texId;
    private int width;

    public FrameHolder(Bitmap bitmap) {
        this(bitmap, 0, -1, -1);
    }

    public Bitmap getCPUFrame() {
        return this.bitmap;
    }

    public int getGPUFrame() {
        return this.texId;
    }

    public int getHeight() {
        Bitmap bitmap = this.bitmap;
        return bitmap != null ? bitmap.getHeight() : this.height;
    }

    public int getWidth() {
        Bitmap bitmap = this.bitmap;
        return bitmap != null ? bitmap.getWidth() : this.width;
    }

    public boolean hasCPU() {
        return this.bitmap != null;
    }

    public boolean hasGPU() {
        return this.texId != 0;
    }

    public void replaceGPUFrame(int i) {
        this.texId = i;
    }

    public FrameHolder(int i, int i2, int i3) {
        this(null, i, i2, i3);
    }

    public FrameHolder(Bitmap bitmap, int i, int i2, int i3) {
        this.bitmap = bitmap;
        this.texId = i;
        this.width = i2;
        this.height = i3;
        if (bitmap == null || i == 0) {
            return;
        }
        if (bitmap.getWidth() != i2 || bitmap.getHeight() != i3) {
            throw new RuntimeException("CPU and GPU frames have different size.");
        }
    }
}
