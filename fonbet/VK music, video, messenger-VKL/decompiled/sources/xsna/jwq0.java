package xsna;

/* compiled from: UserProfileWallMviStore.kt */
/* loaded from: classes4.dex */
public final class jwq0 implements ewq0, mm50<dwq0, pvq0, svq0> {
    public final /* synthetic */ mm50<dwq0, pvq0, svq0> b;

    public jwq0(final fxq0 fxq0Var) {
        this.b = new ql50((aqw) null, 7).a(uil0.a(fxq0Var.e, new j18() { // from class: xsna.iwq0
            @Override // xsna.gzs
            public final Object invoke() {
                fxq0 fxq0Var2 = fxq0.this;
                return new s7n(new tsk0(fxq0Var2, 15), new wzb0(fxq0Var2, 23), 1);
            }
        }, new jsi(new com.vk.movika.tools.controls.seekbar.w(fxq0Var, 17)), new jui(new xka0(fxq0Var, 21)), kwq0.$EnumSwitchMapping$0[fxq0Var.k.b.ordinal()] == 1 ? new sui(new com.vk.movika.tools.controls.seekbar.u(fxq0Var, 12)) : new sui(new com.vk.movika.tools.controls.seekbar.p(fxq0Var, 16))));
    }

    @Override // xsna.mm50
    public final uic G(izs<? super dwq0, s3q0> izsVar) {
        return this.b.G(izsVar);
    }

    @Override // xsna.mm50
    public final uic R(izs<? super svq0, s3q0> izsVar) {
        return this.b.R(izsVar);
    }

    @Override // xsna.mm50
    public final void b(pvq0 pvq0Var) {
        this.b.b(pvq0Var);
    }

    @Override // xsna.uic
    public final void clear() {
        this.b.clear();
    }

    @Override // xsna.mm50
    public final dwq0 getCurrentState() {
        return this.b.getCurrentState();
    }
}
