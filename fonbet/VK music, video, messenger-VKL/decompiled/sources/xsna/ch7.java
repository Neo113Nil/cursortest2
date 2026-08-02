package xsna;

import android.opengl.GLES20;
import android.util.Size;

/* compiled from: BlurShader.kt */
/* loaded from: classes3.dex */
public final class ch7 extends lsj0 {
    public final int m;

    public ch7(int i, int i2) {
        super(i, i2);
        this.m = GLES20.glGetUniformLocation(this.b, "u_TextureSize");
    }

    @Override // xsna.lsj0
    public final void a(Size size) {
        GLES20.glUniform2f(this.m, size.getWidth(), size.getHeight());
    }
}
