package xsna;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes13.dex */
public final class ti01 {
    public final Map a;

    public final HashMap a(Collection collection) {
        Set unmodifiableSet;
        HashMap hashMap = new HashMap();
        Map map = this.a;
        for (String str : map.keySet()) {
            if (map.containsKey(str)) {
                HashSet hashSet = new HashSet();
                for (Map.Entry entry : ((Map) map.get(str)).entrySet()) {
                    if (collection.contains(entry.getKey())) {
                        hashSet.add((String) entry.getValue());
                    }
                }
                unmodifiableSet = Collections.unmodifiableSet(hashSet);
            } else {
                unmodifiableSet = Collections.EMPTY_SET;
            }
            hashMap.put(str, unmodifiableSet);
        }
        return hashMap;
    }
}
