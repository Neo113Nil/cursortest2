package xsna;

import android.opengl.GLES20;

/* compiled from: GlFrameBuffer.kt */
/* loaded from: classes3.dex */
public final class f0u {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    public final void a() {
        int[] iArr = {this.e};
        GLES20.glDeleteTextures(1, iArr, 0);
        this.e = 0;
        iArr[0] = this.d;
        GLES20.glDeleteRenderbuffers(1, iArr, 0);
        this.d = 0;
        iArr[0] = this.c;
        GLES20.glDeleteFramebuffers(1, iArr, 0);
        this.c = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!f0u.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        f0u f0uVar = (f0u) obj;
        return this.a == f0uVar.a && this.b == f0uVar.b && this.c == f0uVar.c && this.d == f0uVar.d && this.e == f0uVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + shy.a(this.d, shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }
}
