package defpackage;

/* loaded from: classes8.dex */
public final class d67 implements v7p {
    public final /* synthetic */ int a;
    public final xh b;
    public final xvf0 c;
    public final xvf0 d;

    public /* synthetic */ d67(xh xhVar, g430 g430Var, xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xhVar;
        this.c = g430Var;
        this.d = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.d;
        xvf0 xvf0Var2 = this.c;
        xh xhVar = this.b;
        switch (i) {
            case 0:
                return new b67(xhVar, (fx60) xvf0Var2.get(), (z0j) xvf0Var.get());
            case 1:
                return new j39(xhVar, (fx60) xvf0Var2.get(), (z0j) xvf0Var.get());
            case 2:
                return new yqd(xhVar, (fx60) xvf0Var2.get(), (z0j) xvf0Var.get());
            case 3:
                return new k4d0(xhVar, (fx60) xvf0Var2.get(), (z0j) xvf0Var.get());
            case 4:
                return new bb21(xhVar, (fx60) xvf0Var2.get(), (z0j) xvf0Var.get());
            default:
                return new lm51(xhVar, (fx60) xvf0Var2.get(), (z0j) xvf0Var.get());
        }
    }
}
