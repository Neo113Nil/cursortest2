package defpackage;

/* loaded from: classes15.dex */
public final /* synthetic */ class my10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ oy10 b;

    public /* synthetic */ my10(oy10 oy10Var, int i) {
        this.a = i;
        this.b = oy10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        oy10 oy10Var = this.b;
        switch (i) {
            case 0:
                py10 py10Var = oy10Var.d;
                x08 f = ((n5t0) py10Var.b.get()).f(new ny10(oy10Var, py10Var));
                op3 op3Var = oy10Var.b;
                kgx kgxVar = oy10.e[0];
                op3Var.b(f);
                break;
            default:
                py10 py10Var2 = oy10Var.d;
                x08 f2 = ((n5t0) py10Var2.b.get()).f(new ny10(oy10Var, py10Var2));
                op3 op3Var2 = oy10Var.b;
                kgx kgxVar2 = oy10.e[0];
                op3Var2.b(f2);
                break;
        }
    }
}
