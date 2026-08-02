package defpackage;

import ru.yandex.taxi.logistics.sdk.deliverydashboard.ui.widget.a;

/* loaded from: classes5.dex */
public final /* synthetic */ class koj implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ foj b;

    public /* synthetic */ koj(foj fojVar, int i) {
        this.a = i;
        this.b = fojVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        foj fojVar = this.b;
        int i2 = 1;
        fid fidVar = (fid) obj2;
        switch (i) {
            case 0:
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    btsVar.Y();
                    break;
                } else {
                    r3b1.a(ljs0.b(ljs0.c(c530.a, 1.0f), 0.0f, 104.0f, 1), fojVar.g, null, x4c.b, wwg.S(-1787505135, true, new koj(fojVar, i2), btsVar), btsVar, 27654, 4);
                    break;
                }
            default:
                int intValue2 = ((Integer) obj3).intValue();
                bts btsVar2 = (bts) fidVar;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                    btsVar2.Y();
                    break;
                } else {
                    a.c(fojVar.a, fojVar.b, fojVar.c, fojVar.e, fojVar.f, fojVar.h, fojVar.j, btsVar2, 0);
                    break;
                }
        }
        return zy11Var;
    }
}
