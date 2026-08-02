package com.yandex.go.places.map.data.repositories;

import com.yandex.go.places.map.domain.entities.PinLayer;
import defpackage.c5t0;
import defpackage.e5t0;
import defpackage.f5t0;
import defpackage.g050;
import defpackage.g5t0;
import defpackage.hn00;
import defpackage.i5t0;
import defpackage.in00;
import defpackage.j5t0;
import defpackage.jl40;
import defpackage.kn00;
import defpackage.lbc0;
import defpackage.nbc0;
import defpackage.ny61;
import defpackage.obc0;
import defpackage.pbc0;
import defpackage.qbc0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.yac0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes13.dex */
public final class i extends g {
    public final tse j;
    public final com.yandex.go.places.impl.data.repositories.map.a k;
    public boolean l;

    public i(tse tseVar, com.yandex.go.places.impl.data.repositories.map.a aVar, tt2 tt2Var, yac0 yac0Var) {
        super(tt2Var, tseVar, yac0Var);
        this.j = tseVar;
        this.k = aVar;
        PinLayer pinLayer = PinLayer.MAIN;
    }

    public static final void x(i iVar, kn00 kn00Var, ArrayList arrayList, LinkedHashSet linkedHashSet) {
        LinkedHashMap linkedHashMap = iVar.e;
        kn00 kn00Var2 = (kn00) linkedHashMap.remove(kn00Var.getId());
        if (kn00Var2 == null) {
            linkedHashMap.put(kn00Var.getId(), kn00Var);
            arrayList.add(kn00Var);
        } else {
            if ((kn00Var2 instanceof hn00) && (kn00Var instanceof hn00)) {
                hn00 hn00Var = (hn00) kn00Var;
                if (((hn00) kn00Var2).f != hn00Var.f) {
                    linkedHashMap.put(hn00Var.a, kn00Var);
                    arrayList.add(kn00Var);
                    linkedHashSet.add(kn00Var2);
                }
            }
            linkedHashMap.put(kn00Var2.getId(), kn00Var2);
        }
        kn00 kn00Var3 = null;
        if (linkedHashMap.size() > iVar.c) {
            Iterator it = linkedHashMap.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String id = ((kn00) entry.getValue()).getId();
                in00 i = iVar.i();
                if (!jl40.l(id, i != null ? i.getId() : null)) {
                    it.remove();
                    kn00Var3 = (kn00) entry.getValue();
                    break;
                }
            }
        }
        if (kn00Var3 != null) {
            linkedHashSet.add(kn00Var3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006f, code lost:
    
        if (r9 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object A(List list, ContinuationImpl continuationImpl) {
        PlacesMapSocialPinsRepository$replaceMapObjects$1 placesMapSocialPinsRepository$replaceMapObjects$1;
        int i;
        lbc0 lbc0Var;
        i5t0 i5t0Var;
        lbc0 lbc0Var2;
        lbc0 lbc0Var3;
        if (continuationImpl instanceof PlacesMapSocialPinsRepository$replaceMapObjects$1) {
            placesMapSocialPinsRepository$replaceMapObjects$1 = (PlacesMapSocialPinsRepository$replaceMapObjects$1) continuationImpl;
            int i2 = placesMapSocialPinsRepository$replaceMapObjects$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                placesMapSocialPinsRepository$replaceMapObjects$1.label = i2 - Integer.MIN_VALUE;
                Object obj = placesMapSocialPinsRepository$replaceMapObjects$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placesMapSocialPinsRepository$replaceMapObjects$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.a.getClass();
                    sjh sjhVar = uyj.a;
                    PlacesMapSocialPinsRepository$replaceMapObjects$result$1 placesMapSocialPinsRepository$replaceMapObjects$result$1 = new PlacesMapSocialPinsRepository$replaceMapObjects$result$1(this, list, null);
                    placesMapSocialPinsRepository$replaceMapObjects$1.L$0 = null;
                    placesMapSocialPinsRepository$replaceMapObjects$1.label = 1;
                    obj = tje.k0(sjhVar, placesMapSocialPinsRepository$replaceMapObjects$result$1, placesMapSocialPinsRepository$replaceMapObjects$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            lbc0Var3 = (lbc0) placesMapSocialPinsRepository$replaceMapObjects$1.L$1;
                            kotlin.b.b(obj);
                            lbc0Var = lbc0Var3;
                            return lbc0Var.b;
                        }
                        lbc0Var2 = (lbc0) placesMapSocialPinsRepository$replaceMapObjects$1.L$1;
                        kotlin.b.b(obj);
                        if (lbc0Var2.d) {
                            lbc0Var = lbc0Var2;
                            return lbc0Var.b;
                        }
                        placesMapSocialPinsRepository$replaceMapObjects$1.L$0 = null;
                        placesMapSocialPinsRepository$replaceMapObjects$1.L$1 = lbc0Var2;
                        placesMapSocialPinsRepository$replaceMapObjects$1.L$2 = null;
                        placesMapSocialPinsRepository$replaceMapObjects$1.label = 3;
                        if (s(placesMapSocialPinsRepository$replaceMapObjects$1) != obj2) {
                            lbc0Var3 = lbc0Var2;
                            lbc0Var = lbc0Var3;
                            return lbc0Var.b;
                        }
                        return obj2;
                    }
                    kotlin.b.b(obj);
                }
                lbc0Var = (lbc0) obj;
                i5t0Var = lbc0Var.a;
                if (i5t0Var != null) {
                    placesMapSocialPinsRepository$replaceMapObjects$1.L$0 = null;
                    placesMapSocialPinsRepository$replaceMapObjects$1.L$1 = lbc0Var;
                    placesMapSocialPinsRepository$replaceMapObjects$1.L$2 = null;
                    placesMapSocialPinsRepository$replaceMapObjects$1.label = 2;
                    if (this.i.emit(i5t0Var, placesMapSocialPinsRepository$replaceMapObjects$1) != obj2) {
                        lbc0Var2 = lbc0Var;
                        if (lbc0Var2.d) {
                        }
                    }
                    return obj2;
                }
                return lbc0Var.b;
            }
        }
        placesMapSocialPinsRepository$replaceMapObjects$1 = new PlacesMapSocialPinsRepository$replaceMapObjects$1(this, continuationImpl);
        Object obj3 = placesMapSocialPinsRepository$replaceMapObjects$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesMapSocialPinsRepository$replaceMapObjects$1.label;
        if (i != 0) {
        }
        lbc0Var = (lbc0) obj3;
        i5t0Var = lbc0Var.a;
        if (i5t0Var != null) {
        }
        return lbc0Var.b;
    }

