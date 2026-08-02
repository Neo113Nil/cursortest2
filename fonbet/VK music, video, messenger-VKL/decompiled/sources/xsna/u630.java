package xsna;

import androidx.lifecycle.Lifecycle;

/* compiled from: Effects.kt */
/* loaded from: classes17.dex */
public final class u630 implements kgn {
    public final /* synthetic */ Lifecycle a;
    public final /* synthetic */ s630 b;
    public final /* synthetic */ ah50 c;
    public final /* synthetic */ izs d;
    public final /* synthetic */ gzs e;

    public u630(Lifecycle lifecycle, s630 s630Var, ah50 ah50Var, izs izsVar, gzs gzsVar) {
        this.a = lifecycle;
        this.b = s630Var;
        this.c = ah50Var;
        this.d = izsVar;
        this.e = gzsVar;
    }

    @Override // xsna.kgn
    public final void dispose() {
        ah50 ah50Var = this.c;
        long i = ah50Var.i();
        Lifecycle lifecycle = this.a;
        if (i > 0 && lifecycle.getCurrentState() == Lifecycle.State.RESUMED) {
            this.d.invoke(new s2u0(ah50Var.i(), ((Number) this.e.invoke()).longValue()));
            ah50Var.p(-1L);
        }
        lifecycle.removeObserver(this.b);
    }
}
