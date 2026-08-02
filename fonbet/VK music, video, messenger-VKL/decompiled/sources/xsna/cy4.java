package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class cy4 implements Runnable {
    public final /* synthetic */ int b;

    public /* synthetic */ cy4(int i) {
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                dy4 dy4Var = dy4.p;
                break;
            default:
                dw20 dw20Var = i4a.a;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                i4a.a = null;
                break;
        }
    }
}
