package xsna;

/* compiled from: CommunityWallBusImpl.kt */
/* loaded from: classes5.dex */
public final class b5i implements a5i {
    public final io.reactivex.rxjava3.subjects.f<c5i> b = new io.reactivex.rxjava3.subjects.f<>();

    @Override // xsna.a5i
    public final io.reactivex.rxjava3.core.q<c5i> a() {
        return this.b;
    }

    @Override // xsna.a5i
    public final void b(c5i c5iVar) {
        this.b.onNext(c5iVar);
    }
}
