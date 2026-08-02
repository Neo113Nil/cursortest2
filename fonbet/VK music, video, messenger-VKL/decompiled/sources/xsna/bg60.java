package xsna;

/* compiled from: NewsfeedCustomMviStore.kt */
/* loaded from: classes4.dex */
public final class bg60 implements yf60, mm50<xf60, pf60, rf60> {
    public final /* synthetic */ mm50<xf60, pf60, rf60> b;

    public bg60(final wg60 wg60Var) {
        this.b = new ql50((aqw) null, 7).a(uil0.a(wg60Var.f, new j18() { // from class: xsna.zf60
            @Override // xsna.gzs
            public final Object invoke() {
                return new ve60(new re40(wg60.this, 2), new d4(26));
            }
        }, new jsi(new com.vk.movika.tools.controls.seekbar.j(wg60Var, 8)), new jui(new v4w(wg60Var, 10)), new sui(new y6c(wg60Var, 9))));
    }

    @Override // xsna.mm50
    public final uic G(izs<? super xf60, s3q0> izsVar) {
        return this.b.G(izsVar);
    }

    @Override // xsna.mm50
    public final uic R(izs<? super rf60, s3q0> izsVar) {
        return this.b.R(izsVar);
    }

    @Override // xsna.mm50
    public final void b(pf60 pf60Var) {
        this.b.b(pf60Var);
    }

    @Override // xsna.uic
    public final void clear() {
        this.b.clear();
    }

    @Override // xsna.mm50
    public final xf60 getCurrentState() {
        return this.b.getCurrentState();
    }
}
