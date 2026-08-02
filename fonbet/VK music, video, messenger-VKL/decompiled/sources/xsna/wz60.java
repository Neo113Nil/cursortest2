package xsna;

/* compiled from: NewsfeedStore.kt */
/* loaded from: classes4.dex */
public final class wz60 implements rz60, mm50<qz60, vs60, xh60> {
    public final /* synthetic */ mm50<qz60, vs60, xh60> b;

    public wz60(final xz60 xz60Var, zz60 zz60Var, xk2 xk2Var) {
        this.b = xz60Var.c.a(new an50(new j18() { // from class: xsna.vz60
            @Override // xsna.gzs
            public final Object invoke() {
                xz60 xz60Var2 = xz60.this;
                Cnew cnew = xz60Var2.a;
                m15 m15Var = xz60Var2.b;
                bd60 bd60Var = new bd60();
                bd60Var.a = cnew;
                bd60Var.b = m15Var;
                return bd60Var;
            }
        }, new jsi(new com.vk.movika.tools.controls.seekbar.i(zz60Var, 10)), new jui(new kn20(zz60Var, 14)), new sui(new mq0(zz60Var, zz60Var.v, xz60Var, 5)), new tti(new au7(5, zz60Var, xk2Var))));
    }

    @Override // xsna.mm50
    public final uic G(izs<? super qz60, s3q0> izsVar) {
        return this.b.G(izsVar);
    }

    @Override // xsna.mm50
    public final uic R(izs<? super xh60, s3q0> izsVar) {
        return this.b.R(izsVar);
    }

    @Override // xsna.mm50
    public final void b(vs60 vs60Var) {
        this.b.b(vs60Var);
    }

    @Override // xsna.uic
    public final void clear() {
        this.b.clear();
    }

    @Override // xsna.d2h0
    public final qz60 e() {
        return this.b.getCurrentState();
    }

    @Override // xsna.mm50
    public final qz60 getCurrentState() {
        return this.b.getCurrentState();
    }
}
