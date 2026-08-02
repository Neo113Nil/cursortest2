package defpackage;

/* loaded from: classes7.dex */
public final /* synthetic */ class mg71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ng71 b;

    public /* synthetic */ mg71(ng71 ng71Var, int i) {
        this.a = i;
        this.b = ng71Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ng71 ng71Var = this.b;
        switch (i) {
            case 0:
                ng71Var.o();
                break;
            case 1:
                if (!ng71Var.g0) {
                    e771 e771Var = ng71Var.J;
                    e771Var.getClass();
                    e771Var.a((sn61) ng71Var);
                    break;
                }
                break;
            default:
                ng71Var.a0 = true;
                break;
        }
    }
}
