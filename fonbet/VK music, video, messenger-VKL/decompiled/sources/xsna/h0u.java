package xsna;

import android.opengl.GLES20;

/* compiled from: GlFrameBuffer.java */
/* loaded from: classes12.dex */
public final class h0u {
    public int a;
    public int b;
    public int c;

    public final void a() {
        int[] iArr = {this.c};
        GLES20.glDeleteTextures(1, iArr, 0);
        this.c = 0;
        iArr[0] = this.b;
        GLES20.glDeleteRenderbuffers(1, iArr, 0);
        this.b = 0;
        iArr[0] = this.a;
        GLES20.glDeleteFramebuffers(1, iArr, 0);
        this.a = 0;
    }
}
