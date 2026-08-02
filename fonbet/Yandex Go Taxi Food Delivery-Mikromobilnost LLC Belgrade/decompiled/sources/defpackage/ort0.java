package defpackage;

/* loaded from: classes13.dex */
public final /* synthetic */ class ort0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ prt0 b;

    public /* synthetic */ ort0(prt0 prt0Var, int i) {
        this.a = i;
        this.b = prt0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        prt0 prt0Var = this.b;
        switch (i) {
            case 0:
                prt0Var.c.postDelayed(new ort0(prt0Var, 1), 500L);
                break;
            default:
                prt0Var.d.invoke();
                break;
        }
    }
}
