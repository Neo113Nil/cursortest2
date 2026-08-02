package defpackage;

/* loaded from: classes11.dex */
public final /* synthetic */ class mrm0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ urm0 b;

    public /* synthetic */ mrm0(urm0 urm0Var, int i, int i2) {
        this.a = i2;
        this.b = urm0Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        urm0 urm0Var = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                e0b1.d(urm0Var, fidVar, vng.O(1));
                break;
            case 1:
                e0b1.f(urm0Var, fidVar, vng.O(1));
                break;
            default:
                e0b1.b(urm0Var, fidVar, vng.O(1));
                break;
        }
        return zy11Var;
    }
}
