package defpackage;

/* loaded from: classes10.dex */
public final /* synthetic */ class mlh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ znw0 b;

    public /* synthetic */ mlh(znw0 znw0Var, int i) {
        this.a = i;
        this.b = znw0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        znw0 znw0Var = this.b;
        switch (i) {
            case 0:
                znw0Var.d();
                break;
            default:
                znw0Var.h.cancel(true);
                break;
        }
    }
}
