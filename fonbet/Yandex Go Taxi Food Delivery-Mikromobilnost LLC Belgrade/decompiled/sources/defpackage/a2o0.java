package defpackage;

/* loaded from: classes3.dex */
public final /* synthetic */ class a2o0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ f2o0 b;

    public /* synthetic */ a2o0(f2o0 f2o0Var, int i, int i2) {
        this.a = i2;
        this.b = f2o0Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        f2o0 f2o0Var = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                t2b1.e(f2o0Var, fidVar, vng.O(1));
                break;
            case 1:
                t2b1.f(f2o0Var, fidVar, vng.O(1));
                break;
            default:
                t2b1.g(f2o0Var, fidVar, vng.O(1));
                break;
        }
        return zy11Var;
    }
}
