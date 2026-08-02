package defpackage;

/* loaded from: classes6.dex */
public final /* synthetic */ class dd40 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ei40 b;
    public final /* synthetic */ tls c;

    public /* synthetic */ dd40(ei40 ei40Var, tls tlsVar, int i, int i2) {
        this.a = i2;
        this.b = ei40Var;
        this.c = tlsVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        tls tlsVar = this.c;
        ei40 ei40Var = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ed40.E(ei40Var, tlsVar, fidVar, vng.O(1));
                break;
            default:
                ed40.n(ei40Var, tlsVar, fidVar, vng.O(1));
                break;
        }
        return zy11Var;
    }
}
