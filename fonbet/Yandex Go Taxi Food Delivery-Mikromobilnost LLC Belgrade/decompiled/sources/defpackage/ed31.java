package defpackage;

/* loaded from: classes14.dex */
public final /* synthetic */ class ed31 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ wg6 b;

    public /* synthetic */ ed31(wg6 wg6Var, int i) {
        this.a = i;
        this.b = wg6Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        wg6 wg6Var = this.b;
        switch (i) {
            case 0:
                return Integer.valueOf((int) (-wg6Var.h.getFloatValue()));
            case 1:
                return Float.valueOf(wg6Var.h.getFloatValue());
            case 2:
                return Boolean.valueOf(((dtr0) wg6Var.g.getValue()).a == -2);
            case 3:
                return new dtr0(rfb1.b(wg6Var));
            default:
                return Boolean.valueOf(rfb1.g(wg6Var));
        }
    }
}
