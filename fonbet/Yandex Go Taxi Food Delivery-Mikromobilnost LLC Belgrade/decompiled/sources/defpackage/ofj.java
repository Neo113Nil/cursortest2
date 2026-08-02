package defpackage;

/* loaded from: classes11.dex */
public final /* synthetic */ class ofj implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ibp0 b;

    public /* synthetic */ ofj(rfj rfjVar, ibp0 ibp0Var) {
        this.a = 0;
        this.b = ibp0Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        c530 c530Var = c530.a;
        zy11 zy11Var = zy11.a;
        ibp0 ibp0Var = this.b;
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
                    btsVar.e0(-1089234444);
                    nnm.s(c530Var, Float.isNaN(Float.NaN) ? deb1.a(ibp0Var.c()) : Float.NaN, btsVar, false);
                    break;
                }
            case 1:
                int intValue2 = num.intValue();
                bts btsVar2 = (bts) fidVar;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else {
                    oeb1.c(btsVar2, ljs0.q(c530Var, Float.isNaN(Float.NaN) ? deb1.a(ibp0Var.c()) : Float.NaN));
                    break;
                }
            case 2:
                int intValue3 = num.intValue();
                bts btsVar3 = (bts) fidVar;
                if (!btsVar3.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                    btsVar3.Y();
                    break;
                } else {
                    oeb1.c(btsVar3, ljs0.q(c530Var, Float.isNaN(Float.NaN) ? deb1.a(ibp0Var.c()) : Float.NaN));
                    break;
                }
            case 3:
                int intValue4 = num.intValue();
                bts btsVar4 = (bts) fidVar;
                if (!btsVar4.V(intValue4 & 1, (intValue4 & 3) != 2)) {
                    btsVar4.Y();
                    break;
                } else {
                    k4b1.f(ibp0Var, btsVar4, 0);
                    break;
                }
            case 4:
                num.getClass();
                k4b1.f(ibp0Var, fidVar, vng.O(1));
                break;
            default:
                num.getClass();
                k4b1.f(ibp0Var, fidVar, vng.O(1));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ ofj(ibp0 ibp0Var, int i) {
        this.a = i;
        this.b = ibp0Var;
    }

    public /* synthetic */ ofj(ibp0 ibp0Var, int i, int i2) {
        this.a = i2;
        this.b = ibp0Var;
    }
}
