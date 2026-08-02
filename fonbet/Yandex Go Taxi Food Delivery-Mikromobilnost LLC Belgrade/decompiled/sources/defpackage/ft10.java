package defpackage;

/* loaded from: classes15.dex */
public final /* synthetic */ class ft10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gt10 b;

    public /* synthetic */ ft10(gt10 gt10Var, int i) {
        this.a = i;
        this.b = gt10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        gt10 gt10Var = this.b;
        switch (i) {
            case 0:
                zf0 zf0Var = gt10Var.c;
                if (zf0Var != null) {
                    zf0Var.a = true;
                    zf0Var.b();
                    break;
                }
                break;
            default:
                zf0 zf0Var2 = gt10Var.c;
                if (zf0Var2 != null) {
                    zf0Var2.a = false;
                    zf0Var2.b();
                    break;
                }
                break;
        }
    }
}
