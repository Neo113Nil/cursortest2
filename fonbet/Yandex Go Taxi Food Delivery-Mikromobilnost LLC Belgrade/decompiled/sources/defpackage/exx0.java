package defpackage;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes14.dex */
public final class exx0 {
    public final pho a;

    public exx0(pho phoVar) {
        this.a = phoVar;
    }

    public final void a(Map map, Double d, String str, Map map2) {
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.put("car_coordinate", map);
        }
        if (d != null) {
            hashMap.put("distance", d);
        }
        if (str != null) {
            hashMap.put("order_id", str);
        }
        if (map2 != null) {
            hashMap.put("origin_coordinate", map2);
        }
        this.a.a("TaxiOnTheWay.WaitingStarted", hashMap, 1, new HashMap());
    }
}
