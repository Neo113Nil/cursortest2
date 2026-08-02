package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.yandex.taxi.masstransit.ui.a;

/* loaded from: classes11.dex */
public final /* synthetic */ class heg0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ au2 b;

    public /* synthetic */ heg0(au2 au2Var, int i) {
        this.a = 3;
        this.b = au2Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        au2 au2Var = this.b;
        zy11 zy11Var = zy11.a;
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
                    sya1.a(this.b, ljs0.m(c530.a, 24.0f), null, AppColor$Palette.EverFront, btsVar, 3120, 4);
                    break;
                }
            case 1:
                int intValue2 = num.intValue();
                bts btsVar2 = (bts) fidVar;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else {
                    a.e(au2Var, btsVar2, 0);
                    break;
                }
            case 2:
                int intValue3 = num.intValue();
                bts btsVar3 = (bts) fidVar;
                if (!btsVar3.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                    btsVar3.Y();
                    break;
                } else {
                    a.e(au2Var, btsVar3, 0);
                    break;
                }
            default:
                num.getClass();
                a.e(au2Var, fidVar, vng.O(1));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ heg0(au2 au2Var, int i, byte b) {
        this.a = i;
        this.b = au2Var;
    }
}
