package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import java.util.ArrayList;
import java.util.UUID;
import ru.yandex.taxi.contacts.SelectedFrom;
import ru.yandex.taxi.delivery.extracted_form_common_data.extra.DeliveryFormStepType;

/* loaded from: classes5.dex */
public final class iai {
    public final uci a;
    public final ozt0 b;
    public final iii c;
    public boolean d;

    public iai(uci uciVar, ozt0 ozt0Var, iii iiiVar) {
        this.a = uciVar;
        this.b = ozt0Var;
        this.c = iiiVar;
    }

    public static f1i a(iai iaiVar, String str, String str2, DeliveryFormStepType deliveryFormStepType, bgq0 bgq0Var, String str3, sls slsVar, tls tlsVar, zki zkiVar, boolean z, String str4, int i) {
        bgq0 bgq0Var2;
        String str5;
        String str6;
        bgq0 bgq0Var3 = (i & 8) != 0 ? bgq0.f : bgq0Var;
        sls slsVar2 = (i & 128) != 0 ? slsVar : zkiVar;
        int i2 = 1;
        boolean z2 = (i & 256) != 0 ? true : z;
        String str7 = (i & 512) != 0 ? null : str4;
        boolean z3 = z2;
        ozt0 ozt0Var = iaiVar.b;
        j0g j0gVar = ozt0Var.b;
        ArrayList arrayList = new ArrayList();
        pex0 m = ((k) ozt0Var.a).m();
        String str8 = m != null ? m.b : null;
        bgq0 q = j0gVar.q(str8);
        String str9 = q.a;
        if (str9 != null && str9.length() != 0 && (str6 = q.b) != null && str6.length() != 0) {
            arrayList.add(q);
        }
        gsi gsiVar = (gsi) j0gVar.b;
        if (str8 == null || !gsiVar.g(str8)) {
            bgq0Var2 = bgq0.f;
        } else {
            vsi e = gsiVar.e(str8);
            String str10 = e.i;
            if (str10 == null) {
                str10 = "";
            }
            String str11 = e.j;
            bgq0Var2 = new bgq0(str10, str11 != null ? str11 : "", SelectedFrom.STANDALONE, UUID.randomUUID().toString());
        }
        String str12 = bgq0Var2.a;
        if (str12 != null && str12.length() != 0 && (str5 = bgq0Var2.b) != null && str5.length() != 0) {
            arrayList.add(bgq0Var2);
        }
        f1i f1iVar = new f1i(new x0i(null, str, arrayList, str2, bgq0Var3, str3, z3 && iaiVar.d, deliveryFormStepType == DeliveryFormStepType.DESTINATION, str7, 1), new xjg(tlsVar, iaiVar, false, 13), new bu6(i2, slsVar2, slsVar), iaiVar.c);
        iaiVar.d = true;
        return f1iVar;
    }
}
