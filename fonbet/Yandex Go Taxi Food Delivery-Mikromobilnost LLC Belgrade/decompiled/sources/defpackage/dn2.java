package defpackage;

/* loaded from: classes5.dex */
public final /* synthetic */ class dn2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bc b;

    public /* synthetic */ dn2(bc bcVar, int i) {
        this.a = i;
        this.b = bcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        bc bcVar = this.b;
        switch (i) {
            case 0:
                g3v0 g3v0Var = (g3v0) bcVar.x;
                if (g3v0Var != null) {
                    g3v0Var.n();
                    break;
                }
                break;
            default:
                g3v0 g3v0Var2 = (g3v0) bcVar.x;
                if (g3v0Var2 != null) {
                    g3v0Var2.i();
                    break;
                }
                break;
        }
    }
}
