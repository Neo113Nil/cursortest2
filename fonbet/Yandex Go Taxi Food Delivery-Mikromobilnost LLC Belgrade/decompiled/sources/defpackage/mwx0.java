package defpackage;

import com.yandex.go.shortcuts.impl.interactors.q;

/* loaded from: classes13.dex */
public final class mwx0 implements pft0 {
    public final q a;

    public mwx0(q qVar) {
        this.a = qVar;
    }

    @Override // defpackage.pft0
    public final void d(tse tseVar) {
        this.a.a();
    }

    @Override // defpackage.pft0
    public final void onPause() {
        q qVar = this.a;
        pzt0 pzt0Var = qVar.l;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        qVar.g.f.b();
        qVar.k.cancel();
        pzt0 pzt0Var2 = qVar.m;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        qVar.b.b(new qaf0(yaf0.a, qVar.hashCode()), true);
    }
}
