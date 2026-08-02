package xsna;

/* compiled from: PostsFromNotificationsMviStore.kt */
/* loaded from: classes4.dex */
public final class zvc0 implements vvc0, mm50<uvc0, avc0, dvc0> {
    public final /* synthetic */ mm50<uvc0, avc0, dvc0> b;

    public zvc0(final lwc0 lwc0Var) {
        this.b = new ql50((aqw) null, 7).a(uil0.a(lwc0Var.e, new j18() { // from class: xsna.wvc0
            @Override // xsna.gzs
            public final Object invoke() {
                return new cvc0(new a040(lwc0.this, 27), new xvc0(0));
            }
        }, new jsi(new w1(lwc0Var, 7)), new jui(new af50(lwc0Var, 16)), new sui(new z76(lwc0Var, 4))));
    }

    @Override // xsna.mm50
    public final uic G(izs<? super uvc0, s3q0> izsVar) {
        return this.b.G(izsVar);
    }

    @Override // xsna.mm50
    public final uic R(izs<? super dvc0, s3q0> izsVar) {
        return this.b.R(izsVar);
    }

    @Override // xsna.mm50
    public final void b(avc0 avc0Var) {
        this.b.b(avc0Var);
    }

    @Override // xsna.uic
    public final void clear() {
        this.b.clear();
    }

    @Override // xsna.mm50
    public final uvc0 getCurrentState() {
        return this.b.getCurrentState();
    }
}
