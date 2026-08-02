package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.b;
import yads.t32;

/* loaded from: classes7.dex */
public final class kn81 {
    public final Map a;

    public kn81(v981 v981Var) {
        this.a = b.i(new Pair(t32.c, new hr71(v981Var, 0)), new Pair(t32.d, new hr71(v981Var, 1)), new Pair(t32.e, new ek81()));
    }

    public HashMap a(Collection collection) {
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
