package xsna;

/* compiled from: PostponedPostsMviStore.kt */
/* loaded from: classes4.dex */
public final class rsc0 implements osc0, mm50<nsc0, trc0, wrc0> {
    public final /* synthetic */ mm50<nsc0, trc0, wrc0> b;

    public rsc0(final ftc0 ftc0Var) {
        int i = 10;
        this.b = new ql50((aqw) null, 7).a(new an50(new j18() { // from class: xsna.qsc0
            @Override // xsna.gzs
            public final Object invoke() {
                return new vrc0(new i440(ftc0.this, 21), new yv2(29));
            }
        }, new jsi(new hq5(ftc0Var, 15)), new jui(new wq20(ftc0Var, 18)), new sui(new xk6(ftc0Var, i)), new tti(new com.vk.movika.tools.controls.seekbar.t(ftc0Var, i))));
    }

    @Override // xsna.mm50
    public final uic G(izs<? super nsc0, s3q0> izsVar) {
        return this.b.G(izsVar);
    }

    @Override // xsna.mm50
    public final uic R(izs<? super wrc0, s3q0> izsVar) {
        return this.b.R(izsVar);
    }

    @Override // xsna.mm50
    public final void b(trc0 trc0Var) {
        this.b.b(trc0Var);
    }

    @Override // xsna.uic
    public final void clear() {
        this.b.clear();
    }

    @Override // xsna.mm50
    public final nsc0 getCurrentState() {
        return this.b.getCurrentState();
    }
}
