package defpackage;

/* loaded from: classes5.dex */
public final /* synthetic */ class dz1 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ xm00 b;

    public /* synthetic */ dz1(xm00 xm00Var, int i) {
        this.a = i;
        this.b = xm00Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        xm00 xm00Var = this.b;
        switch (i) {
            case 0:
                return xm00Var.p();
            case 1:
                xm00Var.d();
                xm00Var.m();
                return zy11.a;
            default:
                return xm00Var.p();
        }
    }
}
