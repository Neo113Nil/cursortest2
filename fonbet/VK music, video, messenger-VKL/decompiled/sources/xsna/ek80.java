package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class ek80 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ek80(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((fk80) this.c).q();
                break;
            default:
                pjk0 pjk0Var = (pjk0) this.c;
                mjk0 mjk0Var = pjk0Var.j;
                if (mjk0Var != null) {
                    mjk0Var.b();
                }
                mjk0 mjk0Var2 = pjk0Var.j;
                if (mjk0Var2 != null) {
                    mjk0Var2.a();
                }
                pjk0Var.j = null;
                pjk0Var.f = false;
                pjk0Var.b(null);
                break;
        }
    }
}
