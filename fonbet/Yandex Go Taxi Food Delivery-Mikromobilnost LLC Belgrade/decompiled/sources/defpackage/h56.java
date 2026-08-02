package defpackage;

import com.yandex.go.address.models.Address;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.MapBuilder;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.preorder.blockedzones.RestrictedAreasShownAnalytics$RestrictedAreaPointTypeV2;

/* loaded from: classes6.dex */
public final class h56 {
    public final sr4 a;
    public final y46 b;
    public final l56 c;

    public h56(sr4 sr4Var, y46 y46Var, l56 l56Var) {
        this.a = sr4Var;
        this.b = y46Var;
        this.c = l56Var;
    }

    public static x46 a(h56 h56Var, pv0 pv0Var, l56 l56Var) {
        x46 b = h56Var.b.b(pv0Var, false);
        if (b.f != null) {
            return b;
        }
        l56Var.clearBlockedZones();
        return b;
    }

    public static void b(h56 h56Var, x46 x46Var, l56 l56Var, pv0 pv0Var, Address address, RoutePointType routePointType, int i) {
        fvd0 fvd0Var;
        List list;
        Address address2 = (i & 8) != 0 ? null : address;
        RoutePointType routePointType2 = (i & 16) != 0 ? RoutePointType.POINT_A : routePointType;
        h56Var.getClass();
        List list2 = x46Var.f;
        List list3 = EmptyList.a;
        if (list2 == null) {
            list2 = list3;
        }
        l56Var.updateBlockedZones(list2);
        sr4 sr4Var = h56Var.a;
        sr4Var.getClass();
        k56 k56Var = pv0Var.b;
        Address address3 = pv0Var.a;
        String str = k56Var.d;
        List list4 = k56Var.a;
        if (str == null && ((list = list4) == null || list.isEmpty())) {
            jst.e.x(new IllegalArgumentException("Failed to send metrica event"), "Can't send RestrictedAreasShown event without blocked zone info");
            return;
        }
        zzs zzsVar = pv0Var.j;
        String screen = address3.getScreen();
        String pickMethod = address3.getPickMethod();
        if (pickMethod != null) {
            fvd0Var = new fvd0(pickMethod, address3.B(), address3.q2(), address3.getPickPosition(), address3.getPickAction(), address2, screen);
        } else {
            jst.e.k(new IllegalArgumentException("Wrong destination address suggest provided"), "Wrong destination address suggest provided");
            fvd0Var = null;
        }
        co40 co40Var = (co40) sr4Var.b;
        for (RestrictedAreasShownAnalytics$RestrictedAreaPointTypeV2 restrictedAreasShownAnalytics$RestrictedAreaPointTypeV2 : RestrictedAreasShownAnalytics$RestrictedAreaPointTypeV2.a()) {
            if (jl40.l(restrictedAreasShownAnalytics$RestrictedAreaPointTypeV2.getEventValue(), sta1.a(routePointType2))) {
                zzs B = address3.B();
                double d = B.a;
                double d2 = B.b;
                fvd0 fvd0Var2 = fvd0Var;
                Double valueOf = Double.valueOf(B.c);
                MapBuilder mapBuilder = new MapBuilder();
                mapBuilder.put("lat", Double.valueOf(d));
                mapBuilder.put("lon", Double.valueOf(d2));
                mapBuilder.put("accuracy", valueOf);
                MapBuilder j = mapBuilder.j();
                if (list4 != null) {
                    list3 = list4;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    String str2 = ((v46) it.next()).e;
                    if (str2 != null) {
                        arrayList.add(str2);
                    }
                }
                gxj0 gxj0Var = zzsVar != null ? new gxj0(zzsVar.a, zzsVar.b, Double.valueOf(zzsVar.c)) : null;
                String str3 = k56Var.c;
                String str4 = k56Var.d;
                Map a = fvd0Var2 != null ? fvd0Var2.a() : null;
                co40Var.getClass();
                HashMap hashMap = new HashMap();
                if (gxj0Var != null) {
                    hashMap.put("origin_coord", gxj0Var.d);
                }
                if (str3 != null) {
                    hashMap.put("pickup_point_id", str3);
                }
                if (str4 != null) {
                    hashMap.put("pin_zone_id", str4);
                }
                hashMap.put("point_type", restrictedAreasShownAnalytics$RestrictedAreaPointTypeV2.getEventValue());
                if (a != null) {
                    hashMap.put("source_description", a);
                }
                hashMap.put("target_coord", j);
                hashMap.put("zone_ids", arrayList);
                co40Var.a.a("RestrictedAreasShown", hashMap, 2, new HashMap());
                return;
            }
        }
        w511.i("Collection contains no element matching the predicate.");
    }
}
