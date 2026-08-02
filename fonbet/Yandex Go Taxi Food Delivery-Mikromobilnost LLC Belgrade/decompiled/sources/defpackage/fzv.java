package defpackage;

import com.yandex.go.routestops.v2.ui.c;
import com.ybsdk.feature.savings.api.SavingsActionStatus;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.masstransit.geopayment.purchase.a;

/* loaded from: classes11.dex */
public final /* synthetic */ class fzv implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ fzv(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        String str = this.b;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    x6b1.c(str, btsVar, 0);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 1:
                ((Integer) obj2).getClass();
                x6b1.c(str, (fid) obj, vng.O(1));
                return zy11Var;
            case 2:
                ((Integer) obj2).getClass();
                cl91.u(str, (fid) obj, vng.O(1));
                return zy11Var;
            case 3:
                ((Integer) obj2).getClass();
                cl91.j(str, (fid) obj, vng.O(1));
                return zy11Var;
            case 4:
                ((Integer) obj2).getClass();
                cl91.i(str, (fid) obj, vng.O(1));
                return zy11Var;
            case 5:
                ((Integer) obj2).getClass();
                cl91.n(str, (fid) obj, vng.O(1));
                return zy11Var;
            case 6:
                ((Integer) obj2).getClass();
                uob1.g(str, (fid) obj, vng.O(1));
                return zy11Var;
            case 7:
                ((Integer) obj2).getClass();
                uob1.f(str, (fid) obj, vng.O(1));
                return zy11Var;
            case 8:
                ((Integer) obj2).getClass();
                a.c(str, (fid) obj, vng.O(1));
                return zy11Var;
            case 9:
                ((Integer) obj2).getClass();
                ppb1.f(str, (fid) obj, vng.O(1));
                return zy11Var;
            case 10:
                ((Integer) obj2).getClass();
                ppb1.e(str, (fid) obj, vng.O(1));
                return zy11Var;
            case 11:
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    s3b1.f(new lvi0(this.b, null, null, null, null, 62), null, null, btsVar2, 0, 6);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            case 12:
                fid fidVar3 = (fid) obj;
                int intValue3 = ((Integer) obj2).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                    ymb1.e(this.b, null, 0L, null, null, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar3, 0, 0, 65534);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
            case 13:
                ((Integer) obj2).getClass();
                si91.g(str, (fid) obj, vng.O(1));
                return zy11Var;
            case 14:
                ((Integer) obj2).getClass();
                si91.e(str, (fid) obj, vng.O(1));
                return zy11Var;
            case 15:
                ((Integer) obj2).getClass();
                si91.f(str, (fid) obj, vng.O(1));
                return zy11Var;
            case 16:
                ((Integer) obj2).getClass();
                mn91.c(str, (fid) obj, vng.O(1));
                return zy11Var;
            case 17:
                fid fidVar4 = (fid) obj;
                int intValue4 = ((Integer) obj2).intValue();
                bts btsVar4 = (bts) fidVar4;
                if (btsVar4.V(intValue4 & 1, (intValue4 & 3) != 2)) {
                    o4b1.b(ua3.b(str, null, null, btsVar4, 14), null, an91.k(c530.a, 8.0f), null, null, 0.0f, null, btsVar4, 432, 120);
                } else {
                    btsVar4.Y();
                }
                return zy11Var;
            case 18:
                ((Integer) obj2).getClass();
                xfe0.a(str, (fid) obj, vng.O(1));
                return zy11Var;
            case 19:
                ((Integer) obj2).getClass();
                xfe0.a(str, (fid) obj, vng.O(1));
                return zy11Var;
            case 20:
                fid fidVar5 = (fid) obj;
                int intValue5 = ((Integer) obj2).intValue();
                bts btsVar5 = (bts) fidVar5;
                if (btsVar5.V(intValue5 & 1, (intValue5 & 3) != 2)) {
                    web1.e(null, null, null, this.b, null, 0L, lzr.E, null, null, 0, false, 0, null, null, null, null, null, null, false, 0L, 0, false, 0, false, null, false, btsVar5, 12582912, 0, 0, 268435319);
                } else {
                    btsVar5.Y();
                }
                return zy11Var;
            case 21:
                fid fidVar6 = (fid) obj;
                int intValue6 = ((Integer) obj2).intValue();
                bts btsVar6 = (bts) fidVar6;
                if (btsVar6.V(intValue6 & 1, (intValue6 & 3) != 2)) {
                    ymb1.c(this.b, null, 0L, null, lzr.E, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar6, HProv.ALG_CLASS_DATA_ENCRYPT, 0, 65518);
                } else {
                    btsVar6.Y();
                }
                return zy11Var;
            case 22:
                ((Integer) obj2).getClass();
                t5l0.d(str, (fid) obj, vng.O(1));
                return zy11Var;
            case 23:
                fid fidVar7 = (fid) obj;
                int intValue7 = ((Integer) obj2).intValue();
                bts btsVar7 = (bts) fidVar7;
                if (btsVar7.V(intValue7 & 1, (intValue7 & 3) != 2)) {
                    ymb1.e(this.b, null, ((el51) btsVar7.m(gl51.a)).o(), null, null, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar7, 0, 0, 65530);
                } else {
                    btsVar7.Y();
                }
                return zy11Var;
            case 24:
                fid fidVar8 = (fid) obj;
                int intValue8 = ((Integer) obj2).intValue();
                bts btsVar8 = (bts) fidVar8;
                if (btsVar8.V(intValue8 & 1, (intValue8 & 3) != 2)) {
                    ymb1.f(this.b, null, ((el51) btsVar8.m(gl51.a)).o(), null, null, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar8, 0, 0, 65530);
                } else {
                    btsVar8.Y();
                }
                return zy11Var;
            case 25:
                ((Integer) obj2).getClass();
                c.f(str, (fid) obj, vng.O(7));
                return zy11Var;
            case 26:
                ((Integer) obj2).getClass();
                nwa1.g(str, (fid) obj, vng.O(1));
                return zy11Var;
            case 27:
                ((Integer) obj2).getClass();
                twa1.f(str, (fid) obj, vng.O(1));
                return zy11Var;
            case 28:
                return new u9m0(str, (SavingsActionStatus) obj, (Throwable) obj2);
            default:
                return new v9m0(str, (SavingsActionStatus) obj, (Throwable) obj2);
        }
    }

    public /* synthetic */ fzv(String str, int i, int i2) {
        this.a = i2;
        this.b = str;
    }
}
