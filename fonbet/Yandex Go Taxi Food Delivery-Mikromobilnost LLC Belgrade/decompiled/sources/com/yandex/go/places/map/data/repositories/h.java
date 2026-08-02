package com.yandex.go.places.map.data.repositories;

import com.yandex.go.places.map.domain.entities.PinLayer;
import defpackage.cq00;
import defpackage.eq00;
import defpackage.fq00;
import defpackage.g050;
import defpackage.gq00;
import defpackage.hn00;
import defpackage.hq00;
import defpackage.in00;
import defpackage.iq00;
import defpackage.jl40;
import defpackage.kn00;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.yac0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class h extends g {
    public final tse j;

    public h(tt2 tt2Var, tse tseVar, yac0 yac0Var) {
        super(tt2Var, tseVar, yac0Var);
        this.j = tseVar;
        PinLayer pinLayer = PinLayer.MAIN;
    }

    public static final void x(h hVar, kn00 kn00Var, ArrayList arrayList, LinkedHashSet linkedHashSet) {
        LinkedHashMap linkedHashMap = hVar.e;
        String id = kn00Var.getId();
        in00 i = hVar.i();
        kn00 kn00Var2 = null;
        if (jl40.l(id, i != null ? i.getId() : null)) {
            return;
        }
        kn00 kn00Var3 = (kn00) linkedHashMap.remove(kn00Var.getId());
        boolean z = (kn00Var3 instanceof hn00) && (kn00Var instanceof hn00) && ((hn00) kn00Var3).f != ((hn00) kn00Var).f;
        if (kn00Var3 == null) {
            linkedHashMap.put(kn00Var.getId(), kn00Var);
            arrayList.add(kn00Var);
        } else if (z) {
            linkedHashMap.put(((hn00) kn00Var).a, kn00Var);
            arrayList.add(kn00Var);
            linkedHashSet.add(kn00Var3);
        } else {
            linkedHashMap.put(kn00Var3.getId(), kn00Var3);
        }
        if (linkedHashMap.size() > hVar.c) {
            Iterator it = linkedHashMap.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String id2 = ((kn00) entry.getValue()).getId();
                in00 i2 = hVar.i();
                if (!jl40.l(id2, i2 != null ? i2.getId() : null)) {
                    it.remove();
                    kn00Var2 = (kn00) entry.getValue();
                    break;
                }
            }
        }
        if (kn00Var2 != null) {
            linkedHashSet.add(kn00Var2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        if (c(r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object A(ContinuationImpl continuationImpl) {
        PlacesMapObjectsRepository$removeMapObjects$1 placesMapObjectsRepository$removeMapObjects$1;
        int i;
        if (continuationImpl instanceof PlacesMapObjectsRepository$removeMapObjects$1) {
            placesMapObjectsRepository$removeMapObjects$1 = (PlacesMapObjectsRepository$removeMapObjects$1) continuationImpl;
            int i2 = placesMapObjectsRepository$removeMapObjects$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                placesMapObjectsRepository$removeMapObjects$1.label = i2 - Integer.MIN_VALUE;
                Object obj = placesMapObjectsRepository$removeMapObjects$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placesMapObjectsRepository$removeMapObjects$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    placesMapObjectsRepository$removeMapObjects$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                placesMapObjectsRepository$removeMapObjects$1.label = 2;
                Object m = m(placesMapObjectsRepository$removeMapObjects$1);
                return m != obj2 ? obj2 : m;
            }
        }
        placesMapObjectsRepository$removeMapObjects$1 = new PlacesMapObjectsRepository$removeMapObjects$1(this, continuationImpl);
        Object obj3 = placesMapObjectsRepository$removeMapObjects$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesMapObjectsRepository$removeMapObjects$1.label;
        if (i != 0) {
        }
        placesMapObjectsRepository$removeMapObjects$1.label = 2;
        Object m2 = m(placesMapObjectsRepository$removeMapObjects$1);
        if (m2 != obj22) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0046, code lost:
    
        if (r2.a(r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.yandex.go.places.map.data.repositories.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        PlacesMapObjectsRepository$clearMapObjects$1 placesMapObjectsRepository$clearMapObjects$1;
        int i;
        g050 g050Var;
        try {
            if (continuationImpl instanceof PlacesMapObjectsRepository$clearMapObjects$1) {
                placesMapObjectsRepository$clearMapObjects$1 = (PlacesMapObjectsRepository$clearMapObjects$1) continuationImpl;
                int i2 = placesMapObjectsRepository$clearMapObjects$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    placesMapObjectsRepository$clearMapObjects$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = placesMapObjectsRepository$clearMapObjects$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = placesMapObjectsRepository$clearMapObjects$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        g050Var = this.f;
                        placesMapObjectsRepository$clearMapObjects$1.L$0 = g050Var;
                        placesMapObjectsRepository$clearMapObjects$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i == 2) {
                                kotlin.b.b(obj);
                                return obj;
                            }
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) placesMapObjectsRepository$clearMapObjects$1.L$0;
                        kotlin.b.b(obj);
                    }
                    u(null);
                    g050Var.d(null);
                    placesMapObjectsRepository$clearMapObjects$1.L$0 = null;
                    placesMapObjectsRepository$clearMapObjects$1.label = 2;
                    Object d = g.d(this, placesMapObjectsRepository$clearMapObjects$1);
                    return d != coroutineSingletons ? coroutineSingletons : d;
                }
            }
            u(null);
            g050Var.d(null);
            placesMapObjectsRepository$clearMapObjects$1.L$0 = null;
            placesMapObjectsRepository$clearMapObjects$1.label = 2;
            Object d2 = g.d(this, placesMapObjectsRepository$clearMapObjects$1);
            if (d2 != coroutineSingletons) {
            }
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
        placesMapObjectsRepository$clearMapObjects$1 = new PlacesMapObjectsRepository$clearMapObjects$1(this, continuationImpl);
        Object obj2 = placesMapObjectsRepository$clearMapObjects$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesMapObjectsRepository$clearMapObjects$1.label;
        if (i != 0) {
        }
    }

    @Override // com.yandex.go.places.map.data.repositories.g
    public final void k() {
        tje.N(this.j, null, null, new PlacesMapObjectsRepository$hideMapObjects$1(this, null), 3);
    }

    @Override // com.yandex.go.places.map.data.repositories.g
    public final Object m(ContinuationImpl continuationImpl) {
        return this.i.emit(cq00.a, continuationImpl);
    }

    @Override // com.yandex.go.places.map.data.repositories.g
    public final Object n(in00 in00Var) {
        return new fq00(in00Var);
    }

    @Override // com.yandex.go.places.map.data.repositories.g
    public final void p(kn00 kn00Var) {
        tje.N(this.j, null, null, new PlacesMapObjectsRepository$removeMapObject$1(this, kn00Var, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x006b, code lost:
    
        if (r8 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.yandex.go.places.map.data.repositories.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(Set set, ContinuationImpl continuationImpl) {
        PlacesMapObjectsRepository$removeMapObjectsByIds$1 placesMapObjectsRepository$removeMapObjectsByIds$1;
        int i;
        Iterator it;
        if (continuationImpl instanceof PlacesMapObjectsRepository$removeMapObjectsByIds$1) {
            placesMapObjectsRepository$removeMapObjectsByIds$1 = (PlacesMapObjectsRepository$removeMapObjectsByIds$1) continuationImpl;
            int i2 = placesMapObjectsRepository$removeMapObjectsByIds$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                placesMapObjectsRepository$removeMapObjectsByIds$1.label = i2 - Integer.MIN_VALUE;
                Object obj = placesMapObjectsRepository$removeMapObjectsByIds$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placesMapObjectsRepository$removeMapObjectsByIds$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!set.isEmpty()) {
                        this.a.getClass();
                        sjh sjhVar = uyj.a;
                        PlacesMapObjectsRepository$removeMapObjectsByIds$emits$1 placesMapObjectsRepository$removeMapObjectsByIds$emits$1 = new PlacesMapObjectsRepository$removeMapObjectsByIds$emits$1(this, set, null);
                        placesMapObjectsRepository$removeMapObjectsByIds$1.L$0 = null;
                        placesMapObjectsRepository$removeMapObjectsByIds$1.label = 1;
                        obj = tje.k0(sjhVar, placesMapObjectsRepository$removeMapObjectsByIds$emits$1, placesMapObjectsRepository$removeMapObjectsByIds$1);
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (Iterator) placesMapObjectsRepository$removeMapObjectsByIds$1.L$3;
                    kotlin.b.b(obj);
                    while (it.hasNext()) {
                        iq00 iq00Var = (iq00) it.next();
                        placesMapObjectsRepository$removeMapObjectsByIds$1.L$0 = null;
                        placesMapObjectsRepository$removeMapObjectsByIds$1.L$1 = null;
                        placesMapObjectsRepository$removeMapObjectsByIds$1.L$2 = null;
                        placesMapObjectsRepository$removeMapObjectsByIds$1.L$3 = it;
                        placesMapObjectsRepository$removeMapObjectsByIds$1.L$4 = null;
                        placesMapObjectsRepository$removeMapObjectsByIds$1.L$5 = null;
                        placesMapObjectsRepository$removeMapObjectsByIds$1.label = 2;
                        if (this.i.emit(iq00Var, placesMapObjectsRepository$removeMapObjectsByIds$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return zy11.a;
                }
                kotlin.b.b(obj);
                it = ((List) obj).iterator();
                while (it.hasNext()) {
                }
                return zy11.a;
            }
        }
        placesMapObjectsRepository$removeMapObjectsByIds$1 = new PlacesMapObjectsRepository$removeMapObjectsByIds$1(this, continuationImpl);
        Object obj2 = placesMapObjectsRepository$removeMapObjectsByIds$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesMapObjectsRepository$removeMapObjectsByIds$1.label;
        if (i != 0) {
        }
        it = ((List) obj2).iterator();
        while (it.hasNext()) {
        }
        return zy11.a;
    }

    @Override // com.yandex.go.places.map.data.repositories.g
    public final Object t(in00 in00Var, boolean z) {
        return new gq00(in00Var, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x007b, code lost:
    
        if (r10.a(r0) == r1) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r9v11, types: [g050] */
    @Override // com.yandex.go.places.map.data.repositories.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(List list, Continuation continuation) {
        PlacesMapObjectsRepository$updateMapObjects$1 placesMapObjectsRepository$updateMapObjects$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        kotlinx.coroutines.sync.a aVar;
        g050 g050Var;
        Object k0;
        hq00 hq00Var;
        try {
            if (continuation instanceof PlacesMapObjectsRepository$updateMapObjects$1) {
                placesMapObjectsRepository$updateMapObjects$1 = (PlacesMapObjectsRepository$updateMapObjects$1) continuation;
                int i2 = placesMapObjectsRepository$updateMapObjects$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    placesMapObjectsRepository$updateMapObjects$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = placesMapObjectsRepository$updateMapObjects$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = placesMapObjectsRepository$updateMapObjects$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        if (list.isEmpty()) {
                            return EmptyList.a;
                        }
                        placesMapObjectsRepository$updateMapObjects$1.L$0 = list;
                        aVar = this.f;
                        placesMapObjectsRepository$updateMapObjects$1.L$1 = aVar;
                        placesMapObjectsRepository$updateMapObjects$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                List list2 = (List) placesMapObjectsRepository$updateMapObjects$1.L$2;
                                kotlin.b.b(obj);
                                return list2;
                            }
                            g050Var = (g050) placesMapObjectsRepository$updateMapObjects$1.L$1;
                            try {
                                kotlin.b.b(obj);
                                Pair pair = (Pair) obj;
                                g050Var.d(null);
                                hq00Var = (hq00) pair.getFirst();
                                List list3 = (List) pair.getSecond();
                                if (hq00Var != null) {
                                    placesMapObjectsRepository$updateMapObjects$1.L$0 = null;
                                    placesMapObjectsRepository$updateMapObjects$1.L$1 = null;
                                    placesMapObjectsRepository$updateMapObjects$1.L$2 = list3;
                                    placesMapObjectsRepository$updateMapObjects$1.L$3 = null;
                                    placesMapObjectsRepository$updateMapObjects$1.label = 3;
                                    if (this.i.emit(hq00Var, placesMapObjectsRepository$updateMapObjects$1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                }
                                return list3;
                            } catch (Throwable th) {
                                th = th;
                                g050Var.d(null);
                                throw th;
                            }
                        }
                        ?? r9 = (g050) placesMapObjectsRepository$updateMapObjects$1.L$1;
                        List list4 = (List) placesMapObjectsRepository$updateMapObjects$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r9;
                        list = list4;
                    }
                    this.a.getClass();
                    sjh sjhVar = uyj.a;
                    PlacesMapObjectsRepository$updateMapObjects$2$1 placesMapObjectsRepository$updateMapObjects$2$1 = new PlacesMapObjectsRepository$updateMapObjects$2$1(this, list, null);
                    placesMapObjectsRepository$updateMapObjects$1.L$0 = null;
                    placesMapObjectsRepository$updateMapObjects$1.L$1 = aVar;
                    placesMapObjectsRepository$updateMapObjects$1.label = 2;
                    k0 = tje.k0(sjhVar, placesMapObjectsRepository$updateMapObjects$2$1, placesMapObjectsRepository$updateMapObjects$1);
                    if (k0 != coroutineSingletons) {
                        kotlinx.coroutines.sync.a aVar2 = aVar;
                        obj = k0;
                        g050Var = aVar2;
                        Pair pair2 = (Pair) obj;
                        g050Var.d(null);
                        hq00Var = (hq00) pair2.getFirst();
                        List list32 = (List) pair2.getSecond();
                        if (hq00Var != null) {
                        }
                        return list32;
                    }
                    return coroutineSingletons;
                }
            }
            this.a.getClass();
            sjh sjhVar2 = uyj.a;
            PlacesMapObjectsRepository$updateMapObjects$2$1 placesMapObjectsRepository$updateMapObjects$2$12 = new PlacesMapObjectsRepository$updateMapObjects$2$1(this, list, null);
            placesMapObjectsRepository$updateMapObjects$1.L$0 = null;
            placesMapObjectsRepository$updateMapObjects$1.L$1 = aVar;
            placesMapObjectsRepository$updateMapObjects$1.label = 2;
            k0 = tje.k0(sjhVar2, placesMapObjectsRepository$updateMapObjects$2$12, placesMapObjectsRepository$updateMapObjects$1);
            if (k0 != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th2) {
            th = th2;
            g050Var = aVar;
            g050Var.d(null);
            throw th;
        }
        placesMapObjectsRepository$updateMapObjects$1 = new PlacesMapObjectsRepository$updateMapObjects$1(this, (ContinuationImpl) continuation);
        Object obj2 = placesMapObjectsRepository$updateMapObjects$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesMapObjectsRepository$updateMapObjects$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object y(ContinuationImpl continuationImpl) {
        PlacesMapObjectsRepository$isMapObjectsEmpty$1 placesMapObjectsRepository$isMapObjectsEmpty$1;
        int i;
        g050 g050Var;
        try {
            if (continuationImpl instanceof PlacesMapObjectsRepository$isMapObjectsEmpty$1) {
                placesMapObjectsRepository$isMapObjectsEmpty$1 = (PlacesMapObjectsRepository$isMapObjectsEmpty$1) continuationImpl;
                int i2 = placesMapObjectsRepository$isMapObjectsEmpty$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    placesMapObjectsRepository$isMapObjectsEmpty$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = placesMapObjectsRepository$isMapObjectsEmpty$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = placesMapObjectsRepository$isMapObjectsEmpty$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        kotlinx.coroutines.sync.a aVar = this.d;
                        placesMapObjectsRepository$isMapObjectsEmpty$1.L$0 = aVar;
                        placesMapObjectsRepository$isMapObjectsEmpty$1.label = 1;
                        if (aVar.a(placesMapObjectsRepository$isMapObjectsEmpty$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        g050Var = aVar;
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) placesMapObjectsRepository$isMapObjectsEmpty$1.L$0;
                        kotlin.b.b(obj);
                    }
                    return Boolean.valueOf(this.e.isEmpty());
                }
            }
            return Boolean.valueOf(this.e.isEmpty());
        } finally {
            g050Var.d(null);
        }
        placesMapObjectsRepository$isMapObjectsEmpty$1 = new PlacesMapObjectsRepository$isMapObjectsEmpty$1(this, continuationImpl);
        Object obj2 = placesMapObjectsRepository$isMapObjectsEmpty$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesMapObjectsRepository$isMapObjectsEmpty$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0060, code lost:
    
        if (r9.a(r0) == r1) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r2v5, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object z(ContinuationImpl continuationImpl) {
        PlacesMapObjectsRepository$loadMapObjects$1 placesMapObjectsRepository$loadMapObjects$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        kotlinx.coroutines.sync.a aVar;
        g050 g050Var;
        g050 g050Var2;
        try {
            if (continuationImpl instanceof PlacesMapObjectsRepository$loadMapObjects$1) {
                placesMapObjectsRepository$loadMapObjects$1 = (PlacesMapObjectsRepository$loadMapObjects$1) continuationImpl;
                int i2 = placesMapObjectsRepository$loadMapObjects$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    placesMapObjectsRepository$loadMapObjects$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = placesMapObjectsRepository$loadMapObjects$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = placesMapObjectsRepository$loadMapObjects$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        aVar = this.f;
                        placesMapObjectsRepository$loadMapObjects$1.L$0 = aVar;
                        placesMapObjectsRepository$loadMapObjects$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                kotlin.b.b(obj);
                                return obj;
                            }
                            g050Var2 = (g050) placesMapObjectsRepository$loadMapObjects$1.L$1;
                            g050Var = (g050) placesMapObjectsRepository$loadMapObjects$1.L$0;
                            try {
                                kotlin.b.b(obj);
                                try {
                                    eq00 eq00Var = new eq00(kotlin.collections.a.J0(this.e.values()), i());
                                    g050Var.d(null);
                                    placesMapObjectsRepository$loadMapObjects$1.L$0 = null;
                                    placesMapObjectsRepository$loadMapObjects$1.L$1 = null;
                                    placesMapObjectsRepository$loadMapObjects$1.L$2 = null;
                                    placesMapObjectsRepository$loadMapObjects$1.label = 3;
                                    Object emit = this.i.emit(eq00Var, placesMapObjectsRepository$loadMapObjects$1);
                                    return emit != coroutineSingletons ? coroutineSingletons : emit;
                                } finally {
                                    g050Var2.d(null);
                                }
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                        ?? r2 = (g050) placesMapObjectsRepository$loadMapObjects$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r2;
                    }
                    g050Var2 = this.d;
                    placesMapObjectsRepository$loadMapObjects$1.L$0 = aVar;
                    placesMapObjectsRepository$loadMapObjects$1.L$1 = g050Var2;
                    placesMapObjectsRepository$loadMapObjects$1.L$2 = null;
                    placesMapObjectsRepository$loadMapObjects$1.label = 2;
                    if (g050Var2.a(placesMapObjectsRepository$loadMapObjects$1) != coroutineSingletons) {
                        g050Var = aVar;
                        eq00 eq00Var2 = new eq00(kotlin.collections.a.J0(this.e.values()), i());
                        g050Var.d(null);
                        placesMapObjectsRepository$loadMapObjects$1.L$0 = null;
                        placesMapObjectsRepository$loadMapObjects$1.L$1 = null;
                        placesMapObjectsRepository$loadMapObjects$1.L$2 = null;
                        placesMapObjectsRepository$loadMapObjects$1.label = 3;
                        Object emit2 = this.i.emit(eq00Var2, placesMapObjectsRepository$loadMapObjects$1);
                        if (emit2 != coroutineSingletons) {
                        }
                    }
                }
            }
            g050Var2 = this.d;
            placesMapObjectsRepository$loadMapObjects$1.L$0 = aVar;
            placesMapObjectsRepository$loadMapObjects$1.L$1 = g050Var2;
            placesMapObjectsRepository$loadMapObjects$1.L$2 = null;
            placesMapObjectsRepository$loadMapObjects$1.label = 2;
            if (g050Var2.a(placesMapObjectsRepository$loadMapObjects$1) != coroutineSingletons) {
            }
        } catch (Throwable th2) {
            th = th2;
            g050Var = aVar;
            throw th;
        }
        placesMapObjectsRepository$loadMapObjects$1 = new PlacesMapObjectsRepository$loadMapObjects$1(this, continuationImpl);
        Object obj2 = placesMapObjectsRepository$loadMapObjects$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesMapObjectsRepository$loadMapObjects$1.label;
        if (i != 0) {
        }
    }
}
