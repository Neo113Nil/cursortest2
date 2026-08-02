package xsna;

import xsna.dkq0;

/* compiled from: RxUserFriendsEventsBusImpl.kt */
/* loaded from: classes6.dex */
public final class dwg0 implements cwg0 {
    public final io.reactivex.rxjava3.subjects.f<dkq0> a = new io.reactivex.rxjava3.subjects.f<>();

    @Override // xsna.cwg0
    public final io.reactivex.rxjava3.subjects.f a() {
        return this.a;
    }

    @Override // xsna.cwg0
    public final void b(dkq0.a aVar) {
        this.a.onNext(aVar);
    }
}
