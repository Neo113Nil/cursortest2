package defpackage;

/* loaded from: classes11.dex */
public final /* synthetic */ class oxl0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ dyl0 b;
    public final /* synthetic */ tls c;

    public /* synthetic */ oxl0(dyl0 dyl0Var, tls tlsVar, int i, int i2) {
        this.a = i2;
        this.b = dyl0Var;
        this.c = tlsVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        tls tlsVar = this.c;
        dyl0 dyl0Var = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                fu91.f(dyl0Var, tlsVar, fidVar, vng.O(1));
                break;
            default:
                fu91.e(dyl0Var, tlsVar, fidVar, vng.O(1));
                break;
        }
        return zy11Var;
    }
}
