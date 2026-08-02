package defpackage;

/* loaded from: classes13.dex */
public final /* synthetic */ class d2p0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ l2p0 b;
    public final /* synthetic */ tls c;

    public /* synthetic */ d2p0(l2p0 l2p0Var, tls tlsVar, int i, int i2) {
        this.a = i2;
        this.b = l2p0Var;
        this.c = tlsVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        tls tlsVar = this.c;
        l2p0 l2p0Var = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                g2p0.b(l2p0Var, tlsVar, fidVar, vng.O(1));
                break;
            case 1:
                g2p0.a(l2p0Var, tlsVar, fidVar, vng.O(1));
                break;
            case 2:
                g2p0.f(l2p0Var, tlsVar, fidVar, vng.O(1));
                break;
            default:
                g2p0.d(l2p0Var, tlsVar, fidVar, vng.O(1));
                break;
        }
        return zy11Var;
    }
}
