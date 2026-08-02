package ru.ok.gl.objects;

import android.opengl.GLES20;
import android.opengl.GLES30;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

/* loaded from: classes9.dex */
public class GL3ObjectImpl implements GLObjectInterface {
    private int drawCount;
    private int drawMode;
    private int texAttrIndex;
    FloatBuffer texBuffer;
    private int vertexAttrIndex;
    FloatBuffer vertexBuffer;
    private int vertexSize;
    private final IntBuffer vao = IntBuffer.allocate(1);
    private final IntBuffer buffers = IntBuffer.allocate(2);

    public GL3ObjectImpl(float[] fArr, int i, float[] fArr2, int i2, int i3, int i4, int i5) {
        this.vertexAttrIndex = i;
        this.texAttrIndex = i2;
        this.vertexSize = i3;
        this.drawMode = i4;
        this.drawCount = i5;
        if (fArr == null || fArr2 == null) {
            return;
        }
        this.vertexBuffer = GlUtil.createFloatBuffer(fArr);
        this.texBuffer = GlUtil.createFloatBuffer(fArr2);
    }

    private void init() {
        GLES30.glGenVertexArrays(1, this.vao);
        GLES20.glGenBuffers(2, this.buffers);
        GLES20.glBindBuffer(34962, this.buffers.get(0));
        GlUtil.checkGlError("glBindBuffer");
        GLES20.glBufferData(34962, this.vertexBuffer.remaining() * 4, this.vertexBuffer, 35044);
        GlUtil.checkGlError("glBufferData");
        GLES20.glBindBuffer(34962, 0);
        GlUtil.checkGlError("glBindBuffer");
        GLES20.glBindBuffer(34962, this.buffers.get(1));
        GlUtil.checkGlError("glBindBuffer");
        GLES20.glBufferData(34962, this.texBuffer.remaining() * 4, this.texBuffer, 35044);
        GlUtil.checkGlError("glBufferData");
        GLES20.glBindBuffer(34962, 0);
        GlUtil.checkGlError("glBindBuffer");
        GLES30.glBindVertexArray(this.vao.get(0));
        GlUtil.checkGlError("glBindVertexArray");
        this.buffers.rewind();
        GLES20.glBindBuffer(34962, this.buffers.get(0));
        GlUtil.checkGlError("glBindBuffer");
        int i = this.vertexAttrIndex;
        int i2 = this.vertexSize;
        GLES20.glVertexAttribPointer(i, i2, 5126, false, i2 * 4, 0);
        GlUtil.checkGlError("glVertexAttribPointer");
        GLES20.glBindBuffer(34962, 0);
        GlUtil.checkGlError("glBindBuffer");
        this.buffers.rewind();
        GLES20.glBindBuffer(34962, this.buffers.get(1));
        GlUtil.checkGlError("glBindBuffer");
        GLES20.glVertexAttribPointer(this.texAttrIndex, 2, 5126, false, 8, 0);
        GlUtil.checkGlError("glVertexAttribPointer");
        GLES20.glBindBuffer(34962, 0);
        GlUtil.checkGlError("glBindBuffer");
        GLES30.glBindVertexArray(0);
        GlUtil.checkGlError("glBindVertexArray");
    }

    @Override // ru.ok.gl.objects.GLObjectInterface
    public void draw() {
        if (this.vao.get(0) == 0) {
            if (this.vertexBuffer == null || this.texBuffer == null) {
                return;
            } else {
                init();
            }
        }
        GLES30.glBindVertexArray(this.vao.get(0));
        GlUtil.checkGlError("glBindVertexArray");
        GLES20.glEnableVertexAttribArray(this.vertexAttrIndex);
        GlUtil.checkGlError("glEnableVertexAttribArray");
        GLES20.glEnableVertexAttribArray(this.texAttrIndex);
        GlUtil.checkGlError("glEnableVertexAttribArray");
        GLES20.glDrawArrays(this.drawMode, 0, this.drawCount);
        GlUtil.checkGlError("glDrawArrays");
        GLES20.glDisableVertexAttribArray(this.vertexAttrIndex);
        GlUtil.checkGlError("glDisableVertexAttribArray");
        GLES20.glDisableVertexAttribArray(this.texAttrIndex);
        GlUtil.checkGlError("glDisableVertexAttribArray");
        GLES30.glBindVertexArray(0);
        GlUtil.checkGlError("glBindVertexArray");
    }

    @Override // ru.ok.gl.objects.GLObjectInterface
    public void release() {
        GLES20.glDeleteBuffers(2, this.buffers);
        GlUtil.checkGlError("glDeleteBuffers");
        GLES30.glDeleteVertexArrays(1, this.vao);
        GlUtil.checkGlError("glDeleteVertexArrays");
    }

    @Override // ru.ok.gl.objects.GLObjectInterface
    public void updateTexArray(float[] fArr) {
        throw new RuntimeException("Not implemented");
    }

    @Override // ru.ok.gl.objects.GLObjectInterface
    public void updateVertexArray(float[] fArr) {
        throw new RuntimeException("Not implemented");
    }
}
