package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.a;

/* loaded from: classes5.dex */
public final class m6s {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0197 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(Object obj, Object obj2, boolean z) {
        Iterator it;
        boolean z2 = obj2 instanceof List;
        if (!z2 || !((List) obj2).isEmpty()) {
            if (z2) {
                Object obj3 = ((List) obj2).get(0);
                if (jl40.l(obj3 instanceof String ? (String) obj3 : null, "not_empty")) {
                    return obj != null;
                }
            }
            if (z2 && (obj instanceof List)) {
                List list = (List) obj2;
                if (list.size() == 1) {
                    Object obj4 = list.get(0);
                    List list2 = obj4 instanceof List ? (List) obj4 : null;
                    if (list2 != null) {
                        List list3 = (List) obj;
                        if (list2.size() == list3.size()) {
                            if (z) {
                                Iterator it2 = a.P0((Iterable) obj, list2).iterator();
                                while (it2.hasNext()) {
                                    Pair pair = (Pair) it2.next();
                                    if (!a(pair.getFirst(), pair.getSecond(), true)) {
                                    }
                                }
                            } else {
                                List list4 = list2;
                                ArrayList arrayList = new ArrayList();
                                for (Object obj5 : list4) {
                                    if (obj5 instanceof List) {
                                        List list5 = (List) obj5;
                                        if (!list5.isEmpty()) {
                                            Object S = a.S(0, list5);
                                            if (jl40.l(S instanceof String ? (String) S : null, "not_empty")) {
                                            }
                                        }
                                    }
                                    arrayList.add(obj5);
                                }
                                ArrayList arrayList2 = new ArrayList(list3);
                                Iterator it3 = arrayList.iterator();
                                loop2: while (true) {
                                    if (it3.hasNext()) {
                                        Object next = it3.next();
                                        it = arrayList2.iterator();
                                        while (it.hasNext()) {
                                            if (a(it.next(), next, false)) {
                                                break;
                                            }
                                        }
                                        break loop2;
                                    }
                                    int size = ((ArrayList) a.M(arrayList2)).size();
                                    ArrayList arrayList3 = new ArrayList();
                                    for (Object obj6 : list4) {
                                        if (obj6 instanceof List) {
                                            Object S2 = a.S(0, (List) obj6);
                                            if (jl40.l(S2 instanceof String ? (String) S2 : null, "not_empty")) {
                                                arrayList3.add(obj6);
                                            }
                                        }
                                    }
                                    if (size >= arrayList3.size()) {
                                    }
                                    it.remove();
                                }
                            }
                        }
                    }
                }
            }
            if ((obj2 instanceof Map) && (obj instanceof Map)) {
                Map map = (Map) obj2;
                Map map2 = (Map) obj;
                if (map.keySet().containsAll(map2.keySet())) {
                    for (Map.Entry entry : map.entrySet()) {
                        if (!a(map2.get(entry.getKey()), entry.getValue(), z)) {
                        }
                    }
                }
            }
            if (!(obj2 instanceof Number) || !(obj instanceof Number)) {
                return jl40.l(obj, obj2);
            }
            if (Math.abs(((Number) obj2).doubleValue() - ((Number) obj).doubleValue()) < 1.0E-14d) {
            }
        }
        return true;
    }
}
