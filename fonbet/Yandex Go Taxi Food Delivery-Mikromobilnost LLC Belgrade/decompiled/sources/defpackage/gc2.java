package defpackage;

/* loaded from: classes10.dex */
public final /* synthetic */ class gc2 implements wls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ sls c;
    public final /* synthetic */ f530 w;
    public final /* synthetic */ int x;

    public /* synthetic */ gc2(f530 f530Var, sls slsVar, boolean z, int i) {
        this.w = f530Var;
        this.c = slsVar;
        this.b = z;
        this.x = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.x;
        f530 f530Var = this.w;
        sls slsVar = this.c;
        boolean z = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                pva1.c(vng.O(i2 | 1), fidVar, slsVar, f530Var, z);
                break;
            default:
                kww.a(vng.O(i2 | 1), fidVar, slsVar, f530Var, z);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ gc2(boolean z, sls slsVar, f530 f530Var, int i) {
        this.b = z;
        this.c = slsVar;
        this.w = f530Var;
        this.x = i;
    }
}
