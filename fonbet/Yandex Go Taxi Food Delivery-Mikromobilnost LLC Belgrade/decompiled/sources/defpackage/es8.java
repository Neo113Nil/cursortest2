package defpackage;

import java.util.List;
import ru.yandex.logistics.care.camera.ui.c;

/* loaded from: classes11.dex */
public final /* synthetic */ class es8 implements wls {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int a = 3;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ es8(rs8 rs8Var, n4u0 n4u0Var, n4u0 n4u0Var2, kzd kzdVar, tls tlsVar, Integer num, f530 f530Var, tpr tprVar, tpr tprVar2, int i) {
        this.b = rs8Var;
        this.c = n4u0Var;
        this.w = n4u0Var2;
        this.x = kzdVar;
        this.y = tlsVar;
        this.z = num;
        this.A = f530Var;
        this.B = tprVar;
        this.C = tprVar2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.C;
        Object obj4 = this.B;
        Object obj5 = this.y;
        Object obj6 = this.A;
        Object obj7 = this.z;
        Object obj8 = this.x;
        Object obj9 = this.w;
        Object obj10 = this.c;
        Object obj11 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                c.a((rs8) obj11, (n4u0) obj10, (n4u0) obj9, (kzd) obj8, (tls) obj5, (Integer) obj7, (f530) obj6, (tpr) obj4, (tpr) obj3, (fid) obj, vng.O(196609));
                break;
            case 1:
                ru.yandex.logistics.sdk.cargo_form.impl.ui.c cVar = (ru.yandex.logistics.sdk.cargo_form.impl.ui.c) obj11;
                qkg qkgVar = (qkg) obj10;
                qkg qkgVar2 = (qkg) obj9;
                qkg qkgVar3 = (qkg) obj8;
                yx40 yx40Var = (yx40) obj5;
                yx40 yx40Var2 = (yx40) obj7;
                yx40 yx40Var3 = (yx40) obj6;
                oip0 oip0Var = (oip0) obj4;
                lv8 lv8Var = (lv8) obj3;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(1 & intValue, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    cVar.c(qkgVar, qkgVar2, qkgVar3, yx40Var, yx40Var2, yx40Var3, oip0Var, lv8Var.a, lv8Var.b, btsVar, 1794048);
                    break;
                }
            case 2:
                ((Integer) obj2).getClass();
                ((ru.yandex.logistics.sdk.cargo_form.impl.ui.c) obj11).b((qkg) obj10, (qkg) obj9, (qkg) obj8, (gq1) obj7, (lv8) obj6, (zi8) obj4, (tls) obj5, (tls) obj3, (fid) obj, vng.O(1));
                break;
            default:
                ((Integer) obj2).getClass();
                w791.a((gbe) obj11, (ibe) obj10, (List) obj9, (fbe) obj8, (yur) obj7, (sls) obj6, (tls) obj5, (tls) obj4, (sls) obj3, (fid) obj, vng.O(24577));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ es8(gbe gbeVar, ibe ibeVar, List list, fbe fbeVar, yur yurVar, sls slsVar, tls tlsVar, tls tlsVar2, sls slsVar2, int i) {
        this.b = gbeVar;
        this.c = ibeVar;
        this.w = list;
        this.x = fbeVar;
        this.z = yurVar;
        this.A = slsVar;
        this.y = tlsVar;
        this.B = tlsVar2;
        this.C = slsVar2;
    }

    public /* synthetic */ es8(ru.yandex.logistics.sdk.cargo_form.impl.ui.c cVar, qkg qkgVar, qkg qkgVar2, qkg qkgVar3, gq1 gq1Var, lv8 lv8Var, zi8 zi8Var, tls tlsVar, tls tlsVar2, int i) {
        this.b = cVar;
        this.c = qkgVar;
        this.w = qkgVar2;
        this.x = qkgVar3;
        this.z = gq1Var;
        this.A = lv8Var;
        this.B = zi8Var;
        this.y = tlsVar;
        this.C = tlsVar2;
    }

    public /* synthetic */ es8(ru.yandex.logistics.sdk.cargo_form.impl.ui.c cVar, qkg qkgVar, qkg qkgVar2, qkg qkgVar3, yx40 yx40Var, yx40 yx40Var2, yx40 yx40Var3, oip0 oip0Var, lv8 lv8Var) {
        this.b = cVar;
        this.c = qkgVar;
        this.w = qkgVar2;
        this.x = qkgVar3;
        this.y = yx40Var;
        this.z = yx40Var2;
        this.A = yx40Var3;
        this.B = oip0Var;
        this.C = lv8Var;
    }
}
