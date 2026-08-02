package xsna;

/* compiled from: ActionLinksSnippetPresenter.kt */
/* loaded from: classes3.dex */
public final class l30 extends io.reactivex.rxjava3.observers.a<Boolean> {
    public final /* synthetic */ h30 c;

    public l30(h30 h30Var) {
        this.c = h30Var;
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onComplete() {
        h30 h30Var = this.c;
        h30Var.b(null);
        h30Var.m = null;
    }

    @Override // io.reactivex.rxjava3.core.v
    public final /* bridge */ /* synthetic */ void onNext(Object obj) {
        ((Boolean) obj).booleanValue();
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onError(Throwable th) {
    }
}
