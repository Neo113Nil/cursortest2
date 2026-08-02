package xsna;

import android.opengl.GLES20;
import android.util.Size;

/* compiled from: DisplayOutput.kt */
/* loaded from: classes3.dex */
public final class agn implements g2t {
    public final b2t a;
    public final bpn0 b = new bpn0(new xrj(this, 3));

    /* compiled from: DisplayOutput.kt */
    public static final class a {
        public final b2t a;

        public a(b2t b2tVar) {
            this.a = b2tVar;
        }
    }

    public agn(b2t b2tVar) {
        this.a = b2tVar;
    }

    @Override // xsna.g2t
    public final void a(int i, Size size) {
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glViewport(0, 0, size.getWidth(), size.getHeight());
        bpn0 bpn0Var = this.b;
        ((lsj0) bpn0Var.getValue()).a = i;
        ((lsj0) bpn0Var.getValue()).b(size);
    }
}
