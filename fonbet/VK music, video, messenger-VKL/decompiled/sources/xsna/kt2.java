package xsna;

import android.content.Context;

/* compiled from: AnonCallPresenter.kt */
/* loaded from: classes7.dex */
public final class kt2 implements nao0 {
    public final Context a;

    public kt2() {
        r55 r55Var = r55.a;
        this.a = r55.a();
    }

    @Override // xsna.nao0
    public final void U() {
        rex0 rex0Var = e370.j;
        if (rex0Var == null) {
            rex0Var = null;
        }
        rex0Var.b(this.a, jeq0.g("https://" + a0a.d + "/terms/vkcalls_terms"));
    }

    @Override // xsna.nao0
    public final void j() {
        rex0 rex0Var = e370.j;
        if (rex0Var == null) {
            rex0Var = null;
        }
        rex0Var.b(this.a, jeq0.g("https://" + a0a.d + "/terms/vkcalls_privacy"));
    }
}
