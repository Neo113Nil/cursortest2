package defpackage;

import android.app.Activity;
import com.yandex.go.vault.data.b;
import com.yandex.go.vault.domain.a;

/* loaded from: classes14.dex */
public final class nqq implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final eqh c;

    public nqq(eqh eqhVar, xvf0 xvf0Var) {
        this.a = 0;
        this.c = eqhVar;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        eqh eqhVar = this.c;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new mqq(i5m.a(eqhVar), i5m.a(xvf0Var));
            case 1:
                return new a((wgr) xvf0Var.get(), (b) eqhVar.get());
            default:
                return new elt0((Activity) xvf0Var.get(), i5m.a(eqhVar));
        }
    }

    public /* synthetic */ nqq(xvf0 xvf0Var, eqh eqhVar, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = eqhVar;
    }
}
