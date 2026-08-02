package xsna;

import android.opengl.GLES20;
import android.util.Size;
import xsna.k2t;

/* compiled from: AberrationTextureSource.kt */
/* loaded from: classes3.dex */
public final class o0 extends k2t {
    public final bpn0 e;

    /* compiled from: AberrationTextureSource.kt */
    public static final class a implements k2t.a {
        public final we0 a;

        public a(we0 we0Var) {
            this.a = we0Var;
        }

        @Override // xsna.k2t.a
        public final k2t a(Size size) {
            return new o0(size, this.a);
        }
    }

    public o0(Size size, we0 we0Var) {
        super(size, we0Var);
        this.e = new bpn0(new n0(0, we0Var, this));
    }

    @Override // xsna.k2t
    public final boolean b(int i, boolean z) {
        GLES20.glBindFramebuffer(36160, this.c.a);
        GLES20.glViewport(0, 0, this.a.getWidth(), this.a.getHeight());
        if (z) {
            bpn0 bpn0Var = this.e;
            ((ch7) bpn0Var.getValue()).a = i;
            ((ch7) bpn0Var.getValue()).b(this.a);
        }
        return z;
    }
}
