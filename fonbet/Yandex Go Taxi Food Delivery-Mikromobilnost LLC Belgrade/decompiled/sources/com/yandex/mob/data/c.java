package com.yandex.mob.data;

import com.yandex.mob.datastore.f;
import com.yandex.mob.domain.g;
import com.yandex.mob.domain.l;
import defpackage.an20;
import defpackage.ffx;
import defpackage.fn20;
import defpackage.gn20;
import defpackage.gw00;
import defpackage.hn20;
import defpackage.iq20;
import defpackage.jl40;
import defpackage.lq20;
import defpackage.ny61;
import defpackage.ol20;
import defpackage.oq20;
import defpackage.pr20;
import defpackage.saj;
import defpackage.tje;
import defpackage.tm20;
import defpackage.tpr;
import defpackage.vng;
import defpackage.zm20;
import defpackage.zy11;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.t0;

/* loaded from: classes8.dex */
public final class c {
    public final f a;
    public final l b;
    public final g c;
    public final an20 d;
    public final ConcurrentHashMap e = new ConcurrentHashMap();
    public final AtomicReference f = new AtomicReference(kotlin.collections.b.f());
    public final ConcurrentHashMap g = new ConcurrentHashMap();
    public final n0 h = ffx.c(0, 1, BufferOverflow.DROP_OLDEST, 1);

    public c(f fVar, l lVar, g gVar, an20 an20Var) {
        this.a = fVar;
        this.b = lVar;
        this.c = gVar;
        this.d = an20Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, ContinuationImpl continuationImpl) {
        MobContourProvisionMemoryStorage$rebuildInMemoryStorage$1 mobContourProvisionMemoryStorage$rebuildInMemoryStorage$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        List list;
        Object a;
        tm20 tm20Var;
        List<List> list2;
        cVar.getClass();
        ConcurrentHashMap concurrentHashMap = cVar.e;
        if (continuationImpl instanceof MobContourProvisionMemoryStorage$rebuildInMemoryStorage$1) {
            mobContourProvisionMemoryStorage$rebuildInMemoryStorage$1 = (MobContourProvisionMemoryStorage$rebuildInMemoryStorage$1) continuationImpl;
            int i2 = mobContourProvisionMemoryStorage$rebuildInMemoryStorage$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobContourProvisionMemoryStorage$rebuildInMemoryStorage$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mobContourProvisionMemoryStorage$rebuildInMemoryStorage$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobContourProvisionMemoryStorage$rebuildInMemoryStorage$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List J0 = kotlin.collections.a.J0(concurrentHashMap.keySet());
                    if (!J0.isEmpty()) {
                        l lVar = cVar.b;
                        mobContourProvisionMemoryStorage$rebuildInMemoryStorage$1.L$0 = J0;
                        mobContourProvisionMemoryStorage$rebuildInMemoryStorage$1.label = 1;
                        Object d = lVar.d(mobContourProvisionMemoryStorage$rebuildInMemoryStorage$1);
                        if (d != coroutineSingletons) {
                            list = J0;
                            obj = d;
                        }
                        return coroutineSingletons;
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tm20Var = (tm20) mobContourProvisionMemoryStorage$rebuildInMemoryStorage$1.L$1;
                    list2 = (List) mobContourProvisionMemoryStorage$rebuildInMemoryStorage$1.L$0;
                    kotlin.b.b(obj);
                    Map map = (Map) obj;
                    for (List list3 : list2) {
                        LinkedHashMap b = cVar.b(cVar.g, list3, tm20Var, map);
                        if (b.isEmpty()) {
                            concurrentHashMap.remove(list3);
                        } else {
                            concurrentHashMap.put(list3, b);
                        }
                    }
                    return zy11.a;
                }
                list = (List) mobContourProvisionMemoryStorage$rebuildInMemoryStorage$1.L$0;
                kotlin.b.b(obj);
                tm20 tm20Var2 = (tm20) obj;
                g gVar = cVar.c;
                mobContourProvisionMemoryStorage$rebuildInMemoryStorage$1.L$0 = list;
                mobContourProvisionMemoryStorage$rebuildInMemoryStorage$1.L$1 = tm20Var2;
                mobContourProvisionMemoryStorage$rebuildInMemoryStorage$1.label = 2;
                a = gVar.a(mobContourProvisionMemoryStorage$rebuildInMemoryStorage$1);
                if (a != coroutineSingletons) {
                    tm20Var = tm20Var2;
                    obj = a;
                    list2 = list;
                    Map map2 = (Map) obj;
                    while (r1.hasNext()) {
                    }
                    return zy11.a;
                }
                return coroutineSingletons;
            }
        }
        mobContourProvisionMemoryStorage$rebuildInMemoryStorage$1 = new MobContourProvisionMemoryStorage$rebuildInMemoryStorage$1(cVar, continuationImpl);
        Object obj2 = mobContourProvisionMemoryStorage$rebuildInMemoryStorage$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobContourProvisionMemoryStorage$rebuildInMemoryStorage$1.label;
        if (i != 0) {
        }
        tm20 tm20Var22 = (tm20) obj2;
        g gVar2 = cVar.c;
        mobContourProvisionMemoryStorage$rebuildInMemoryStorage$1.L$0 = list;
        mobContourProvisionMemoryStorage$rebuildInMemoryStorage$1.L$1 = tm20Var22;
        mobContourProvisionMemoryStorage$rebuildInMemoryStorage$1.label = 2;
        a = gVar2.a(mobContourProvisionMemoryStorage$rebuildInMemoryStorage$1);
        if (a != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    public final LinkedHashMap b(ConcurrentHashMap concurrentHashMap, List list, tm20 tm20Var, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            zm20 zm20Var = (zm20) entry.getKey();
            List<pr20> list2 = (List) entry.getValue();
            if (m(zm20Var, list)) {
                for (pr20 pr20Var : list2) {
                    lq20 lq20Var = pr20Var.a;
                    linkedHashMap.put(lq20Var.a, new iq20(pr20Var, this.c.b(tm20Var, lq20Var), map, kotlin.collections.b.i(new Pair("mobConfigId", tm20Var.a), new Pair("mobProxyId", pr20Var.a.b))));
                }
            }
        }
        return linkedHashMap;
    }

