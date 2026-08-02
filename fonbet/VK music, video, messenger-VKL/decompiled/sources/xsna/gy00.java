package xsna;

/* compiled from: MarketEventBusImpl.kt */
/* loaded from: classes.dex */
public final class gy00 implements fy00 {
    public final io.reactivex.rxjava3.subjects.f<ay00> a = new io.reactivex.rxjava3.subjects.f<>();

    @Override // xsna.fy00
    public final io.reactivex.rxjava3.core.q<ay00> a() {
        return this.a;
    }

    @Override // xsna.fy00
    public final void b(ay00 ay00Var) {
        this.a.onNext(ay00Var);
    }
}
