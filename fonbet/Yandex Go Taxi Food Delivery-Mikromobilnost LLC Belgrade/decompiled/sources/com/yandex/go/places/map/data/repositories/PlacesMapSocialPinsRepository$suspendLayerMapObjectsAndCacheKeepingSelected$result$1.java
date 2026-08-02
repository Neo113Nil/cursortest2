package com.yandex.go.places.map.data.repositories;

import defpackage.g050;
import defpackage.g5t0;
import defpackage.i5t0;
import defpackage.in00;
import defpackage.jl40;
import defpackage.kn00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pbc0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lpbc0;", "<anonymous>", "(Ltse;)Lpbc0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.map.data.repositories.PlacesMapSocialPinsRepository$suspendLayerMapObjectsAndCacheKeepingSelected$result$1", f = "PlacesMapSocialPinsRepository.kt", l = {474, 481, 74}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PlacesMapSocialPinsRepository$suspendLayerMapObjectsAndCacheKeepingSelected$result$1 extends SuspendLambda implements wls {
    final /* synthetic */ in00 $selectedPin;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacesMapSocialPinsRepository$suspendLayerMapObjectsAndCacheKeepingSelected$result$1(i iVar, in00 in00Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
        this.$selectedPin = in00Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlacesMapSocialPinsRepository$suspendLayerMapObjectsAndCacheKeepingSelected$result$1(this.this$0, this.$selectedPin, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlacesMapSocialPinsRepository$suspendLayerMapObjectsAndCacheKeepingSelected$result$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x008a, code lost:
    
        if (r10.a(r9) == r0) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00d6 A[Catch: all -> 0x0029, TryCatch #1 {all -> 0x0029, blocks: (B:9:0x0024, B:11:0x00ba, B:12:0x00d0, B:14:0x00d6, B:17:0x00eb, B:22:0x00ef, B:24:0x00ff, B:25:0x010a), top: B:8:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ff A[Catch: all -> 0x0029, TryCatch #1 {all -> 0x0029, blocks: (B:9:0x0024, B:11:0x00ba, B:12:0x00d0, B:14:0x00d6, B:17:0x00eb, B:22:0x00ef, B:24:0x00ff, B:25:0x010a), top: B:8:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0109  */
    /* JADX WARN: Type inference failed for: r1v11, types: [g050] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [g050] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ?? r7;
        Throwable th;
        i iVar;
        in00 in00Var;
        Object obj2;
        kotlinx.coroutines.sync.a aVar;
        g050 g050Var;
        Throwable th2;
        g050 g050Var2;
        i iVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            try {
                if (i == 0) {
                    kotlin.b.b(obj);
                    iVar = this.this$0;
                    kotlinx.coroutines.sync.a aVar2 = iVar.f;
                    in00Var = this.$selectedPin;
                    this.L$0 = aVar2;
                    this.L$1 = iVar;
                    this.L$2 = in00Var;
                    this.label = 1;
                    if (aVar2.a(this) != coroutineSingletons) {
                        obj2 = aVar2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) this.L$3;
                        in00Var = (in00) this.L$2;
                        iVar2 = (i) this.L$1;
                        g050Var2 = (g050) this.L$0;
                        try {
                            kotlin.b.b(obj);
                            iVar = iVar2;
                            iVar.l = true;
                            LinkedHashMap linkedHashMap = iVar.e;
                            iVar.u(in00Var);
                            Collection values = linkedHashMap.values();
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            for (Object obj3 : values) {
                                if (!jl40.l(((kn00) obj3).getId(), in00Var.getId())) {
                                    linkedHashSet.add(obj3);
                                }
                            }
                            linkedHashMap.clear();
                            linkedHashMap.put(in00Var.getId(), in00Var);
                            pbc0 pbc0Var = new pbc0(!linkedHashSet.isEmpty() ? new i5t0(Collections.singletonList(in00Var), linkedHashSet) : null, new g5t0(in00Var, false));
                            g050Var.d(null);
                            g050Var2.d(null);
                            return pbc0Var;
                        } catch (Throwable th3) {
                            th2 = th3;
                            g050Var.d(null);
                            throw th2;
                        }
                    }
                    ?? r1 = (g050) this.L$3;
                    in00 in00Var2 = (in00) this.L$2;
                    iVar = (i) this.L$1;
                    g050 g050Var3 = (g050) this.L$0;
                    kotlin.b.b(obj);
                    aVar = r1;
                    in00Var = in00Var2;
                    r7 = g050Var3;
                    try {
                        boolean z = iVar.l;
                        LinkedHashMap linkedHashMap2 = iVar.e;
                        if (z || linkedHashMap2.isEmpty()) {
                            g050Var = aVar;
                            g050Var2 = r7;
                            iVar.l = true;
                            LinkedHashMap linkedHashMap3 = iVar.e;
                            iVar.u(in00Var);
                            Collection values2 = linkedHashMap3.values();
                            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                            while (r2.hasNext()) {
                            }
                            linkedHashMap3.clear();
                            linkedHashMap3.put(in00Var.getId(), in00Var);
                            pbc0 pbc0Var2 = new pbc0(!linkedHashSet2.isEmpty() ? new i5t0(Collections.singletonList(in00Var), linkedHashSet2) : null, new g5t0(in00Var, false));
                            g050Var.d(null);
                            g050Var2.d(null);
                            return pbc0Var2;
                        }
                        com.yandex.go.places.impl.data.repositories.map.a aVar3 = iVar.k;
                        this.L$0 = r7;
                        this.L$1 = iVar;
                        this.L$2 = in00Var;
                        this.L$3 = aVar;
                        this.L$4 = null;
                        this.label = 3;
                        if (aVar3.c(linkedHashMap2, this) != coroutineSingletons) {
                            g050Var = aVar;
                            iVar2 = iVar;
                            g050Var2 = r7;
                            iVar = iVar2;
                            iVar.l = true;
                            LinkedHashMap linkedHashMap32 = iVar.e;
                            iVar.u(in00Var);
                            Collection values22 = linkedHashMap32.values();
                            LinkedHashSet linkedHashSet22 = new LinkedHashSet();
                            while (r2.hasNext()) {
                            }
                            linkedHashMap32.clear();
                            linkedHashMap32.put(in00Var.getId(), in00Var);
                            pbc0 pbc0Var22 = new pbc0(!linkedHashSet22.isEmpty() ? new i5t0(Collections.singletonList(in00Var), linkedHashSet22) : null, new g5t0(in00Var, false));
                            g050Var.d(null);
                            g050Var2.d(null);
                            return pbc0Var22;
                        }
                        return coroutineSingletons;
                    } catch (Throwable th4) {
                        g050Var = aVar;
                        th2 = th4;
                        g050Var.d(null);
                        throw th2;
                    }
                }
                in00Var = (in00) this.L$2;
                iVar = (i) this.L$1;
                Object obj4 = (g050) this.L$0;
                kotlin.b.b(obj);
                obj2 = obj4;
                aVar = iVar.d;
                this.L$0 = obj2;
                this.L$1 = iVar;
                this.L$2 = in00Var;
                this.L$3 = aVar;
                this.L$4 = null;
                this.label = 2;
                r7 = obj2;
            } catch (Throwable th5) {
                th = th5;
                r7.d(null);
                throw th;
            }
        } catch (Throwable th6) {
            r7 = this;
            th = th6;
            r7.d(null);
            throw th;
        }
    }
}
