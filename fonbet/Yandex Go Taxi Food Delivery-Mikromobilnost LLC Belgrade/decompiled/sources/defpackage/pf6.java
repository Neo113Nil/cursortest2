package defpackage;

/* loaded from: classes14.dex */
public final /* synthetic */ class pf6 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ wg6 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int w;

    public /* synthetic */ pf6(wg6 wg6Var, float f, int i) {
        this.a = 1;
        this.b = wg6Var;
        this.c = f;
        this.w = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        float f = this.c;
        int i2 = this.w;
        wg6 wg6Var = this.b;
        switch (i) {
            case 0:
                return Float.valueOf(Math.abs(rfb1.c(wg6Var) - wg6Var.f(i2)) < f ? 0.0f : rfb1.e(wg6Var));
            case 1:
                if ((-wg6Var.h.getFloatValue()) > f && rfb1.e(wg6Var) >= 0.5f && ((dtr0) wg6Var.g.getValue()).a != i2) {
                    r1 = false;
                }
                return Boolean.valueOf(r1);
            default:
                return Boolean.valueOf((((dtr0) wg6Var.g.getValue()).a == i2) && ((wg6Var.h.getFloatValue() > (wg6Var.f(i2) + f) ? 1 : (wg6Var.h.getFloatValue() == (wg6Var.f(i2) + f) ? 0 : -1)) <= 0));
        }
    }

    public /* synthetic */ pf6(wg6 wg6Var, int i, float f, int i2) {
        this.a = i2;
        this.b = wg6Var;
        this.w = i;
        this.c = f;
    }
}
