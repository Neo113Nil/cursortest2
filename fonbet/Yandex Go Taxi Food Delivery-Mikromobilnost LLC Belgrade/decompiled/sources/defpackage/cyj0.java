package defpackage;

/* loaded from: classes15.dex */
public final /* synthetic */ class cyj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dyj0 b;
    public final /* synthetic */ txj0 c;

    public /* synthetic */ cyj0(dyj0 dyj0Var, txj0 txj0Var, int i) {
        this.a = i;
        this.b = dyj0Var;
        this.c = txj0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        txj0 txj0Var = this.c;
        dyj0 dyj0Var = this.b;
        switch (i) {
            case 0:
                tje.e();
                if (dyj0Var.a == null) {
                    txj0Var.close();
                    break;
                } else {
                    tje.e();
                    txj0 txj0Var2 = dyj0Var.b;
                    if (txj0Var2 != null) {
                        txj0Var2.close();
                    }
                    dyj0Var.b = txj0Var;
                    ((x6f0) dyj0Var.a.a).d(txj0Var);
                    break;
                }
            default:
                tje.e();
                if (dyj0Var.a == null) {
                    txj0Var.close();
                    break;
                } else {
                    tje.e();
                    txj0 txj0Var3 = dyj0Var.b;
                    if (txj0Var3 != null) {
                        txj0Var3.close();
                    }
                    dyj0Var.b = txj0Var;
                    ((x6f0) dyj0Var.a.a).d(txj0Var);
                    break;
                }
        }
    }
}
