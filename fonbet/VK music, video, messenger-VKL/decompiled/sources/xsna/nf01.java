package xsna;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes13.dex */
public final class nf01 {
    public final HashMap a = new HashMap();

    public final void a(String str, String str2, String str3) {
        HashMap hashMap = this.a;
        if (!hashMap.containsKey(str2)) {
            hashMap.put(str2, new HashMap());
        }
        ((Map) hashMap.get(str2)).put(str, str3);
    }

    public final ti01 b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.a.entrySet()) {
            hashMap.put((String) entry.getKey(), Collections.unmodifiableMap(new HashMap((Map) entry.getValue())));
        }
        return new ti01(Collections.unmodifiableMap(hashMap));
    }
}
