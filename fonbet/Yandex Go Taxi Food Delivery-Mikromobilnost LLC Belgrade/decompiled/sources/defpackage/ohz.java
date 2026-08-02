package defpackage;

/* loaded from: classes5.dex */
public final /* synthetic */ class ohz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ iej b;

    public /* synthetic */ ohz(iej iejVar, int i) {
        this.a = i;
        this.b = iejVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        yej yejVar = yej.a;
        wej wejVar = wej.a;
        iej iejVar = this.b;
        switch (i) {
            case 0:
                iejVar.c(wejVar);
                break;
            case 1:
                iejVar.c(yejVar);
                break;
            case 2:
                iejVar.c(vej.a);
                break;
            case 3:
                iejVar.c(yejVar);
                break;
            case 4:
                iejVar.c(wejVar);
                break;
            default:
                iejVar.c(xej.a);
                break;
        }
    }
}
