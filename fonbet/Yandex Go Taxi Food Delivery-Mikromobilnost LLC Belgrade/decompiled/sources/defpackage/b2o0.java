package defpackage;

/* loaded from: classes3.dex */
public final /* synthetic */ class b2o0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ f2o0 b;
    public final /* synthetic */ tls c;

    public /* synthetic */ b2o0(f2o0 f2o0Var, tls tlsVar, int i, int i2) {
        this.a = i2;
        this.b = f2o0Var;
        this.c = tlsVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        tls tlsVar = this.c;
        f2o0 f2o0Var = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                t2b1.b(f2o0Var, tlsVar, fidVar, vng.O(1));
                break;
            case 1:
                t2b1.a(f2o0Var, tlsVar, fidVar, vng.O(1));
                break;
            default:
                t2b1.c(f2o0Var, tlsVar, fidVar, vng.O(1));
                break;
        }
        return zy11Var;
    }
}
