package xsna;

import android.opengl.GLES20;
import android.util.Size;

/* compiled from: GLTextureSource.kt */
/* loaded from: classes3.dex */
public abstract class k2t {
    public Size a;
    public final gzs<b2t> b;
    public x1t c;
    public final bpn0 d = new bpn0(new xqf(this, 22));

    /* compiled from: GLTextureSource.kt */
    public interface a {
        k2t a(Size size);
    }

    public k2t(Size size, gzs<b2t> gzsVar) {
        this.a = size;
        this.b = gzsVar;
        this.c = a(size);
    }

    public static x1t a(Size size) {
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        GLES20.glGenTextures(1, iArr2, 0);
        GLES20.glGenRenderbuffers(1, iArr3, 0);
        GLES20.glBindFramebuffer(36160, iArr[0]);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, iArr2[0]);
        GLES20.glTexImage2D(3553, 0, 6408, size.getWidth(), size.getHeight(), 0, 6408, 5121, null);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr2[0], 0);
        GLES20.glBindRenderbuffer(36161, iArr3[0]);
        GLES20.glRenderbufferStorage(36161, 33189, size.getWidth(), size.getHeight());
        GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, iArr3[0]);
        return new x1t(iArr[0], iArr3[0], iArr2[0]);
    }

    public abstract boolean b(int i, boolean z);
}
