package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.slot.SlotSize;
import com.yandex.go.masstransit.design.compose.route.Ellipse$Size;

/* loaded from: classes11.dex */
public final /* synthetic */ class aqw implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ q611 b;

    public /* synthetic */ aqw(q611 q611Var, int i) {
        this.a = i;
        this.b = q611Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        q611 q611Var = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    btsVar.Y();
                    break;
                } else {
                    qb91.a(ljs0.b(c530.a, 0.0f, SlotSize.XS.getSize(), 1), new zrm(6, Ellipse$Size.SMALL, qb91.b(q611Var.e)), 0.0f, Float.valueOf(1.5f), new ldc(ldc.f), btsVar, 221248, 76);
                    break;
                }
            case 1:
                ibp0 ibp0Var = (ibp0) obj;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((bts) fidVar2).k(ibp0Var) ? 4 : 2;
                }
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                    btsVar2.Y();
                    break;
                } else {
                    z8b1.a(ibp0Var, q611Var.a, btsVar2, intValue2 & 14);
                    break;
                }
            case 2:
                fid fidVar3 = (fid) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (!btsVar3.V(intValue3 & 1, (intValue3 & 17) != 16)) {
                    btsVar3.Y();
                    break;
                } else {
                    jeb1.f(q611Var.b, null, AppColor$Palette.Text, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar3).g.b, btsVar3, 384, 0, 16378);
                    break;
                }
            default:
                fid fidVar4 = (fid) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                bts btsVar4 = (bts) fidVar4;
                if (!btsVar4.V(1 & intValue4, (intValue4 & 17) != 16)) {
                    btsVar4.Y();
                    break;
                } else {
                    ytb1.a(0, btsVar4, null, q611Var.c);
                    break;
                }
        }
        return zy11Var;
    }
}
