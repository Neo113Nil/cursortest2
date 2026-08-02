package defpackage;

/* loaded from: classes10.dex */
public final /* synthetic */ class bnw0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ enw0 b;

    public /* synthetic */ bnw0(enw0 enw0Var, int i) {
        this.a = i;
        this.b = enw0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        enw0 enw0Var = this.b;
        switch (i) {
            case 0:
                geb1.f().execute(new bnw0(enw0Var, 1));
                break;
            default:
                if (!enw0Var.n) {
                    enw0Var.e();
                    break;
                }
                break;
        }
    }
}
