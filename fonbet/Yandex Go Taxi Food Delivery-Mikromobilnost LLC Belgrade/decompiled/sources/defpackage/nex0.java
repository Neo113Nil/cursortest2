package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.a;
import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

/* loaded from: classes6.dex */
public final class nex0 {
    public final wiq0 a;
    public final dqe0 b;
    public final arv0 c;
    public final ck31 d;
    public final nnx0 e;
    public final zax0 f;
    public final pj g;
    public boolean h;
    public wvb1 i;

    public nex0(wiq0 wiq0Var, dqe0 dqe0Var, arv0 arv0Var, ck31 ck31Var, nnx0 nnx0Var, zax0 zax0Var, pj pjVar) {
        this.a = wiq0Var;
        this.b = dqe0Var;
        this.c = arv0Var;
        this.d = ck31Var;
        this.e = nnx0Var;
        this.f = zax0Var;
        this.g = pjVar;
    }

    public final void a(String str) {
        Boolean bool;
        String str2;
        Boolean bool2;
        int i;
        Object obj;
        String str3;
        String str4;
        dhm dhmVar;
        is60 is60Var;
        wvb1 wvb1Var = this.i;
        if (wvb1Var == null) {
            return;
        }
        pex0 m = ((k) this.a).m();
        String str5 = m != null ? m.b : null;
        if (m != null) {
            str2 = "explicit_antisurge";
            if (m.O instanceof pl2) {
                bool = Boolean.TRUE;
            } else {
                List list = m.t0.a;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((ex1) it.next()) instanceof gl2) {
                            bool = Boolean.FALSE;
                            break;
                        }
                    }
                }
                bool = null;
                str2 = null;
            }
            bool2 = Boolean.valueOf(!m.u);
        } else {
            bool = null;
            str2 = null;
            bool2 = null;
        }
        ArrayList arrayList = (ArrayList) wvb1Var.b;
        boolean z = wvb1Var.a;
        pex0 m2 = ((k) this.a).m();
        if (m2 != null) {
            Iterator it2 = ((k) this.d).j().a.iterator();
            while (it2.hasNext()) {
                List list2 = ((za31) it2.next()).b;
                if (!list2.isEmpty()) {
                    Iterator it3 = list2.iterator();
                    i = 0;
                    while (true) {
                        if (!it3.hasNext()) {
                            i = -1;
                            break;
                        } else if (jl40.l(m2.b, ((mi31) it3.next()).a.b)) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i != -1) {
                        break;
                    }
                }
            }
        }
        i = -1;
        MapBuilder mapBuilder = new MapBuilder(3);
        MapBuilder mapBuilder2 = new MapBuilder(6);
        mapBuilder2.put("tariffClass", String.valueOf(str5));
        mapBuilder2.put("initiatedType", "userInitiated");
        mapBuilder2.put("tariff_available", String.valueOf(bool2));
        mapBuilder2.put("visible_price", String.valueOf(str));
        if (bool != null) {
            mapBuilder2.put("antisurge", bool);
            if (str2 != null && str2.length() != 0) {
                mapBuilder2.put("type", str2);
            }
        }
        Iterator it4 = arrayList.iterator();
        while (true) {
            if (!it4.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it4.next();
                if (((j69) obj).d) {
                    break;
                }
            }
        }
        j69 j69Var = (j69) obj;
        if (j69Var != null) {
            String str6 = j69Var.e;
            String str7 = j69Var.b;
            if (str7 != null && str7.length() != 0) {
                mapBuilder2.put("verticalId", str7);
            }
            if (str6 != null && str6.length() != 0) {
                mapBuilder2.put("modifier_text", str6);
            }
        }
        mapBuilder.put("selected_cell", mapBuilder2.j());
        mapBuilder.putAll(tgb1.a(arrayList));
        mapBuilder.put("selector_type", z ? "outer" : "inner");
        if (i != -1) {
            mapBuilder.put("offer_num", Integer.valueOf(i));
        }
        MapBuilder j = mapBuilder.j();
        if (this.h) {
            this.h = false;
            str3 = "vertical_page_changed";
        } else {
            str3 = null;
        }
        nnx0 nnx0Var = this.e;
        Object obj2 = j.get("cells");
        List list3 = obj2 instanceof List ? (List) obj2 : null;
        Object obj3 = j.get("selected_cell");
        Map map = obj3 instanceof Map ? (Map) obj3 : null;
        Object obj4 = j.get("selector_type");
        String str8 = obj4 instanceof String ? (String) obj4 : null;
        Object obj5 = j.get("offer_num");
        Integer num = obj5 instanceof Integer ? (Integer) obj5 : null;
        String str9 = ((a7t0) this.c).a().b;
        String a = (m == null || (is60Var = m.J0.b) == null) ? null : is60Var.a();
        String str10 = this.b.a.V;
        if (m == null || (dhmVar = m.Y) == null || (str4 = dhmVar.a) == null || str4.length() == 0) {
            str4 = null;
        }
        nnx0Var.getClass();
        HashMap hashMap = new HashMap();
        if (list3 != null) {
            hashMap.put("cells", list3);
        }
        if (str4 != null) {
            hashMap.put("drive_offer_id", str4);
        }
        if (a != null) {
            hashMap.put("offer_id", a);
        }
        if (num != null) {
            hashMap.put("offer_num", num);
        }
        if (str3 != null) {
            hashMap.put(CRLReasonCodeExtension.REASON, str3);
        }
        if (map != null) {
            hashMap.put("selected_cell", map);
        }
        if (str8 != null) {
            hashMap.put("selector_type", str8);
        }
        if (str9 != null) {
            hashMap.put("summary_state", str9);
        }
        if (str10 != null) {
            hashMap.put("vertical_id", str10);
        }
        nnx0Var.a.a("TariffSelector.OrderConfirmed", hashMap, 1, new HashMap());
    }

    public final void b(ArrayList arrayList, boolean z) {
        int i;
        wvb1 wvb1Var = this.i;
        wvb1 wvb1Var2 = new wvb1(arrayList, z);
        this.i = wvb1Var2;
        if (wvb1Var == null) {
            List list = (List) tgb1.a(arrayList).get("cells");
            zax0 zax0Var = this.f;
            zax0Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("cells", list);
            zax0Var.a.a("Tariff.Available", hashMap, 1, new HashMap());
            return;
        }
        ArrayList arrayList2 = (ArrayList) wvb1Var.b;
        if (arrayList.size() == arrayList2.size()) {
            for (Object obj : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    scc.m();
                    throw null;
                }
                j69 j69Var = (j69) obj;
                j69 j69Var2 = (j69) a.S(i, arrayList2);
                i = (jl40.l(j69Var.a, j69Var2 != null ? j69Var2.a : null) && j69Var.f == j69Var2.f) ? i2 : 0;
            }
            return;
        }
        List list2 = (List) tgb1.a((ArrayList) wvb1Var2.b).get("cells");
        nnx0 nnx0Var = this.e;
        nnx0Var.getClass();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("cells", list2);
        nnx0Var.a.a("TariffSelector.CollectionChanged", hashMap2, 1, new HashMap());
    }

    public final void c(boolean z) {
        String str = z ? "toEnd" : "toStart";
        nnx0 nnx0Var = this.e;
        String str2 = this.b.a.V;
        nnx0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("type", str);
        if (str2 != null) {
            hashMap.put("vertical_id", str2);
        }
        nnx0Var.a.a("TariffSelector.TariffSwipe", hashMap, 1, new HashMap());
    }

    public final void d(String str) {
        if (str == null || str.length() == 0) {
            str = null;
        }
        pj pjVar = this.g;
        pjVar.getClass();
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("type", str);
        }
        pjVar.a.a("AntiSurge.NotificationShown", hashMap, 1, new HashMap());
    }
}
