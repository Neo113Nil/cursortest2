package defpackage;

/* loaded from: classes6.dex */
public final /* synthetic */ class aqu0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bqu0 b;

    public /* synthetic */ aqu0(bqu0 bqu0Var, int i) {
        this.a = i;
        this.b = bqu0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        bqu0 bqu0Var = this.b;
        switch (i) {
            case 0:
                bqu0Var.v();
                break;
            case 1:
                bqu0Var.v();
                break;
            case 2:
                bqu0Var.u();
                break;
            case 3:
                bqu0Var.u();
                break;
            case 4:
                bqu0Var.u();
                break;
            default:
                bqu0Var.v();
                break;
        }
    }
}
