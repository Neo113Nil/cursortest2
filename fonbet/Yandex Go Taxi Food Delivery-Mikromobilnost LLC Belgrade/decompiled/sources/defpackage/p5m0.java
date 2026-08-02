package defpackage;

/* loaded from: classes3.dex */
public final /* synthetic */ class p5m0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ wls b;
    public final /* synthetic */ tls c;

    public /* synthetic */ p5m0(wls wlsVar, tls tlsVar, int i) {
        this.a = i;
        this.b = wlsVar;
        this.c = tlsVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = 3;
        tls tlsVar = this.c;
        wls wlsVar = this.b;
        n70 n70Var = (n70) obj;
        switch (i) {
            case 0:
                ((d261) n70Var.N).b.setActionHandler(new p70(wlsVar, n70Var, 2));
                n70Var.W(new ns3(n70Var, 10));
                n70Var.a0(new h4m0(i2, n70Var, tlsVar));
                break;
            default:
                n70Var.W(new p70(n70Var, wlsVar, i2));
                n70Var.a0(new h4m0(4, n70Var, tlsVar));
                break;
        }
        return zy11Var;
    }
}
