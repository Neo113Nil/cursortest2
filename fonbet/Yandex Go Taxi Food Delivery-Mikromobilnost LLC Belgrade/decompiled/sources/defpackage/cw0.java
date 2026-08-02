package defpackage;

/* loaded from: classes5.dex */
public final /* synthetic */ class cw0 implements wls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ f530 b;
    public final /* synthetic */ uv0 c;
    public final /* synthetic */ sls w;

    public /* synthetic */ cw0(f530 f530Var, uv0 uv0Var, sls slsVar) {
        this.b = f530Var;
        this.c = uv0Var;
        this.w = slsVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        sls slsVar = this.w;
        uv0 uv0Var = this.c;
        f530 f530Var = this.b;
        fid fidVar = (fid) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    coa1.b(f530Var, uv0Var, slsVar, btsVar, 0);
                    break;
                }
            default:
                num.getClass();
                coa1.b(f530Var, uv0Var, slsVar, fidVar, vng.O(1));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ cw0(f530 f530Var, uv0 uv0Var, sls slsVar, int i) {
        this.b = f530Var;
        this.c = uv0Var;
        this.w = slsVar;
    }
}
