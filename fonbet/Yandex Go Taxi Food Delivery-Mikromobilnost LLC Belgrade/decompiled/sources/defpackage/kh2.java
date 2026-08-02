package defpackage;

/* loaded from: classes9.dex */
public final /* synthetic */ class kh2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gtg b;

    public /* synthetic */ kh2(gtg gtgVar, int i) {
        this.a = i;
        this.b = gtgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        gtg gtgVar = this.b;
        switch (i) {
            case 0:
                gtgVar.invoke();
                break;
            default:
                lh2 lh2Var = lh2.c;
                gtgVar.invoke();
                break;
        }
    }
}
