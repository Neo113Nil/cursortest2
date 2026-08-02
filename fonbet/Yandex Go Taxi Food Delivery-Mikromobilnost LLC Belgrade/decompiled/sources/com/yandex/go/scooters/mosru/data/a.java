package com.yandex.go.scooters.mosru.data;

import com.yandex.go.scooters.mosru.api.domain.model.ScootersMosRuAuthStatus;
import com.yandex.go.scooters.mosru.data.model.ScootersMosRuStateResponse;
import defpackage.bvf0;
import defpackage.cmt;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.ny61;
import defpackage.qzn0;
import defpackage.zgz;
import defpackage.zy11;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class a {
    public final com.yandex.go.scooters.mosru.mapper.a a;
    public final ScootersMosRuApi b;
    public final ru.yandex.taxi.scooters.data.a c;
    public final kotlinx.coroutines.sync.a d = gtq0.a();
    public final r0 e = bvf0.c(ScootersMosRuAuthStatus.UNAUTHORIZED);
    public qzn0 f;

    public a(com.yandex.go.scooters.mosru.mapper.a aVar, ScootersMosRuApi scootersMosRuApi, ru.yandex.taxi.scooters.data.a aVar2) {
        this.a = aVar;
        this.b = scootersMosRuApi;
        this.c = aVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x004f, code lost:
    
        if (r8.a(r0) == r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r2v8, types: [g050] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.yandex.go.scooters.mosru.data.a] */
    /* JADX WARN: Type inference failed for: r7v1, types: [g050] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v16, types: [g050] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ScootersMosRuAuthRepository$getMosRuStateCachedOrLoad$1 scootersMosRuAuthRepository$getMosRuStateCachedOrLoad$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        qzn0 qzn0Var;
        Throwable th;
        ?? r7;
        Object c;
        kotlinx.coroutines.sync.a aVar2;
        try {
            try {
                if (continuationImpl instanceof ScootersMosRuAuthRepository$getMosRuStateCachedOrLoad$1) {
                    scootersMosRuAuthRepository$getMosRuStateCachedOrLoad$1 = (ScootersMosRuAuthRepository$getMosRuStateCachedOrLoad$1) continuationImpl;
                    int i2 = scootersMosRuAuthRepository$getMosRuStateCachedOrLoad$1.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        scootersMosRuAuthRepository$getMosRuStateCachedOrLoad$1.label = i2 - Integer.MIN_VALUE;
                        Object obj = scootersMosRuAuthRepository$getMosRuStateCachedOrLoad$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = scootersMosRuAuthRepository$getMosRuStateCachedOrLoad$1.label;
                        if (i != 0) {
                            kotlin.b.b(obj);
                            aVar = this.d;
                            scootersMosRuAuthRepository$getMosRuStateCachedOrLoad$1.L$0 = aVar;
                            scootersMosRuAuthRepository$getMosRuStateCachedOrLoad$1.label = 1;
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                r7 = (g050) scootersMosRuAuthRepository$getMosRuStateCachedOrLoad$1.L$0;
                                try {
                                    kotlin.b.b(obj);
                                    r7 = r7;
                                    qzn0Var = (qzn0) obj;
                                    aVar2 = r7;
                                } catch (CancellationException e) {
                                    throw e;
                                } catch (Throwable th2) {
                                    th = th2;
                                    zgz.a(null, th);
                                    qzn0Var = null;
                                    aVar2 = r7;
                                    aVar = aVar2;
                                    aVar.d(null);
                                    return qzn0Var;
                                }
                                aVar = aVar2;
                                aVar.d(null);
                                return qzn0Var;
                            }
                            ?? r2 = (g050) scootersMosRuAuthRepository$getMosRuStateCachedOrLoad$1.L$0;
                            kotlin.b.b(obj);
                            aVar = r2;
                        }
                        qzn0Var = this.f;
                        if (qzn0Var == null) {
                            try {
                                scootersMosRuAuthRepository$getMosRuStateCachedOrLoad$1.L$0 = aVar;
                                scootersMosRuAuthRepository$getMosRuStateCachedOrLoad$1.label = 2;
                                c = c(scootersMosRuAuthRepository$getMosRuStateCachedOrLoad$1);
                            } catch (CancellationException e2) {
                                throw e2;
                            } catch (Throwable th3) {
                                kotlinx.coroutines.sync.a aVar3 = aVar;
                                th = th3;
                                r7 = aVar3;
                                zgz.a(null, th);
                                qzn0Var = null;
                                aVar2 = r7;
                                aVar = aVar2;
                                aVar.d(null);
                                return qzn0Var;
                            }
                            if (c != coroutineSingletons) {
                                kotlinx.coroutines.sync.a aVar4 = aVar;
                                obj = c;
                                r7 = aVar4;
                                qzn0Var = (qzn0) obj;
                                aVar2 = r7;
                                aVar = aVar2;
                            }
                            return coroutineSingletons;
                        }
                        aVar.d(null);
                        return qzn0Var;
                    }
                }
                qzn0Var = this.f;
                if (qzn0Var == null) {
                }
                aVar.d(null);
                return qzn0Var;
            } catch (Throwable th4) {
                kotlinx.coroutines.sync.a aVar5 = aVar;
                th = th4;
                this = aVar5;
                this.d(null);
                throw th;
            }
            if (i != 0) {
            }
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                th = th6;
                this.d(null);
                throw th;
            }
        }
        scootersMosRuAuthRepository$getMosRuStateCachedOrLoad$1 = new ScootersMosRuAuthRepository$getMosRuStateCachedOrLoad$1(this, continuationImpl);
        Object obj2 = scootersMosRuAuthRepository$getMosRuStateCachedOrLoad$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersMosRuAuthRepository$getMosRuStateCachedOrLoad$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        ScootersMosRuAuthRepository$invalidateMosRuStateCache$1 scootersMosRuAuthRepository$invalidateMosRuStateCache$1;
        int i;
        g050 g050Var;
        try {
            if (continuationImpl instanceof ScootersMosRuAuthRepository$invalidateMosRuStateCache$1) {
                scootersMosRuAuthRepository$invalidateMosRuStateCache$1 = (ScootersMosRuAuthRepository$invalidateMosRuStateCache$1) continuationImpl;
                int i2 = scootersMosRuAuthRepository$invalidateMosRuStateCache$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersMosRuAuthRepository$invalidateMosRuStateCache$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = scootersMosRuAuthRepository$invalidateMosRuStateCache$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersMosRuAuthRepository$invalidateMosRuStateCache$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        kotlinx.coroutines.sync.a aVar = this.d;
                        scootersMosRuAuthRepository$invalidateMosRuStateCache$1.L$0 = aVar;
                        scootersMosRuAuthRepository$invalidateMosRuStateCache$1.label = 1;
                        if (aVar.a(scootersMosRuAuthRepository$invalidateMosRuStateCache$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        g050Var = aVar;
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) scootersMosRuAuthRepository$invalidateMosRuStateCache$1.L$0;
                        kotlin.b.b(obj);
                    }
                    this.f = null;
                    g050Var.d(null);
                    return zy11.a;
                }
            }
            this.f = null;
            g050Var.d(null);
            return zy11.a;
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
        scootersMosRuAuthRepository$invalidateMosRuStateCache$1 = new ScootersMosRuAuthRepository$invalidateMosRuStateCache$1(this, continuationImpl);
        Object obj2 = scootersMosRuAuthRepository$invalidateMosRuStateCache$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersMosRuAuthRepository$invalidateMosRuStateCache$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
    
        if (r8 != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
    
        if (r8 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        ScootersMosRuAuthRepository$loadAndCacheMosRuState$1 scootersMosRuAuthRepository$loadAndCacheMosRuState$1;
        int i;
        a aVar;
        if (continuationImpl instanceof ScootersMosRuAuthRepository$loadAndCacheMosRuState$1) {
            scootersMosRuAuthRepository$loadAndCacheMosRuState$1 = (ScootersMosRuAuthRepository$loadAndCacheMosRuState$1) continuationImpl;
            int i2 = scootersMosRuAuthRepository$loadAndCacheMosRuState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersMosRuAuthRepository$loadAndCacheMosRuState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersMosRuAuthRepository$loadAndCacheMosRuState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersMosRuAuthRepository$loadAndCacheMosRuState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersMosRuAuthRepository$loadAndCacheMosRuState$1.label = 1;
                    obj = this.c.a(false, scootersMosRuAuthRepository$loadAndCacheMosRuState$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            aVar = (a) scootersMosRuAuthRepository$loadAndCacheMosRuState$1.L$2;
                            kotlin.b.b(obj);
                            aVar.f = (qzn0) obj;
                            return this.f;
                        }
                        kotlin.b.b(obj);
                        scootersMosRuAuthRepository$loadAndCacheMosRuState$1.L$0 = null;
                        scootersMosRuAuthRepository$loadAndCacheMosRuState$1.L$1 = null;
                        scootersMosRuAuthRepository$loadAndCacheMosRuState$1.L$2 = this;
                        scootersMosRuAuthRepository$loadAndCacheMosRuState$1.label = 3;
                        obj = this.a.a((ScootersMosRuStateResponse) obj, scootersMosRuAuthRepository$loadAndCacheMosRuState$1);
                        if (obj != coroutineSingletons) {
                            aVar = this;
                            aVar.f = (qzn0) obj;
                            return this.f;
                        }
                        return coroutineSingletons;
                    }
                    kotlin.b.b(obj);
                }
                cmt<ScootersMosRuStateResponse> a = this.b.a((Map) obj);
                scootersMosRuAuthRepository$loadAndCacheMosRuState$1.L$0 = null;
                scootersMosRuAuthRepository$loadAndCacheMosRuState$1.label = 2;
                obj = ru.yandex.taxi.network.api.a.a(a, null, scootersMosRuAuthRepository$loadAndCacheMosRuState$1);
            }
        }
        scootersMosRuAuthRepository$loadAndCacheMosRuState$1 = new ScootersMosRuAuthRepository$loadAndCacheMosRuState$1(this, continuationImpl);
        Object obj2 = scootersMosRuAuthRepository$loadAndCacheMosRuState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersMosRuAuthRepository$loadAndCacheMosRuState$1.label;
        if (i != 0) {
        }
        cmt<ScootersMosRuStateResponse> a2 = this.b.a((Map) obj2);
        scootersMosRuAuthRepository$loadAndCacheMosRuState$1.L$0 = null;
        scootersMosRuAuthRepository$loadAndCacheMosRuState$1.label = 2;
        obj2 = ru.yandex.taxi.network.api.a.a(a2, null, scootersMosRuAuthRepository$loadAndCacheMosRuState$1);
    }
}
