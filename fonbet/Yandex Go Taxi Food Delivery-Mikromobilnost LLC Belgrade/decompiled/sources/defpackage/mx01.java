package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class mx01 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ zx01 b;

    public /* synthetic */ mx01(zx01 zx01Var, int i) {
        this.a = i;
        this.b = zx01Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zx01 zx01Var = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf((jl40.l(zx01Var.d.getValue(), zx01Var.c()) && zx01Var.g.getLongValue() == Long.MIN_VALUE && !((Boolean) zx01Var.h.getValue()).booleanValue()) ? false : true);
            default:
                return Long.valueOf(zx01Var.b());
        }
    }
}
