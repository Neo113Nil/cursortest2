package defpackage;

import com.yandex.go.places.analytics.generated.DiscoveryAnalytics$MapObjectType;
import com.yandex.go.places.analytics.generated.DiscoveryAnalytics$MapType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes13.dex */
public final class nfc0 {
    public final jio a;
    public final cn80 b;

    public nfc0(jio jioVar, cn80 cn80Var) {
        this.a = jioVar;
        this.b = cn80Var;
    }

    public static DiscoveryAnalytics$MapObjectType a(kn00 kn00Var) {
        if (kn00Var instanceof gn00) {
            return DiscoveryAnalytics$MapObjectType.Organization;
        }
        if (kn00Var instanceof jn00) {
            return DiscoveryAnalytics$MapObjectType.UgcPin;
        }
        if (!(kn00Var instanceof hn00)) {
            w511.b();
            return null;
        }
        fo00 fo00Var = ((hn00) kn00Var).h;
        if (!(fo00Var instanceof bo00)) {
            return DiscoveryAnalytics$MapObjectType.Organization;
        }
        DiscoveryAnalytics$MapObjectType discoveryAnalytics$MapObjectType = ((bo00) fo00Var).g ? DiscoveryAnalytics$MapObjectType.Video : null;
        return discoveryAnalytics$MapObjectType == null ? DiscoveryAnalytics$MapObjectType.Photo : discoveryAnalytics$MapObjectType;
    }

    public final void b(List list) {
        String str;
        DiscoveryAnalytics$MapType discoveryAnalytics$MapType;
        CharSequence charSequence;
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            kn00 kn00Var = (kn00) it.next();
            String id = kn00Var.getId();
            String eventValue = a(kn00Var).getEventValue();
            fr action = kn00Var.getAction();
            jp jpVar = action instanceof jp ? (jp) action : null;
            String str2 = jpVar != null ? jpVar.a : null;
            hn00 hn00Var = kn00Var instanceof hn00 ? (hn00) kn00Var : null;
            if (hn00Var != null) {
                fo00 fo00Var = hn00Var.h;
                bo00 bo00Var = fo00Var instanceof bo00 ? (bo00) fo00Var : null;
                if (bo00Var != null && (charSequence = bo00Var.e) != null) {
                    str = charSequence.toString();
                }
            }
            arrayList.add(new fsj(id, eventValue, str2, str));
        }
        bn80 bn80Var = (bn80) this.b.a.getValue();
        str = bn80Var != null ? bn80Var.a : null;
        jio jioVar = this.a;
        hsj hsjVar = jioVar.b;
        int i = iio.a[jioVar.a.ordinal()];
        if (i == 1) {
            discoveryAnalytics$MapType = DiscoveryAnalytics$MapType.SuperappDiscoveryMap;
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            discoveryAnalytics$MapType = DiscoveryAnalytics$MapType.PlacesMap;
        }
        hsjVar.getClass();
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((fsj) it2.next()).e);
        }
        hashMap.put("pin_list", arrayList2);
        hashMap.put("map_type", discoveryAnalytics$MapType.getEventValue());
        if (str != null) {
            hashMap.put("geosearch_context", str);
        }
        hsjVar.a.a("Discovery.Map.Pin.Loaded", hashMap, 1, new HashMap());
    }
}
