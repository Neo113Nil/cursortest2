package defpackage;

import com.yandex.go.scooters.parking.d;
import ru.yandex.taxi.logistics.sdk.cost_details.ui.a;

/* loaded from: classes11.dex */
public final /* synthetic */ class fj5 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ sls c;

    public /* synthetic */ fj5(sls slsVar, String str) {
        this.a = 5;
        this.b = str;
        this.c = slsVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        sls slsVar = this.c;
        String str = this.b;
        fid fidVar = (fid) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                q5b1.h(str, slsVar, fidVar, vng.O(1));
                break;
            case 1:
                num.getClass();
                a.a(str, slsVar, fidVar, vng.O(1));
                break;
            case 2:
                num.getClass();
                kj20.a(str, slsVar, fidVar, vng.O(1));
                break;
            case 3:
                num.getClass();
                cn91.c(str, slsVar, fidVar, vng.O(1));
                break;
            case 4:
                num.getClass();
                ru.yandex.taxi.logistics.sdk.payment_method_selector.ui.a.a(str, slsVar, fidVar, vng.O(1));
                break;
            case 5:
                int intValue = num.intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    si91.d(str, slsVar, btsVar, 0);
                    break;
                }
            case 6:
                num.getClass();
                si91.d(str, slsVar, fidVar, vng.O(1));
                break;
            case 7:
                num.getClass();
                t5l0.c(str, slsVar, fidVar, vng.O(1));
                break;
            case 8:
                num.getClass();
                d.a(str, slsVar, fidVar, vng.O(1));
                break;
            default:
                num.getClass();
                v4b1.b(str, slsVar, fidVar, vng.O(1));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ fj5(int i, int i2, sls slsVar, String str) {
        this.a = i2;
        this.b = str;
        this.c = slsVar;
    }
}
