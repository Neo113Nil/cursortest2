package xsna;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Pair;

/* compiled from: Maps.kt */
/* loaded from: classes11.dex */
public class pn00 extends on00 {
    public static Object h(Object obj, Map map) {
        if (map instanceof sm00) {
            return ((sm00) map).R2(obj);
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException(so.a(obj, "Key ", " is missing in the map."));
    }

    public static <K, V> HashMap<K, V> i(Pair<? extends K, ? extends V>... pairArr) {
        HashMap<K, V> hashMap = new HashMap<>(on00.e(pairArr.length));
        r(hashMap, pairArr);
        return hashMap;
    }

    public static <K, V> LinkedHashMap<K, V> j(Pair<? extends K, ? extends V>... pairArr) {
        LinkedHashMap<K, V> linkedHashMap = new LinkedHashMap<>(on00.e(pairArr.length));
        r(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    public static <K, V> Map<K, V> k(Pair<? extends K, ? extends V>... pairArr) {
        if (pairArr.length <= 0) {
            return jgp.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(on00.e(pairArr.length));
        r(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    public static Map l(Object obj, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.remove(obj);
        int size = linkedHashMap.size();
        if (size == 0) {
            return jgp.b;
        }
        if (size != 1) {
            return linkedHashMap;
        }
        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    public static LinkedHashMap m(Pair... pairArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(on00.e(pairArr.length));
        r(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    public static LinkedHashMap n(Map map, Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static <K, V> Map<K, V> o(Map<? extends K, ? extends V> map, Pair<? extends K, ? extends V> pair) {
        if (map.isEmpty()) {
            return on00.f(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.i(), pair.j());
        return linkedHashMap;
    }

    public static <K, V> void p(Map<? super K, ? super V> map, Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        for (Pair<? extends K, ? extends V> pair : iterable) {
            map.put(pair.d(), pair.g());
        }
    }

    public static <K, V> void q(Map<? super K, ? super V> map, uki0<? extends Pair<? extends K, ? extends V>> uki0Var) {
        for (Pair<? extends K, ? extends V> pair : uki0Var) {
            map.put(pair.d(), pair.g());
        }
    }

    public static <K, V> void r(Map<? super K, ? super V> map, Pair<? extends K, ? extends V>[] pairArr) {
        for (Pair<? extends K, ? extends V> pair : pairArr) {
            map.put(pair.d(), pair.g());
        }
    }

    public static <K, V> Map<K, V> s(Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        boolean z = iterable instanceof Collection;
        jgp jgpVar = jgp.b;
        if (z) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return jgpVar;
            }
            if (size == 1) {
                return on00.f((Pair) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(on00.e(collection.size()));
            p(linkedHashMap, iterable);
            return linkedHashMap;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        p(linkedHashMap2, iterable);
        int size2 = linkedHashMap2.size();
        if (size2 == 0) {
            return jgpVar;
        }
        if (size2 != 1) {
            return linkedHashMap2;
        }
        Map.Entry<K, V> next = linkedHashMap2.entrySet().iterator().next();
        return Collections.singletonMap(next.getKey(), next.getValue());
    }

    public static <K, V> Map<K, V> t(Map<? extends K, ? extends V> map) {
        int size = map.size();
        if (size == 0) {
            return jgp.b;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        return Collections.singletonMap(next.getKey(), next.getValue());
    }

    public static <K, V> Map<K, V> u(Pair<? extends K, ? extends V>[] pairArr) {
        int length = pairArr.length;
        if (length == 0) {
            return jgp.b;
        }
        if (length == 1) {
            return on00.f(pairArr[0]);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(on00.e(pairArr.length));
        r(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    public static LinkedHashMap v(Map map) {
        return new LinkedHashMap(map);
    }
}
