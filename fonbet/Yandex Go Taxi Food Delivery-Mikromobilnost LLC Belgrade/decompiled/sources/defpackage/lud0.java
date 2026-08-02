package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.delivery.extracted_form_common_data.extra.DeliveryFormStepType;
import ru.yandex.taxi.delivery.extracted_form_common_data.extra.DeliverySelectedFrom;

/* loaded from: classes9.dex */
public final class lud0 {
    public final uuh a;
    public final DeliveryFormStepType b;
    public final UUID c;
    public r0i d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public boolean j;
    public Map k;

    public lud0(uuh uuhVar, DeliveryFormStepType deliveryFormStepType, int i) {
        LinkedHashMap linkedHashMap;
        List list;
        r0i r0iVar;
        r0i r0iVar2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        r0i r0iVar3;
        boolean z = true;
        DeliverySelectedFrom deliverySelectedFrom = null;
        uuhVar = (i & 1) != 0 ? null : uuhVar;
        UUID randomUUID = UUID.randomUUID();
        this.a = uuhVar;
        this.b = deliveryFormStepType;
        this.c = randomUUID;
        this.d = (uuhVar == null || (r0iVar3 = uuhVar.a) == null) ? r0i.d : r0iVar3;
        String str6 = "";
        this.e = (uuhVar == null || (str5 = uuhVar.b) == null) ? "" : str5;
        this.f = (uuhVar == null || (str4 = uuhVar.c) == null) ? "" : str4;
        this.g = (uuhVar == null || (str3 = uuhVar.e) == null) ? "" : str3;
        this.h = (uuhVar == null || (str2 = uuhVar.f) == null) ? "" : str2;
        if (uuhVar != null && (str = uuhVar.g) != null) {
            str6 = str;
        }
        this.i = str6;
        if (((uuhVar == null || (r0iVar2 = uuhVar.a) == null) ? null : r0iVar2.c) != DeliverySelectedFrom.SUGGEST) {
            if (uuhVar != null && (r0iVar = uuhVar.a) != null) {
                deliverySelectedFrom = r0iVar.c;
            }
            if (deliverySelectedFrom != DeliverySelectedFrom.ORDER_FOR_ANOTHER) {
                z = false;
            }
        }
        this.j = z;
        if (uuhVar == null || (list = uuhVar.d) == null) {
            linkedHashMap = new LinkedHashMap();
        } else {
            List<gkb0> list2 = list;
            ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
            for (gkb0 gkb0Var : list2) {
                arrayList.add(new kkb0(gkb0Var.b(), gkb0Var.a()));
            }
            int d = gw00.d(tcc.n(arrayList, 10));
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(d < 16 ? 16 : d);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                linkedHashMap2.put(((kkb0) next).getId(), next);
            }
            linkedHashMap = new LinkedHashMap(linkedHashMap2);
        }
        this.k = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lud0)) {
            return false;
        }
        lud0 lud0Var = (lud0) obj;
        return jl40.l(this.a, lud0Var.a) && this.b == lud0Var.b && jl40.l(this.c, lud0Var.c);
    }

    public final int hashCode() {
        uuh uuhVar = this.a;
        int hashCode = uuhVar == null ? 0 : uuhVar.hashCode();
        return this.c.hashCode() + ((this.b.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return "PointData(address=" + this.a + ", type=" + this.b + ", uuid=" + this.c + Extension.C_BRAKE;
    }
}
