package defpackage;

/* loaded from: classes13.dex */
public final /* synthetic */ class lit0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ plp0 b;

    public /* synthetic */ lit0(plp0 plp0Var, int i) {
        this.a = i;
        this.b = plp0Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        plp0 plp0Var = this.b;
        switch (i) {
            case 0:
                plp0Var.f.run();
                break;
            default:
                plp0Var.g.run();
                break;
        }
        return zy11Var;
    }
}
