package com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.state;

import defpackage.d6x;
import defpackage.gw00;
import defpackage.h5x;
import defpackage.i5x;
import defpackage.j5x;
import defpackage.jl40;
import defpackage.k6x;
import defpackage.m5x;
import defpackage.o6x;
import defpackage.tcc;
import defpackage.v4x;
import defpackage.v6x;
import defpackage.w4x;
import defpackage.w511;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a+\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\n*\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0019\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e*\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0012\u001a\u00020\u0004*\u00020\u0011H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lk6x;", "", "stateName", "valueName", "", "newValue", "Ld6x;", "updateValue", "(Lk6x;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ld6x;", "Lm5x;", "", "objectContent", "(Lm5x;)Ljava/util/Map;", "Lv4x;", "", "arrayContent", "(Lv4x;)Ljava/util/List;", "Lj5x;", "content", "(Lj5x;)Ljava/lang/Object;", "value", "toJasonNode", "(Ljava/lang/Object;)Lj5x;", "impl-18-1-0_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class JasonStateExtKt {
    public static final List<Object> arrayContent(v4x v4xVar) {
        List list = v4xVar.a;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(content((j5x) it.next()));
        }
        return arrayList;
    }

    public static final Object content(j5x j5xVar) {
        if (j5xVar instanceof o6x) {
            return ((o6x) j5xVar).a;
        }
        if (j5xVar instanceof i5x) {
            return Long.valueOf(((i5x) j5xVar).a);
        }
        if (j5xVar instanceof h5x) {
            return Double.valueOf(((h5x) j5xVar).a);
        }
        if (j5xVar instanceof w4x) {
            return Boolean.valueOf(((w4x) j5xVar).a);
        }
        if (j5xVar instanceof m5x) {
            return objectContent((m5x) j5xVar);
        }
        if (j5xVar instanceof v4x) {
            return arrayContent((v4x) j5xVar);
        }
        w511.b();
        return null;
    }

    public static final Map<String, Object> objectContent(m5x m5xVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : m5xVar.a.entrySet()) {
            linkedHashMap.put((String) entry.getKey(), content((j5x) entry.getValue()));
        }
        return linkedHashMap;
    }

    private static final j5x toJasonNode(Object obj) {
        if ((obj instanceof String) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double) || (obj instanceof Boolean)) {
            return new o6x(obj.toString());
        }
        if (obj instanceof Enum) {
            return new o6x(((Enum) obj).name());
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                j5x jasonNode = toJasonNode(it.next());
                if (jasonNode != null) {
                    arrayList.add(jasonNode);
                }
            }
            return new v4x(arrayList);
        }
        Set<Map.Entry> entrySet = ((Map) obj).entrySet();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : entrySet) {
            j5x jasonNode2 = toJasonNode(entry.getValue());
            Pair pair = jasonNode2 != null ? new Pair(String.valueOf(entry.getKey()), jasonNode2) : null;
            if (pair != null) {
                arrayList2.add(pair);
            }
        }
        int d = gw00.d(tcc.n(arrayList2, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Pair pair2 = (Pair) it2.next();
            linkedHashMap.put(pair2.c(), pair2.f());
        }
        return new m5x(linkedHashMap);
    }

    public static final d6x updateValue(k6x k6xVar, String str, String str2, Object obj) {
        if (!k6xVar.a()) {
            return k6xVar.b();
        }
        d6x updateValue$lambda$0 = updateValue$lambda$0(obj, str, str2, k6xVar.b());
        return jl40.l(updateValue$lambda$0, k6xVar.b()) ? k6xVar.b() : k6xVar.e(updateValue$lambda$0);
    }

    private static final d6x updateValue$lambda$0(Object obj, String str, String str2, d6x d6xVar) {
        v6x v6xVar = d6xVar.a;
        j5x jasonNode = toJasonNode(obj);
        if (jasonNode != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(v6xVar.a.a);
            Object obj2 = linkedHashMap.get(str);
            m5x m5xVar = obj2 instanceof m5x ? (m5x) obj2 : null;
            if (m5xVar != null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(m5xVar.a);
                linkedHashMap2.put(str2, jasonNode);
                linkedHashMap.put(str, new m5x(linkedHashMap2));
                v6xVar.a.getClass();
                return new d6x(new v6x(new m5x(linkedHashMap)), d6xVar.b);
            }
        }
        return d6xVar;
    }
}
