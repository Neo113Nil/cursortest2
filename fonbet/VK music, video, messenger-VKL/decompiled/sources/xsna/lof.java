package xsna;

/* compiled from: ClipsViewerEventStoreImpl.kt */
/* loaded from: classes17.dex */
public final class lof implements kof {
    public final io.reactivex.rxjava3.subjects.f<nfd> a = new io.reactivex.rxjava3.subjects.f<>();

    @Override // xsna.kof
    public final io.reactivex.rxjava3.internal.operators.observable.z0 a() {
        io.reactivex.rxjava3.subjects.f<nfd> fVar = this.a;
        fVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.z0(fVar);
    }

    @Override // xsna.jof
    public final void b(nfd nfdVar) {
        this.a.onNext(nfdVar);
    }
}
