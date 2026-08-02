package xsna;

import xsna.izy0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class ekz0 extends izy0.a {
    public final /* synthetic */ fkz0 a;

    public ekz0(fkz0 fkz0Var) {
        this.a = fkz0Var;
    }

    @Override // xsna.izy0.a
    public final void a() {
        this.a.getClass();
    }

    @Override // xsna.izy0.a
    public final void b(boolean z) {
        if (z) {
            return;
        }
        gu8.c("IntrNativeAdCtrlImpl", "Banner is not visible");
        fkz0 fkz0Var = this.a;
        if (fkz0Var.s) {
            gu8.c("IntrNativeAdCtrlImpl", "Stop tracking");
            fkz0Var.s = false;
            fkz0Var.g.e();
            if (!fkz0Var.e.isEmpty()) {
                fkz0Var.f.a();
            }
            izy0 izy0Var = fkz0Var.m;
            if (izy0Var != null) {
                izy0Var.h();
            }
            qiy0 qiy0Var = fkz0Var.l;
            if (qiy0Var != null) {
                qiy0Var.b.clear();
            }
        }
    }

    @Override // xsna.izy0.a
    public final void c() {
    }
}
