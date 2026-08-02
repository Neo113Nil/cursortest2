package xsna;

import android.opengl.GLES20;
import androidx.media3.common.util.GlUtil;

/* compiled from: GlTextureInfo.java */
/* loaded from: classes12.dex */
public final class r0u {
    public static final r0u e = new r0u(-1, -1, -1, -1);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public r0u(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final void a() throws GlUtil.GlException {
        int i = this.a;
        if (i != -1) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            GlUtil.d();
        }
        int i2 = this.b;
        if (i2 != -1) {
            GLES20.glDeleteFramebuffers(1, new int[]{i2}, 0);
            GlUtil.d();
        }
    }
}
