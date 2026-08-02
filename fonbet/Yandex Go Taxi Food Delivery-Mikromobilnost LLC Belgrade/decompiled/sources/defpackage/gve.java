package defpackage;

import android.os.Looper;
import com.yandex.go.superapp.order.multi.old.provider.g;
import com.yandex.go.yb.data.u;
import com.yandex.go.yb.domain.o;
import com.yandex.go.yb.domain.p;

/* loaded from: classes8.dex */
public final class gve implements v7p {
    public final /* synthetic */ int a;
    public final eqh b;
    public final xvf0 c;

    public gve(eqh eqhVar, xvf0 xvf0Var) {
        this.a = 1;
        this.b = eqhVar;
        this.c = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        eqh eqhVar = this.b;
        xvf0 xvf0Var = this.c;
        switch (i) {
            case 0:
                return new fve((eve) xvf0Var.get(), eqhVar);
            case 1:
                return new xnj(i5m.a(eqhVar), i5m.a(xvf0Var));
            case 2:
                return new x020((v220) xvf0Var.get(), (g) eqhVar.get());
            case 3:
                return ((cx50) eqhVar.get()).a(((w4o) xvf0Var.get()).c);
            case 4:
                return new eyj0((Looper) xvf0Var.get(), (k020) eqhVar.get());
            default:
                return new p((u) xvf0Var.get(), (o) eqhVar.get());
        }
    }

    public /* synthetic */ gve(xvf0 xvf0Var, eqh eqhVar, int i) {
        this.a = i;
        this.c = xvf0Var;
        this.b = eqhVar;
    }

    public gve(fx50 fx50Var, xvf0 xvf0Var, eqh eqhVar) {
        this.a = 3;
        this.c = xvf0Var;
        this.b = eqhVar;
    }
}
