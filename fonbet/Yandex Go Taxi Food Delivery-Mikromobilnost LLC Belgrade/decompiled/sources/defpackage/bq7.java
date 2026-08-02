package defpackage;

/* loaded from: classes10.dex */
public final /* synthetic */ class bq7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ iq7 b;
    public final /* synthetic */ xs7 c;

    public /* synthetic */ bq7(iq7 iq7Var, xs7 xs7Var, int i) {
        this.a = i;
        this.b = iq7Var;
        this.c = xs7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a = this.c;
                break;
            default:
                try {
                    if (this.b.j(this.c)) {
                        jst.e.getClass();
                        break;
                    }
                } catch (IllegalStateException e) {
                    zgz.a("Strange bug with `hasCamera` on some devices after timeout", e);
                }
                break;
        }
    }
}
