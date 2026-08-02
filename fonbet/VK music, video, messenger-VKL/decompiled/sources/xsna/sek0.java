package xsna;

import android.graphics.Color;
import android.opengl.GLES20;
import android.util.Size;

/* compiled from: SolidColorShader.kt */
/* loaded from: classes4.dex */
public final class sek0 extends ksj0 {
    public int m;
    public final int n;

    public sek0(int i, int i2) {
        super(i, i2);
        this.m = -1;
        this.n = GLES20.glGetUniformLocation(this.b, "u_Color");
    }

    @Override // xsna.ksj0
    public final void a(Size size) {
        GLES20.glUniform4f(this.n, Color.red(this.m) / 255.0f, Color.green(this.m) / 255.0f, Color.blue(this.m) / 255.0f, 1.0f);
    }
}
