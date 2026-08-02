package xsna;

/* compiled from: VkOAuthServicePresenter.kt */
/* loaded from: classes15.dex */
public final class y6v0 extends p66<i90>.a {
    public final /* synthetic */ w6v0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6v0(w6v0 w6v0Var) {
        super();
        this.n = w6v0Var;
    }

    @Override // xsna.p66.a, xsna.ipj0, io.reactivex.rxjava3.core.v
    public final void onError(Throwable th) {
        this.n.B0(th.getMessage());
        par0.a.getClass();
        par0.c("[OAuthPresenter] authBySilentTokenWithoutCheck", th);
    }
}
