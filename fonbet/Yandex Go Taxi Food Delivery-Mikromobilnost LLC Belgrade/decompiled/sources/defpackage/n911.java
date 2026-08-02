package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.slot.SlotSize;
import com.yandex.go.masstransit.design.compose.route.Ellipse$Size;

/* loaded from: classes11.dex */
public final /* synthetic */ class n911 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ e711 b;

    public /* synthetic */ n911(e711 e711Var, int i) {
        this.a = i;
        this.b = e711Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        e711 e711Var = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    btsVar.Y();
                    break;
                } else {
                    jeb1.f(e711Var.a, c530.a, AppColor$Palette.TextMinor, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar).h.a, btsVar, 432, 0, 16376);
                    break;
                }
            default:
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                    btsVar2.Y();
                    break;
                } else {
                    qb91.a(ljs0.b(c530.a, 0.0f, SlotSize.XS.getSize(), 1), new zrm(6, Ellipse$Size.SMALL, qb91.b(e711Var.b)), 0.0f, Float.valueOf(1.5f), new ldc(ldc.f), btsVar2, 221248, 76);
                    break;
                }
        }
        return zy11Var;
    }
}
