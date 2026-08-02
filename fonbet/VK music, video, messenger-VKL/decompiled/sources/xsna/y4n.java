package xsna;

/* compiled from: DiscoverMediaStore.kt */
/* loaded from: classes4.dex */
public final class y4n implements u4n, mm50<t4n, m2n, e3n> {
    public final /* synthetic */ mm50<t4n, m2n, e3n> b;

    public y4n(final z4n z4nVar, a5n a5nVar, pn0 pn0Var) {
        this.b = z4nVar.c.a(new an50(new j18() { // from class: xsna.x4n
            @Override // xsna.gzs
            public final Object invoke() {
                z4n z4nVar2 = z4n.this;
                p3h p3hVar = z4nVar2.a;
                we0 we0Var = z4nVar2.b;
                x2n x2nVar = new x2n();
                x2nVar.a = p3hVar;
                x2nVar.b = we0Var;
                return x2nVar;
            }
        }, new jsi(new cd4(a5nVar, 5)), new jui(new wpg(a5nVar, 8)), new sui(new dd4(a5nVar, 3)), new tti(new zjm(1, a5nVar, pn0Var))));
    }

    @Override // xsna.mm50
    public final uic G(izs<? super t4n, s3q0> izsVar) {
        return this.b.G(izsVar);
    }

    @Override // xsna.mm50
    public final uic R(izs<? super e3n, s3q0> izsVar) {
        return this.b.R(izsVar);
    }

    @Override // xsna.mm50
    public final void b(m2n m2nVar) {
        this.b.b(m2nVar);
    }

    @Override // xsna.uic
    public final void clear() {
        this.b.clear();
    }

    @Override // xsna.d2h0
    public final t4n e() {
        return this.b.getCurrentState();
    }

    @Override // xsna.mm50
    public final t4n getCurrentState() {
        return this.b.getCurrentState();
    }
}
