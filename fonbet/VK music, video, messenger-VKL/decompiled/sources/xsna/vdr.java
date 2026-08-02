package xsna;

import android.opengl.GLES20;
import android.util.Size;

/* compiled from: FilterShader.kt */
/* loaded from: classes4.dex */
public final class vdr extends ksj0 {
    public Integer m;
    public float n;
    public final int o;
    public final int p;
    public final int q;

    public vdr(int i, int i2) {
        super(i, i2);
        this.n = 1.0f;
        this.o = GLES20.glGetUniformLocation(this.b, "u_LutTexture");
        this.p = GLES20.glGetUniformLocation(this.b, "u_FilterIntensity");
        this.q = GLES20.glGetUniformLocation(this.b, "u_FilterEnabled");
    }

    @Override // xsna.ksj0
    public final void a(Size size) {
        GLES20.glActiveTexture(33985);
        Integer num = this.m;
        GLES20.glBindTexture(3553, num != null ? num.intValue() : -1);
        GLES20.glUniform1i(this.o, 1);
        GLES20.glUniform1f(this.p, this.n);
        GLES20.glUniform1i(this.q, this.m == null ? 0 : 1);
    }
}
