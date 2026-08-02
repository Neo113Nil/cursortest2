package defpackage;

/* loaded from: classes13.dex */
public final /* synthetic */ class izo0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ vzo0 b;
    public final /* synthetic */ tls c;

    public /* synthetic */ izo0(vzo0 vzo0Var, tls tlsVar, int i, int i2) {
        this.a = i2;
        this.b = vzo0Var;
        this.c = tlsVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        tls tlsVar = this.c;
        vzo0 vzo0Var = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                lzo0.a(vzo0Var, tlsVar, fidVar, vng.O(1));
                break;
            case 1:
                lzo0.b(vzo0Var, tlsVar, fidVar, vng.O(1));
                break;
            default:
                lzo0.f(vzo0Var, tlsVar, fidVar, vng.O(1));
                break;
        }
        return zy11Var;
    }
}
