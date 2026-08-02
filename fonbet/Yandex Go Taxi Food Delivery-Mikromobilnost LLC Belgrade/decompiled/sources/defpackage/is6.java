package defpackage;

/* loaded from: classes11.dex */
public final /* synthetic */ class is6 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ oip0 b;

    public /* synthetic */ is6(oip0 oip0Var, int i) {
        this.a = i;
        this.b = oip0Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int b;
        int b2;
        int intValue;
        int i = this.a;
        float f = 0.0f;
        oip0 oip0Var = this.b;
        switch (i) {
            case 0:
                return Float.valueOf(oip0Var.b() ? 1.0f : 0.0f);
            case 1:
                return Float.valueOf(oip0Var.b() ? 1.0f : 0.0f);
            case 2:
                int intValue2 = oip0Var.e.getIntValue();
                int intValue3 = oip0Var.b.getIntValue();
                if (intValue2 != 0 && intValue2 != Integer.MAX_VALUE && intValue3 != 0 && (b = m810.b(intValue3 * 0.15f)) != 0) {
                    f = Math.min((intValue2 - oip0Var.a.getIntValue()) / b, 1.0f);
                }
                return Float.valueOf(f);
            case 3:
                return Boolean.valueOf(oip0Var.a.getIntValue() > 0);
            case 4:
                int intValue4 = oip0Var.e.getIntValue();
                if (intValue4 != 0 && intValue4 != Integer.MAX_VALUE) {
                    f = Math.min((intValue4 - oip0Var.a.getIntValue()) / 24.0f, 1.0f);
                }
                return Float.valueOf(f);
            case 5:
                int intValue5 = oip0Var.e.getIntValue();
                int intValue6 = oip0Var.b.getIntValue();
                if (intValue5 != 0 && intValue5 != Integer.MAX_VALUE && intValue6 != 0 && (b2 = m810.b(intValue6 * 0.15f)) != 0) {
                    f = Math.min((intValue5 - oip0Var.a.getIntValue()) / b2, 1.0f);
                }
                return Float.valueOf(f);
            case 6:
                intValue = oip0Var.e.getIntValue();
                break;
            case 7:
                return Boolean.valueOf(oip0Var.a.getIntValue() < oip0Var.e.getIntValue());
            case 8:
                return Boolean.valueOf(oip0Var.a.getIntValue() > 0);
            default:
                intValue = oip0Var.a.getIntValue();
                break;
        }
        return Integer.valueOf(intValue);
    }
}
