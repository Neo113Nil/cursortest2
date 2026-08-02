package xsna;

/* compiled from: FaveFeedMviStore.kt */
/* loaded from: classes4.dex */
public final class qpq implements lpq, mm50<kpq, uoq, xoq> {
    public final /* synthetic */ mm50<kpq, uoq, xoq> b;

    public qpq(final cqq cqqVar) {
        this.b = new ql50((aqw) null, 7).a(uil0.a(cqqVar.g, new j18() { // from class: xsna.ppq
            @Override // xsna.gzs
            public final Object invoke() {
                return new s7n(new xyh(cqq.this, 11), new d2(14), 1);
            }
        }, new jsi(new z77(cqqVar, 5)), new jui(new wik(cqqVar, 7)), new sui(new f9h(cqqVar, 4))));
    }

    @Override // xsna.mm50
    public final uic G(izs<? super kpq, s3q0> izsVar) {
        return this.b.G(izsVar);
    }

    @Override // xsna.mm50
    public final uic R(izs<? super xoq, s3q0> izsVar) {
        return this.b.R(izsVar);
    }

    @Override // xsna.mm50
    public final void b(uoq uoqVar) {
        this.b.b(uoqVar);
    }

    @Override // xsna.uic
    public final void clear() {
        this.b.clear();
    }

    @Override // xsna.mm50
    public final kpq getCurrentState() {
        return this.b.getCurrentState();
    }
}
