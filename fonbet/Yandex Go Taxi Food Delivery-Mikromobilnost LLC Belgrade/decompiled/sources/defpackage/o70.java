package defpackage;

/* loaded from: classes3.dex */
public final /* synthetic */ class o70 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ wls b;
    public final /* synthetic */ sls c;

    public /* synthetic */ o70(wls wlsVar, sls slsVar, int i) {
        this.a = i;
        this.b = wlsVar;
        this.c = slsVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        sls slsVar = this.c;
        wls wlsVar = this.b;
        switch (i) {
            case 0:
                return new lum(new zbd(6), new bj0(4, (spl) obj), new o70(wlsVar, slsVar, 1), r70.a);
            default:
                n70 n70Var = (n70) obj;
                int i2 = 0;
                ((d261) n70Var.N).b.setActionHandler(new p70(wlsVar, n70Var, i2));
                n70Var.W(new q70(n70Var, slsVar, i2));
                return zy11.a;
        }
    }
}
