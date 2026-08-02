package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public final class caa1 {
    public final HashMap a = new HashMap();

    public final void a(String str, String str2, String str3) {
        HashMap hashMap = this.a;
        if (!hashMap.containsKey(str2)) {
            hashMap.put(str2, new HashMap());
        }
        ((Map) hashMap.get(str2)).put(str, str3);
    }

    public final kn81 b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.a.entrySet()) {
            hashMap.put((String) entry.getKey(), Collections.unmodifiableMap(new HashMap((Map) entry.getValue())));
        }
        return new kn81(Collections.unmodifiableMap(hashMap));
    }
}
