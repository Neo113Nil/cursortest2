package defpackage;

/* loaded from: classes9.dex */
public final /* synthetic */ class kq2 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ yvf0 b;

    public /* synthetic */ kq2(yvf0 yvf0Var, int i) {
        this.a = i;
        this.b = yvf0Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        exf0 plugin;
        int i = this.a;
        yvf0 yvf0Var = this.b;
        switch (i) {
            case 0:
                return (pav) yvf0Var.get();
            case 1:
                return (dw) yvf0Var.get();
            case 2:
                return (dw) yvf0Var.get();
            case 3:
                return (dw) yvf0Var.get();
            case 4:
                return (dw) yvf0Var.get();
            case 5:
                return (dw) yvf0Var.get();
            case 6:
                return (dw) yvf0Var.get();
            case 7:
                return (dw) yvf0Var.get();
            case 8:
                return (dw) yvf0Var.get();
            case 9:
                return (dw) yvf0Var.get();
            case 10:
                return (dw) yvf0Var.get();
            case 11:
                return (ib5) yvf0Var.get();
            case 12:
                return (oav) yvf0Var.get();
            case 13:
                return (pwy0) yvf0Var.get();
            default:
                t3d0 t3d0Var = (t3d0) ((z3d0) yvf0Var.get());
                synchronized (t3d0Var) {
                    plugin = t3d0Var.getPlugin();
                }
                if (plugin != null) {
                    return plugin;
                }
                xfo.g(qv10.m(exf0.class, "Plugin ", " is absent! You must install plugin before using it!"));
                return null;
        }
    }
}
