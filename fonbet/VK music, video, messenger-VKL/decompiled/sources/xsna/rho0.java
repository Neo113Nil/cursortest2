package xsna;

import xsna.v4s;

/* compiled from: TextFieldSize.kt */
/* loaded from: classes11.dex */
final class rho0 extends d730<sho0> {
    public final nmo0 a;

    public rho0(nmo0 nmo0Var) {
        this.a = nmo0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rho0)) {
            return false;
        }
        return epx.f(this.a, ((rho0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // xsna.d730
    public final sho0 r() {
        return new sho0(this.a);
    }

    @Override // xsna.d730
    public final void s(sho0 sho0Var) {
        sho0 sho0Var2 = sho0Var;
        sho0Var2.getClass();
        nmo0 a = tmo0.a(this.a, itl.f(sho0Var2).A);
        sho0Var2.i2(a, (v4s.a) ovi.a(sho0Var2, uvi.k));
        qho0 qho0Var = sho0Var2.r;
        if (qho0Var == null) {
            throw jq.f("Min size state is not set.");
        }
        qho0.a(qho0Var, null, null, a, 23);
        itl.f(sho0Var2).Q();
    }
}
