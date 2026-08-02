package defpackage;

import kotlinx.coroutines.c;

/* loaded from: classes9.dex */
public final class cpb extends t8x {
    public final j18 A;

    public cpb(j18 j18Var) {
        this.A = j18Var;
    }

    @Override // defpackage.t8x
    public final boolean n() {
        return true;
    }

    @Override // defpackage.t8x
    public final void o(Throwable th) {
        c cVar = this.z;
        if (cVar == null) {
            cVar = null;
        }
        j18 j18Var = this.A;
        Throwable p = j18Var.p(cVar);
        if (!j18Var.z() ? false : ((pyj) j18Var.w).o(p)) {
            return;
        }
        j18Var.b(p);
        if (j18Var.z()) {
            return;
        }
        j18Var.n();
    }
}
