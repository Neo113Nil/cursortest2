package defpackage;

/* loaded from: classes10.dex */
public final /* synthetic */ class lkf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qkf0 b;

    public /* synthetic */ lkf0(qkf0 qkf0Var, int i) {
        this.a = i;
        this.b = qkf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        qkf0 qkf0Var = this.b;
        switch (i) {
            case 0:
                qkf0Var.e0 = true;
                break;
            case 1:
                qkf0Var.v();
                break;
            default:
                if (!qkf0Var.k0) {
                    we10 we10Var = qkf0Var.L;
                    we10Var.getClass();
                    we10Var.onContinueLoadingRequested(qkf0Var);
                    break;
                }
                break;
        }
    }
}
