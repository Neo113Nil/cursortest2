package defpackage;

import com.squareup.moshi.Moshi;

/* loaded from: classes6.dex */
public final class alx0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final n3w e;

    public /* synthetic */ alx0(n3w n3wVar, eqh eqhVar, eqh eqhVar2, xvf0 xvf0Var, int i) {
        this.a = i;
        this.e = n3wVar;
        this.b = eqhVar;
        this.c = eqhVar2;
        this.d = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.d;
        xvf0 xvf0Var2 = this.c;
        xvf0 xvf0Var3 = this.b;
        n3w n3wVar = this.e;
        switch (i) {
            case 0:
                return new zkx0((fva0) xvf0Var3.get(), (uqc) xvf0Var2.get(), (xn40) xvf0Var.get(), (si31) n3wVar.a);
            case 1:
                return new wrx0(i5m.a(xvf0Var3), (fva0) xvf0Var2.get(), (unx0) xvf0Var.get(), (bmq0) n3wVar.a);
            case 2:
                return new naz0((o1b0) n3wVar.a, (at2) xvf0Var3.get(), (k020) xvf0Var2.get(), (lqo) xvf0Var.get());
            default:
                return new vcz0((o1b0) n3wVar.a, (at2) xvf0Var3.get(), (k020) xvf0Var2.get(), (Moshi) xvf0Var.get());
        }
    }

    public /* synthetic */ alx0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, n3w n3wVar, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = n3wVar;
    }
}
