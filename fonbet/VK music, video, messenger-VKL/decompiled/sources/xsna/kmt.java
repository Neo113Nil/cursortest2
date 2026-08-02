package xsna;

/* compiled from: GeoPostsMviStore.kt */
/* loaded from: classes4.dex */
public final class kmt implements hmt, mm50<gmt, ult, xlt> {
    public final /* synthetic */ mm50<gmt, ult, xlt> b;

    public kmt(final vmt vmtVar) {
        this.b = new ql50((aqw) null, 7).a(uil0.a(vmtVar.f, new j18() { // from class: xsna.jmt
            @Override // xsna.gzs
            public final Object invoke() {
                return new s7n(new qbj(vmt.this, 12), new ee4(15), 1);
            }
        }, new jsi(new p00(vmtVar, 5)), new jui(new t3h(vmtVar, 23)), new sui(new s77(vmtVar, 4))));
    }

    @Override // xsna.mm50
    public final uic G(izs<? super gmt, s3q0> izsVar) {
        return this.b.G(izsVar);
    }

    @Override // xsna.mm50
    public final uic R(izs<? super xlt, s3q0> izsVar) {
        return this.b.R(izsVar);
    }

    @Override // xsna.mm50
    public final void b(ult ultVar) {
        this.b.b(ultVar);
    }

    @Override // xsna.uic
    public final void clear() {
        this.b.clear();
    }

    @Override // xsna.mm50
    public final gmt getCurrentState() {
        return this.b.getCurrentState();
    }
}
