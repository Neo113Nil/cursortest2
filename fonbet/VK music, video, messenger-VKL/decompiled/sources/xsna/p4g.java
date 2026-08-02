package xsna;

import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* compiled from: CollectionExt.kt */
/* loaded from: classes.dex */
public final class p4g {
    public static final a a = new a();

    /* compiled from: CollectionExt.kt */
    public static final class a extends ThreadLocal<StringBuilder> {
        @Override // java.lang.ThreadLocal
        public final StringBuilder initialValue() {
            return new StringBuilder();
        }
    }

    public static final void a(Object obj, Collection collection, boolean z) {
        if (z) {
            collection.add(obj);
        }
    }

    public static final <T> boolean b(Collection<? extends T> collection, Collection<? extends T> collection2) {
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean c(Collection collection, Enum r2) {
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!epx.f(it.next(), r2)) {
                return false;
            }
        }
        return true;
    }

    public static final HashSet d(Set set) {
        HashSet hashSet = new HashSet(set.size());
        hashSet.addAll(set);
        return hashSet;
    }

    public static final HashSet e(Set set, Object obj) {
        HashSet hashSet = new HashSet(set.size());
        hashSet.addAll(set);
        hashSet.add(obj);
        return hashSet;
    }

    public static final HashSet f(Set set, Object obj) {
        HashSet hashSet = new HashSet(set.size());
        hashSet.addAll(set);
        hashSet.remove(obj);
        return hashSet;
    }

    public static final <K, V> boolean g(Map<K, ? extends V> map, Map<K, ? extends V> map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        Iterator<Map.Entry<K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (!map2.containsKey(it.next().getKey())) {
                return false;
            }
        }
        return true;
    }

    public static final LinkedHashMap h(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static final <T> Pair<Integer, T> i(Collection<? extends T> collection, wzs<? super Integer, ? super T, Boolean> wzsVar) {
        int i = 0;
        for (T t : collection) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            if (wzsVar.invoke(Integer.valueOf(i), t).booleanValue()) {
                return new Pair<>(Integer.valueOf(i), t);
            }
            i = i2;
        }
        return null;
    }

    public static final Integer j(Object obj, Collection collection) {
        int c0 = j5g.c0(collection, obj);
        if (c0 == -1) {
            return null;
        }
        return Integer.valueOf(c0);
    }

    public static final <E> String k(Collection<? extends E> collection, String str, izs<? super E, ? extends Object> izsVar) {
        Object invoke;
        if (collection.isEmpty()) {
            return "";
        }
        StringBuilder sb = a.get();
        sb.setLength(0);
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (izsVar != null && (invoke = izsVar.invoke(next)) != null) {
                next = invoke;
            }
            if (next instanceof Integer) {
                sb.append(((Number) next).intValue());
            } else if (next instanceof Long) {
                sb.append(((Number) next).longValue());
            } else {
                sb.append(next);
            }
            sb.append(str);
        }
        sb.setLength(sb.length() - str.length());
        return sb.toString();
    }

    public static final void l(ArrayList arrayList, Object obj, boolean z) {
        if (z) {
            arrayList.remove(obj);
        }
    }

    public static final void m(Collection collection, izs izsVar) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((Boolean) izsVar.invoke(it.next())).booleanValue()) {
                it.remove();
            }
        }
    }

    public static final <E> void n(Collection<E> collection, Collection<? extends E> collection2) {
        collection.clear();
        collection.addAll(collection2);
    }

    public static final void o(Collection collection, Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(((Map.Entry) it.next()).getKey())) {
                it.remove();
            }
        }
    }

    public static final List p(int i, Collection collection) {
        if (i <= 0) {
            throw new IllegalArgumentException(lhg.a(i, "Count < 0: "));
        }
        if (collection.size() < i) {
            return Collections.singletonList(j5g.O0(collection));
        }
        ArrayList arrayList = new ArrayList(collection);
        ArrayList arrayList2 = new ArrayList((collection.size() / i) + 1);
        int size = arrayList.size();
        if (i <= 0) {
            throw new IllegalArgumentException(uqi.a("Step must be positive, was: ", i, JwtParser.SEPARATOR_CHAR));
        }
        int i2 = 0;
        int b = tyx.b(0, size, i);
        if (b >= 0) {
            while (true) {
                int i3 = i2 + i;
                List subList = arrayList.subList(i2, Math.min(i3, arrayList.size()));
                if (!subList.isEmpty()) {
                    arrayList2.add(subList);
                }
                if (i2 == b) {
                    break;
                }
                i2 = i3;
            }
        }
        return arrayList2;
    }

    public static final <T> ArrayList<T> q(Collection<? extends T> collection) {
        ArrayList<T> arrayList = collection instanceof ArrayList ? (ArrayList) collection : null;
        return arrayList == null ? new ArrayList<>(collection) : arrayList;
    }

    public static final HashMap r(Collection collection, izs izsVar) {
        HashMap hashMap = new HashMap(collection.size());
        for (Object obj : collection) {
            hashMap.put(izsVar.invoke(obj), obj);
        }
        return hashMap;
    }

    public static final HashMap s(Collection collection, izs izsVar, izs izsVar2) {
        HashMap hashMap = new HashMap(collection.size());
        for (Object obj : collection) {
            hashMap.put(izsVar.invoke(obj), izsVar2.invoke(obj));
        }
        return hashMap;
    }
}
