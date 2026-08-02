package defpackage;

import java.util.HashMap;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes14.dex */
public final class eax0 {
    public final o7r0 a;

    public eax0(o7r0 o7r0Var) {
        this.a = o7r0Var;
    }

    public final void a(String str, String str2, String str3, PointType pointType, Boolean bool, boolean z, String str4) {
        int i = pointType == null ? -1 : dax0.a[pointType.ordinal()];
        if (i == 1) {
            str4 = "B";
        } else if (i == 2) {
            str4 = "A";
        }
        String j = b64.j(jl40.l(bool, Boolean.TRUE) ? "clarifying_" : jl40.l(bool, Boolean.FALSE) ? "editing_" : "", str4);
        long currentTimeMillis = System.currentTimeMillis();
        o7r0 o7r0Var = this.a;
        o7r0Var.getClass();
        HashMap hashMap = new HashMap();
        if (str2 != null) {
            hashMap.put("type", str2);
        }
        if (str3 != null) {
            hashMap.put("name", str3);
        }
        hashMap.put("id", str);
        hashMap.put("screen_type", j);
        hashMap.put("device_timestamp", Long.valueOf(currentTimeMillis));
        o7r0Var.a.a("Tap_POI", hashMap, 1, g8e.v(hashMap, "open_card", Boolean.valueOf(z)));
    }
}
