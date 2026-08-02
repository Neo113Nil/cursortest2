package com.yandex.go.places.map.data.repositories;

import defpackage.g050;
import defpackage.i5t0;
import defpackage.kn00;
import defpackage.mbc0;
import defpackage.mvg;
import defpackage.nbc0;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lobc0;", "<anonymous>", "(Ltse;)Lobc0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.map.data.repositories.PlacesMapSocialPinsRepository$resumeLayerMapObjectsFromCache$result$1", f = "PlacesMapSocialPinsRepository.kt", l = {474, 481, 113}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PlacesMapSocialPinsRepository$resumeLayerMapObjectsFromCache$result$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacesMapSocialPinsRepository$resumeLayerMapObjectsFromCache$result$1(i iVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlacesMapSocialPinsRepository$resumeLayerMapObjectsFromCache$result$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlacesMapSocialPinsRepository$resumeLayerMapObjectsFromCache$result$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d6 A[Catch: all -> 0x0029, TryCatch #2 {all -> 0x0029, blocks: (B:9:0x0024, B:10:0x00a4, B:13:0x00ac, B:15:0x00b2, B:20:0x00b5, B:21:0x00d0, B:23:0x00d6, B:26:0x00e7, B:31:0x00eb, B:33:0x00f1, B:37:0x0109, B:39:0x00fa), top: B:8:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a0  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2, types: [g050] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        i iVar;
        Object obj2;
        i iVar2;
        g050 g050Var;
        Object b;
        List list;
        i iVar3;
        g050 g050Var2;
        Map map;
        boolean z;
        i5t0 i5t0Var;
        Object nbc0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        ?? r4 = 1;
        try {
            try {
                if (i == 0) {
                    kotlin.b.b(obj);
                    iVar = this.this$0;
                    kotlinx.coroutines.sync.a aVar = iVar.f;
                    this.L$0 = aVar;
                    this.L$1 = iVar;
                    this.label = 1;
                    if (aVar.a(this) != coroutineSingletons) {
                        obj2 = aVar;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        list = (List) this.L$4;
                        g050Var = (g050) this.L$2;
                        iVar3 = (i) this.L$1;
                        g050Var2 = (g050) this.L$0;
                        try {
                            kotlin.b.b(obj);
                            map = (Map) obj;
                            z = iVar3.l;
                            LinkedHashMap linkedHashMap = iVar3.e;
                            if (z && map.isEmpty()) {
                                nbc0Var = mbc0.a;
                            } else {
                                iVar3.l = false;
                                iVar3.u(null);
                                linkedHashMap.clear();
                                linkedHashMap.putAll(map);
                                Set keySet = map.keySet();
                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                for (Object obj3 : list) {
                                    if (!keySet.contains(((kn00) obj3).getId())) {
                                        linkedHashSet.add(obj3);
                                    }
                                }
                                if (map.isEmpty() && linkedHashSet.isEmpty()) {
                                    i5t0Var = null;
                                    nbc0Var = new nbc0(i5t0Var);
                                }
                                i5t0Var = new i5t0(kotlin.collections.a.J0(linkedHashMap.values()), linkedHashSet);
                                nbc0Var = new nbc0(i5t0Var);
                            }
                            g050Var.d(null);
                            g050Var2.d(null);
                            return nbc0Var;
                        } catch (Throwable th2) {
                            th = th2;
                            g050Var.d(null);
                            throw th;
                        }
                    }
                    g050Var = (g050) this.L$2;
                    iVar2 = (i) this.L$1;
                    g050 g050Var3 = (g050) this.L$0;
                    kotlin.b.b(obj);
                    r4 = g050Var3;
                    try {
                        List J0 = kotlin.collections.a.J0(iVar2.e.values());
                        com.yandex.go.places.impl.data.repositories.map.a aVar2 = iVar2.k;
                        this.L$0 = r4;
                        this.L$1 = iVar2;
                        this.L$2 = g050Var;
                        this.L$3 = null;
                        this.L$4 = J0;
                        this.label = 3;
                        b = aVar2.b(this);
                        if (b != coroutineSingletons) {
                            list = J0;
                            iVar3 = iVar2;
                            obj = b;
                            g050Var2 = r4;
                            map = (Map) obj;
                            z = iVar3.l;
                            LinkedHashMap linkedHashMap2 = iVar3.e;
                            if (z) {
                            }
                            iVar3.l = false;
                            iVar3.u(null);
                            linkedHashMap2.clear();
                            linkedHashMap2.putAll(map);
                            Set keySet2 = map.keySet();
                            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                            while (r0.hasNext()) {
                            }
                            if (map.isEmpty()) {
                                i5t0Var = null;
                                nbc0Var = new nbc0(i5t0Var);
                                g050Var.d(null);
                                g050Var2.d(null);
                                return nbc0Var;
                            }
                            i5t0Var = new i5t0(kotlin.collections.a.J0(linkedHashMap2.values()), linkedHashSet2);
                            nbc0Var = new nbc0(i5t0Var);
                            g050Var.d(null);
                            g050Var2.d(null);
                            return nbc0Var;
                        }
                        return coroutineSingletons;
                    } catch (Throwable th3) {
                        th = th3;
                        g050Var.d(null);
                        throw th;
                    }
                }
                iVar = (i) this.L$1;
                Object obj4 = (g050) this.L$0;
                kotlin.b.b(obj);
                obj2 = obj4;
                kotlinx.coroutines.sync.a aVar3 = iVar.d;
                this.L$0 = obj2;
                this.L$1 = iVar;
                this.L$2 = aVar3;
                this.L$3 = null;
                this.label = 2;
                if (aVar3.a(this) != coroutineSingletons) {
                    iVar2 = iVar;
                    g050Var = aVar3;
                    r4 = obj2;
                    List J02 = kotlin.collections.a.J0(iVar2.e.values());
                    com.yandex.go.places.impl.data.repositories.map.a aVar22 = iVar2.k;
                    this.L$0 = r4;
                    this.L$1 = iVar2;
                    this.L$2 = g050Var;
                    this.L$3 = null;
                    this.L$4 = J02;
                    this.label = 3;
                    b = aVar22.b(this);
                    if (b != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            } catch (Throwable th4) {
                th = th4;
                r4.d(null);
                throw th;
            }
        } catch (Throwable th5) {
            r4 = this;
            th = th5;
            r4.d(null);
            throw th;
        }
    }
}
