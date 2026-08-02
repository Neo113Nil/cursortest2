package defpackage;

import java.util.HashMap;
import kotlin.collections.builders.MapBuilder;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* loaded from: classes.dex */
public final class kf00 {
    public final pho a;

    public kf00(pho phoVar) {
        this.a = phoVar;
    }

    public static void d(kf00 kf00Var, String str, String str2, String str3, String str4, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        HashMap A = oyr.A(kf00Var);
        if (str != null) {
            A.put("mode", str);
        }
        if (str2 != null) {
            A.put(MetaDataField.SCREEN_FIELD, str2);
        }
        if (str3 != null) {
            A.put("scooter_id", str3);
        }
        if (str4 != null) {
            A.put("provider", str4);
        }
        kf00Var.a.a("Map.Scooter.Shown", A, 1, new HashMap());
    }

    public final void a(MapBuilder mapBuilder) {
        HashMap hashMap = new HashMap();
        if (mapBuilder != null) {
            hashMap.put("DeliveryMetrics", mapBuilder);
        }
        this.a.a("Map.BackButton.Tapped", hashMap, 1, tse0.r("mode", hashMap, "shared_order"));
    }

    public final void b(String str, Boolean bool, Boolean bool2) {
        HashMap hashMap = new HashMap();
        hashMap.put("user_route_flg", bool);
        hashMap.put("taxi_route_flg", bool2);
        if (str != null) {
            hashMap.put("zoom_map_type", str);
        }
        this.a.a("Map.RoutesShown", hashMap, 1, new HashMap());
    }

    public final void c(String str, String str2, String str3, String str4) {
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("mode", str);
        }
        if (str2 != null) {
            hashMap.put(MetaDataField.SCREEN_FIELD, str2);
        }
        if (str3 != null) {
            hashMap.put("parking_id", str3);
        }
        if (str4 != null) {
            hashMap.put("provider", str4);
        }
        this.a.a("Map.ScooterParking.Tapped", hashMap, 1, new HashMap());
    }

    public final void e(String str, String str2, String str3, String str4, String str5) {
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("mode", str);
        }
        if (str2 != null) {
            hashMap.put(MetaDataField.SCREEN_FIELD, str2);
        }
        if (str3 != null) {
            hashMap.put("scooter_id", str3);
        }
        if (str4 != null) {
            hashMap.put("scooter_vendor", str4);
        }
        if (str5 != null) {
            hashMap.put("provider", str5);
        }
        this.a.a("Map.Scooter.Tapped", hashMap, 1, new HashMap());
    }
}
