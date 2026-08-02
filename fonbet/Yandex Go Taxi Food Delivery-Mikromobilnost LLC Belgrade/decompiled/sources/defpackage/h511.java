package defpackage;

/* loaded from: classes12.dex */
public final /* synthetic */ class h511 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ jh5 b;
    public final /* synthetic */ ig5 c;

    public /* synthetic */ h511(jh5 jh5Var, ig5 ig5Var, int i) {
        this.a = i;
        this.b = jh5Var;
        this.c = ig5Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        ig5 ig5Var = this.c;
        jh5 jh5Var = this.b;
        switch (i) {
            case 0:
                jh5Var.a.dispatch(((f511) ig5Var).c);
                break;
            case 1:
                jh5Var.a.dispatch(((r511) ig5Var).c);
                break;
            default:
                jh5Var.a.dispatch(((tb11) ig5Var).c);
                break;
        }
        return zy11Var;
    }
}
