package xsna;

import android.opengl.GLES20;

/* compiled from: GlFrameBuffer.kt */
/* loaded from: classes3.dex */
public final class g0u {
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

    public final void b(int i, int i2) {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(3379, iArr, 0);
        int i3 = iArr[0];
        if (i > i3 || i2 > i3) {
            throw new IllegalArgumentException(("GL_MAX_TEXTURE_SIZE " + iArr[0]).toString());
        }
        GLES20.glGetIntegerv(34024, iArr, 0);
        int i4 = iArr[0];
        if (i > i4 || i2 > i4) {
            throw new IllegalArgumentException(("GL_MAX_RENDERBUFFER_SIZE " + iArr[0]).toString());
        }
        GLES20.glGetIntegerv(36006, iArr, 0);
        int i5 = iArr[0];
        GLES20.glGetIntegerv(36007, iArr, 0);
        int i6 = iArr[0];
        GLES20.glGetIntegerv(32873, iArr, 0);
        int i7 = iArr[0];
        a();
        try {
            this.a = i;
            this.b = i2;
            GLES20.glGenFramebuffers(1, iArr, 0);
            int i8 = iArr[0];
            this.c = i8;
            GLES20.glBindFramebuffer(36160, i8);
            GLES20.glGenRenderbuffers(1, iArr, 0);
            int i9 = iArr[0];
            this.d = i9;
            GLES20.glBindRenderbuffer(36161, i9);
            GLES20.glRenderbufferStorage(36161, 33189, i, i2);
            GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, this.d);
            GLES20.glGenTextures(1, iArr, 0);
            int i10 = iArr[0];
            this.e = i10;
            GLES20.glBindTexture(3553, i10);
            GLES20.glTexParameterf(3553, 10240, 9729);
            GLES20.glTexParameterf(3553, 10241, 9728);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.e, 0);
            int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
            if (glCheckFramebufferStatus != 36053) {
                throw new IllegalStateException("Failed to initialize framebuffer object " + glCheckFramebufferStatus);
            }
            GLES20.glBindFramebuffer(36160, i5);
            GLES20.glBindRenderbuffer(36161, i6);
            GLES20.glBindTexture(3553, i7);
        } catch (RuntimeException e) {
            a();
            throw e;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!g0u.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        g0u g0uVar = (g0u) obj;
        return this.a == g0uVar.a && this.b == g0uVar.b && this.c == g0uVar.c && this.d == g0uVar.d && this.e == g0uVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + shy.a(this.d, shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }
}
