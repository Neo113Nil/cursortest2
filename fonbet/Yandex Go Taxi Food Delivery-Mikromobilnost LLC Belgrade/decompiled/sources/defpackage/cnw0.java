package defpackage;

/* loaded from: classes10.dex */
public final /* synthetic */ class cnw0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dnw0 b;

    public /* synthetic */ cnw0(dnw0 dnw0Var, int i) {
        this.a = i;
        this.b = dnw0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        dnw0 dnw0Var = this.b;
        switch (i) {
            case 0:
                dnw0Var.a();
                break;
            case 1:
                dnw0Var.b();
                break;
            default:
                snw0 snw0Var = dnw0Var.r;
                if (snw0Var != null) {
                    snw0Var.d();
                }
                if (dnw0Var.q == null) {
                    dnw0Var.p.c();
                }
                dnw0Var.q = null;
                break;
        }
    }
}
