package defpackage;

/* loaded from: classes12.dex */
public final /* synthetic */ class gp5 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ wg6 b;

    public /* synthetic */ gp5(wg6 wg6Var, int i) {
        this.a = i;
        this.b = wg6Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        float f = 0.0f;
        wg6 wg6Var = this.b;
        switch (i) {
            case 0:
                return Float.valueOf(1.0f - rfb1.e(wg6Var));
            case 1:
                return Float.valueOf(rfb1.e(wg6Var));
            case 2:
                return Float.valueOf(1.0f - rfb1.d(wg6Var));
            case 3:
                return Boolean.valueOf(wg6Var.B.getIntValue() > 0);
            case 4:
                if (rfb1.g(wg6Var) || rfb1.h(wg6Var)) {
                    return null;
                }
                return new dtr0(((dtr0) wg6Var.g.getValue()).a);
            case 5:
                return Float.valueOf(rfb1.e(wg6Var));
            case 6:
                return new dtr0(rfb1.b(wg6Var));
            case 7:
                return new dtr0(rfb1.b(wg6Var));
            case 8:
                return Boolean.valueOf(rfb1.b(wg6Var) != -1 || (-wg6Var.h.getFloatValue()) > 0.0f);
            case 9:
                if (rfb1.g(wg6Var) || rfb1.h(wg6Var)) {
                    return null;
                }
                return Integer.valueOf((int) (-wg6Var.h.getFloatValue()));
            case 10:
                return new dtr0(rfb1.b(wg6Var));
            case 11:
                return Boolean.valueOf(rfb1.g(wg6Var));
            case 12:
                return new dtr0(rfb1.b(wg6Var));
            case 13:
                return Integer.valueOf((int) (-wg6Var.h.getFloatValue()));
            case 14:
                return Float.valueOf(wg6Var.h.getFloatValue());
            case 15:
                return Float.valueOf(wg6Var.h.getFloatValue());
            case 16:
                return Float.valueOf(wg6Var.h.getFloatValue());
            case 17:
                return Float.valueOf(1.0f - rfb1.d(wg6Var));
            case 18:
                return Float.valueOf(y6i0.c(rfb1.f(wg6Var) - 1.0f, 0.0f, 1.0f));
            case 19:
                return Boolean.valueOf(rfb1.g(wg6Var));
            case 20:
                return Float.valueOf(wg6Var.h.getFloatValue());
            case 21:
                return Float.valueOf(rfb1.e(wg6Var));
            case 22:
                return Float.valueOf(y6i0.c((rfb1.e(wg6Var) - 0.35f) / 0.65f, 0.0f, 1.0f));
            case 23:
                return Float.valueOf(y6i0.c((0.35f - rfb1.e(wg6Var)) / 0.35f, 0.0f, 1.0f));
            case 24:
                return Boolean.valueOf(Math.abs(wg6Var.h.getFloatValue() - rfb1.c(wg6Var)) > 1.0f);
            case 25:
                return Float.valueOf(wg6Var.h.getFloatValue());
            case 26:
                return new ch6(rfb1.b(wg6Var), rfb1.g(wg6Var), rfb1.h(wg6Var));
            case 27:
                if (((dtr0) wg6Var.g.getValue()).a != -2 && !rfb1.g(wg6Var) && !rfb1.h(wg6Var)) {
                    f = 1.0f;
                }
                return Float.valueOf(f);
            case 28:
                return new ch6(rfb1.b(wg6Var), rfb1.g(wg6Var), rfb1.h(wg6Var));
            default:
                return Integer.valueOf((int) (-wg6Var.h.getFloatValue()));
        }
    }
}
