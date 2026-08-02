package defpackage;

/* loaded from: classes13.dex */
public final class g3s0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g18 b;

    public /* synthetic */ g3s0(g18 g18Var, int i) {
        this.a = i;
        this.b = g18Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.cancel();
                break;
            default:
                this.b.cancel();
                break;
        }
    }
}
