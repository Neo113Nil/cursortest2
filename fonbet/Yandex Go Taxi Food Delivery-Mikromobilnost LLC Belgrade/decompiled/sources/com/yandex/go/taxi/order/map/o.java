package com.yandex.go.taxi.order.map;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.geo.XYPoint;
import defpackage.f4c0;
import defpackage.gw00;
import defpackage.ny61;
import defpackage.rcc;
import defpackage.scc;
import defpackage.sfr;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.EmptySet;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class o {
    public final ru.yandex.taxi.map_common.map.utils.a a;

    public o(ru.yandex.taxi.map_common.map.utils.a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0135, code lost:
    
        r9 = r7.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0143, code lost:
    
        if (r9.hasNext() != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0145, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x017a, code lost:
    
        r8 = (java.util.Map.Entry) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x017c, code lost:
    
        if (r8 == null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x017e, code lost:
    
        r8 = ((java.lang.Number) r8.getKey()).intValue();
        r9 = (java.util.Set) r7.get(java.lang.Integer.valueOf(r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0192, code lost:
    
        if (r9 != null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0194, code lost:
    
        r9 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0195, code lost:
    
        r6.add(java.lang.Integer.valueOf(r8));
        r9 = r9.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01a4, code lost:
    
        if (r9.hasNext() == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01a6, code lost:
    
        r10 = (java.util.Set) r7.get(java.lang.Integer.valueOf(((java.lang.Number) r9.next()).intValue()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01ba, code lost:
    
        if (r10 == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01bc, code lost:
    
        r10.remove(java.lang.Integer.valueOf(r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0147, code lost:
    
        r8 = r9.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x014f, code lost:
    
        if (r9.hasNext() != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0152, code lost:
    
        r10 = ((java.util.Set) ((java.util.Map.Entry) r8).getValue()).size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x015f, code lost:
    
        r1 = r9.next();
        r2 = ((java.util.Set) ((java.util.Map.Entry) r1).getValue()).size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0170, code lost:
    
        if (r10 >= r2) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0172, code lost:
    
        r8 = r1;
        r10 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0178, code lost:
    
        if (r9.hasNext() != false) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006d A[LOOP:0: B:11:0x0067->B:13:0x006d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01cd A[EDGE_INSN: B:86:0x01cd->B:46:0x01cd BREAK  A[LOOP:3: B:41:0x0108->B:73:0x01c4, LOOP_LABEL: LOOP:3: B:41:0x0108->B:73:0x01c4], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(CopyOnWriteArrayList copyOnWriteArrayList, List list, float f, ContinuationImpl continuationImpl) {
        RoadObjectsIntersectionsDetector$checkIntersecting$1 roadObjectsIntersectionsDetector$checkIntersecting$1;
        int i;
        LinkedHashMap linkedHashMap;
        boolean containsKey;
        Collection values;
        Iterator it;
        int intValue;
        if (continuationImpl instanceof RoadObjectsIntersectionsDetector$checkIntersecting$1) {
            roadObjectsIntersectionsDetector$checkIntersecting$1 = (RoadObjectsIntersectionsDetector$checkIntersecting$1) continuationImpl;
            int i2 = roadObjectsIntersectionsDetector$checkIntersecting$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                roadObjectsIntersectionsDetector$checkIntersecting$1.label = i2 - Integer.MIN_VALUE;
                Object obj = roadObjectsIntersectionsDetector$checkIntersecting$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = roadObjectsIntersectionsDetector$checkIntersecting$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ArrayList m0 = kotlin.collections.a.m0(copyOnWriteArrayList, list);
                    roadObjectsIntersectionsDetector$checkIntersecting$1.L$0 = null;
                    roadObjectsIntersectionsDetector$checkIntersecting$1.L$1 = null;
                    roadObjectsIntersectionsDetector$checkIntersecting$1.F$0 = f;
                    roadObjectsIntersectionsDetector$checkIntersecting$1.label = 1;
                    obj = b(m0, f, roadObjectsIntersectionsDetector$checkIntersecting$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                Map map = (Map) obj;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(gw00.d(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap2.put(entry.getKey(), kotlin.collections.a.M0((Iterable) entry.getValue()));
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap2);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                containsKey = map.containsKey(0);
                EmptySet emptySet = EmptySet.a;
                if (containsKey) {
                    Set set = (Set) map.get(0);
                    if (set == null) {
                        set = emptySet;
                    }
                    Iterator it2 = set.iterator();
                    while (it2.hasNext()) {
                        int intValue2 = ((Number) it2.next()).intValue();
                        linkedHashSet.add(Integer.valueOf(intValue2));
                        Set set2 = (Set) map.get(Integer.valueOf(intValue2));
                        if (set2 == null) {
                            set2 = emptySet;
                        }
                        Iterator it3 = set2.iterator();
                        while (it3.hasNext()) {
                            Set set3 = (Set) linkedHashMap.get(Integer.valueOf(((Number) it3.next()).intValue()));
                            if (set3 != null) {
                                set3.remove(Integer.valueOf(intValue2));
                            }
                        }
                        linkedHashMap.remove(Integer.valueOf(intValue2));
                    }
                    linkedHashMap.remove(0);
                }
                loop3: while (true) {
                    values = linkedHashMap.values();
                    if (!(values instanceof Collection) && values.isEmpty()) {
                        break;
                    }
                    it = values.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break loop3;
                        }
                        if (!((Set) it.next()).isEmpty()) {
                            break;
                        }
                    }
                    linkedHashMap.remove(Integer.valueOf(intValue));
                }
                return linkedHashSet;
            }
        }
        roadObjectsIntersectionsDetector$checkIntersecting$1 = new RoadObjectsIntersectionsDetector$checkIntersecting$1(this, continuationImpl);
        Object obj2 = roadObjectsIntersectionsDetector$checkIntersecting$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = roadObjectsIntersectionsDetector$checkIntersecting$1.label;
        if (i != 0) {
        }
        Map map2 = (Map) obj2;
        LinkedHashMap linkedHashMap22 = new LinkedHashMap(gw00.d(map2.size()));
        while (r7.hasNext()) {
        }
        linkedHashMap = new LinkedHashMap(linkedHashMap22);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        containsKey = map2.containsKey(0);
        EmptySet emptySet2 = EmptySet.a;
        if (containsKey) {
        }
        loop3: while (true) {
            values = linkedHashMap.values();
            if (!(values instanceof Collection)) {
            }
            it = values.iterator();
            while (true) {
                if (!it.hasNext()) {
                }
            }
            linkedHashMap.remove(Integer.valueOf(intValue));
        }
        return linkedHashSet2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x008f -> B:10:0x0047). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ArrayList arrayList, float f, ContinuationImpl continuationImpl) {
        RoadObjectsIntersectionsDetector$getIntersections$1 roadObjectsIntersectionsDetector$getIntersections$1;
        int i;
        Map linkedHashMap;
        List a;
        List list;
        Iterator it;
        float f2;
        if (continuationImpl instanceof RoadObjectsIntersectionsDetector$getIntersections$1) {
            roadObjectsIntersectionsDetector$getIntersections$1 = (RoadObjectsIntersectionsDetector$getIntersections$1) continuationImpl;
            int i2 = roadObjectsIntersectionsDetector$getIntersections$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                roadObjectsIntersectionsDetector$getIntersections$1.label = i2 - Integer.MIN_VALUE;
                Object obj = roadObjectsIntersectionsDetector$getIntersections$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = roadObjectsIntersectionsDetector$getIntersections$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    linkedHashMap = new LinkedHashMap();
                    a = rcc.a();
                    list = a;
                    it = arrayList.iterator();
                    f2 = f;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    float f3 = roadObjectsIntersectionsDetector$getIntersections$1.F$0;
                    f4c0 f4c0Var = (f4c0) roadObjectsIntersectionsDetector$getIntersections$1.L$5;
                    it = (Iterator) roadObjectsIntersectionsDetector$getIntersections$1.L$4;
                    a = (List) roadObjectsIntersectionsDetector$getIntersections$1.L$3;
                    list = (List) roadObjectsIntersectionsDetector$getIntersections$1.L$2;
                    linkedHashMap = (Map) roadObjectsIntersectionsDetector$getIntersections$1.L$1;
                    kotlin.b.b(obj);
                    float f4 = f3;
                    a.add(ru.yandex.taxi.map.utils.a.l(f4c0Var, (XYPoint) obj, 0, 0, 0, 0, f4));
                    f2 = f4;
                    if (it.hasNext()) {
                        f4c0Var = (f4c0) it.next();
                        Point point = (Point) f4c0Var.h;
                        roadObjectsIntersectionsDetector$getIntersections$1.L$0 = null;
                        roadObjectsIntersectionsDetector$getIntersections$1.L$1 = linkedHashMap;
                        roadObjectsIntersectionsDetector$getIntersections$1.L$2 = list;
                        roadObjectsIntersectionsDetector$getIntersections$1.L$3 = a;
                        roadObjectsIntersectionsDetector$getIntersections$1.L$4 = it;
                        roadObjectsIntersectionsDetector$getIntersections$1.L$5 = f4c0Var;
                        roadObjectsIntersectionsDetector$getIntersections$1.F$0 = f2;
                        roadObjectsIntersectionsDetector$getIntersections$1.label = 1;
                        Object b = this.a.b(point, roadObjectsIntersectionsDetector$getIntersections$1);
                        if (b == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        f4 = f2;
                        obj = b;
                        a.add(ru.yandex.taxi.map.utils.a.l(f4c0Var, (XYPoint) obj, 0, 0, 0, 0, f4));
                        f2 = f4;
                        if (it.hasNext()) {
                            ListBuilder j = ((ListBuilder) list).j();
                            int f5 = scc.f(j);
                            if (f5 >= 0) {
                                int i3 = 0;
                                while (true) {
                                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                                    int f6 = scc.f(j);
                                    if (f6 >= 0) {
                                        int i4 = 0;
                                        while (true) {
                                            if (i3 != i4) {
                                                Polyline polyline = ru.yandex.taxi.map.utils.a.b;
                                                if (ru.yandex.taxi.map.utils.a.b((sfr) j.get(i3), (sfr) j.get(i4))) {
                                                    linkedHashSet.add(new Integer(i4));
                                                }
                                            }
                                            if (i4 == f6) {
                                                break;
                                            }
                                            i4++;
                                        }
                                    }
                                    if (!linkedHashSet.isEmpty()) {
                                        linkedHashMap.put(new Integer(i3), linkedHashSet);
                                    }
                                    if (i3 == f5) {
                                        break;
                                    }
                                    i3++;
                                }
                            }
                            return linkedHashMap;
                        }
                    }
                }
            }
        }
        roadObjectsIntersectionsDetector$getIntersections$1 = new RoadObjectsIntersectionsDetector$getIntersections$1(this, continuationImpl);
        Object obj2 = roadObjectsIntersectionsDetector$getIntersections$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = roadObjectsIntersectionsDetector$getIntersections$1.label;
        if (i != 0) {
        }
    }
}
