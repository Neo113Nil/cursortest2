package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class nwi implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nwi(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((gzs) this.c).invoke();
                break;
            default:
                pjk0 pjk0Var = (pjk0) this.c;
                pjk0Var.g = true;
                u1u0.f(0L, pjk0Var.q);
                break;
        }
    }
}
