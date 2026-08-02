package com.yandex.go.litert.service;

import com.yandex.go.dynamic.api.DynamicFeature;
import com.yandex.go.litert.api.error.LiteRtServiceException;
import com.yandex.go.litert.contract.LiteRtDynamicApi;
import defpackage.ac20;
import defpackage.b8n;
import defpackage.c8n;
import defpackage.d8n;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.i7n;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.rol0;
import defpackage.y7n;
import defpackage.yuy;
import defpackage.zuy;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.b;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.analytics.q;

/* loaded from: classes12.dex */
public final class a implements zuy {
    public final i7n a;
    public final yuy b;
    public volatile LiteRtDynamicApi c;
    public final kotlinx.coroutines.sync.a d = gtq0.a();

    public a(i7n i7nVar, yuy yuyVar) {
        this.a = i7nVar;
        this.b = yuyVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0058, code lost:
    
        if (r8.a(r0) == r1) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0060 A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:26:0x005b, B:29:0x0060, B:31:0x0071, B:32:0x0087, B:34:0x008b, B:38:0x00a3, B:39:0x00a8), top: B:25:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v12, types: [g050] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.yandex.go.litert.service.a] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v15, types: [g050] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v8, types: [g050] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        LiteRtServiceImpl$getReadyApi$1 liteRtServiceImpl$getReadyApi$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        Throwable th;
        ?? r7;
        LiteRtDynamicApi liteRtDynamicApi;
        try {
            if (continuationImpl instanceof LiteRtServiceImpl$getReadyApi$1) {
                liteRtServiceImpl$getReadyApi$1 = (LiteRtServiceImpl$getReadyApi$1) continuationImpl;
                int i2 = liteRtServiceImpl$getReadyApi$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    liteRtServiceImpl$getReadyApi$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = liteRtServiceImpl$getReadyApi$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = liteRtServiceImpl$getReadyApi$1.label;
                    if (i != 0) {
                        b.b(obj);
                        LiteRtDynamicApi liteRtDynamicApi2 = this.c;
                        if (liteRtDynamicApi2 != null) {
                            return liteRtDynamicApi2;
                        }
                        aVar = this.d;
                        liteRtServiceImpl$getReadyApi$1.L$0 = aVar;
                        liteRtServiceImpl$getReadyApi$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            r7 = (g050) liteRtServiceImpl$getReadyApi$1.L$0;
                            try {
                                b.b(obj);
                                r7 = r7;
                                liteRtDynamicApi = (LiteRtDynamicApi) obj;
                                aVar = r7;
                                aVar.d(null);
                                return liteRtDynamicApi;
                            } catch (Throwable th2) {
                                th = th2;
                                r7.d(null);
                                throw th;
                            }
                        }
                        ?? r2 = (g050) liteRtServiceImpl$getReadyApi$1.L$0;
                        b.b(obj);
                        aVar = r2;
                    }
                    liteRtDynamicApi = this.c;
                    if (liteRtDynamicApi != null) {
                        i7n i7nVar = this.a;
                        DynamicFeature dynamicFeature = DynamicFeature.LITERT;
                        ((com.yandex.go.dynamic.impl.b) i7nVar).getClass();
                        d8n n = com.yandex.go.dynamic.impl.b.n(dynamicFeature);
                        if (!(n instanceof b8n)) {
                            if (n instanceof c8n) {
                                throw new LiteRtServiceException.FeatureUnavailable();
                            }
                            liteRtServiceImpl$getReadyApi$1.L$0 = aVar;
                            liteRtServiceImpl$getReadyApi$1.L$1 = null;
                            liteRtServiceImpl$getReadyApi$1.label = 2;
                            Object c = c(liteRtServiceImpl$getReadyApi$1);
                            if (c != coroutineSingletons) {
                                kotlinx.coroutines.sync.a aVar2 = aVar;
                                obj = c;
                                r7 = aVar2;
                                liteRtDynamicApi = (LiteRtDynamicApi) obj;
                                aVar = r7;
                            }
                            return coroutineSingletons;
                        }
                        this.c = (LiteRtDynamicApi) ((b8n) n).a;
                        liteRtDynamicApi = (LiteRtDynamicApi) ((b8n) n).a;
                    }
                    aVar.d(null);
                    return liteRtDynamicApi;
                }
            }
            liteRtDynamicApi = this.c;
            if (liteRtDynamicApi != null) {
            }
            aVar.d(null);
            return liteRtDynamicApi;
        } catch (Throwable th3) {
            kotlinx.coroutines.sync.a aVar3 = aVar;
            th = th3;
            r7 = aVar3;
            r7.d(null);
            throw th;
        }
        liteRtServiceImpl$getReadyApi$1 = new LiteRtServiceImpl$getReadyApi$1(this, continuationImpl);
        Object obj2 = liteRtServiceImpl$getReadyApi$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = liteRtServiceImpl$getReadyApi$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        LiteRtServiceImpl$loadAndAwaitReady$1 liteRtServiceImpl$loadAndAwaitReady$1;
        int i;
        try {
            if (continuationImpl instanceof LiteRtServiceImpl$loadAndAwaitReady$1) {
                liteRtServiceImpl$loadAndAwaitReady$1 = (LiteRtServiceImpl$loadAndAwaitReady$1) continuationImpl;
                int i2 = liteRtServiceImpl$loadAndAwaitReady$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    liteRtServiceImpl$loadAndAwaitReady$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = liteRtServiceImpl$loadAndAwaitReady$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = liteRtServiceImpl$loadAndAwaitReady$1.label;
                    if (i != 0) {
                        b.b(obj);
                        liteRtServiceImpl$loadAndAwaitReady$1.label = 1;
                        if (a(liteRtServiceImpl$loadAndAwaitReady$1) == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                    }
                    return zy11.a;
                }
            }
            if (i != 0) {
            }
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        liteRtServiceImpl$loadAndAwaitReady$1 = new LiteRtServiceImpl$loadAndAwaitReady$1(this, continuationImpl);
        Object obj3 = liteRtServiceImpl$loadAndAwaitReady$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = liteRtServiceImpl$loadAndAwaitReady$1.label;
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0041: MOVE (r1 I:??[long, double]) = (r6 I:??[long, double]), block:B:59:0x0041 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0094 A[Catch: all -> 0x0031, CancellationException -> 0x0112, TryCatch #1 {all -> 0x0031, blocks: (B:13:0x002d, B:14:0x008e, B:16:0x0094, B:19:0x00ae, B:21:0x00b2, B:23:0x00b6, B:24:0x00bb, B:25:0x00bc, B:26:0x00c8, B:27:0x00c9, B:28:0x00d2), top: B:12:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ae A[Catch: all -> 0x0031, CancellationException -> 0x0112, TryCatch #1 {all -> 0x0031, blocks: (B:13:0x002d, B:14:0x008e, B:16:0x0094, B:19:0x00ae, B:21:0x00b2, B:23:0x00b6, B:24:0x00bb, B:25:0x00bc, B:26:0x00c8, B:27:0x00c9, B:28:0x00d2), top: B:12:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0064 A[Catch: all -> 0x0040, CancellationException -> 0x0112, TryCatch #0 {all -> 0x0040, blocks: (B:45:0x003c, B:46:0x0060, B:48:0x0064, B:50:0x0071, B:55:0x004b), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0071 A[Catch: all -> 0x0040, CancellationException -> 0x0112, TRY_LEAVE, TryCatch #0 {all -> 0x0040, blocks: (B:45:0x003c, B:46:0x0060, B:48:0x0064, B:50:0x0071, B:55:0x004b), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        LiteRtServiceImpl$loadReadyApi$1 liteRtServiceImpl$loadReadyApi$1;
        int i;
        long j;
        long j2;
        long nanoTime;
        LiteRtDynamicApi liteRtDynamicApi;
        d8n d8nVar;
        try {
            try {
                if (continuationImpl instanceof LiteRtServiceImpl$loadReadyApi$1) {
                    liteRtServiceImpl$loadReadyApi$1 = (LiteRtServiceImpl$loadReadyApi$1) continuationImpl;
                    int i2 = liteRtServiceImpl$loadReadyApi$1.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        liteRtServiceImpl$loadReadyApi$1.label = i2 - Integer.MIN_VALUE;
                        Object obj = liteRtServiceImpl$loadReadyApi$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = liteRtServiceImpl$loadReadyApi$1.label;
                        if (i != 0) {
                            b.b(obj);
                            nanoTime = System.nanoTime();
                            qoh p = ((com.yandex.go.dynamic.impl.b) this.a).p(DynamicFeature.LITERT);
                            liteRtServiceImpl$loadReadyApi$1.J$0 = nanoTime;
                            liteRtServiceImpl$loadReadyApi$1.label = 1;
                            obj = p.s(liteRtServiceImpl$loadReadyApi$1);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                j2 = liteRtServiceImpl$loadReadyApi$1.J$0;
                                try {
                                    b.b(obj);
                                    d8nVar = (d8n) obj;
                                    if (!(d8nVar instanceof b8n)) {
                                        this.c = (LiteRtDynamicApi) ((b8n) d8nVar).a;
                                        this.b.a(System.nanoTime() - j2);
                                        return (LiteRtDynamicApi) ((b8n) d8nVar).a;
                                    }
                                    if (d8nVar instanceof y7n) {
                                        throw new LiteRtServiceException.FeatureLoadingFailed(((y7n) d8nVar).a);
                                    }
                                    if (d8nVar instanceof c8n) {
                                        throw new LiteRtServiceException.FeatureUnavailable();
                                    }
                                    throw new LiteRtServiceException.FeatureLoadingFailed(new IllegalStateException("LiteRT dynamic feature is not ready after download attempt"));
                                } catch (Throwable th) {
                                    th = th;
                                    yuy yuyVar = this.b;
                                    long nanoTime2 = System.nanoTime() - j2;
                                    ac20 ac20Var = yuyVar.a;
                                    MapBuilder mapBuilder = new MapBuilder();
                                    mapBuilder.put("failure_kind", !(th instanceof LiteRtServiceException.FeatureUnavailable) ? !(th instanceof LiteRtServiceException.FeatureLoadingFailed) ? th instanceof LiteRtServiceException.ModelFileMissing ? "model_file_missing" : "unknown" : "feature_loading_failed" : "feature_unavailable");
                                    mapBuilder.put("total_ns", Long.valueOf(nanoTime2));
                                    ((q) ac20Var).d("Perf.LiteRt.FeatureLoad.Failure", mapBuilder.j());
                                    throw th;
                                }
                            }
                            nanoTime = liteRtServiceImpl$loadReadyApi$1.J$0;
                            b.b(obj);
                        }
                        liteRtDynamicApi = (LiteRtDynamicApi) obj;
                        if (liteRtDynamicApi == null) {
                            this.c = liteRtDynamicApi;
                            this.b.a(System.nanoTime() - nanoTime);
                            return liteRtDynamicApi;
                        }
                        rol0 j3 = ((com.yandex.go.dynamic.impl.b) this.a).j(DynamicFeature.LITERT);
                        LiteRtServiceImpl$loadReadyApi$2$finalState$1 liteRtServiceImpl$loadReadyApi$2$finalState$1 = new LiteRtServiceImpl$loadReadyApi$2$finalState$1(2, null);
                        liteRtServiceImpl$loadReadyApi$1.L$0 = null;
                        liteRtServiceImpl$loadReadyApi$1.J$0 = nanoTime;
                        liteRtServiceImpl$loadReadyApi$1.label = 2;
                        obj = e.x(j3, liteRtServiceImpl$loadReadyApi$2$finalState$1, liteRtServiceImpl$loadReadyApi$1);
                        if (obj != coroutineSingletons) {
                            j2 = nanoTime;
                            d8nVar = (d8n) obj;
                            if (!(d8nVar instanceof b8n)) {
                            }
                        }
                        return coroutineSingletons;
                    }
                }
                if (i != 0) {
                }
                liteRtDynamicApi = (LiteRtDynamicApi) obj;
                if (liteRtDynamicApi == null) {
                }
            } catch (Throwable th2) {
                th = th2;
                j2 = j;
            }
        } catch (CancellationException e) {
            throw e;
        }
        liteRtServiceImpl$loadReadyApi$1 = new LiteRtServiceImpl$loadReadyApi$1(this, continuationImpl);
        Object obj2 = liteRtServiceImpl$loadReadyApi$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = liteRtServiceImpl$loadReadyApi$1.label;
    }
}
