package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class ddx implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ gzs c;

    public /* synthetic */ ddx(int i, gzs gzsVar) {
        this.b = i;
        this.c = gzsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.c.invoke();
                break;
            case 1:
                this.c.invoke();
                break;
            default:
                this.c.invoke();
                break;
        }
    }
}
