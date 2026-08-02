package defpackage;

/* loaded from: classes6.dex */
public final /* synthetic */ class nd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x880 b;

    public /* synthetic */ nd(x880 x880Var, int i) {
        this.a = i;
        this.b = x880Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        x880 x880Var = this.b;
        switch (i) {
            case 0:
                x880Var.o();
                break;
            case 1:
                x880Var.n();
                break;
            default:
                x880Var.o();
                break;
        }
    }
}
