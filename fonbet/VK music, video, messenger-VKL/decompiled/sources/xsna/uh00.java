package xsna;

/* compiled from: ManagedGroupActionsInteractor.kt */
/* loaded from: classes3.dex */
public final class uh00 {
    public final a1w a;
    public final v3q b;
    public final bfm c;

    public uh00(a1w a1wVar, v3q v3qVar, bfm bfmVar) {
        this.a = a1wVar;
        this.b = v3qVar;
        this.c = bfmVar;
    }

    public final io.reactivex.rxjava3.internal.operators.completable.w a(boolean z) {
        return new io.reactivex.rxjava3.internal.operators.completable.p(this.a.C(this, new dsa(z, (String) this.c.invoke())).q(this.b.c())).g(new th00());
    }
}
