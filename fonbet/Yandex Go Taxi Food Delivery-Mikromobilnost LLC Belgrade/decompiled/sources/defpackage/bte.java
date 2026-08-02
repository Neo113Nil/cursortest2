package defpackage;

/* loaded from: classes11.dex */
public final class bte implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ pte b;

    public /* synthetic */ bte(pte pteVar, int i) {
        this.a = i;
        this.b = pteVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        pte pteVar = this.b;
        switch (i) {
            case 0:
                ibp0 ibp0Var = (ibp0) obj;
                fid fidVar = (fid) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((bts) fidVar).k(ibp0Var) ? 4 : 2;
                }
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 19) != 18)) {
                    btsVar.Y();
                    break;
                } else {
                    ovi0 ovi0Var = pteVar.b;
                    if (ovi0Var != null) {
                        btsVar.e0(-1441116227);
                        tdb1.d(ibp0Var, ovi0Var, null, null, null, null, 0.0f, 0, null, btsVar, intValue & 14, 510);
                        btsVar.t(false);
                        break;
                    } else {
                        btsVar.e0(-1441116228);
                        btsVar.t(false);
                        break;
                    }
                }
            default:
                ebp0 ebp0Var = (ebp0) obj;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Number) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((bts) fidVar2).k(ebp0Var) ? 4 : 2;
                }
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                    btsVar2.Y();
                    break;
                } else {
                    p9b1.c(ebp0Var, pteVar.a, null, null, null, 0, 0, null, null, null, 0, 0, null, btsVar2, intValue2 & 14, 0, 8190);
                    break;
                }
        }
        return zy11Var;
    }
}
