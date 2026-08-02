package xsna;

import xsna.y560;

/* compiled from: VideoOfflineManagerImplOld.kt */
/* loaded from: classes.dex */
public final class f0t0 implements y560.a {
    public final /* synthetic */ io.reactivex.rxjava3.subjects.d<Boolean> a;

    public f0t0(io.reactivex.rxjava3.subjects.d<Boolean> dVar) {
        this.a = dVar;
    }

    @Override // xsna.y560.a
    public final void b() {
        this.a.onNext(Boolean.TRUE);
    }

    @Override // xsna.y560.a
    public final void c() {
        this.a.onNext(Boolean.FALSE);
    }

    @Override // xsna.y560.a
    public final boolean f(String str) {
        return true;
    }
}
