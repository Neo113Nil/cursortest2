package defpackage;

/* loaded from: classes13.dex */
public final /* synthetic */ class nhi0 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ dhi0 b;

    public /* synthetic */ nhi0(dhi0 dhi0Var, int i) {
        this.a = i;
        this.b = dhi0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        c530 c530Var = c530.a;
        zy11 zy11Var = zy11.a;
        dhi0 dhi0Var = this.b;
        switch (i) {
            case 0:
                ebp0 ebp0Var = (ebp0) obj;
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((bts) fidVar).k(ebp0Var) ? 4 : 2;
                }
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 19) != 18)) {
                    btsVar.Y();
                    break;
                } else {
                    p9b1.c(ebp0Var, ((bhi0) dhi0Var).a, null, null, null, 0, 0, null, null, null, 0, 0, null, btsVar, intValue & 14, 0, 8190);
                    break;
                }
            case 1:
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                    btsVar2.Y();
                    break;
                } else {
                    jeb1.f(((bhi0) dhi0Var).c, an91.m(c530Var, 14.0f, 0.0f, 2), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar2).h.a, btsVar2, 48, 0, 16380);
                    break;
                }
            case 2:
                ebp0 ebp0Var2 = (ebp0) obj;
                fid fidVar3 = (fid) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((bts) fidVar3).k(ebp0Var2) ? 4 : 2;
                }
                bts btsVar3 = (bts) fidVar3;
                if (!btsVar3.V(intValue3 & 1, (intValue3 & 19) != 18)) {
                    btsVar3.Y();
                    break;
                } else {
                    p9b1.c(ebp0Var2, ((chi0) dhi0Var).a, null, null, null, 0, 0, null, null, null, 0, 0, null, btsVar3, intValue3 & 14, 0, 8190);
                    break;
                }
            default:
                fid fidVar4 = (fid) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                bts btsVar4 = (bts) fidVar4;
                if (!btsVar4.V(intValue4 & 1, (intValue4 & 17) != 16)) {
                    btsVar4.Y();
                    break;
                } else {
                    jeb1.f(((bhi0) dhi0Var).b, an91.m(c530Var, 14.0f, 0.0f, 2), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar4).h.a, btsVar4, 48, 0, 16380);
                    break;
                }
        }
        return zy11Var;
    }
}