    public final void c(List list) {
        ConcurrentHashMap concurrentHashMap = this.g;
        concurrentHashMap.clear();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            pr20 pr20Var = (pr20) it.next();
            zm20 i = vng.i(pr20Var.a);
            Object obj = linkedHashMap.get(i);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(i, obj);
            }
            ((List) obj).add(pr20Var);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            concurrentHashMap.put((zm20) entry.getKey(), (List) entry.getValue());
        }
    }

    public final Map d(List list) {
        Map map = (Map) this.e.get(list);
        if (map == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!e(map, (zm20) it.next())) {
                return null;
            }
        }
        return map;
    }

    public final boolean e(Map map, zm20 zm20Var) {
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            if (l(vng.i(((iq20) it.next()).a.a), zm20Var)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable f(ArrayList arrayList, ContinuationImpl continuationImpl) {
        MobContourProvisionMemoryStorage$createDefaultProvisions$1 mobContourProvisionMemoryStorage$createDefaultProvisions$1;
        int i;
        List list;
        if (continuationImpl instanceof MobContourProvisionMemoryStorage$createDefaultProvisions$1) {
            mobContourProvisionMemoryStorage$createDefaultProvisions$1 = (MobContourProvisionMemoryStorage$createDefaultProvisions$1) continuationImpl;
            int i2 = mobContourProvisionMemoryStorage$createDefaultProvisions$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobContourProvisionMemoryStorage$createDefaultProvisions$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mobContourProvisionMemoryStorage$createDefaultProvisions$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobContourProvisionMemoryStorage$createDefaultProvisions$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mobContourProvisionMemoryStorage$createDefaultProvisions$1.L$0 = arrayList;
                    mobContourProvisionMemoryStorage$createDefaultProvisions$1.label = 1;
                    obj = this.b.d(mobContourProvisionMemoryStorage$createDefaultProvisions$1);
                    list = arrayList;
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    List list2 = (List) mobContourProvisionMemoryStorage$createDefaultProvisions$1.L$0;
                    kotlin.b.b(obj);
                    list = list2;
                }
                tm20 tm20Var = (tm20) obj;
                g gVar = this.c;
                gVar.a.getClass();
                Map e = gw00.e(new Pair("X-Mob-Id", "Undefined"));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (lq20 lq20Var : tm20Var.c) {
                    zm20 i3 = vng.i(lq20Var);
                    if (m(i3, list)) {
                        pr20 pr20Var = new pr20(lq20Var, false);
                        oq20 b = gVar.b(tm20Var, lq20Var);
                        gVar.getClass();
                        linkedHashMap.put(i3, new iq20(pr20Var, b, e, kotlin.collections.b.i(new Pair("mobConfigId", tm20Var.a), new Pair("mobProxyId", lq20Var.b))));
                    }
                }
                return linkedHashMap;
            }
        }
        mobContourProvisionMemoryStorage$createDefaultProvisions$1 = new MobContourProvisionMemoryStorage$createDefaultProvisions$1(this, continuationImpl);
        Object obj2 = mobContourProvisionMemoryStorage$createDefaultProvisions$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobContourProvisionMemoryStorage$createDefaultProvisions$1.label;
        if (i != 0) {
        }
        tm20 tm20Var2 = (tm20) obj2;
        g gVar2 = this.c;
        gVar2.a.getClass();
        Map e2 = gw00.e(new Pair("X-Mob-Id", "Undefined"));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        while (r3.hasNext()) {
        }
        return linkedHashMap2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable g(ArrayList arrayList, ContinuationImpl continuationImpl) {
        MobContourProvisionMemoryStorage$fallbackProvisions$1 mobContourProvisionMemoryStorage$fallbackProvisions$1;
        int i;
        LinkedHashMap linkedHashMap;
        Map map;
        if (continuationImpl instanceof MobContourProvisionMemoryStorage$fallbackProvisions$1) {
            mobContourProvisionMemoryStorage$fallbackProvisions$1 = (MobContourProvisionMemoryStorage$fallbackProvisions$1) continuationImpl;
            int i2 = mobContourProvisionMemoryStorage$fallbackProvisions$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobContourProvisionMemoryStorage$fallbackProvisions$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mobContourProvisionMemoryStorage$fallbackProvisions$1.result;
                Serializable serializable = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobContourProvisionMemoryStorage$fallbackProvisions$1.label;
                AtomicReference atomicReference = this.f;
                if (i != 0) {
                    kotlin.b.b(obj);
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    ArrayList arrayList2 = new ArrayList();
                    Map map2 = (Map) atomicReference.get();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        zm20 zm20Var = (zm20) it.next();
                        boolean z = false;
                        for (Map.Entry entry : map2.entrySet()) {
                            zm20 zm20Var2 = (zm20) entry.getKey();
                            iq20 iq20Var = (iq20) entry.getValue();
                            if (l(zm20Var2, zm20Var)) {
                                linkedHashMap2.put(zm20Var2, iq20Var);
                                z = true;
                            }
                        }
                        if (!z) {
                            arrayList2.add(zm20Var);
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        return linkedHashMap2;
                    }
                    mobContourProvisionMemoryStorage$fallbackProvisions$1.L$0 = null;
                    mobContourProvisionMemoryStorage$fallbackProvisions$1.L$1 = linkedHashMap2;
                    mobContourProvisionMemoryStorage$fallbackProvisions$1.L$2 = null;
                    mobContourProvisionMemoryStorage$fallbackProvisions$1.L$3 = null;
                    mobContourProvisionMemoryStorage$fallbackProvisions$1.label = 1;
                    Serializable f = f(arrayList2, mobContourProvisionMemoryStorage$fallbackProvisions$1);
                    if (f == serializable) {
                        return serializable;
                    }
                    obj = f;
                    linkedHashMap = linkedHashMap2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    linkedHashMap = (LinkedHashMap) mobContourProvisionMemoryStorage$fallbackProvisions$1.L$1;
                    kotlin.b.b(obj);
                }
                map = (Map) obj;
                if (!map.isEmpty()) {
                    atomicReference.updateAndGet(new saj(2, map));
                    linkedHashMap.putAll(map);
                }
                return linkedHashMap;
            }
        }
        mobContourProvisionMemoryStorage$fallbackProvisions$1 = new MobContourProvisionMemoryStorage$fallbackProvisions$1(this, continuationImpl);
        Object obj2 = mobContourProvisionMemoryStorage$fallbackProvisions$1.result;
        Serializable serializable2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobContourProvisionMemoryStorage$fallbackProvisions$1.label;
        AtomicReference atomicReference2 = this.f;
        if (i != 0) {
        }
        map = (Map) obj2;
        if (!map.isEmpty()) {
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(ContinuationImpl continuationImpl) {
        MobContourProvisionMemoryStorage$init$1 mobContourProvisionMemoryStorage$init$1;
        int i;
        if (continuationImpl instanceof MobContourProvisionMemoryStorage$init$1) {
            mobContourProvisionMemoryStorage$init$1 = (MobContourProvisionMemoryStorage$init$1) continuationImpl;
            int i2 = mobContourProvisionMemoryStorage$init$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobContourProvisionMemoryStorage$init$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mobContourProvisionMemoryStorage$init$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobContourProvisionMemoryStorage$init$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mobContourProvisionMemoryStorage$init$1.L$0 = this;
                    mobContourProvisionMemoryStorage$init$1.label = 1;
                    obj = this.a.b(mobContourProvisionMemoryStorage$init$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (c) mobContourProvisionMemoryStorage$init$1.L$0;
                    kotlin.b.b(obj);
                }
                this.c((List) obj);
                return zy11.a;
            }
        }
        mobContourProvisionMemoryStorage$init$1 = new MobContourProvisionMemoryStorage$init$1(this, continuationImpl);
        Object obj2 = mobContourProvisionMemoryStorage$init$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobContourProvisionMemoryStorage$init$1.label;
        if (i != 0) {
        }
        this.c((List) obj2);
        return zy11.a;
    }

    public final tpr i(String str, ol20... ol20VarArr) {
        return e.t(new hn20(new t0(this.h, new MobContourProvisionMemoryStorage$invokeFlow$1(2, null)), this, str, ol20VarArr));
    }

    public final Map j(String str, ol20... ol20VarArr) {
        ol20[] ol20VarArr2 = (ol20[]) Arrays.copyOf(ol20VarArr, ol20VarArr.length);
        this.d.getClass();
        List b = an20.b(str, ol20VarArr2);
        if (b.isEmpty()) {
            return kotlin.collections.b.f();
        }
        Map d = d(b);
        if (d != null) {
            return d;
        }
        return (Map) tje.Y(EmptyCoroutineContext.a, new MobContourProvisionMemoryStorage$invokeOrFallback$2(this, b, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x005c, code lost:
    
        if (r11 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(List list, ContinuationImpl continuationImpl) {
        MobContourProvisionMemoryStorage$loadProvisions$1 mobContourProvisionMemoryStorage$loadProvisions$1;
        int i;
        Map map;
        ArrayList arrayList;
        c cVar;
        List<zm20> list2;
        Map map2;
        List list3;
        boolean isEmpty;
        if (continuationImpl instanceof MobContourProvisionMemoryStorage$loadProvisions$1) {
            mobContourProvisionMemoryStorage$loadProvisions$1 = (MobContourProvisionMemoryStorage$loadProvisions$1) continuationImpl;
            int i2 = mobContourProvisionMemoryStorage$loadProvisions$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobContourProvisionMemoryStorage$loadProvisions$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mobContourProvisionMemoryStorage$loadProvisions$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobContourProvisionMemoryStorage$loadProvisions$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mobContourProvisionMemoryStorage$loadProvisions$1.L$0 = list;
                    mobContourProvisionMemoryStorage$loadProvisions$1.label = 1;
                    obj = n(list, mobContourProvisionMemoryStorage$loadProvisions$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        map2 = (Map) mobContourProvisionMemoryStorage$loadProvisions$1.L$5;
                        list2 = (List) mobContourProvisionMemoryStorage$loadProvisions$1.L$4;
                        cVar = (c) mobContourProvisionMemoryStorage$loadProvisions$1.L$3;
                        list3 = (List) mobContourProvisionMemoryStorage$loadProvisions$1.L$0;
                        kotlin.b.b(obj);
                        Map map3 = (Map) obj;
                        cVar.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (zm20 zm20Var : list2) {
                            for (Map.Entry entry : map2.entrySet()) {
                                String str = (String) entry.getKey();
                                iq20 iq20Var = (iq20) entry.getValue();
                                if (cVar.l(vng.i(iq20Var.a.a), zm20Var)) {
                                    linkedHashMap.put(str, iq20Var);
                                }
                            }
                            for (Map.Entry entry2 : map3.entrySet()) {
                                zm20 zm20Var2 = (zm20) entry2.getKey();
                                iq20 iq20Var2 = (iq20) entry2.getValue();
                                boolean l = cVar.l(zm20Var2, zm20Var);
                                String str2 = zm20Var2.b;
                                if (l && !linkedHashMap.containsKey(str2)) {
                                    linkedHashMap.put(str2, iq20Var2);
                                }
                            }
                        }
                        list = list3;
                        map = linkedHashMap;
                        isEmpty = map.isEmpty();
                        ConcurrentHashMap concurrentHashMap = this.e;
                        if (isEmpty) {
                            concurrentHashMap.remove(list);
                            return map;
                        }
                        concurrentHashMap.put(list, map);
                        return map;
                    }
                    list = (List) mobContourProvisionMemoryStorage$loadProvisions$1.L$0;
                    kotlin.b.b(obj);
                }
                map = (Map) obj;
                arrayList = new ArrayList();
                for (zm20 zm20Var3 : list) {
                    if (!e(map, zm20Var3)) {
                        arrayList.add(zm20Var3);
                    }
                }
                if (!arrayList.isEmpty()) {
                    mobContourProvisionMemoryStorage$loadProvisions$1.L$0 = list;
                    mobContourProvisionMemoryStorage$loadProvisions$1.L$1 = null;
                    mobContourProvisionMemoryStorage$loadProvisions$1.L$2 = null;
                    mobContourProvisionMemoryStorage$loadProvisions$1.L$3 = this;
                    mobContourProvisionMemoryStorage$loadProvisions$1.L$4 = list;
                    mobContourProvisionMemoryStorage$loadProvisions$1.L$5 = map;
                    mobContourProvisionMemoryStorage$loadProvisions$1.label = 2;
                    Object g = g(arrayList, mobContourProvisionMemoryStorage$loadProvisions$1);
                    if (g != obj2) {
                        cVar = this;
                        list2 = list;
                        map2 = map;
                        obj = g;
                        list3 = list2;
                        Map map32 = (Map) obj;
                        cVar.getClass();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        while (r1.hasNext()) {
                        }
                        list = list3;
                        map = linkedHashMap2;
                    }
                    return obj2;
                }
                isEmpty = map.isEmpty();
                ConcurrentHashMap concurrentHashMap2 = this.e;
                if (isEmpty) {
                }
            }
        }
        mobContourProvisionMemoryStorage$loadProvisions$1 = new MobContourProvisionMemoryStorage$loadProvisions$1(this, continuationImpl);
        Object obj3 = mobContourProvisionMemoryStorage$loadProvisions$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobContourProvisionMemoryStorage$loadProvisions$1.label;
        if (i != 0) {
        }
        map = (Map) obj3;
        arrayList = new ArrayList();
        while (r5.hasNext()) {
        }
        if (!arrayList.isEmpty()) {
        }
        isEmpty = map.isEmpty();
        ConcurrentHashMap concurrentHashMap22 = this.e;
        if (isEmpty) {
        }
    }

    public final boolean l(zm20 zm20Var, zm20 zm20Var2) {
        this.d.getClass();
        if (!jl40.l(zm20Var.a, zm20Var2.a)) {
            return false;
        }
        String str = zm20Var.b;
        String str2 = zm20Var2.b;
        return str2.equals(an20.a(str2)) ? an20.a(str).equals(str2) : jl40.l(str, str2);
    }

    public final boolean m(zm20 zm20Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (l(zm20Var, (zm20) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x008c, code lost:
    
        if (r11 != r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable n(List list, ContinuationImpl continuationImpl) {
        MobContourProvisionMemoryStorage$selectedProvisions$1 mobContourProvisionMemoryStorage$selectedProvisions$1;
        int i;
        ConcurrentHashMap concurrentHashMap;
        List list2;
        c cVar;
        List list3;
        tm20 tm20Var;
        if (continuationImpl instanceof MobContourProvisionMemoryStorage$selectedProvisions$1) {
            mobContourProvisionMemoryStorage$selectedProvisions$1 = (MobContourProvisionMemoryStorage$selectedProvisions$1) continuationImpl;
            int i2 = mobContourProvisionMemoryStorage$selectedProvisions$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobContourProvisionMemoryStorage$selectedProvisions$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mobContourProvisionMemoryStorage$selectedProvisions$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobContourProvisionMemoryStorage$selectedProvisions$1.label;
                concurrentHashMap = this.g;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (concurrentHashMap.isEmpty()) {
                        mobContourProvisionMemoryStorage$selectedProvisions$1.L$0 = list;
                        mobContourProvisionMemoryStorage$selectedProvisions$1.L$1 = this;
                        mobContourProvisionMemoryStorage$selectedProvisions$1.label = 1;
                        obj = this.a.b(mobContourProvisionMemoryStorage$selectedProvisions$1);
                        if (obj != coroutineSingletons) {
                            list2 = list;
                            cVar = this;
                        }
                        return coroutineSingletons;
                    }
                    mobContourProvisionMemoryStorage$selectedProvisions$1.L$0 = list;
                    mobContourProvisionMemoryStorage$selectedProvisions$1.L$1 = null;
                    mobContourProvisionMemoryStorage$selectedProvisions$1.label = 2;
                    obj = this.b.d(mobContourProvisionMemoryStorage$selectedProvisions$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            tm20Var = (tm20) mobContourProvisionMemoryStorage$selectedProvisions$1.L$1;
                            list3 = (List) mobContourProvisionMemoryStorage$selectedProvisions$1.L$0;
                            kotlin.b.b(obj);
                            return b(concurrentHashMap, list3, tm20Var, (Map) obj);
                        }
                        list = (List) mobContourProvisionMemoryStorage$selectedProvisions$1.L$0;
                        kotlin.b.b(obj);
                        tm20 tm20Var2 = (tm20) obj;
                        mobContourProvisionMemoryStorage$selectedProvisions$1.L$0 = list;
                        mobContourProvisionMemoryStorage$selectedProvisions$1.L$1 = tm20Var2;
                        mobContourProvisionMemoryStorage$selectedProvisions$1.label = 3;
                        Object a = this.c.a(mobContourProvisionMemoryStorage$selectedProvisions$1);
                        if (a != coroutineSingletons) {
                            list3 = list;
                            tm20Var = tm20Var2;
                            obj = a;
                            return b(concurrentHashMap, list3, tm20Var, (Map) obj);
                        }
                        return coroutineSingletons;
                    }
                    cVar = (c) mobContourProvisionMemoryStorage$selectedProvisions$1.L$1;
                    list2 = (List) mobContourProvisionMemoryStorage$selectedProvisions$1.L$0;
                    kotlin.b.b(obj);
                }
                cVar.c((List) obj);
                if (!concurrentHashMap.isEmpty()) {
                    return (Serializable) kotlin.collections.b.f();
                }
                list = list2;
                mobContourProvisionMemoryStorage$selectedProvisions$1.L$0 = list;
                mobContourProvisionMemoryStorage$selectedProvisions$1.L$1 = null;
                mobContourProvisionMemoryStorage$selectedProvisions$1.label = 2;
                obj = this.b.d(mobContourProvisionMemoryStorage$selectedProvisions$1);
            }
        }
        mobContourProvisionMemoryStorage$selectedProvisions$1 = new MobContourProvisionMemoryStorage$selectedProvisions$1(this, continuationImpl);
        Object obj2 = mobContourProvisionMemoryStorage$selectedProvisions$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobContourProvisionMemoryStorage$selectedProvisions$1.label;
        concurrentHashMap = this.g;
        if (i != 0) {
        }
        cVar.c((List) obj2);
        if (!concurrentHashMap.isEmpty()) {
        }
    }

    public final Object o(SuspendLambda suspendLambda) {
        Object collect = com.yandex.mob.datastore.a.b(this.a.a).collect(new com.yandex.mob.datastore.e(new b(this)), suspendLambda);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        zy11 zy11Var = zy11.a;
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        return collect == coroutineSingletons ? collect : zy11Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(pr20 pr20Var, ContinuationImpl continuationImpl) {
        MobContourProvisionMemoryStorage$updateProxyInCache$1 mobContourProvisionMemoryStorage$updateProxyInCache$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        zm20 zm20Var;
        Object a;
        pr20 pr20Var2;
        tm20 tm20Var;
        zm20 zm20Var2;
        Iterator it;
        if (continuationImpl instanceof MobContourProvisionMemoryStorage$updateProxyInCache$1) {
            mobContourProvisionMemoryStorage$updateProxyInCache$1 = (MobContourProvisionMemoryStorage$updateProxyInCache$1) continuationImpl;
            int i2 = mobContourProvisionMemoryStorage$updateProxyInCache$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobContourProvisionMemoryStorage$updateProxyInCache$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mobContourProvisionMemoryStorage$updateProxyInCache$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobContourProvisionMemoryStorage$updateProxyInCache$1.label;
                g gVar = this.c;
                if (i != 0) {
                    kotlin.b.b(obj);
                    zm20 i3 = vng.i(pr20Var.a);
                    this.g.put(i3, Collections.singletonList(pr20Var));
                    mobContourProvisionMemoryStorage$updateProxyInCache$1.L$0 = pr20Var;
                    mobContourProvisionMemoryStorage$updateProxyInCache$1.L$1 = i3;
                    mobContourProvisionMemoryStorage$updateProxyInCache$1.label = 1;
                    Object d = this.b.d(mobContourProvisionMemoryStorage$updateProxyInCache$1);
                    if (d != coroutineSingletons) {
                        zm20Var = i3;
                        obj = d;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tm20Var = (tm20) mobContourProvisionMemoryStorage$updateProxyInCache$1.L$2;
                    zm20Var2 = (zm20) mobContourProvisionMemoryStorage$updateProxyInCache$1.L$1;
                    pr20Var2 = (pr20) mobContourProvisionMemoryStorage$updateProxyInCache$1.L$0;
                    kotlin.b.b(obj);
                    iq20 iq20Var = new iq20(pr20Var2, gVar.b(tm20Var, pr20Var2.a), (Map) obj, kotlin.collections.b.i(new Pair("mobConfigId", tm20Var.a), new Pair("mobProxyId", pr20Var2.a.b)));
                    ConcurrentHashMap concurrentHashMap = this.e;
                    it = ((ConcurrentHashMap.KeySetView) concurrentHashMap.keySet()).iterator();
                    while (it.hasNext()) {
                        List list = (List) it.next();
                        if (m(zm20Var2, list)) {
                            concurrentHashMap.computeIfPresent(list, new gn20(new fn20(this, list, zm20Var2, iq20Var), 0));
                        }
                    }
                    n0 n0Var = this.h;
                    zy11 zy11Var = zy11.a;
                    n0Var.g(zy11Var);
                    return zy11Var;
                }
                zm20 zm20Var3 = (zm20) mobContourProvisionMemoryStorage$updateProxyInCache$1.L$1;
                pr20 pr20Var3 = (pr20) mobContourProvisionMemoryStorage$updateProxyInCache$1.L$0;
                kotlin.b.b(obj);
                zm20Var = zm20Var3;
                pr20Var = pr20Var3;
                tm20 tm20Var2 = (tm20) obj;
                mobContourProvisionMemoryStorage$updateProxyInCache$1.L$0 = pr20Var;
                mobContourProvisionMemoryStorage$updateProxyInCache$1.L$1 = zm20Var;
                mobContourProvisionMemoryStorage$updateProxyInCache$1.L$2 = tm20Var2;
                mobContourProvisionMemoryStorage$updateProxyInCache$1.label = 2;
                a = gVar.a(mobContourProvisionMemoryStorage$updateProxyInCache$1);
                if (a != coroutineSingletons) {
                    pr20Var2 = pr20Var;
                    tm20Var = tm20Var2;
                    obj = a;
                    zm20Var2 = zm20Var;
                    iq20 iq20Var2 = new iq20(pr20Var2, gVar.b(tm20Var, pr20Var2.a), (Map) obj, kotlin.collections.b.i(new Pair("mobConfigId", tm20Var.a), new Pair("mobProxyId", pr20Var2.a.b)));
                    ConcurrentHashMap concurrentHashMap2 = this.e;
                    it = ((ConcurrentHashMap.KeySetView) concurrentHashMap2.keySet()).iterator();
                    while (it.hasNext()) {
                    }
                    n0 n0Var2 = this.h;
                    zy11 zy11Var2 = zy11.a;
                    n0Var2.g(zy11Var2);
                    return zy11Var2;
                }
                return coroutineSingletons;
            }
        }
        mobContourProvisionMemoryStorage$updateProxyInCache$1 = new MobContourProvisionMemoryStorage$updateProxyInCache$1(this, continuationImpl);
        Object obj2 = mobContourProvisionMemoryStorage$updateProxyInCache$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobContourProvisionMemoryStorage$updateProxyInCache$1.label;
        g gVar2 = this.c;
        if (i != 0) {
        }
        tm20 tm20Var22 = (tm20) obj2;
        mobContourProvisionMemoryStorage$updateProxyInCache$1.L$0 = pr20Var;
        mobContourProvisionMemoryStorage$updateProxyInCache$1.L$1 = zm20Var;
        mobContourProvisionMemoryStorage$updateProxyInCache$1.L$2 = tm20Var22;
        mobContourProvisionMemoryStorage$updateProxyInCache$1.label = 2;
        a = gVar2.a(mobContourProvisionMemoryStorage$updateProxyInCache$1);
        if (a != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
