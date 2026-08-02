package defpackage;

import com.yandex.go.address.models.Address;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.collections.b;
import ru.yandex.taxi.delivery.extracted_delivery_form.ui.unitedsummary.recycler.DeliveryAddressExtendedModel$Field;
import ru.yandex.taxi.delivery.extracted_form_common_data.extra.DeliveryFormStepType;
import ru.yandex.taxi.delivery.extracted_form_common_data.models.ui.DeliveryFormType;

/* loaded from: classes5.dex */
public final class gbi {
    public final vsi a;
    public final kki b;
    public final jji0 c;
    public final gwh d;
    public final a22 e;
    public final u0i f;
    public final a02 g;
    public final cpf h;
    public final w810 i;

    public gbi(vsi vsiVar, kki kkiVar, jji0 jji0Var, gwh gwhVar, a22 a22Var, u0i u0iVar, a02 a02Var, cpf cpfVar, w810 w810Var) {
        this.a = vsiVar;
        this.b = kkiVar;
        this.c = jji0Var;
        this.d = gwhVar;
        this.e = a22Var;
        this.f = u0iVar;
        this.g = a02Var;
        this.h = cpfVar;
        this.i = w810Var;
    }

    public final nq0 a(hki hkiVar, vuh vuhVar, DeliveryFormType deliveryFormType) {
        String K;
        b6i c = c(hkiVar.a());
        boolean z = hkiVar instanceof gki;
        gwh gwhVar = this.d;
        if (z) {
            K = q5z.F(gwhVar.a.e());
        } else {
            if (!(hkiVar instanceof fki)) {
                w511.b();
                return null;
            }
            Address address = (Address) a.S(((fki) hkiVar).a, gwhVar.a.b());
            K = address != null ? q5z.K(address) : "";
        }
        String str = K;
        int i = fbi.a[deliveryFormType.ordinal()];
        if (i == 1) {
            return b(c, vuhVar, str, hkiVar, Collections.singleton(DeliveryAddressExtendedModel$Field.Comment));
        }
        if (i == 2) {
            return b(c, vuhVar, str, hkiVar, j73.f0(new DeliveryAddressExtendedModel$Field[]{DeliveryAddressExtendedModel$Field.Porch, DeliveryAddressExtendedModel$Field.Comment}));
        }
        if (i == 3) {
            return b(c, vuhVar, str, hkiVar, j73.f0(new DeliveryAddressExtendedModel$Field[]{DeliveryAddressExtendedModel$Field.Porch, DeliveryAddressExtendedModel$Field.Apartment, DeliveryAddressExtendedModel$Field.Floor, DeliveryAddressExtendedModel$Field.DoorPhone, DeliveryAddressExtendedModel$Field.Comment}));
        }
        if (i != 4) {
            w511.b();
            return null;
        }
        String str2 = this.a.t ? "" : c.a;
        String str3 = c.c;
        r0i r0iVar = vuhVar.a;
        this.f.getClass();
        Pattern pattern = bgb0.a;
        String str4 = r0iVar.a;
        String str5 = r0iVar.b;
        if (str4.length() <= 0) {
            str4 = bgb0.e(str5);
        }
        return new fwh(str2, new i630(vuhVar.a.b.length() == 0, vuhVar.g, str3, str4), str, hkiVar);
    }

    public final tvh b(b6i b6iVar, vuh vuhVar, String str, hki hkiVar, Set set) {
        boolean a = this.h.a();
        vsi vsiVar = this.a;
        boolean z = vsiVar.t;
        yii yiiVar = vsiVar.q;
        String str2 = z ? "" : b6iVar.a;
        String str3 = b6iVar.c;
        r0i r0iVar = vuhVar.a;
        List list = vuhVar.h;
        this.f.getClass();
        Pattern pattern = bgb0.a;
        String str4 = r0iVar.a;
        String str5 = r0iVar.b;
        if (str4.length() <= 0) {
            str4 = bgb0.e(str5);
        }
        i630 i630Var = new i630(vuhVar.a.b.length() == 0, vuhVar.g, str3, str4);
        boolean z2 = yiiVar.a;
        boolean z3 = list.size() >= yiiVar.b;
        Map i = b.i(new Pair(DeliveryAddressExtendedModel$Field.Porch, new svh(b6iVar.j, vuhVar.b)), new Pair(DeliveryAddressExtendedModel$Field.Apartment, new svh(b6iVar.g, a ? vuhVar.e : "")), new Pair(DeliveryAddressExtendedModel$Field.Floor, new svh(b6iVar.h, a ? vuhVar.c : "")), new Pair(DeliveryAddressExtendedModel$Field.DoorPhone, new svh(b6iVar.k, a ? vuhVar.f : "")), new Pair(DeliveryAddressExtendedModel$Field.Comment, new svh(b6iVar.i, vuhVar.d)));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : i.entrySet()) {
            if (set.contains((DeliveryAddressExtendedModel$Field) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return new tvh(str2, i630Var, str, hkiVar, z2, z3, list, linkedHashMap);
    }

    public final b6i c(DeliveryFormStepType deliveryFormStepType) {
        Object obj;
        Iterator it = this.a.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((b6i) obj).b == deliveryFormStepType) {
                break;
            }
        }
        b6i b6iVar = (b6i) obj;
        return b6iVar == null ? b6i.l : b6iVar;
    }

    public final int d() {
        return this.b.a.h.size() + 1;
    }

    public final void e(hki hkiVar) {
        boolean z = hkiVar instanceof gki;
        kki kkiVar = this.b;
        if (z) {
            y5i.q(kkiVar.a, null, null, null, null, null, null, null, 191);
        } else if (hkiVar instanceof fki) {
            y5i.n(kkiVar.a, ((fki) hkiVar).a, null, null, null, null, null, null, null, 382);
        } else {
            kkiVar.getClass();
            w511.b();
        }
    }
}
