package xsna;

/* compiled from: CityResultFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class jfc implements fuq<xec, bfc> {
    public final io.reactivex.rxjava3.subjects.f<bfc> a = new io.reactivex.rxjava3.subjects.f<>();

    @Override // xsna.fuq
    public final io.reactivex.rxjava3.core.q<? extends xec> d() {
        return io.reactivex.rxjava3.internal.operators.observable.g0.b;
    }

    @Override // xsna.fuq
    public final io.reactivex.rxjava3.core.q<? extends bfc> e() {
        io.reactivex.rxjava3.subjects.f<bfc> fVar = this.a;
        fVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.z0(fVar);
    }
}
