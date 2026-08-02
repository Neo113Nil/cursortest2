package defpackage;

import java.util.HashMap;

/* loaded from: classes6.dex */
public final class jho0 {
    public final pho a;

    public jho0(pho phoVar) {
        this.a = phoVar;
    }

    public final void a(String str, String str2, String str3) {
        HashMap p = x4e.p("close_reason", "button");
        if (str != null) {
            p.put("order_id", str);
        }
        if (str2 != null) {
            p.put("scooter_number", str2);
        }
        if (str3 != null) {
            p.put("camera_state", str3);
        }
        this.a.a("ScootersPhotoOfDamageCard.Closed", p, 1, new HashMap());
    }

    public final void b(String str, String str2, String str3, String str4) {
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("button_name", str);
        }
        if (str2 != null) {
            hashMap.put("order_id", str2);
        }
        if (str3 != null) {
            hashMap.put("scooter_number", str3);
        }
        if (str4 != null) {
            hashMap.put("camera_state", str4);
        }
        this.a.a("ScootersPhotoOfDamageCard.Tapped", hashMap, 1, new HashMap());
    }
}
