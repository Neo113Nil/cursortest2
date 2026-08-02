package xsna;

import xsna.rcz0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class jjz0 {
    public final /* synthetic */ f8x a;
    public final /* synthetic */ ijz0 b;

    public jjz0(ijz0 ijz0Var, f8x f8xVar) {
        this.b = ijz0Var;
        this.a = f8xVar;
    }

    public final void a(wlv wlvVar, pjz0 pjz0Var) {
        t8z0 t8z0Var;
        rcz0 rcz0Var = this.b.q;
        synchronized (rcz0Var) {
            rcz0.a a = rcz0Var.a(pjz0Var, -1.0f);
            if (a != null) {
                a.b = true;
                if (rcz0Var.c == a && (t8z0Var = rcz0Var.e) != null) {
                    rcz0Var.c = null;
                    t8z0Var.accept(rcz0Var.d);
                    rcz0Var.d = null;
                    rcz0Var.e = null;
                }
            }
        }
        try {
            this.a.b(pjz0Var.c, wlvVar, this.b.a);
        } catch (Throwable th) {
            eb3.a(null, new StringBuilder("InstreamAudioAdEngine: sectionPrepareCallback.onPrepareResult failed: "), th);
        }
    }
}
