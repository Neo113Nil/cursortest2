package defpackage;

/* loaded from: classes15.dex */
public final /* synthetic */ class pbi0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qbi0 b;

    public /* synthetic */ pbi0(qbi0 qbi0Var, int i) {
        this.a = i;
        this.b = qbi0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        qbi0 qbi0Var = this.b;
        switch (i) {
            case 0:
                qbi0Var.a();
                break;
            default:
                qbi0Var.a();
                break;
        }
    }
}
