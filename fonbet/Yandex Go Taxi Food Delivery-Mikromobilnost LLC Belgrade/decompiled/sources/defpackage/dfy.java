package defpackage;

/* loaded from: classes6.dex */
public final /* synthetic */ class dfy implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tse b;

    public /* synthetic */ dfy(tse tseVar, int i) {
        this.a = i;
        this.b = tseVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        tse tseVar = this.b;
        switch (i) {
            case 0:
                l8x l8xVar = (l8x) tseVar.getCoroutineContext().get(seu.C);
                if (l8xVar != null) {
                    l8xVar.a(null);
                    break;
                }
                break;
            default:
                l8x l8xVar2 = (l8x) tseVar.getCoroutineContext().get(seu.C);
                if (l8xVar2 != null) {
                    l8xVar2.a(null);
                    break;
                }
                break;
        }
    }
}
