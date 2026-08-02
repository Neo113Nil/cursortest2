package defpackage;

/* loaded from: classes11.dex */
public final /* synthetic */ class frs0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ibp0 b;
    public final /* synthetic */ dss0 c;
    public final /* synthetic */ int w;

    public /* synthetic */ frs0(ibp0 ibp0Var, dss0 dss0Var, int i, int i2) {
        this.a = i2;
        this.b = ibp0Var;
        this.c = dss0Var;
        this.w = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.w;
        dss0 dss0Var = this.c;
        ibp0 ibp0Var = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                vdb1.a(ibp0Var, dss0Var, fidVar, vng.O(i2 | 1));
                break;
            default:
                vdb1.d(ibp0Var, dss0Var, fidVar, vng.O(i2 | 1));
                break;
        }
        return zy11Var;
    }
}
