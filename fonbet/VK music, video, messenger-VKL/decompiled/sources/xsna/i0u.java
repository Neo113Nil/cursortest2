package xsna;

import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import ru.ok.gl.objects.GLProgram;

/* compiled from: GlGpuImageFilter.java */
/* loaded from: classes12.dex */
public final class i0u extends n2t {
    public final umv i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public float[] p;
    public float[] q;
    public boolean r;

    public i0u(umv umvVar) {
        this.i = umvVar;
        umvVar.i();
    }

    @Override // xsna.n2t
    public final int a() {
        return this.j;
    }

    @Override // xsna.n2t
    public final void b() {
        if (this.r) {
            return;
        }
        e();
    }

    @Override // xsna.n2t
    public final void c() {
        this.r = false;
        GLES20.glDeleteProgram(this.j);
        this.i.release();
    }

    @Override // xsna.n2t
    public final void d(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        GLES20.glUseProgram(this.j);
        if (this.r) {
            this.i.onDraw();
            floatBuffer.position(0);
            GLES20.glVertexAttribPointer(this.k, 2, 5126, false, 0, (Buffer) floatBuffer);
            GLES20.glEnableVertexAttribArray(this.k);
            floatBuffer2.position(0);
            GLES20.glVertexAttribPointer(this.m, 2, 5126, false, 0, (Buffer) floatBuffer2);
            GLES20.glEnableVertexAttribArray(this.m);
            if (i != -1) {
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, i);
                GLES20.glUniform1i(this.l, 0);
            }
            if (this.p == null) {
                float[] fArr = new float[16];
                this.p = fArr;
                Matrix.setIdentityM(fArr, 0);
            }
            if (this.q == null) {
                float[] fArr2 = new float[16];
                this.q = fArr2;
                Matrix.setIdentityM(fArr2, 0);
            }
            GLES20.glUniformMatrix4fv(this.n, 1, false, this.p, 0);
            GLES20.glUniformMatrix4fv(this.o, 1, false, this.q, 0);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.k);
            GLES20.glDisableVertexAttribArray(this.m);
            GLES20.glBindTexture(3553, 0);
        }
    }

    @Override // xsna.n2t
    public final void e() {
        umv umvVar = this.i;
        int e = nap.e(umvVar.p(), umvVar.e(false));
        this.j = e;
        umvVar.l(e);
        this.k = GLES20.glGetAttribLocation(this.j, "aPosition");
        this.l = GLES20.glGetUniformLocation(this.j, GLProgram.FRAGMENT_SHADER_UNI_TEXTURE_SAMPLER);
        this.n = GLES20.glGetUniformLocation(this.j, GLProgram.VERTEX_SHADER_UNI_MVP_MATRIX);
        this.o = GLES20.glGetUniformLocation(this.j, GLProgram.VERTEX_SHADER_UNI_TEXTURE_MATRIX);
        this.m = GLES20.glGetAttribLocation(this.j, GLProgram.VERTEX_SHADER_ATTR_TEXTURE_COORDINATES);
        this.r = true;
        umvVar.init();
    }

    @Override // xsna.n2t
    public final void f(int i, int i2) {
        this.i.a(i, i2);
    }
}
