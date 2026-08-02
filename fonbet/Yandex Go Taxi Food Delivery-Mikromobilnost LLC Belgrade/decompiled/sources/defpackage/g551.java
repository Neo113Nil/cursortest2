package defpackage;

import com.yandex.go.dto.response.BundledOrdersPayload;
import com.yandex.go.dto.response.OrderDto;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.MapBuilder;
import kotlin.collections.builders.SetBuilder;

/* loaded from: classes10.dex */
public final class g551 {
    public final List a = scc.g(yaf0.c, yaf0.b);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [x251] */
    /* JADX WARN: Type inference failed for: r4v5, types: [kv6] */
    /* JADX WARN: Type inference failed for: r4v6, types: [kv6] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [cb80] */
    /* JADX WARN: Type inference failed for: r4v9, types: [cb80] */
    public static ArrayList a(List list, List list2) {
        if (list2 != null && !list.isEmpty()) {
            List list3 = list;
            int d = gw00.d(tcc.n(list3, 10));
            if (d < 16) {
                d = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(d);
            for (Object obj : list3) {
                linkedHashMap.put(((wx70) obj).getB(), obj);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
            List<??> list4 = list2;
            ArrayList arrayList = new ArrayList(tcc.n(list4, 10));
            for (?? r4 : list4) {
                if (r4 instanceof cb80) {
                    r4 = (cb80) r4;
                    wx70 wx70Var = (wx70) linkedHashMap2.remove(r4.getA().getC());
                    if (wx70Var != null) {
                        r4 = cb80.b(r4, c(wx70Var));
                    }
                } else if (r4 instanceof kv6) {
                    r4 = (kv6) r4;
                    List<OrderDto> c = r4.getA().getC();
                    int d2 = gw00.d(tcc.n(c, 10));
                    if (d2 < 16) {
                        d2 = 16;
                    }
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(d2);
                    for (OrderDto orderDto : c) {
                        Pair pair = new Pair(orderDto.getC(), linkedHashMap2.get(orderDto.getC()));
                        linkedHashMap3.put(pair.c(), pair.f());
                    }
                    if (!linkedHashMap3.isEmpty()) {
                        Iterator it = linkedHashMap3.entrySet().iterator();
                        while (it.hasNext()) {
                            if (((Map.Entry) it.next()).getValue() == null) {
                                break;
                            }
                        }
                    }
                    linkedHashMap2.keySet().removeAll(linkedHashMap3.keySet());
                    BundledOrdersPayload a = r4.getA();
                    Collection values = linkedHashMap3.values();
                    Iterator it2 = values.iterator();
                    while (it2.hasNext()) {
                        if (it2.next() == null) {
                            vg10.h("null element found in ", values, 46);
                            return null;
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(tcc.n(values, 10));
                    Iterator it3 = values.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(c((wx70) it3.next()));
                    }
                    r4 = kv6.b(r4, BundledOrdersPayload.a(a, arrayList2));
                } else if (!(r4 instanceof m521)) {
                    w511.b();
                    return null;
                }
                arrayList.add(r4);
            }
            if (!linkedHashMap2.isEmpty()) {
                arrayList = null;
            }
            if (arrayList != null) {
                return arrayList;
            }
        }
        List list5 = list;
        ArrayList arrayList3 = new ArrayList(tcc.n(list5, 10));
        Iterator it4 = list5.iterator();
        while (it4.hasNext()) {
            arrayList3.add(new cb80(c((wx70) it4.next()), 2));
        }
        return arrayList3;
    }

    public static OrderDto c(wx70 wx70Var) {
        return new OrderDto(wx70Var.getA(), wx70Var.getB(), 10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012f  */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map b(c551 c551Var, Map map, boolean z) {
        Object obj;
        String str;
        ?? r5;
        if (map == null) {
            MapBuilder mapBuilder = new MapBuilder();
            List list = this.a;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (jl40.l(vez0.D((uaf0) it.next()), c551Var.a)) {
                        break;
                    }
                }
            }
            if (c551Var.a != null) {
                obj = EmptyList.a;
                if (z) {
                    mapBuilder.put(new o801("superapp_main"), obj);
                    mapBuilder.put(new o801("wallet"), obj);
                }
                str = c551Var.a;
                if (str == null) {
                    str = "";
                }
                mapBuilder.put(new o801(str), obj);
                return mapBuilder.j();
            }
            obj = a(c551Var.b, null);
            if (z) {
            }
            str = c551Var.a;
            if (str == null) {
            }
            mapBuilder.put(new o801(str), obj);
            return mapBuilder.j();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            List<x251> list2 = (List) entry.getValue();
            if (z) {
                SetBuilder setBuilder = new SetBuilder();
                for (x251 x251Var : list2) {
                    if (x251Var instanceof cb80) {
                        setBuilder.add(((cb80) x251Var).getA().getC());
                    } else if (x251Var instanceof kv6) {
                        List c = ((kv6) x251Var).getA().getC();
                        ArrayList arrayList = new ArrayList(tcc.n(c, 10));
                        Iterator it2 = c.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(((OrderDto) it2.next()).getC());
                        }
                        setBuilder.addAll(arrayList);
                    } else if (!(x251Var instanceof m521)) {
                        w511.b();
                        return null;
                    }
                }
                SetBuilder b = setBuilder.b();
                List list3 = c551Var.b;
                r5 = new ArrayList();
                for (Object obj2 : list3) {
                    if (b.contains(((wx70) obj2).getB())) {
                        r5.add(obj2);
                    }
                }
            } else {
                r5 = c551Var.b;
            }
            linkedHashMap.put(key, a(r5, list2));
        }
        return linkedHashMap;
    }
}
