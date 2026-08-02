package defpackage;

/* loaded from: classes15.dex */
public final /* synthetic */ class evi0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ fvi0 b;
    public final /* synthetic */ cvi0 c;

    public /* synthetic */ evi0(fvi0 fvi0Var, cvi0 cvi0Var, int i) {
        this.a = i;
        this.b = fvi0Var;
        this.c = cvi0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        cvi0 cvi0Var = this.c;
        fvi0 fvi0Var = this.b;
        oll0 oll0Var = (oll0) obj;
        switch (i) {
            case 0:
                return Long.valueOf(fvi0Var.b.e(oll0Var, cvi0Var));
            default:
                return Integer.valueOf(fvi0Var.c.c(oll0Var, cvi0Var));
        }
    }
}
