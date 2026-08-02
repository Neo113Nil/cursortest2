package defpackage;

import java.util.Iterator;

/* loaded from: classes10.dex */
public final class pdy extends iq7 {
    public pey O;

    /* JADX WARN: Removed duplicated region for block: B:10:0x00a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.iq7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ody s() {
        bj21 b;
        if (this.O != null && this.t != null) {
            if (!l()) {
                sgb1.g(3, "CameraController");
            } else if (this.v == null || this.u == null) {
                sgb1.g(3, "CameraController");
            } else {
                if (l()) {
                    this.t.a(this.c, this.e, this.i, this.l);
                }
                aj21 aj21Var = new aj21();
                aj21Var.a(this.c);
                tob1.b();
                if ((this.b & 1) != 0) {
                    aj21Var.a(this.e);
                }
                tob1.b();
                if ((this.b & 2) != 0) {
                    aj21Var.a(this.i);
                }
                tob1.b();
                if ((this.b & 4) != 0) {
                    aj21Var.a(this.l);
                }
                aj21Var.a = this.u;
                Iterator it = this.I.iterator();
                while (it.hasNext()) {
                    if (it.next() != null) {
                        ny61.u();
                        return null;
                    }
                    aj21Var.c.add(null);
                }
                b = aj21Var.b();
                if (b != null) {
                    try {
                        return (ody) this.t.a.c(this.O, this.a, b);
                    } catch (IllegalArgumentException e) {
                        ny61.h("The selected camera does not support the enabled use cases. Please disable use case and/or select a different camera. e.g. #setVideoCaptureEnabled(false)", e);
                        return null;
                    }
                }
            }
            b = null;
            if (b != null) {
            }
        }
        return null;
    }

    public final void z() {
        tob1.b();
        this.O = null;
        this.s = null;
        j5f0 j5f0Var = this.t;
        if (j5f0Var != null) {
            j5f0Var.a.g();
        }
    }
}
