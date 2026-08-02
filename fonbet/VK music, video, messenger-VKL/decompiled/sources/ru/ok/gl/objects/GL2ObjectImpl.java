package ru.ok.gl.objects;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* loaded from: classes9.dex */
public class GL2ObjectImpl implements GLObjectInterface {
    private int drawCount;
    private int drawMode;
    private int texAttrIndex;
    private FloatBuffer texBuffer;
    private int vertexAttrIndex;
    private FloatBuffer vertexBuffer;
    private int vertexSize;

    public GL2ObjectImpl(float[] fArr, int i, float[] fArr2, int i2, int i3, int i4, int i5) {
        this.vertexAttrIndex = i;
        this.texAttrIndex = i2;
        this.vertexSize = i3;
        if (fArr != null) {
            this.vertexBuffer = GlUtil.createFloatBuffer(fArr);
        }
        if (fArr2 != null) {
            this.texBuffer = GlUtil.createFloatBuffer(fArr2);
        }
        this.drawMode = i4;
        this.drawCount = i5;
    }

    @Override // ru.ok.gl.objects.GLObjectInterface
    public void draw() {
        if (this.vertexBuffer == null || this.texBuffer == null) {
            return;
        }
        GLES20.glEnableVertexAttribArray(this.vertexAttrIndex);
        GlUtil.checkGlError("glEnableVertexAttribArray");
        GLES20.glEnableVertexAttribArray(this.texAttrIndex);
        GlUtil.checkGlError("glEnableVertexAttribArray");
        int i = this.vertexAttrIndex;
        int i2 = this.vertexSize;
        GLES20.glVertexAttribPointer(i, i2, 5126, false, i2 * 4, (Buffer) this.vertexBuffer);
        GlUtil.checkGlError("glVertexAttribPointer");
        GLES20.glVertexAttribPointer(this.texAttrIndex, 2, 5126, false, 8, (Buffer) this.texBuffer);
        GlUtil.checkGlError("glVertexAttribPointer");
        GLES20.glDrawArrays(this.drawMode, 0, this.drawCount);
        GlUtil.checkGlError("glDrawArrays");
        GLES20.glDisableVertexAttribArray(this.vertexAttrIndex);
        GlUtil.checkGlError("glDisableVertexAttribArray");
        GLES20.glDisableVertexAttribArray(this.texAttrIndex);
        GlUtil.checkGlError("glDisableVertexAttribArray");
    }

    @Override // ru.ok.gl.objects.GLObjectInterface
    public void updateTexArray(float[] fArr) {
        if (fArr != null) {
            this.texBuffer = GlUtil.createFloatBuffer(fArr);
        }
    }

    @Override // ru.ok.gl.objects.GLObjectInterface
    public void updateVertexArray(float[] fArr) {
        if (fArr != null) {
            this.vertexBuffer = GlUtil.createFloatBuffer(fArr);
        }
    }

    @Override // ru.ok.gl.objects.GLObjectInterface
    public void release() {
    }
}
