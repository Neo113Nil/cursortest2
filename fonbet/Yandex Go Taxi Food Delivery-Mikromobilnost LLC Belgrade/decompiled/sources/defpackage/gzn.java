package defpackage;

/* loaded from: classes10.dex */
public final /* synthetic */ class gzn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xyn b;

    public /* synthetic */ gzn(xyn xynVar, int i) {
        this.a = i;
        this.b = xynVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        xyn xynVar = this.b;
        switch (i) {
            case 0:
                xynVar.l();
                break;
            default:
                xynVar.getClass();
                break;
        }
    }
}
