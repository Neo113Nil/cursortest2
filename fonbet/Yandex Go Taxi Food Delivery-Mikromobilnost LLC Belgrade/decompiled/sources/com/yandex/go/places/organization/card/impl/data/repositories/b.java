package com.yandex.go.places.organization.card.impl.data.repositories;

import com.yandex.go.places.map.data.repositories.g;
import com.yandex.go.places.map.domain.entities.PinLayer;
import com.yandex.go.places.map.domain.layer.c;
import com.yandex.go.places.models.data.entities.network.map.e;
import com.yandex.go.places.organization.card.impl.data.entities.network.search.OrganizationCardItem;
import defpackage.al80;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.jl40;
import defpackage.kn00;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uc4;
import defpackage.uyj;
import defpackage.zy11;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class b {
    public final tt2 a;
    public final al80 b;
    public final com.yandex.go.places.map.data.mappers.a c;
    public final c d;
    public final LinkedHashSet e = new LinkedHashSet();
    public final kotlinx.coroutines.sync.a f = gtq0.a();

    public b(tt2 tt2Var, al80 al80Var, com.yandex.go.places.map.data.mappers.a aVar, c cVar) {
        this.a = tt2Var;
        this.b = al80Var;
        this.c = aVar;
        this.d = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0060, code lost:
    
        if (r3.a(r1) == r2) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        OrganizationCardsSliderRepository$clearLoadedMapObjects$1 organizationCardsSliderRepository$clearLoadedMapObjects$1;
        int i;
        g050 g050Var;
        Iterator it;
        LinkedHashSet linkedHashSet = this.e;
        try {
            if (continuationImpl instanceof OrganizationCardsSliderRepository$clearLoadedMapObjects$1) {
                organizationCardsSliderRepository$clearLoadedMapObjects$1 = (OrganizationCardsSliderRepository$clearLoadedMapObjects$1) continuationImpl;
                int i2 = organizationCardsSliderRepository$clearLoadedMapObjects$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    organizationCardsSliderRepository$clearLoadedMapObjects$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = organizationCardsSliderRepository$clearLoadedMapObjects$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = organizationCardsSliderRepository$clearLoadedMapObjects$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        g050Var = this.f;
                        organizationCardsSliderRepository$clearLoadedMapObjects$1.L$0 = g050Var;
                        organizationCardsSliderRepository$clearLoadedMapObjects$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            it = (Iterator) organizationCardsSliderRepository$clearLoadedMapObjects$1.L$2;
                            kotlin.b.b(obj);
                            while (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                PinLayer pinLayer = (PinLayer) entry.getKey();
                                List list = (List) entry.getValue();
                                g e = this.d.e(pinLayer);
                                Set N0 = kotlin.collections.a.N0(list);
                                organizationCardsSliderRepository$clearLoadedMapObjects$1.L$0 = null;
                                organizationCardsSliderRepository$clearLoadedMapObjects$1.L$1 = null;
                                organizationCardsSliderRepository$clearLoadedMapObjects$1.L$2 = it;
                                organizationCardsSliderRepository$clearLoadedMapObjects$1.L$3 = null;
                                organizationCardsSliderRepository$clearLoadedMapObjects$1.L$4 = null;
                                organizationCardsSliderRepository$clearLoadedMapObjects$1.L$5 = null;
                                organizationCardsSliderRepository$clearLoadedMapObjects$1.label = 2;
                                if (e.r(N0, organizationCardsSliderRepository$clearLoadedMapObjects$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            return zy11.a;
                        }
                        g050Var = (g050) organizationCardsSliderRepository$clearLoadedMapObjects$1.L$0;
                        kotlin.b.b(obj);
                    }
                    List<Pair> J0 = kotlin.collections.a.J0(linkedHashSet);
                    linkedHashSet.clear();
                    g050Var.d(null);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Pair pair : J0) {
                        PinLayer pinLayer2 = (PinLayer) pair.getSecond();
                        Object obj2 = linkedHashMap.get(pinLayer2);
                        if (obj2 == null) {
                            obj2 = new ArrayList();
                            linkedHashMap.put(pinLayer2, obj2);
                        }
                        ((List) obj2).add((String) pair.getFirst());
                    }
                    it = linkedHashMap.entrySet().iterator();
                    while (it.hasNext()) {
                    }
                    return zy11.a;
                }
            }
            List<Pair> J02 = kotlin.collections.a.J0(linkedHashSet);
            linkedHashSet.clear();
            g050Var.d(null);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            while (r9.hasNext()) {
            }
            it = linkedHashMap2.entrySet().iterator();
            while (it.hasNext()) {
            }
            return zy11.a;
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
        organizationCardsSliderRepository$clearLoadedMapObjects$1 = new OrganizationCardsSliderRepository$clearLoadedMapObjects$1(this, continuationImpl);
        Object obj3 = organizationCardsSliderRepository$clearLoadedMapObjects$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = organizationCardsSliderRepository$clearLoadedMapObjects$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x028d A[Catch: all -> 0x02a0, LOOP:0: B:18:0x0287->B:20:0x028d, LOOP_END, TryCatch #0 {all -> 0x02a0, blocks: (B:17:0x0276, B:18:0x0287, B:20:0x028d, B:22:0x02a2), top: B:16:0x0276 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02bf A[LOOP:1: B:24:0x02b9->B:26:0x02bf, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01d6 A[Catch: all -> 0x01f2, TryCatch #1 {all -> 0x01f2, blocks: (B:47:0x01c7, B:48:0x01d0, B:50:0x01d6, B:52:0x01ec, B:57:0x01f5), top: B:46:0x01c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0207 A[LOOP:3: B:59:0x01ff->B:61:0x0207, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0221 A[EDGE_INSN: B:62:0x0221->B:63:0x0221 BREAK  A[LOOP:3: B:59:0x01ff->B:61:0x0207], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019d A[LOOP:4: B:73:0x0197->B:75:0x019d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(uc4 uc4Var, String str, String str2, boolean z, ContinuationImpl continuationImpl) {
        OrganizationCardsSliderRepository$loadOrganizationsList$1 organizationCardsSliderRepository$loadOrganizationsList$1;
        int i;
        boolean z2;
        mdh mdhVar;
        OrganizationCardsSliderRepository$loadOrganizationsList$organizations$1$1 organizationCardsSliderRepository$loadOrganizationsList$organizations$1$1;
        Object obj;
        int i2;
        List list;
        List list2;
        List list3;
        HashSet hashSet;
        Iterator it;
        g050 g050Var;
        Iterator it2;
        boolean hasNext;
        c cVar;
        boolean z3;
        List list4;
        Pair pair;
        PinLayer pinLayer;
        List list5;
        Iterator it3;
        Iterator it4;
        try {
            if (continuationImpl instanceof OrganizationCardsSliderRepository$loadOrganizationsList$1) {
                organizationCardsSliderRepository$loadOrganizationsList$1 = (OrganizationCardsSliderRepository$loadOrganizationsList$1) continuationImpl;
                int i3 = organizationCardsSliderRepository$loadOrganizationsList$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    organizationCardsSliderRepository$loadOrganizationsList$1.label = i3 - Integer.MIN_VALUE;
                    OrganizationCardsSliderRepository$loadOrganizationsList$1 organizationCardsSliderRepository$loadOrganizationsList$12 = organizationCardsSliderRepository$loadOrganizationsList$1;
                    Object obj2 = organizationCardsSliderRepository$loadOrganizationsList$12.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = organizationCardsSliderRepository$loadOrganizationsList$12.label;
                    g050 g050Var2 = this.f;
                    EmptyList emptyList = EmptyList.a;
                    LinkedHashSet linkedHashSet = this.e;
                    if (i != 0) {
                        kotlin.b.b(obj2);
                        try {
                            this.a.getClass();
                            sjh sjhVar = uyj.a;
                            mdhVar = mdh.b;
                            obj = null;
                            i2 = 10;
                            try {
                                organizationCardsSliderRepository$loadOrganizationsList$organizations$1$1 = new OrganizationCardsSliderRepository$loadOrganizationsList$organizations$1$1(this, uc4Var, str, str2, null);
                                organizationCardsSliderRepository$loadOrganizationsList$12.L$0 = null;
                                organizationCardsSliderRepository$loadOrganizationsList$12.L$1 = null;
                                organizationCardsSliderRepository$loadOrganizationsList$12.L$2 = null;
                                z2 = z;
                            } catch (Throwable unused) {
                                z2 = z;
                                list = emptyList;
                                if (z2) {
                                }
                            }
                        } catch (Throwable unused2) {
                            z2 = z;
                            obj = null;
                            i2 = 10;
                            list = emptyList;
                            if (z2) {
                            }
                        }
                        try {
                            organizationCardsSliderRepository$loadOrganizationsList$12.Z$0 = z2;
                            organizationCardsSliderRepository$loadOrganizationsList$12.label = 1;
                            obj2 = tje.k0(mdhVar, organizationCardsSliderRepository$loadOrganizationsList$organizations$1$1, organizationCardsSliderRepository$loadOrganizationsList$12);
                        } catch (Throwable unused3) {
                            list = emptyList;
                            if (z2) {
                            }
                        }
                        if (obj2 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            if (i == 2) {
                                z2 = organizationCardsSliderRepository$loadOrganizationsList$12.Z$0;
                                List list6 = (List) organizationCardsSliderRepository$loadOrganizationsList$12.L$3;
                                kotlin.b.b(obj2);
                                list2 = list6;
                                obj = null;
                                list3 = (List) obj2;
                                hashSet = new HashSet();
                                it = list3.iterator();
                                while (it.hasNext()) {
                                    hashSet.add(((kn00) it.next()).getId());
                                }
                                organizationCardsSliderRepository$loadOrganizationsList$12.L$0 = obj;
                                organizationCardsSliderRepository$loadOrganizationsList$12.L$1 = obj;
                                organizationCardsSliderRepository$loadOrganizationsList$12.L$2 = obj;
                                organizationCardsSliderRepository$loadOrganizationsList$12.L$3 = list2;
                                organizationCardsSliderRepository$loadOrganizationsList$12.L$4 = list3;
                                organizationCardsSliderRepository$loadOrganizationsList$12.L$5 = hashSet;
                                organizationCardsSliderRepository$loadOrganizationsList$12.L$6 = g050Var2;
                                organizationCardsSliderRepository$loadOrganizationsList$12.Z$0 = z2;
                                organizationCardsSliderRepository$loadOrganizationsList$12.label = 3;
                                if (g050Var2.a(organizationCardsSliderRepository$loadOrganizationsList$12) != coroutineSingletons) {
                                    g050Var = g050Var2;
                                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                    while (r4.hasNext()) {
                                    }
                                    linkedHashSet.removeAll(linkedHashSet2);
                                    g050Var.d(obj);
                                    it2 = linkedHashSet2.iterator();
                                    while (true) {
                                        hasNext = it2.hasNext();
                                        cVar = this.d;
                                        if (hasNext) {
                                        }
                                        Pair pair2 = (Pair) it2.next();
                                        cVar.e((PinLayer) pair2.getSecond()).q((String) pair2.getFirst());
                                    }
                                    organizationCardsSliderRepository$loadOrganizationsList$12.L$0 = obj;
                                    organizationCardsSliderRepository$loadOrganizationsList$12.L$1 = obj;
                                    organizationCardsSliderRepository$loadOrganizationsList$12.L$2 = obj;
                                    organizationCardsSliderRepository$loadOrganizationsList$12.L$3 = list2;
                                    organizationCardsSliderRepository$loadOrganizationsList$12.L$4 = obj;
                                    organizationCardsSliderRepository$loadOrganizationsList$12.L$5 = obj;
                                    organizationCardsSliderRepository$loadOrganizationsList$12.L$6 = obj;
                                    organizationCardsSliderRepository$loadOrganizationsList$12.Z$0 = z2;
                                    organizationCardsSliderRepository$loadOrganizationsList$12.label = 4;
                                    obj2 = cVar.f(list3, organizationCardsSliderRepository$loadOrganizationsList$12);
                                    if (obj2 != coroutineSingletons) {
                                    }
                                }
                                return coroutineSingletons;
                            }
                            if (i == 3) {
                                z2 = organizationCardsSliderRepository$loadOrganizationsList$12.Z$0;
                                g050Var = (g050) organizationCardsSliderRepository$loadOrganizationsList$12.L$6;
                                HashSet hashSet2 = (HashSet) organizationCardsSliderRepository$loadOrganizationsList$12.L$5;
                                list3 = (List) organizationCardsSliderRepository$loadOrganizationsList$12.L$4;
                                list2 = (List) organizationCardsSliderRepository$loadOrganizationsList$12.L$3;
                                kotlin.b.b(obj2);
                                hashSet = hashSet2;
                                obj = null;
                                try {
                                    LinkedHashSet linkedHashSet22 = new LinkedHashSet();
                                    for (Object obj3 : linkedHashSet) {
                                        if (!hashSet.contains((String) ((Pair) obj3).getFirst())) {
                                            linkedHashSet22.add(obj3);
                                        }
                                    }
                                    linkedHashSet.removeAll(linkedHashSet22);
                                    g050Var.d(obj);
                                    it2 = linkedHashSet22.iterator();
                                    while (true) {
                                        hasNext = it2.hasNext();
                                        cVar = this.d;
                                        if (hasNext) {
                                            break;
                                        }
                                        Pair pair22 = (Pair) it2.next();
                                        cVar.e((PinLayer) pair22.getSecond()).q((String) pair22.getFirst());
                                    }
                                    organizationCardsSliderRepository$loadOrganizationsList$12.L$0 = obj;
                                    organizationCardsSliderRepository$loadOrganizationsList$12.L$1 = obj;
                                    organizationCardsSliderRepository$loadOrganizationsList$12.L$2 = obj;
                                    organizationCardsSliderRepository$loadOrganizationsList$12.L$3 = list2;
                                    organizationCardsSliderRepository$loadOrganizationsList$12.L$4 = obj;
                                    organizationCardsSliderRepository$loadOrganizationsList$12.L$5 = obj;
                                    organizationCardsSliderRepository$loadOrganizationsList$12.L$6 = obj;
                                    organizationCardsSliderRepository$loadOrganizationsList$12.Z$0 = z2;
                                    organizationCardsSliderRepository$loadOrganizationsList$12.label = 4;
                                    obj2 = cVar.f(list3, organizationCardsSliderRepository$loadOrganizationsList$12);
                                    if (obj2 != coroutineSingletons) {
                                        z3 = z2;
                                        list4 = list2;
                                        pair = (Pair) obj2;
                                        if (pair == null) {
                                        }
                                        pinLayer = (PinLayer) pair.getFirst();
                                        List list7 = (List) pair.getSecond();
                                        organizationCardsSliderRepository$loadOrganizationsList$12.L$0 = obj;
                                        organizationCardsSliderRepository$loadOrganizationsList$12.L$1 = obj;
                                        organizationCardsSliderRepository$loadOrganizationsList$12.L$2 = obj;
                                        organizationCardsSliderRepository$loadOrganizationsList$12.L$3 = list4;
                                        organizationCardsSliderRepository$loadOrganizationsList$12.L$4 = obj;
                                        organizationCardsSliderRepository$loadOrganizationsList$12.L$5 = obj;
                                        organizationCardsSliderRepository$loadOrganizationsList$12.L$6 = obj;
                                        organizationCardsSliderRepository$loadOrganizationsList$12.L$7 = pinLayer;
                                        organizationCardsSliderRepository$loadOrganizationsList$12.L$8 = list7;
                                        organizationCardsSliderRepository$loadOrganizationsList$12.L$9 = g050Var2;
                                        organizationCardsSliderRepository$loadOrganizationsList$12.Z$0 = z3;
                                        organizationCardsSliderRepository$loadOrganizationsList$12.label = 5;
                                        if (g050Var2.a(organizationCardsSliderRepository$loadOrganizationsList$12) != coroutineSingletons) {
                                        }
                                    }
                                    return coroutineSingletons;
                                } catch (Throwable th) {
                                    g050Var.d(obj);
                                    throw th;
                                }
                            }
                            if (i != 4) {
                                if (i != 5) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                g050Var2 = (g050) organizationCardsSliderRepository$loadOrganizationsList$12.L$9;
                                list5 = (List) organizationCardsSliderRepository$loadOrganizationsList$12.L$8;
                                pinLayer = (PinLayer) organizationCardsSliderRepository$loadOrganizationsList$12.L$7;
                                list4 = (List) organizationCardsSliderRepository$loadOrganizationsList$12.L$3;
                                kotlin.b.b(obj2);
                                obj = null;
                                try {
                                    List list8 = list5;
                                    ArrayList arrayList = new ArrayList(tcc.n(list8, 10));
                                    it3 = list8.iterator();
                                    while (it3.hasNext()) {
                                        arrayList.add(new Pair(((kn00) it3.next()).getId(), pinLayer));
                                    }
                                    linkedHashSet.addAll(arrayList);
                                    g050Var2.d(obj);
                                    List list9 = list4;
                                    ArrayList arrayList2 = new ArrayList(tcc.n(list9, 10));
                                    it4 = list9.iterator();
                                    while (it4.hasNext()) {
                                        arrayList2.add(((OrganizationCardItem) it4.next()).a);
                                    }
                                    return arrayList2;
                                } catch (Throwable th2) {
                                    g050Var2.d(obj);
                                    throw th2;
                                }
                            }
                            z3 = organizationCardsSliderRepository$loadOrganizationsList$12.Z$0;
                            List list10 = (List) organizationCardsSliderRepository$loadOrganizationsList$12.L$3;
                            kotlin.b.b(obj2);
                            list4 = list10;
                            obj = null;
                            pair = (Pair) obj2;
                            if (pair == null) {
                                pair = new Pair(PinLayer.MAIN, emptyList);
                            }
                            pinLayer = (PinLayer) pair.getFirst();
                            List list72 = (List) pair.getSecond();
                            organizationCardsSliderRepository$loadOrganizationsList$12.L$0 = obj;
                            organizationCardsSliderRepository$loadOrganizationsList$12.L$1 = obj;
                            organizationCardsSliderRepository$loadOrganizationsList$12.L$2 = obj;
                            organizationCardsSliderRepository$loadOrganizationsList$12.L$3 = list4;
                            organizationCardsSliderRepository$loadOrganizationsList$12.L$4 = obj;
                            organizationCardsSliderRepository$loadOrganizationsList$12.L$5 = obj;
                            organizationCardsSliderRepository$loadOrganizationsList$12.L$6 = obj;
                            organizationCardsSliderRepository$loadOrganizationsList$12.L$7 = pinLayer;
                            organizationCardsSliderRepository$loadOrganizationsList$12.L$8 = list72;
                            organizationCardsSliderRepository$loadOrganizationsList$12.L$9 = g050Var2;
                            organizationCardsSliderRepository$loadOrganizationsList$12.Z$0 = z3;
                            organizationCardsSliderRepository$loadOrganizationsList$12.label = 5;
                            if (g050Var2.a(organizationCardsSliderRepository$loadOrganizationsList$12) != coroutineSingletons) {
                                list5 = list72;
                                List list82 = list5;
                                ArrayList arrayList3 = new ArrayList(tcc.n(list82, 10));
                                it3 = list82.iterator();
                                while (it3.hasNext()) {
                                }
                                linkedHashSet.addAll(arrayList3);
                                g050Var2.d(obj);
                                List list92 = list4;
                                ArrayList arrayList22 = new ArrayList(tcc.n(list92, 10));
                                it4 = list92.iterator();
                                while (it4.hasNext()) {
                                }
                                return arrayList22;
                            }
                            return coroutineSingletons;
                        }
                        z2 = organizationCardsSliderRepository$loadOrganizationsList$12.Z$0;
                        try {
                            kotlin.b.b(obj2);
                            obj = null;
                            i2 = 10;
                        } catch (Throwable unused4) {
                            obj = null;
                            i2 = 10;
                            list = emptyList;
                            if (z2) {
                            }
                        }
                    }
                    list = (List) obj2;
                    if (z2) {
                        List list11 = list;
                        ArrayList arrayList4 = new ArrayList(tcc.n(list11, i2));
                        Iterator it5 = list11.iterator();
                        while (it5.hasNext()) {
                            arrayList4.add(((OrganizationCardItem) it5.next()).a);
                        }
                        return arrayList4;
                    }
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it6 = list.iterator();
                    while (it6.hasNext()) {
                        e eVar = ((OrganizationCardItem) it6.next()).b;
                        if (eVar != null) {
                            arrayList5.add(eVar);
                        }
                    }
                    organizationCardsSliderRepository$loadOrganizationsList$12.L$0 = obj;
                    organizationCardsSliderRepository$loadOrganizationsList$12.L$1 = obj;
                    organizationCardsSliderRepository$loadOrganizationsList$12.L$2 = obj;
                    organizationCardsSliderRepository$loadOrganizationsList$12.L$3 = list;
                    organizationCardsSliderRepository$loadOrganizationsList$12.Z$0 = z2;
                    organizationCardsSliderRepository$loadOrganizationsList$12.label = 2;
                    Object o = this.c.o(arrayList5, organizationCardsSliderRepository$loadOrganizationsList$12);
                    if (o != coroutineSingletons) {
                        list2 = list;
                        obj2 = o;
                        list3 = (List) obj2;
                        hashSet = new HashSet();
                        it = list3.iterator();
                        while (it.hasNext()) {
                        }
                        organizationCardsSliderRepository$loadOrganizationsList$12.L$0 = obj;
                        organizationCardsSliderRepository$loadOrganizationsList$12.L$1 = obj;
                        organizationCardsSliderRepository$loadOrganizationsList$12.L$2 = obj;
                        organizationCardsSliderRepository$loadOrganizationsList$12.L$3 = list2;
                        organizationCardsSliderRepository$loadOrganizationsList$12.L$4 = list3;
                        organizationCardsSliderRepository$loadOrganizationsList$12.L$5 = hashSet;
                        organizationCardsSliderRepository$loadOrganizationsList$12.L$6 = g050Var2;
                        organizationCardsSliderRepository$loadOrganizationsList$12.Z$0 = z2;
                        organizationCardsSliderRepository$loadOrganizationsList$12.label = 3;
                        if (g050Var2.a(organizationCardsSliderRepository$loadOrganizationsList$12) != coroutineSingletons) {
                        }
                    }
                    return coroutineSingletons;
                }
            }
            if (i != 0) {
            }
            list = (List) obj2;
            if (z2) {
            }
        } catch (CancellationException e) {
            throw e;
        }
        organizationCardsSliderRepository$loadOrganizationsList$1 = new OrganizationCardsSliderRepository$loadOrganizationsList$1(this, continuationImpl);
        OrganizationCardsSliderRepository$loadOrganizationsList$1 organizationCardsSliderRepository$loadOrganizationsList$122 = organizationCardsSliderRepository$loadOrganizationsList$1;
        Object obj22 = organizationCardsSliderRepository$loadOrganizationsList$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = organizationCardsSliderRepository$loadOrganizationsList$122.label;
        g050 g050Var22 = this.f;
        EmptyList emptyList2 = EmptyList.a;
        LinkedHashSet linkedHashSet3 = this.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0162, code lost:
    
        if (r3.a(r0) == r1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x013b, code lost:
    
        if (r15 != r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x009f, code lost:
    
        if (r15 == r1) goto L60;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e3 A[Catch: all -> 0x00fe, TryCatch #0 {all -> 0x00fe, blocks: (B:40:0x00d4, B:41:0x00dd, B:43:0x00e3, B:46:0x00fa, B:51:0x0101), top: B:39:0x00d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0111 A[LOOP:2: B:53:0x010b->B:55:0x0111, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(e eVar, ContinuationImpl continuationImpl) {
        OrganizationCardsSliderRepository$showOnlyMapObject$1 organizationCardsSliderRepository$showOnlyMapObject$1;
        int i;
        kn00 kn00Var;
        kn00 kn00Var2;
        g050 g050Var;
        PinLayer pinLayer;
        List list;
        if (continuationImpl instanceof OrganizationCardsSliderRepository$showOnlyMapObject$1) {
            organizationCardsSliderRepository$showOnlyMapObject$1 = (OrganizationCardsSliderRepository$showOnlyMapObject$1) continuationImpl;
            int i2 = organizationCardsSliderRepository$showOnlyMapObject$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                organizationCardsSliderRepository$showOnlyMapObject$1.label = i2 - Integer.MIN_VALUE;
                Object obj = organizationCardsSliderRepository$showOnlyMapObject$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = organizationCardsSliderRepository$showOnlyMapObject$1.label;
                g050 g050Var2 = this.f;
                LinkedHashSet linkedHashSet = this.e;
                c cVar = this.d;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    organizationCardsSliderRepository$showOnlyMapObject$1.L$0 = null;
                    organizationCardsSliderRepository$showOnlyMapObject$1.label = 1;
                    obj = this.c.n(eVar, organizationCardsSliderRepository$showOnlyMapObject$1);
                } else if (i == 1) {
                    kotlin.b.b(obj);
                } else {
                    if (i == 2) {
                        kn00 kn00Var3 = (kn00) organizationCardsSliderRepository$showOnlyMapObject$1.L$1;
                        kotlin.b.b(obj);
                        kn00Var2 = kn00Var3;
                        if (((Pair) obj) == null) {
                            organizationCardsSliderRepository$showOnlyMapObject$1.L$0 = null;
                            organizationCardsSliderRepository$showOnlyMapObject$1.L$1 = kn00Var2;
                            organizationCardsSliderRepository$showOnlyMapObject$1.L$2 = g050Var2;
                            organizationCardsSliderRepository$showOnlyMapObject$1.label = 3;
                            if (g050Var2.a(organizationCardsSliderRepository$showOnlyMapObject$1) != coroutineSingletons) {
                                g050Var = g050Var2;
                                LinkedHashSet<Pair> linkedHashSet2 = new LinkedHashSet();
                                while (r2.hasNext()) {
                                }
                                linkedHashSet.removeAll(linkedHashSet2);
                                g050Var2.d(null);
                                while (r13.hasNext()) {
                                }
                                List singletonList = Collections.singletonList(kn00Var2);
                                organizationCardsSliderRepository$showOnlyMapObject$1.L$0 = null;
                                organizationCardsSliderRepository$showOnlyMapObject$1.L$1 = null;
                                organizationCardsSliderRepository$showOnlyMapObject$1.L$2 = null;
                                organizationCardsSliderRepository$showOnlyMapObject$1.label = 4;
                                obj = cVar.f(singletonList, organizationCardsSliderRepository$showOnlyMapObject$1);
                            }
                            return coroutineSingletons;
                        }
                        return zy11Var;
                    }
                    if (i != 3) {
                        if (i == 4) {
                            kotlin.b.b(obj);
                            Pair pair = (Pair) obj;
                            if (pair != null) {
                                pinLayer = (PinLayer) pair.getFirst();
                                list = (List) pair.getSecond();
                                organizationCardsSliderRepository$showOnlyMapObject$1.L$0 = null;
                                organizationCardsSliderRepository$showOnlyMapObject$1.L$1 = null;
                                organizationCardsSliderRepository$showOnlyMapObject$1.L$2 = null;
                                organizationCardsSliderRepository$showOnlyMapObject$1.L$3 = pinLayer;
                                organizationCardsSliderRepository$showOnlyMapObject$1.L$4 = list;
                                organizationCardsSliderRepository$showOnlyMapObject$1.L$5 = g050Var2;
                                organizationCardsSliderRepository$showOnlyMapObject$1.label = 5;
                            }
                            return zy11Var;
                        }
                        if (i != 5) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var2 = (g050) organizationCardsSliderRepository$showOnlyMapObject$1.L$5;
                        list = (List) organizationCardsSliderRepository$showOnlyMapObject$1.L$4;
                        pinLayer = (PinLayer) organizationCardsSliderRepository$showOnlyMapObject$1.L$3;
                        kotlin.b.b(obj);
                        try {
                            List list2 = list;
                            ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList.add(new Pair(((kn00) it.next()).getId(), pinLayer));
                            }
                            linkedHashSet.addAll(arrayList);
                            g050Var2.d(null);
                            return zy11Var;
                        } finally {
                            g050Var2.d(null);
                        }
                    }
                    g050Var = (g050) organizationCardsSliderRepository$showOnlyMapObject$1.L$2;
                    kn00Var2 = (kn00) organizationCardsSliderRepository$showOnlyMapObject$1.L$1;
                    kotlin.b.b(obj);
                    try {
                        LinkedHashSet<Pair> linkedHashSet22 = new LinkedHashSet();
                        for (Object obj2 : linkedHashSet) {
                            if (!jl40.l((String) ((Pair) obj2).getFirst(), kn00Var2.getId())) {
                                linkedHashSet22.add(obj2);
                            }
                        }
                        linkedHashSet.removeAll(linkedHashSet22);
                        g050Var2.d(null);
                        for (Pair pair2 : linkedHashSet22) {
                            cVar.e((PinLayer) pair2.getSecond()).q((String) pair2.getFirst());
                        }
                        List singletonList2 = Collections.singletonList(kn00Var2);
                        organizationCardsSliderRepository$showOnlyMapObject$1.L$0 = null;
                        organizationCardsSliderRepository$showOnlyMapObject$1.L$1 = null;
                        organizationCardsSliderRepository$showOnlyMapObject$1.L$2 = null;
                        organizationCardsSliderRepository$showOnlyMapObject$1.label = 4;
                        obj = cVar.f(singletonList2, organizationCardsSliderRepository$showOnlyMapObject$1);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                kn00Var = (kn00) obj;
                if (kn00Var != null) {
                    List singletonList3 = Collections.singletonList(kn00Var);
                    organizationCardsSliderRepository$showOnlyMapObject$1.L$0 = null;
                    organizationCardsSliderRepository$showOnlyMapObject$1.L$1 = kn00Var;
                    organizationCardsSliderRepository$showOnlyMapObject$1.label = 2;
                    Serializable d = cVar.d(singletonList3, organizationCardsSliderRepository$showOnlyMapObject$1);
                    if (d != coroutineSingletons) {
                        kn00Var2 = kn00Var;
                        obj = d;
                        if (((Pair) obj) == null) {
                        }
                    }
                    return coroutineSingletons;
                }
                return zy11Var;
            }
        }
        organizationCardsSliderRepository$showOnlyMapObject$1 = new OrganizationCardsSliderRepository$showOnlyMapObject$1(this, continuationImpl);
        Object obj3 = organizationCardsSliderRepository$showOnlyMapObject$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = organizationCardsSliderRepository$showOnlyMapObject$1.label;
        g050 g050Var22 = this.f;
        LinkedHashSet linkedHashSet3 = this.e;
        c cVar2 = this.d;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        kn00Var = (kn00) obj3;
        if (kn00Var != null) {
        }
        return zy11Var2;
    }
}
