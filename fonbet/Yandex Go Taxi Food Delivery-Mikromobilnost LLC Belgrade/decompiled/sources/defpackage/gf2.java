package defpackage;

/* loaded from: classes6.dex */
public final /* synthetic */ class gf2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hf2 b;

    public /* synthetic */ gf2(hf2 hf2Var, int i) {
        this.a = i;
        this.b = hf2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        hf2 hf2Var = this.b;
        switch (i) {
            case 0:
                hf2Var.l = null;
                hf2Var.d();
                break;
            case 1:
                hf2Var.l = null;
                break;
            case 2:
                hf2Var.b(true);
                break;
            default:
                hf2Var.d();
                break;
        }
    }
}
