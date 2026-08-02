package defpackage;

/* loaded from: classes13.dex */
public final /* synthetic */ class bx2 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ oip0 b;
    public final /* synthetic */ yx40 c;

    public /* synthetic */ bx2(oip0 oip0Var, yx40 yx40Var, int i) {
        this.a = i;
        this.b = oip0Var;
        this.c = yx40Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        yx40 yx40Var = this.c;
        oip0 oip0Var = this.b;
        switch (i) {
            case 0:
                return Float.valueOf(yx40Var.getIntValue() != 0 ? y6i0.c(1.0f - (oip0Var.a.getIntValue() / yx40Var.getIntValue()), 0.0f, 1.0f) : 1.0f);
            default:
                return Float.valueOf(yx40Var.getIntValue() != 0 ? y6i0.c(1.0f - (oip0Var.a.getIntValue() / yx40Var.getIntValue()), 0.0f, 1.0f) : 1.0f);
        }
    }
}
