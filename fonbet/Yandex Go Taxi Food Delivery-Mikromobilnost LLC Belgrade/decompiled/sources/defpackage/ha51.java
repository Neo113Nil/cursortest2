package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class ha51 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ia51 b;
    public final /* synthetic */ oll0 c;

    public /* synthetic */ ha51(ia51 ia51Var, oll0 oll0Var, int i) {
        this.a = i;
        this.b = ia51Var;
        this.c = oll0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        oll0 oll0Var = this.c;
        ia51 ia51Var = this.b;
        w53 w53Var = (w53) obj;
        switch (i) {
            case 0:
                ia51Var.a(oll0Var, w53Var);
                break;
            default:
                ia51Var.b(oll0Var, w53Var);
                break;
        }
        return zy11Var;
    }
}
