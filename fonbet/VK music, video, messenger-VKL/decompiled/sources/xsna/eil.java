package xsna;

/* compiled from: DefaultMarketMultiPickerTechMetricsCollector.kt */
/* loaded from: classes18.dex */
public final class eil implements z810 {
    public final m1k a;
    public final io.reactivex.rxjava3.disposables.b b = new io.reactivex.rxjava3.disposables.b();
    public a910 c;

    public eil(m1k m1kVar) {
        this.a = m1kVar;
    }

    @Override // xsna.z810
    public final void a() {
        io.reactivex.rxjava3.internal.operators.single.v vVar = new io.reactivex.rxjava3.internal.operators.single.v(new dil(this, 0));
        asu0.a.getClass();
        this.b.b(vVar.q(asu0.m()).subscribe());
    }

    @Override // xsna.z810
    public final a910 b() {
        return this.c;
    }

    @Override // xsna.z810
    public final void c(a910 a910Var) {
        this.c = a910Var;
    }

    @Override // xsna.z810
    public final void onDestroy() {
        this.b.e();
    }
}
