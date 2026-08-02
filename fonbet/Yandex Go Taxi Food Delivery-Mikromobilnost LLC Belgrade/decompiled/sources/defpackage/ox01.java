package defpackage;

import androidx.compose.runtime.f;

/* loaded from: classes.dex */
public final class ox01 {
    public final gl11 a;
    public final oz40 b = f.j(null);
    public final /* synthetic */ zx01 c;

    public ox01(zx01 zx01Var, gl11 gl11Var, String str) {
        this.c = zx01Var;
        this.a = gl11Var;
    }

    public final nx01 a(tls tlsVar, tls tlsVar2) {
        oz40 oz40Var = this.b;
        nx01 nx01Var = (nx01) oz40Var.getValue();
        zx01 zx01Var = this.c;
        if (nx01Var == null) {
            Object invoke = tlsVar2.invoke(zx01Var.c());
            Object invoke2 = tlsVar2.invoke(zx01Var.c());
            gl11 gl11Var = this.a;
            sj2 sj2Var = (sj2) gl11Var.a.invoke(invoke2);
            sj2Var.d();
            tx01 tx01Var = new tx01(zx01Var, invoke, sj2Var, gl11Var);
            nx01Var = new nx01(this, tx01Var, tlsVar, tlsVar2);
            oz40Var.setValue(nx01Var);
            zx01Var.i.add(tx01Var);
        }
        nx01Var.c = tlsVar2;
        nx01Var.b = tlsVar;
        nx01Var.a(zx01Var.f());
        return nx01Var;
    }
}
