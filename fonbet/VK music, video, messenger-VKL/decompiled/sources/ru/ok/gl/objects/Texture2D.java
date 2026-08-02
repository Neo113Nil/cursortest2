package ru.ok.gl.objects;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLES30;

/* loaded from: classes9.dex */
public class Texture2D {
    private int format;
    private int height;
    private int[] texIds;
    private int width;

    public Texture2D(int i, int i2, int i3) {
        this(createTexture(i, i2, i3), i, i2, i3);
    }

    private static int createTexture(int i, int i2, int i3) {
        int i4 = GlUtil.createTextures(1)[0];
        if (getShaderFormat(i3).isEmpty()) {
            GLES20.glTexImage2D(3553, 0, i3, i, i2, 0, 6408, 5121, null);
        } else {
            GLES30.glTexStorage2D(3553, 1, i3, i, i2);
        }
        GlUtil.checkGlError("glTexImage2D");
        GLES20.glBindTexture(3553, 0);
        GlUtil.checkGlError("glBindTexture");
        return i4;
    }

    public int getChannelNumber() {
        int i = this.format;
        return (i == 6408 || i == 32856 || i == 34836 || i == 34842) ? 4 : 0;
    }

    public int getFormat() {
        return this.format;
    }

    public int getHeight() {
        return this.height;
    }

    public String getShaderFormat() {
        return getShaderFormat(this.format);
    }

    public int getTextureId() {
        return this.texIds[0];
    }

    public int getWidth() {
        return this.width;
    }

    public Bitmap rasterizeTexture() throws IllegalAccessException {
        throw new IllegalAccessException("You must use this method only in debug.");
    }

    public void release() {
        GLES20.glDeleteTextures(1, this.texIds, 0);
    }

    public Texture2D(int i, int i2, int i3, int i4) {
        this.texIds = new int[]{i};
        this.width = i2;
        this.height = i3;
        this.format = i4;
    }

    public static String getShaderFormat(int i) {
        switch (i) {
            case 32856:
                return "rgba8";
            case 33328:
                return "rg32f";
            case 34836:
                return "rgba32f";
            case 34842:
                return "rgba16f";
            default:
                return "";
        }
    }
}
