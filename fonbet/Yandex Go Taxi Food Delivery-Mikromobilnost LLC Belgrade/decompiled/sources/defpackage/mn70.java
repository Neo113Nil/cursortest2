package defpackage;

/* loaded from: classes14.dex */
public final /* synthetic */ class mn70 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ nn70 b;
    public final /* synthetic */ int c;

    public /* synthetic */ mn70(nn70 nn70Var, int i, int i2) {
        this.a = i2;
        this.b = nn70Var;
        this.c = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.c;
        nn70 nn70Var = this.b;
        switch (i) {
            case 0:
                return Float.valueOf(tje.w(((Number) nn70Var.c.invoke(Integer.valueOf(i2))).intValue(), nn70Var.a));
            case 1:
                return Integer.valueOf(tje.u(((Number) nn70Var.d.invoke(Integer.valueOf(i2))).intValue(), nn70Var.a));
            default:
                return Integer.valueOf(tje.u(((Number) nn70Var.b.invoke(Integer.valueOf(i2))).intValue(), nn70Var.a));
        }
    }
}
