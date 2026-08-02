package defpackage;

/* loaded from: classes15.dex */
public final /* synthetic */ class lrh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mrh b;

    public /* synthetic */ lrh(mrh mrhVar, int i) {
        this.a = i;
        this.b = mrhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        mrh mrhVar = this.b;
        switch (i) {
            case 0:
                mrhVar.x.setVisibility(0);
                break;
            default:
                mrhVar.x.setVisibility(8);
                break;
        }
    }
}
