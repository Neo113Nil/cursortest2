package defpackage;

/* loaded from: classes15.dex */
public final /* synthetic */ class ev21 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ gv21 b;
    public final /* synthetic */ hv21 c;

    public /* synthetic */ ev21(gv21 gv21Var, hv21 hv21Var, int i) {
        this.a = i;
        this.b = gv21Var;
        this.c = hv21Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        hv21 hv21Var = this.c;
        gv21 gv21Var = this.b;
        oll0 oll0Var = (oll0) obj;
        switch (i) {
            case 0:
                gv21Var.b.d(oll0Var, hv21Var);
                return zy11.a;
            default:
                return Long.valueOf(gv21Var.e.e(oll0Var, hv21Var));
        }
    }
}
