package defpackage;

import yads.pn2;

/* loaded from: classes7.dex */
public final /* synthetic */ class b381 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pn2 b;

    public /* synthetic */ b381(pn2 pn2Var, int i) {
        this.a = i;
        this.b = pn2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        pn2 pn2Var = this.b;
        switch (i) {
            case 0:
                pn2Var.b();
                break;
            default:
                pn2Var.a();
                break;
        }
    }
}
