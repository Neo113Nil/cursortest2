package xsna;

/* compiled from: ClipsPlaylistEventBusImpl.kt */
/* loaded from: classes16.dex */
public final class gqe implements fqe {
    public final io.reactivex.rxjava3.subjects.f<eqe> a = new io.reactivex.rxjava3.subjects.f<>();

    @Override // xsna.fqe
    public final io.reactivex.rxjava3.core.q<eqe> a() {
        return this.a;
    }

    @Override // xsna.hqe
    public final void b(eqe eqeVar) {
        this.a.onNext(eqeVar);
    }
}