    public final Object B(Continuation continuation) {
        this.a.getClass();
        Object k0 = tje.k0(uyj.a, new PlacesMapSocialPinsRepository$restoreFromCache$2(this, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0058, code lost:
    
        if (r8 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object C(ContinuationImpl continuationImpl) {
        PlacesMapSocialPinsRepository$resumeLayerMapObjectsFromCache$1 placesMapSocialPinsRepository$resumeLayerMapObjectsFromCache$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        nbc0 nbc0Var;
        i5t0 i5t0Var;
        if (continuationImpl instanceof PlacesMapSocialPinsRepository$resumeLayerMapObjectsFromCache$1) {
            placesMapSocialPinsRepository$resumeLayerMapObjectsFromCache$1 = (PlacesMapSocialPinsRepository$resumeLayerMapObjectsFromCache$1) continuationImpl;
            int i2 = placesMapSocialPinsRepository$resumeLayerMapObjectsFromCache$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                placesMapSocialPinsRepository$resumeLayerMapObjectsFromCache$1.label = i2 - Integer.MIN_VALUE;
                Object obj = placesMapSocialPinsRepository$resumeLayerMapObjectsFromCache$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placesMapSocialPinsRepository$resumeLayerMapObjectsFromCache$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.a.getClass();
                    sjh sjhVar = uyj.a;
                    PlacesMapSocialPinsRepository$resumeLayerMapObjectsFromCache$result$1 placesMapSocialPinsRepository$resumeLayerMapObjectsFromCache$result$1 = new PlacesMapSocialPinsRepository$resumeLayerMapObjectsFromCache$result$1(this, null);
                    placesMapSocialPinsRepository$resumeLayerMapObjectsFromCache$1.label = 1;
                    obj = tje.k0(sjhVar, placesMapSocialPinsRepository$resumeLayerMapObjectsFromCache$result$1, placesMapSocialPinsRepository$resumeLayerMapObjectsFromCache$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    kotlin.b.b(obj);
                }
                obc0 obc0Var = (obc0) obj;
                nbc0Var = !(obc0Var instanceof nbc0) ? (nbc0) obc0Var : null;
                if (nbc0Var != null && (i5t0Var = nbc0Var.a) != null) {
                    placesMapSocialPinsRepository$resumeLayerMapObjectsFromCache$1.L$0 = null;
                    placesMapSocialPinsRepository$resumeLayerMapObjectsFromCache$1.L$1 = null;
                    placesMapSocialPinsRepository$resumeLayerMapObjectsFromCache$1.L$2 = null;
                    placesMapSocialPinsRepository$resumeLayerMapObjectsFromCache$1.label = 2;
                    if (this.i.emit(i5t0Var, placesMapSocialPinsRepository$resumeLayerMapObjectsFromCache$1) != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11Var;
            }
        }
        placesMapSocialPinsRepository$resumeLayerMapObjectsFromCache$1 = new PlacesMapSocialPinsRepository$resumeLayerMapObjectsFromCache$1(this, continuationImpl);
        Object obj2 = placesMapSocialPinsRepository$resumeLayerMapObjectsFromCache$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesMapSocialPinsRepository$resumeLayerMapObjectsFromCache$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        obc0 obc0Var2 = (obc0) obj2;
        if (!(obc0Var2 instanceof nbc0)) {
        }
        if (nbc0Var != null) {
            placesMapSocialPinsRepository$resumeLayerMapObjectsFromCache$1.L$0 = null;
            placesMapSocialPinsRepository$resumeLayerMapObjectsFromCache$1.L$1 = null;
            placesMapSocialPinsRepository$resumeLayerMapObjectsFromCache$1.L$2 = null;
            placesMapSocialPinsRepository$resumeLayerMapObjectsFromCache$1.label = 2;
            if (this.i.emit(i5t0Var, placesMapSocialPinsRepository$resumeLayerMapObjectsFromCache$1) != coroutineSingletons) {
            }
        }
        return zy11Var2;
    }

    public final void D() {
        tje.N(this.j, null, null, new PlacesMapSocialPinsRepository$showMapObjects$1(this, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (defpackage.tje.k0(r7, r2, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object E(ContinuationImpl continuationImpl) {
        PlacesMapSocialPinsRepository$suspendLayerMapObjectsAndCache$1 placesMapSocialPinsRepository$suspendLayerMapObjectsAndCache$1;
        int i;
        if (continuationImpl instanceof PlacesMapSocialPinsRepository$suspendLayerMapObjectsAndCache$1) {
            placesMapSocialPinsRepository$suspendLayerMapObjectsAndCache$1 = (PlacesMapSocialPinsRepository$suspendLayerMapObjectsAndCache$1) continuationImpl;
            int i2 = placesMapSocialPinsRepository$suspendLayerMapObjectsAndCache$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                placesMapSocialPinsRepository$suspendLayerMapObjectsAndCache$1.label = i2 - Integer.MIN_VALUE;
                Object obj = placesMapSocialPinsRepository$suspendLayerMapObjectsAndCache$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placesMapSocialPinsRepository$suspendLayerMapObjectsAndCache$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.a.getClass();
                    sjh sjhVar = uyj.a;
                    PlacesMapSocialPinsRepository$suspendLayerMapObjectsAndCache$2 placesMapSocialPinsRepository$suspendLayerMapObjectsAndCache$2 = new PlacesMapSocialPinsRepository$suspendLayerMapObjectsAndCache$2(this, null);
                    placesMapSocialPinsRepository$suspendLayerMapObjectsAndCache$1.label = 1;
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
                placesMapSocialPinsRepository$suspendLayerMapObjectsAndCache$1.label = 2;
                Object m = m(placesMapSocialPinsRepository$suspendLayerMapObjectsAndCache$1);
                return m != obj2 ? obj2 : m;
            }
        }
        placesMapSocialPinsRepository$suspendLayerMapObjectsAndCache$1 = new PlacesMapSocialPinsRepository$suspendLayerMapObjectsAndCache$1(this, continuationImpl);
        Object obj3 = placesMapSocialPinsRepository$suspendLayerMapObjectsAndCache$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesMapSocialPinsRepository$suspendLayerMapObjectsAndCache$1.label;
        if (i != 0) {
        }
        placesMapSocialPinsRepository$suspendLayerMapObjectsAndCache$1.label = 2;
        Object m2 = m(placesMapSocialPinsRepository$suspendLayerMapObjectsAndCache$1);
        if (m2 != obj22) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
    
        if (r3.emit(r9, r0) == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        if (r10 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0096 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object F(in00 in00Var, ContinuationImpl continuationImpl) {
        PlacesMapSocialPinsRepository$suspendLayerMapObjectsAndCacheKeepingSelected$1 placesMapSocialPinsRepository$suspendLayerMapObjectsAndCacheKeepingSelected$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        pbc0 pbc0Var;
        i5t0 i5t0Var;
        if (continuationImpl instanceof PlacesMapSocialPinsRepository$suspendLayerMapObjectsAndCacheKeepingSelected$1) {
            placesMapSocialPinsRepository$suspendLayerMapObjectsAndCacheKeepingSelected$1 = (PlacesMapSocialPinsRepository$suspendLayerMapObjectsAndCacheKeepingSelected$1) continuationImpl;
            int i2 = placesMapSocialPinsRepository$suspendLayerMapObjectsAndCacheKeepingSelected$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                placesMapSocialPinsRepository$suspendLayerMapObjectsAndCacheKeepingSelected$1.label = i2 - Integer.MIN_VALUE;
                Object obj = placesMapSocialPinsRepository$suspendLayerMapObjectsAndCacheKeepingSelected$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placesMapSocialPinsRepository$suspendLayerMapObjectsAndCacheKeepingSelected$1.label;
                n0 n0Var = this.i;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.a.getClass();
                    sjh sjhVar = uyj.a;
                    PlacesMapSocialPinsRepository$suspendLayerMapObjectsAndCacheKeepingSelected$result$1 placesMapSocialPinsRepository$suspendLayerMapObjectsAndCacheKeepingSelected$result$1 = new PlacesMapSocialPinsRepository$suspendLayerMapObjectsAndCacheKeepingSelected$result$1(this, in00Var, null);
                    placesMapSocialPinsRepository$suspendLayerMapObjectsAndCacheKeepingSelected$1.L$0 = null;
                    placesMapSocialPinsRepository$suspendLayerMapObjectsAndCacheKeepingSelected$1.label = 1;
                    obj = tje.k0(sjhVar, placesMapSocialPinsRepository$suspendLayerMapObjectsAndCacheKeepingSelected$result$1, placesMapSocialPinsRepository$suspendLayerMapObjectsAndCacheKeepingSelected$1);
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
                        pbc0Var = (pbc0) placesMapSocialPinsRepository$suspendLayerMapObjectsAndCacheKeepingSelected$1.L$1;
                        kotlin.b.b(obj);
                        g5t0 g5t0Var = pbc0Var.b;
                        placesMapSocialPinsRepository$suspendLayerMapObjectsAndCacheKeepingSelected$1.L$0 = null;
                        placesMapSocialPinsRepository$suspendLayerMapObjectsAndCacheKeepingSelected$1.L$1 = null;
                        placesMapSocialPinsRepository$suspendLayerMapObjectsAndCacheKeepingSelected$1.L$2 = null;
                        placesMapSocialPinsRepository$suspendLayerMapObjectsAndCacheKeepingSelected$1.label = 3;
                        Object emit = n0Var.emit(g5t0Var, placesMapSocialPinsRepository$suspendLayerMapObjectsAndCacheKeepingSelected$1);
                        return emit == coroutineSingletons ? coroutineSingletons : emit;
                    }
                    kotlin.b.b(obj);
                }
                pbc0Var = (pbc0) obj;
                i5t0Var = pbc0Var.a;
                if (i5t0Var != null) {
                    placesMapSocialPinsRepository$suspendLayerMapObjectsAndCacheKeepingSelected$1.L$0 = null;
                    placesMapSocialPinsRepository$suspendLayerMapObjectsAndCacheKeepingSelected$1.L$1 = pbc0Var;
                    placesMapSocialPinsRepository$suspendLayerMapObjectsAndCacheKeepingSelected$1.L$2 = null;
                    placesMapSocialPinsRepository$suspendLayerMapObjectsAndCacheKeepingSelected$1.label = 2;
                }
                g5t0 g5t0Var2 = pbc0Var.b;
                placesMapSocialPinsRepository$suspendLayerMapObjectsAndCacheKeepingSelected$1.L$0 = null;
                placesMapSocialPinsRepository$suspendLayerMapObjectsAndCacheKeepingSelected$1.L$1 = null;
                placesMapSocialPinsRepository$suspendLayerMapObjectsAndCacheKeepingSelected$1.L$2 = null;
                placesMapSocialPinsRepository$suspendLayerMapObjectsAndCacheKeepingSelected$1.label = 3;
                Object emit2 = n0Var.emit(g5t0Var2, placesMapSocialPinsRepository$suspendLayerMapObjectsAndCacheKeepingSelected$1);
                if (emit2 == coroutineSingletons) {
                }
            }
        }
        placesMapSocialPinsRepository$suspendLayerMapObjectsAndCacheKeepingSelected$1 = new PlacesMapSocialPinsRepository$suspendLayerMapObjectsAndCacheKeepingSelected$1(this, continuationImpl);
        Object obj2 = placesMapSocialPinsRepository$suspendLayerMapObjectsAndCacheKeepingSelected$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesMapSocialPinsRepository$suspendLayerMapObjectsAndCacheKeepingSelected$1.label;
        n0 n0Var2 = this.i;
        if (i != 0) {
        }
        pbc0Var = (pbc0) obj2;
        i5t0Var = pbc0Var.a;
        if (i5t0Var != null) {
        }
        g5t0 g5t0Var22 = pbc0Var.b;
        placesMapSocialPinsRepository$suspendLayerMapObjectsAndCacheKeepingSelected$1.L$0 = null;
        placesMapSocialPinsRepository$suspendLayerMapObjectsAndCacheKeepingSelected$1.L$1 = null;
        placesMapSocialPinsRepository$suspendLayerMapObjectsAndCacheKeepingSelected$1.L$2 = null;
        placesMapSocialPinsRepository$suspendLayerMapObjectsAndCacheKeepingSelected$1.label = 3;
        Object emit22 = n0Var2.emit(g5t0Var22, placesMapSocialPinsRepository$suspendLayerMapObjectsAndCacheKeepingSelected$1);
        if (emit22 == coroutineSingletons) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
    
        if (r8 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object G(List list, ContinuationImpl continuationImpl) {
        PlacesMapSocialPinsRepository$updateLayerMapObjects$1 placesMapSocialPinsRepository$updateLayerMapObjects$1;
        int i;
        boolean booleanValue;
        if (continuationImpl instanceof PlacesMapSocialPinsRepository$updateLayerMapObjects$1) {
            placesMapSocialPinsRepository$updateLayerMapObjects$1 = (PlacesMapSocialPinsRepository$updateLayerMapObjects$1) continuationImpl;
            int i2 = placesMapSocialPinsRepository$updateLayerMapObjects$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                placesMapSocialPinsRepository$updateLayerMapObjects$1.label = i2 - Integer.MIN_VALUE;
                Object obj = placesMapSocialPinsRepository$updateLayerMapObjects$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placesMapSocialPinsRepository$updateLayerMapObjects$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    placesMapSocialPinsRepository$updateLayerMapObjects$1.L$0 = list;
                    placesMapSocialPinsRepository$updateLayerMapObjects$1.label = 1;
                    this.a.getClass();
                    obj = tje.k0(uyj.a, new PlacesMapSocialPinsRepository$cacheLayerMapObjectsIfSuspended$2(this, list, null), placesMapSocialPinsRepository$updateLayerMapObjects$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    list = (List) placesMapSocialPinsRepository$updateLayerMapObjects$1.L$0;
                    kotlin.b.b(obj);
                }
                booleanValue = ((Boolean) obj).booleanValue();
                if (!booleanValue) {
                    return EmptyList.a;
                }
                placesMapSocialPinsRepository$updateLayerMapObjects$1.L$0 = null;
                placesMapSocialPinsRepository$updateLayerMapObjects$1.Z$0 = booleanValue;
                placesMapSocialPinsRepository$updateLayerMapObjects$1.label = 2;
                Object H = H(list, placesMapSocialPinsRepository$updateLayerMapObjects$1, true);
                return H == obj2 ? obj2 : H;
            }
        }
        placesMapSocialPinsRepository$updateLayerMapObjects$1 = new PlacesMapSocialPinsRepository$updateLayerMapObjects$1(this, continuationImpl);
        Object obj3 = placesMapSocialPinsRepository$updateLayerMapObjects$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesMapSocialPinsRepository$updateLayerMapObjects$1.label;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj3).booleanValue();
        if (!booleanValue) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x016d, code lost:
    
        if (g(r0) == r1) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0170, code lost:
    
        r11 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x018b, code lost:
    
        if (s(r0) == r1) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00dd, code lost:
    
        if (r13.a(r0) != r1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00a7, code lost:
    
        if (r13 == r1) goto L79;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.yandex.go.places.map.data.repositories.g, com.yandex.go.places.map.data.repositories.i] */
    /* JADX WARN: Type inference failed for: r14v13, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object H(List list, ContinuationImpl continuationImpl, boolean z) {
        PlacesMapSocialPinsRepository$updateMapObjectsInternal$1 placesMapSocialPinsRepository$updateMapObjectsInternal$1;
        int i;
        qbc0 qbc0Var;
        i5t0 i5t0Var;
        qbc0 qbc0Var2;
        boolean z2;
        kotlinx.coroutines.sync.a aVar;
        int i2;
        if (continuationImpl instanceof PlacesMapSocialPinsRepository$updateMapObjectsInternal$1) {
            placesMapSocialPinsRepository$updateMapObjectsInternal$1 = (PlacesMapSocialPinsRepository$updateMapObjectsInternal$1) continuationImpl;
            int i3 = placesMapSocialPinsRepository$updateMapObjectsInternal$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                placesMapSocialPinsRepository$updateMapObjectsInternal$1.label = i3 - Integer.MIN_VALUE;
                Object obj = placesMapSocialPinsRepository$updateMapObjectsInternal$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placesMapSocialPinsRepository$updateMapObjectsInternal$1.label;
                int i4 = 1;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (list.isEmpty()) {
                        return EmptyList.a;
                    }
                    this.a.getClass();
                    sjh sjhVar = uyj.a;
                    PlacesMapSocialPinsRepository$updateMapObjectsInternal$result$1 placesMapSocialPinsRepository$updateMapObjectsInternal$result$1 = new PlacesMapSocialPinsRepository$updateMapObjectsInternal$result$1(this, z, list, null);
                    placesMapSocialPinsRepository$updateMapObjectsInternal$1.L$0 = null;
                    placesMapSocialPinsRepository$updateMapObjectsInternal$1.Z$0 = z;
                    placesMapSocialPinsRepository$updateMapObjectsInternal$1.label = 1;
                    obj = tje.k0(sjhVar, placesMapSocialPinsRepository$updateMapObjectsInternal$result$1, placesMapSocialPinsRepository$updateMapObjectsInternal$1);
                } else if (i == 1) {
                    z = placesMapSocialPinsRepository$updateMapObjectsInternal$1.Z$0;
                    kotlin.b.b(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4 && i != 5) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qbc0 qbc0Var3 = (qbc0) placesMapSocialPinsRepository$updateMapObjectsInternal$1.L$1;
                            kotlin.b.b(obj);
                            qbc0Var = qbc0Var3;
                            return qbc0Var.b;
                        }
                        z2 = placesMapSocialPinsRepository$updateMapObjectsInternal$1.Z$0;
                        ?? r14 = (g050) placesMapSocialPinsRepository$updateMapObjectsInternal$1.L$3;
                        qbc0 qbc0Var4 = (qbc0) placesMapSocialPinsRepository$updateMapObjectsInternal$1.L$1;
                        kotlin.b.b(obj);
                        aVar = r14;
                        qbc0Var2 = qbc0Var4;
                        try {
                            in00 i5 = i();
                            String id = i5 != null ? i5.getId() : null;
                            if (id != null) {
                                Set set = qbc0Var2.c;
                                if (!(set instanceof Collection) || !set.isEmpty()) {
                                    Iterator it = set.iterator();
                                    while (it.hasNext()) {
                                        if (jl40.l(((kn00) it.next()).getId(), id)) {
                                            i2 = 1;
                                            break;
                                        }
                                    }
                                }
                                i2 = 0;
                                List list2 = qbc0Var2.b;
                                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                    Iterator it2 = list2.iterator();
                                    while (it2.hasNext()) {
                                        if (jl40.l(((kn00) it2.next()).getId(), id)) {
                                            break;
                                        }
                                    }
                                }
                                i4 = 0;
                                if (i2 != 0 && i4 == 0) {
                                    placesMapSocialPinsRepository$updateMapObjectsInternal$1.L$0 = null;
                                    placesMapSocialPinsRepository$updateMapObjectsInternal$1.L$1 = qbc0Var2;
                                    placesMapSocialPinsRepository$updateMapObjectsInternal$1.L$2 = null;
                                    placesMapSocialPinsRepository$updateMapObjectsInternal$1.L$3 = null;
                                    placesMapSocialPinsRepository$updateMapObjectsInternal$1.L$4 = null;
                                    placesMapSocialPinsRepository$updateMapObjectsInternal$1.Z$0 = z2;
                                    placesMapSocialPinsRepository$updateMapObjectsInternal$1.I$0 = i4;
                                    placesMapSocialPinsRepository$updateMapObjectsInternal$1.I$1 = i2;
                                    placesMapSocialPinsRepository$updateMapObjectsInternal$1.label = 4;
                                } else if (i4 != 0) {
                                    placesMapSocialPinsRepository$updateMapObjectsInternal$1.L$0 = null;
                                    placesMapSocialPinsRepository$updateMapObjectsInternal$1.L$1 = qbc0Var2;
                                    placesMapSocialPinsRepository$updateMapObjectsInternal$1.L$2 = null;
                                    placesMapSocialPinsRepository$updateMapObjectsInternal$1.L$3 = null;
                                    placesMapSocialPinsRepository$updateMapObjectsInternal$1.L$4 = null;
                                    placesMapSocialPinsRepository$updateMapObjectsInternal$1.Z$0 = z2;
                                    placesMapSocialPinsRepository$updateMapObjectsInternal$1.I$0 = i4;
                                    placesMapSocialPinsRepository$updateMapObjectsInternal$1.I$1 = i2;
                                    placesMapSocialPinsRepository$updateMapObjectsInternal$1.label = 5;
                                }
                                qbc0Var = qbc0Var3;
                                return qbc0Var.b;
                            }
                            qbc0Var = qbc0Var2;
                            return qbc0Var.b;
                        } finally {
                            aVar.d(null);
                        }
                    }
                    z2 = placesMapSocialPinsRepository$updateMapObjectsInternal$1.Z$0;
                    qbc0Var2 = (qbc0) placesMapSocialPinsRepository$updateMapObjectsInternal$1.L$1;
                    kotlin.b.b(obj);
                    placesMapSocialPinsRepository$updateMapObjectsInternal$1.L$0 = null;
                    placesMapSocialPinsRepository$updateMapObjectsInternal$1.L$1 = qbc0Var2;
                    placesMapSocialPinsRepository$updateMapObjectsInternal$1.L$2 = null;
                    aVar = this.f;
                    placesMapSocialPinsRepository$updateMapObjectsInternal$1.L$3 = aVar;
                    placesMapSocialPinsRepository$updateMapObjectsInternal$1.L$4 = null;
                    placesMapSocialPinsRepository$updateMapObjectsInternal$1.Z$0 = z2;
                    placesMapSocialPinsRepository$updateMapObjectsInternal$1.label = 3;
                }
                qbc0Var = (qbc0) obj;
                i5t0Var = qbc0Var.a;
                if (i5t0Var != null) {
                    placesMapSocialPinsRepository$updateMapObjectsInternal$1.L$0 = null;
                    placesMapSocialPinsRepository$updateMapObjectsInternal$1.L$1 = qbc0Var;
                    placesMapSocialPinsRepository$updateMapObjectsInternal$1.L$2 = null;
                    placesMapSocialPinsRepository$updateMapObjectsInternal$1.Z$0 = z;
                    placesMapSocialPinsRepository$updateMapObjectsInternal$1.label = 2;
                    if (this.i.emit(i5t0Var, placesMapSocialPinsRepository$updateMapObjectsInternal$1) != coroutineSingletons) {
                        boolean z3 = z;
                        qbc0Var2 = qbc0Var;
                        z2 = z3;
                        placesMapSocialPinsRepository$updateMapObjectsInternal$1.L$0 = null;
                        placesMapSocialPinsRepository$updateMapObjectsInternal$1.L$1 = qbc0Var2;
                        placesMapSocialPinsRepository$updateMapObjectsInternal$1.L$2 = null;
                        aVar = this.f;
                        placesMapSocialPinsRepository$updateMapObjectsInternal$1.L$3 = aVar;
                        placesMapSocialPinsRepository$updateMapObjectsInternal$1.L$4 = null;
                        placesMapSocialPinsRepository$updateMapObjectsInternal$1.Z$0 = z2;
                        placesMapSocialPinsRepository$updateMapObjectsInternal$1.label = 3;
                    }
                    return coroutineSingletons;
                }
                return qbc0Var.b;
            }
        }
        placesMapSocialPinsRepository$updateMapObjectsInternal$1 = new PlacesMapSocialPinsRepository$updateMapObjectsInternal$1(this, continuationImpl);
        Object obj2 = placesMapSocialPinsRepository$updateMapObjectsInternal$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesMapSocialPinsRepository$updateMapObjectsInternal$1.label;
        int i42 = 1;
        if (i != 0) {
        }
        qbc0Var = (qbc0) obj2;
        i5t0Var = qbc0Var.a;
        if (i5t0Var != null) {
        }
        return qbc0Var.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
        if (r8.c(r3, r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004f, code lost:
    
        if (r9.a(r0) == r1) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0056 A[Catch: all -> 0x0063, TRY_LEAVE, TryCatch #1 {all -> 0x0063, blocks: (B:25:0x0052, B:27:0x0056), top: B:24:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r2v4, types: [g050] */
    @Override // com.yandex.go.places.map.data.repositories.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        PlacesMapSocialPinsRepository$clearMapObjects$1 placesMapSocialPinsRepository$clearMapObjects$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        Throwable th;
        g050 g050Var;
        try {
            if (continuationImpl instanceof PlacesMapSocialPinsRepository$clearMapObjects$1) {
                placesMapSocialPinsRepository$clearMapObjects$1 = (PlacesMapSocialPinsRepository$clearMapObjects$1) continuationImpl;
                int i2 = placesMapSocialPinsRepository$clearMapObjects$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    placesMapSocialPinsRepository$clearMapObjects$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = placesMapSocialPinsRepository$clearMapObjects$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = placesMapSocialPinsRepository$clearMapObjects$1.label;
                    LinkedHashMap linkedHashMap = this.e;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        aVar = this.d;
                        placesMapSocialPinsRepository$clearMapObjects$1.L$0 = aVar;
                        placesMapSocialPinsRepository$clearMapObjects$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            g050Var = (g050) placesMapSocialPinsRepository$clearMapObjects$1.L$0;
                            try {
                                kotlin.b.b(obj);
                                linkedHashMap.clear();
                                g050Var.d(null);
                                return zy11.a;
                            } catch (Throwable th2) {
                                th = th2;
                                g050Var.d(null);
                                throw th;
                            }
                        }
                        ?? r2 = (g050) placesMapSocialPinsRepository$clearMapObjects$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r2;
                    }
                    if (!this.l) {
                        com.yandex.go.places.impl.data.repositories.map.a aVar2 = this.k;
                        placesMapSocialPinsRepository$clearMapObjects$1.L$0 = aVar;
                        placesMapSocialPinsRepository$clearMapObjects$1.label = 2;
                    }
                    g050Var = aVar;
                    linkedHashMap.clear();
                    g050Var.d(null);
                    return zy11.a;
                }
            }
            if (!this.l) {
            }
            g050Var = aVar;
            linkedHashMap.clear();
            g050Var.d(null);
            return zy11.a;
        } catch (Throwable th3) {
            kotlinx.coroutines.sync.a aVar3 = aVar;
            th = th3;
            g050Var = aVar3;
            g050Var.d(null);
            throw th;
        }
        placesMapSocialPinsRepository$clearMapObjects$1 = new PlacesMapSocialPinsRepository$clearMapObjects$1(this, continuationImpl);
        Object obj2 = placesMapSocialPinsRepository$clearMapObjects$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesMapSocialPinsRepository$clearMapObjects$1.label;
        LinkedHashMap linkedHashMap2 = this.e;
        if (i != 0) {
        }
    }

    @Override // com.yandex.go.places.map.data.repositories.g
    public final void k() {
        tje.N(this.j, null, null, new PlacesMapSocialPinsRepository$hideMapObjects$1(this, null), 3);
    }

    @Override // com.yandex.go.places.map.data.repositories.g
    public final Object m(ContinuationImpl continuationImpl) {
        return this.i.emit(c5t0.a, continuationImpl);
    }

    @Override // com.yandex.go.places.map.data.repositories.g
    public final Object n(in00 in00Var) {
        return new f5t0(in00Var);
    }

    @Override // com.yandex.go.places.map.data.repositories.g
    public final void p(kn00 kn00Var) {
        tje.N(this.j, null, null, new PlacesMapSocialPinsRepository$removeMapObject$1(this, kn00Var, null), 3);
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
        PlacesMapSocialPinsRepository$removeMapObjectsByIds$1 placesMapSocialPinsRepository$removeMapObjectsByIds$1;
        int i;
        Iterator it;
        if (continuationImpl instanceof PlacesMapSocialPinsRepository$removeMapObjectsByIds$1) {
            placesMapSocialPinsRepository$removeMapObjectsByIds$1 = (PlacesMapSocialPinsRepository$removeMapObjectsByIds$1) continuationImpl;
            int i2 = placesMapSocialPinsRepository$removeMapObjectsByIds$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                placesMapSocialPinsRepository$removeMapObjectsByIds$1.label = i2 - Integer.MIN_VALUE;
                Object obj = placesMapSocialPinsRepository$removeMapObjectsByIds$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placesMapSocialPinsRepository$removeMapObjectsByIds$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!set.isEmpty()) {
                        this.a.getClass();
                        sjh sjhVar = uyj.a;
                        PlacesMapSocialPinsRepository$removeMapObjectsByIds$emits$1 placesMapSocialPinsRepository$removeMapObjectsByIds$emits$1 = new PlacesMapSocialPinsRepository$removeMapObjectsByIds$emits$1(this, set, null);
                        placesMapSocialPinsRepository$removeMapObjectsByIds$1.L$0 = null;
                        placesMapSocialPinsRepository$removeMapObjectsByIds$1.label = 1;
                        obj = tje.k0(sjhVar, placesMapSocialPinsRepository$removeMapObjectsByIds$emits$1, placesMapSocialPinsRepository$removeMapObjectsByIds$1);
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (Iterator) placesMapSocialPinsRepository$removeMapObjectsByIds$1.L$3;
                    kotlin.b.b(obj);
                    while (it.hasNext()) {
                        j5t0 j5t0Var = (j5t0) it.next();
                        placesMapSocialPinsRepository$removeMapObjectsByIds$1.L$0 = null;
                        placesMapSocialPinsRepository$removeMapObjectsByIds$1.L$1 = null;
                        placesMapSocialPinsRepository$removeMapObjectsByIds$1.L$2 = null;
                        placesMapSocialPinsRepository$removeMapObjectsByIds$1.L$3 = it;
                        placesMapSocialPinsRepository$removeMapObjectsByIds$1.L$4 = null;
                        placesMapSocialPinsRepository$removeMapObjectsByIds$1.L$5 = null;
                        placesMapSocialPinsRepository$removeMapObjectsByIds$1.label = 2;
                        if (this.i.emit(j5t0Var, placesMapSocialPinsRepository$removeMapObjectsByIds$1) == coroutineSingletons) {
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
        placesMapSocialPinsRepository$removeMapObjectsByIds$1 = new PlacesMapSocialPinsRepository$removeMapObjectsByIds$1(this, continuationImpl);
        Object obj2 = placesMapSocialPinsRepository$removeMapObjectsByIds$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesMapSocialPinsRepository$removeMapObjectsByIds$1.label;
        if (i != 0) {
        }
        it = ((List) obj2).iterator();
        while (it.hasNext()) {
        }
        return zy11.a;
    }

    @Override // com.yandex.go.places.map.data.repositories.g
    public final Object t(in00 in00Var, boolean z) {
        return new g5t0(in00Var, z);
    }

    @Override // com.yandex.go.places.map.data.repositories.g
    public final Object v(List list, Continuation continuation) {
        return H(list, (ContinuationImpl) continuation, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        if (r7.i.emit(r8, r0) != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0055, code lost:
    
        if (r2.a(r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object y(ContinuationImpl continuationImpl) {
        PlacesMapSocialPinsRepository$loadMapObjects$1 placesMapSocialPinsRepository$loadMapObjects$1;
        int i;
        g050 g050Var;
        try {
            if (continuationImpl instanceof PlacesMapSocialPinsRepository$loadMapObjects$1) {
                placesMapSocialPinsRepository$loadMapObjects$1 = (PlacesMapSocialPinsRepository$loadMapObjects$1) continuationImpl;
                int i2 = placesMapSocialPinsRepository$loadMapObjects$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    placesMapSocialPinsRepository$loadMapObjects$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = placesMapSocialPinsRepository$loadMapObjects$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = placesMapSocialPinsRepository$loadMapObjects$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        g050Var = this.d;
                        placesMapSocialPinsRepository$loadMapObjects$1.L$0 = g050Var;
                        placesMapSocialPinsRepository$loadMapObjects$1.label = 1;
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
                            kotlin.b.b(obj);
                            placesMapSocialPinsRepository$loadMapObjects$1.L$0 = null;
                            placesMapSocialPinsRepository$loadMapObjects$1.label = 3;
                            Object s = s(placesMapSocialPinsRepository$loadMapObjects$1);
                            return s == obj2 ? obj2 : s;
                        }
                        g050Var = (g050) placesMapSocialPinsRepository$loadMapObjects$1.L$0;
                        kotlin.b.b(obj);
                    }
                    e5t0 e5t0Var = new e5t0(kotlin.collections.a.J0(this.e.values()));
                    g050Var.d(null);
                    placesMapSocialPinsRepository$loadMapObjects$1.L$0 = null;
                    placesMapSocialPinsRepository$loadMapObjects$1.label = 2;
                }
            }
            e5t0 e5t0Var2 = new e5t0(kotlin.collections.a.J0(this.e.values()));
            g050Var.d(null);
            placesMapSocialPinsRepository$loadMapObjects$1.L$0 = null;
            placesMapSocialPinsRepository$loadMapObjects$1.label = 2;
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
        placesMapSocialPinsRepository$loadMapObjects$1 = new PlacesMapSocialPinsRepository$loadMapObjects$1(this, continuationImpl);
        Object obj3 = placesMapSocialPinsRepository$loadMapObjects$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesMapSocialPinsRepository$loadMapObjects$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object z(ContinuationImpl continuationImpl) {
        PlacesMapSocialPinsRepository$removeMapObjects$1 placesMapSocialPinsRepository$removeMapObjects$1;
        int i;
        g050 g050Var;
        try {
            if (continuationImpl instanceof PlacesMapSocialPinsRepository$removeMapObjects$1) {
                placesMapSocialPinsRepository$removeMapObjects$1 = (PlacesMapSocialPinsRepository$removeMapObjects$1) continuationImpl;
                int i2 = placesMapSocialPinsRepository$removeMapObjects$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    placesMapSocialPinsRepository$removeMapObjects$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = placesMapSocialPinsRepository$removeMapObjects$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = placesMapSocialPinsRepository$removeMapObjects$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        kotlinx.coroutines.sync.a aVar = this.d;
                        placesMapSocialPinsRepository$removeMapObjects$1.L$0 = aVar;
                        placesMapSocialPinsRepository$removeMapObjects$1.label = 1;
                        if (aVar.a(placesMapSocialPinsRepository$removeMapObjects$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        g050Var = aVar;
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) placesMapSocialPinsRepository$removeMapObjects$1.L$0;
                        kotlin.b.b(obj);
                    }
                    this.e.clear();
                    g050Var.d(null);
                    return zy11.a;
                }
            }
            this.e.clear();
            g050Var.d(null);
            return zy11.a;
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
        placesMapSocialPinsRepository$removeMapObjects$1 = new PlacesMapSocialPinsRepository$removeMapObjects$1(this, continuationImpl);
        Object obj2 = placesMapSocialPinsRepository$removeMapObjects$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesMapSocialPinsRepository$removeMapObjects$1.label;
        if (i != 0) {
        }
    }
}
