package defpackage;

import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes13.dex */
public final /* synthetic */ class c2o0 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ f2o0 b;

    public /* synthetic */ c2o0(f2o0 f2o0Var, int i) {
        this.a = i;
        this.b = f2o0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        f2o0 f2o0Var = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    btsVar.Y();
                    break;
                } else {
                    ovi0 a = mja1.a(f2o0Var.a, null, 6);
                    hcd.a.getClass();
                    v0b1.a(a, null, null, hcd.b, null, null, null, null, 0.0f, 0, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 1014);
                    break;
                }
            case 1:
                ebp0 ebp0Var = (ebp0) obj;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((bts) fidVar2).k(ebp0Var) ? 4 : 2;
                }
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                    btsVar2.Y();
                    break;
                } else {
                    m9b1.a(ebp0Var, f2o0Var.d, null, null, null, 0, 0, null, null, null, 0, 0, null, btsVar2, intValue2 & 14, 0, 16382);
                    break;
                }
            default:
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
                    m9b1.a(ebp0Var2, f2o0Var.e, null, null, xya1.e(btsVar3).g.b, 0, 0, null, null, null, 0, 0, null, btsVar3, intValue3 & 14, 0, 16374);
                    break;
                }
        }
        return zy11Var;
    }
}
