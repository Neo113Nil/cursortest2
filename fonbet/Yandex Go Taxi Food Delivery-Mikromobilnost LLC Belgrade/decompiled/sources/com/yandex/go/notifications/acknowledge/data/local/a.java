package com.yandex.go.notifications.acknowledge.data.local;

import com.adjust.sdk.Constants;
import com.yandex.go.notifications.acknowledge.data.model.PushAckParam;
import com.yandex.go.notifications.acknowledge.data.model.PushAckParams;
import com.yandex.go.utils.storage.json.b;
import defpackage.am2;
import defpackage.auu0;
import defpackage.eex;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.k8u;
import defpackage.ny61;
import defpackage.v4r0;
import defpackage.zy11;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class a {
    public final b a;
    public final kotlinx.coroutines.sync.a b;

    public a(eex eexVar) {
        Map f = kotlin.collections.b.f();
        am2 am2Var = new am2(Constants.PUSH, "push_ack_params.json", f);
        auu0 auu0Var = auu0.a;
        KSerializer serializer = PushAckParams.Companion.serializer();
        eexVar.getClass();
        this.a = eexVar.c(am2Var, new k8u(auu0Var, serializer, 1));
        this.b = gtq0.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bf, code lost:
    
        if (r3.d(r2, r0) == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0075, code lost:
    
        if (r8.a(r0) == r1) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0096 A[Catch: all -> 0x0045, TryCatch #0 {all -> 0x0045, blocks: (B:13:0x0040, B:20:0x0056, B:21:0x0085, B:23:0x0096, B:25:0x009c, B:26:0x00a5, B:29:0x00a1, B:32:0x0078), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009c A[Catch: all -> 0x0045, TryCatch #0 {all -> 0x0045, blocks: (B:13:0x0040, B:20:0x0056, B:21:0x0085, B:23:0x0096, B:25:0x009c, B:26:0x00a5, B:29:0x00a1, B:32:0x0078), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a1 A[Catch: all -> 0x0045, TryCatch #0 {all -> 0x0045, blocks: (B:13:0x0040, B:20:0x0056, B:21:0x0085, B:23:0x0096, B:25:0x009c, B:26:0x00a5, B:29:0x00a1, B:32:0x0078), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PushAckParam pushAckParam, ContinuationImpl continuationImpl) {
        PushAckParamStorage$addParam$1 pushAckParamStorage$addParam$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        g050 g050Var;
        try {
            if (continuationImpl instanceof PushAckParamStorage$addParam$1) {
                pushAckParamStorage$addParam$1 = (PushAckParamStorage$addParam$1) continuationImpl;
                int i2 = pushAckParamStorage$addParam$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    pushAckParamStorage$addParam$1.label = i2 - Integer.MIN_VALUE;
                    obj = pushAckParamStorage$addParam$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = pushAckParamStorage$addParam$1.label;
                    b bVar = this.a;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        pushAckParamStorage$addParam$1.L$0 = pushAckParam;
                        g050Var = this.b;
                        pushAckParamStorage$addParam$1.L$1 = g050Var;
                        pushAckParamStorage$addParam$1.label = 1;
                    } else if (i == 1) {
                        g050Var = (g050) pushAckParamStorage$addParam$1.L$1;
                        pushAckParam = (PushAckParam) pushAckParamStorage$addParam$1.L$0;
                        kotlin.b.b(obj);
                    } else {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            g050Var = (g050) pushAckParamStorage$addParam$1.L$1;
                            kotlin.b.b(obj);
                            g050Var.d(null);
                            return zy11.a;
                        }
                        g050Var = (g050) pushAckParamStorage$addParam$1.L$1;
                        pushAckParam = (PushAckParam) pushAckParamStorage$addParam$1.L$0;
                        kotlin.b.b(obj);
                        LinkedHashMap linkedHashMap = new LinkedHashMap((Map) obj);
                        PushAckParams pushAckParams = (PushAckParams) linkedHashMap.get(pushAckParam.b);
                        Set set = pushAckParams != null ? pushAckParams.a : null;
                        linkedHashMap.put(pushAckParam.b, new PushAckParams(set != null ? v4r0.i(set, pushAckParam) : Collections.singleton(pushAckParam)));
                        pushAckParamStorage$addParam$1.L$0 = null;
                        pushAckParamStorage$addParam$1.L$1 = g050Var;
                        pushAckParamStorage$addParam$1.L$2 = null;
                        pushAckParamStorage$addParam$1.L$3 = null;
                        pushAckParamStorage$addParam$1.L$4 = null;
                        pushAckParamStorage$addParam$1.label = 3;
                    }
                    pushAckParamStorage$addParam$1.L$0 = pushAckParam;
                    pushAckParamStorage$addParam$1.L$1 = g050Var;
                    pushAckParamStorage$addParam$1.label = 2;
                    obj = bVar.a(pushAckParamStorage$addParam$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap((Map) obj);
                    PushAckParams pushAckParams2 = (PushAckParams) linkedHashMap2.get(pushAckParam.b);
                    if (pushAckParams2 != null) {
                    }
                    linkedHashMap2.put(pushAckParam.b, new PushAckParams(set != null ? v4r0.i(set, pushAckParam) : Collections.singleton(pushAckParam)));
                    pushAckParamStorage$addParam$1.L$0 = null;
                    pushAckParamStorage$addParam$1.L$1 = g050Var;
                    pushAckParamStorage$addParam$1.L$2 = null;
                    pushAckParamStorage$addParam$1.L$3 = null;
                    pushAckParamStorage$addParam$1.L$4 = null;
                    pushAckParamStorage$addParam$1.label = 3;
                }
            }
            if (i != 0) {
            }
            pushAckParamStorage$addParam$1.L$0 = pushAckParam;
            pushAckParamStorage$addParam$1.L$1 = g050Var;
            pushAckParamStorage$addParam$1.label = 2;
            obj = bVar.a(pushAckParamStorage$addParam$1);
            if (obj == coroutineSingletons) {
            }
            LinkedHashMap linkedHashMap22 = new LinkedHashMap((Map) obj);
            PushAckParams pushAckParams22 = (PushAckParams) linkedHashMap22.get(pushAckParam.b);
            if (pushAckParams22 != null) {
            }
            linkedHashMap22.put(pushAckParam.b, new PushAckParams(set != null ? v4r0.i(set, pushAckParam) : Collections.singleton(pushAckParam)));
            pushAckParamStorage$addParam$1.L$0 = null;
            pushAckParamStorage$addParam$1.L$1 = g050Var;
            pushAckParamStorage$addParam$1.L$2 = null;
            pushAckParamStorage$addParam$1.L$3 = null;
            pushAckParamStorage$addParam$1.L$4 = null;
            pushAckParamStorage$addParam$1.label = 3;
        } catch (Throwable th) {
            d(null);
            throw th;
        }
        pushAckParamStorage$addParam$1 = new PushAckParamStorage$addParam$1(this, continuationImpl);
        obj = pushAckParamStorage$addParam$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pushAckParamStorage$addParam$1.label;
        b bVar2 = this.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x004d, code lost:
    
        if (r8.a(r0) == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v3, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        PushAckParamStorage$getAll$1 pushAckParamStorage$getAll$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        kotlinx.coroutines.sync.a aVar;
        Throwable th;
        g050 g050Var;
        Object a;
        try {
            if (continuationImpl instanceof PushAckParamStorage$getAll$1) {
                pushAckParamStorage$getAll$1 = (PushAckParamStorage$getAll$1) continuationImpl;
                int i2 = pushAckParamStorage$getAll$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    pushAckParamStorage$getAll$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = pushAckParamStorage$getAll$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = pushAckParamStorage$getAll$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        aVar = this.b;
                        pushAckParamStorage$getAll$1.L$0 = aVar;
                        pushAckParamStorage$getAll$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            g050Var = (g050) pushAckParamStorage$getAll$1.L$0;
                            try {
                                kotlin.b.b(obj);
                                Map map = (Map) obj;
                                g050Var.d(null);
                                return map;
                            } catch (Throwable th2) {
                                th = th2;
                                g050Var.d(null);
                                throw th;
                            }
                        }
                        ?? r2 = (g050) pushAckParamStorage$getAll$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r2;
                    }
                    b bVar = this.a;
                    pushAckParamStorage$getAll$1.L$0 = aVar;
                    pushAckParamStorage$getAll$1.label = 2;
                    a = bVar.a(pushAckParamStorage$getAll$1);
                    if (a != coroutineSingletons) {
                        kotlinx.coroutines.sync.a aVar2 = aVar;
                        obj = a;
                        g050Var = aVar2;
                        Map map2 = (Map) obj;
                        g050Var.d(null);
                        return map2;
                    }
                    return coroutineSingletons;
                }
            }
            b bVar2 = this.a;
            pushAckParamStorage$getAll$1.L$0 = aVar;
            pushAckParamStorage$getAll$1.label = 2;
            a = bVar2.a(pushAckParamStorage$getAll$1);
            if (a != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            kotlinx.coroutines.sync.a aVar3 = aVar;
            th = th3;
            g050Var = aVar3;
            g050Var.d(null);
            throw th;
        }
        pushAckParamStorage$getAll$1 = new PushAckParamStorage$getAll$1(this, continuationImpl);
        Object obj2 = pushAckParamStorage$getAll$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pushAckParamStorage$getAll$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ec, code lost:
    
        if (r3.d(r2, r0) == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x006d, code lost:
    
        if (r8.a(r0) == r1) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0094 A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:13:0x0038, B:20:0x004e, B:21:0x007f, B:22:0x008e, B:24:0x0094, B:26:0x00aa, B:27:0x00b3, B:29:0x00bb, B:31:0x00bf, B:32:0x00c7, B:34:0x00cc, B:42:0x00d3, B:38:0x00dc, B:46:0x00b1, B:48:0x00e0, B:52:0x0071), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Map map, ContinuationImpl continuationImpl) {
        PushAckParamStorage$removeParams$1 pushAckParamStorage$removeParams$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        g050 g050Var;
        Set set;
        try {
            if (continuationImpl instanceof PushAckParamStorage$removeParams$1) {
                pushAckParamStorage$removeParams$1 = (PushAckParamStorage$removeParams$1) continuationImpl;
                int i2 = pushAckParamStorage$removeParams$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    pushAckParamStorage$removeParams$1.label = i2 - Integer.MIN_VALUE;
                    obj = pushAckParamStorage$removeParams$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = pushAckParamStorage$removeParams$1.label;
                    b bVar = this.a;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        pushAckParamStorage$removeParams$1.L$0 = map;
                        g050Var = this.b;
                        pushAckParamStorage$removeParams$1.L$1 = g050Var;
                        pushAckParamStorage$removeParams$1.label = 1;
                    } else if (i == 1) {
                        g050Var = (g050) pushAckParamStorage$removeParams$1.L$1;
                        map = (Map) pushAckParamStorage$removeParams$1.L$0;
                        kotlin.b.b(obj);
                    } else {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            g050Var = (g050) pushAckParamStorage$removeParams$1.L$1;
                            kotlin.b.b(obj);
                            g050Var.d(null);
                            return zy11.a;
                        }
                        g050Var = (g050) pushAckParamStorage$removeParams$1.L$1;
                        map = (Map) pushAckParamStorage$removeParams$1.L$0;
                        kotlin.b.b(obj);
                        LinkedHashMap linkedHashMap = new LinkedHashMap((Map) obj);
                        for (Map.Entry entry : map.entrySet()) {
                            String str = (String) entry.getKey();
                            Set set2 = ((PushAckParams) entry.getValue()).a;
                            Iterable N0 = set2 != null ? kotlin.collections.a.N0(set2) : EmptySet.a;
                            PushAckParams pushAckParams = (PushAckParams) linkedHashMap.get(str);
                            Set g = (pushAckParams == null || (set = pushAckParams.a) == null) ? null : v4r0.g(set, N0);
                            Set set3 = g;
                            if (set3 != null && !set3.isEmpty()) {
                                linkedHashMap.put(str, new PushAckParams(g));
                            }
                            linkedHashMap.remove(str);
                        }
                        pushAckParamStorage$removeParams$1.L$0 = null;
                        pushAckParamStorage$removeParams$1.L$1 = g050Var;
                        pushAckParamStorage$removeParams$1.L$2 = null;
                        pushAckParamStorage$removeParams$1.label = 3;
                    }
                    pushAckParamStorage$removeParams$1.L$0 = map;
                    pushAckParamStorage$removeParams$1.L$1 = g050Var;
                    pushAckParamStorage$removeParams$1.label = 2;
                    obj = bVar.a(pushAckParamStorage$removeParams$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap((Map) obj);
                    while (r9.hasNext()) {
                    }
                    pushAckParamStorage$removeParams$1.L$0 = null;
                    pushAckParamStorage$removeParams$1.L$1 = g050Var;
                    pushAckParamStorage$removeParams$1.L$2 = null;
                    pushAckParamStorage$removeParams$1.label = 3;
                }
            }
            if (i != 0) {
            }
            pushAckParamStorage$removeParams$1.L$0 = map;
            pushAckParamStorage$removeParams$1.L$1 = g050Var;
            pushAckParamStorage$removeParams$1.label = 2;
            obj = bVar.a(pushAckParamStorage$removeParams$1);
            if (obj == coroutineSingletons) {
            }
            LinkedHashMap linkedHashMap22 = new LinkedHashMap((Map) obj);
            while (r9.hasNext()) {
            }
            pushAckParamStorage$removeParams$1.L$0 = null;
            pushAckParamStorage$removeParams$1.L$1 = g050Var;
            pushAckParamStorage$removeParams$1.L$2 = null;
            pushAckParamStorage$removeParams$1.label = 3;
        } catch (Throwable th) {
            d(null);
            throw th;
        }
        pushAckParamStorage$removeParams$1 = new PushAckParamStorage$removeParams$1(this, continuationImpl);
        obj = pushAckParamStorage$removeParams$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pushAckParamStorage$removeParams$1.label;
        b bVar2 = this.a;
    }
}
