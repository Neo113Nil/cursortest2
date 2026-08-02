package defpackage;

/* loaded from: classes10.dex */
public final /* synthetic */ class ifu implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ jfu b;

    public /* synthetic */ ifu(jfu jfuVar, int i) {
        this.a = i;
        this.b = jfuVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        jfu jfuVar = this.b;
        switch (i) {
            case 0:
                rp11 rp11Var = jfuVar.A;
                if (rp11Var == null) {
                    throw nzs.g("Font resolution state is not set.");
                }
                rp11Var.getValue();
                return zy11Var;
            default:
                rp11 rp11Var2 = jfuVar.A;
                if (rp11Var2 == null) {
                    throw nzs.g("Font resolution state is not set.");
                }
                rp11Var2.getValue();
                return zy11Var;
        }
    }
}
