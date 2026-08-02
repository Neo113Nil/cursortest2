package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class mac implements eev {
    public final /* synthetic */ nac a;

    public mac(gp41 gp41Var, gp41 gp41Var2, nac nacVar) {
        this.a = nacVar;
    }

    @Override // defpackage.eev
    public final void d(m9o m9oVar) {
        this.a.i.invoke();
    }

    @Override // defpackage.eev
    public final void k(t3v0 t3v0Var) {
        nac nacVar = this.a;
        tls tlsVar = nacVar.h;
        q7v q7vVar = t3v0Var.a;
        View view = nacVar.a;
        tlsVar.invoke(q7vVar instanceof sac ? cma1.j(((sac) q7vVar).a, view.getResources()) : cma1.j(q7vVar, view.getResources()));
    }

    @Override // defpackage.eev
    public final void onCancel() {
    }

    @Override // defpackage.eev
    public final void onStart() {
    }
}
