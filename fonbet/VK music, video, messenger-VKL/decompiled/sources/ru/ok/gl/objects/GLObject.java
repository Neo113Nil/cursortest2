package ru.ok.gl.objects;

import android.opengl.GLES20;

/* loaded from: classes9.dex */
public class GLObject implements GLObjectInterface {
    private final GLObjectInterface impl;

    public GLObject(float[] fArr, int i, float[] fArr2, int i2, int i3, int i4, int i5) {
        String glGetString = GLES20.glGetString(7938);
        this.impl = (glGetString == null || !glGetString.contains("3.")) ? new GL2ObjectImpl(fArr, i, fArr2, i2, i3, i4, i5) : new GL3ObjectImpl(fArr, i, fArr2, i2, i3, i4, i5);
    }

    @Override // ru.ok.gl.objects.GLObjectInterface
    public void draw() {
        this.impl.draw();
    }

    @Override // ru.ok.gl.objects.GLObjectInterface
    public void release() {
        this.impl.release();
    }

    @Override // ru.ok.gl.objects.GLObjectInterface
    public void updateTexArray(float[] fArr) {
        this.impl.updateTexArray(fArr);
    }

    @Override // ru.ok.gl.objects.GLObjectInterface
    public void updateVertexArray(float[] fArr) {
        this.impl.updateVertexArray(fArr);
    }
}
