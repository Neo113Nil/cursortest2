package defpackage;

/* loaded from: classes9.dex */
public final class irg implements f7, ta, ua, lrg, nrg {
    public final oz2 a;

    public irg(oz2 oz2Var) {
        this.a = oz2Var;
    }

    @Override // defpackage.ta
    public final void e(s7s s7sVar) {
        this.a.a(s7sVar);
    }

    @Override // defpackage.ua
    public final void h(s7s s7sVar) {
        this.a.a(s7sVar);
    }

    @Override // defpackage.f7
    public final oz2 j() {
        return this.a;
    }

    @Override // defpackage.f7
    public final f7 o() {
        return new irg(new oz2());
    }
}
