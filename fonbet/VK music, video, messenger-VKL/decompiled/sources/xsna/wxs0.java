package xsna;

/* compiled from: VideoNavigationEventsBehaviorSubject.kt */
/* loaded from: classes2.dex */
public final class wxs0 implements xxs0 {
    public final io.reactivex.rxjava3.subjects.d<vxs0> a = io.reactivex.rxjava3.subjects.d.N0();

    @Override // xsna.xxs0
    public final io.reactivex.rxjava3.subjects.d a() {
        return this.a;
    }

    @Override // xsna.xxs0
    public final void b(vxs0 vxs0Var) {
        this.a.onNext(vxs0Var);
    }
}
