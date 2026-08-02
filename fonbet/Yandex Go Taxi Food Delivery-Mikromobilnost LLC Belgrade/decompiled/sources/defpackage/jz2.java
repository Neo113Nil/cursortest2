package defpackage;

import androidx.compose.runtime.internal.a;

/* loaded from: classes5.dex */
public final /* synthetic */ class jz2 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ jz2(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                ((Integer) obj3).getClass();
                aVar.invoke((fid) obj2, 0);
                break;
            case 1:
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    btsVar.Y();
                    break;
                } else {
                    aVar.invoke(btsVar, 6);
                    break;
                }
            case 2:
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                    btsVar2.Y();
                    break;
                } else {
                    aVar.invoke(btsVar2, 6);
                    break;
                }
            case 3:
                fid fidVar3 = (fid) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (!btsVar3.V(intValue3 & 1, (intValue3 & 17) != 16)) {
                    btsVar3.Y();
                    break;
                } else {
                    aVar.invoke(btsVar3, 6);
                    break;
                }
            case 4:
                fid fidVar4 = (fid) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                bts btsVar4 = (bts) fidVar4;
                if (!btsVar4.V(intValue4 & 1, (intValue4 & 17) != 16)) {
                    btsVar4.Y();
                    break;
                } else {
                    aVar.invoke(btsVar4, 6);
                    break;
                }
            case 5:
                bj6 bj6Var = (bj6) obj;
                fid fidVar5 = (fid) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((bts) fidVar5).k(bj6Var) ? 4 : 2;
                }
                bts btsVar5 = (bts) fidVar5;
                if (!btsVar5.V(intValue5 & 1, (intValue5 & 19) != 18)) {
                    btsVar5.Y();
                    break;
                } else {
                    aVar.invoke(bj6Var, btsVar5, Integer.valueOf(intValue5 & 14));
                    break;
                }
            default:
                bj6 bj6Var2 = (bj6) obj;
                fid fidVar6 = (fid) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((bts) fidVar6).k(bj6Var2) ? 4 : 2;
                }
                bts btsVar6 = (bts) fidVar6;
                if (!btsVar6.V(intValue6 & 1, (intValue6 & 19) != 18)) {
                    btsVar6.Y();
                    break;
                } else {
                    aVar.invoke(bj6Var2, btsVar6, Integer.valueOf(intValue6 & 14));
                    break;
                }
        }
        return zy11Var;
    }
}
