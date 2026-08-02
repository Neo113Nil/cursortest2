package defpackage;

/* loaded from: classes.dex */
public final class nx01 implements m3u0 {
    public final tx01 a;
    public tls b;
    public tls c;
    public final /* synthetic */ ox01 w;

    public nx01(ox01 ox01Var, tx01 tx01Var, tls tlsVar, tls tlsVar2) {
        this.w = ox01Var;
        this.a = tx01Var;
        this.b = tlsVar;
        this.c = tlsVar2;
    }

    public final void a(rx01 rx01Var) {
        Object invoke = this.c.invoke(rx01Var.b());
        boolean g = this.w.c.g();
        tx01 tx01Var = this.a;
        if (g) {
            tx01Var.f(this.c.invoke(rx01Var.c()), invoke, (qar) this.b.invoke(rx01Var));
        } else {
            tx01Var.g(invoke, (qar) this.b.invoke(rx01Var));
        }
    }

    @Override // defpackage.m3u0
    public final Object getValue() {
        a(this.w.c.f());
        return this.a.A.getValue();
    }
}
