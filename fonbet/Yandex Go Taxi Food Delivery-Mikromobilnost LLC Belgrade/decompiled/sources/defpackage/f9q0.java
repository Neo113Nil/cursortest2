package defpackage;

/* loaded from: classes5.dex */
public final /* synthetic */ class f9q0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ l3t0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ f9q0(l3t0 l3t0Var, int i, int i2) {
        this.a = i2;
        this.b = l3t0Var;
        this.c = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.c;
        l3t0 l3t0Var = this.b;
        rzx rzxVar = (rzx) obj;
        switch (i) {
            case 0:
                l3t0Var.put(Integer.valueOf(i2), Integer.valueOf((int) (rzxVar.e() >> 32)));
                break;
            default:
                l3t0Var.put(Integer.valueOf(i2), Integer.valueOf((int) (rzxVar.e() >> 32)));
                break;
        }
        return zy11Var;
    }
}
