package com.yandex.go.fallback_experiment;

import com.yandex.go.fallback_experiment.network.FallbackExperimentApi;
import com.yandex.go.fallback_experiment.network.FallbackExperimentParam;
import com.yandex.go.fallback_experiment.network.FallbackExperimentResponse;
import com.yandex.go.route.interactor.b;
import defpackage.bvf0;
import defpackage.cmt;
import defpackage.h3y;
import defpackage.ny61;
import defpackage.o9p;
import defpackage.po21;
import defpackage.qn11;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a implements o9p {
    public final b a;
    public final po21 b;
    public final h3y c;

    public a(b bVar, po21 po21Var, h3y h3yVar) {
        this.a = bVar;
        this.b = po21Var;
        this.c = h3yVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, qn11 qn11Var, ContinuationImpl continuationImpl) {
        FallbackExperimentInteractorImpl$getExperimentOrDefault$1 fallbackExperimentInteractorImpl$getExperimentOrDefault$1;
        int i;
        try {
            if (continuationImpl instanceof FallbackExperimentInteractorImpl$getExperimentOrDefault$1) {
                fallbackExperimentInteractorImpl$getExperimentOrDefault$1 = (FallbackExperimentInteractorImpl$getExperimentOrDefault$1) continuationImpl;
                int i2 = fallbackExperimentInteractorImpl$getExperimentOrDefault$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    fallbackExperimentInteractorImpl$getExperimentOrDefault$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = fallbackExperimentInteractorImpl$getExperimentOrDefault$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = fallbackExperimentInteractorImpl$getExperimentOrDefault$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        fallbackExperimentInteractorImpl$getExperimentOrDefault$1.L$0 = null;
                        fallbackExperimentInteractorImpl$getExperimentOrDefault$1.L$1 = qn11Var;
                        fallbackExperimentInteractorImpl$getExperimentOrDefault$1.label = 1;
                        obj = b(str, fallbackExperimentInteractorImpl$getExperimentOrDefault$1);
                        if (obj == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qn11Var = (qn11) fallbackExperimentInteractorImpl$getExperimentOrDefault$1.L$1;
                        kotlin.b.b(obj);
                    }
                    qn11 b = ((FallbackExperimentResponse) obj).b(qn11Var.getClass());
                    return b != null ? qn11Var : b;
                }
            }
            if (i != 0) {
            }
            qn11 b2 = ((FallbackExperimentResponse) obj).b(qn11Var.getClass());
            if (b2 != null) {
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            return qn11Var;
        }
        fallbackExperimentInteractorImpl$getExperimentOrDefault$1 = new FallbackExperimentInteractorImpl$getExperimentOrDefault$1(this, continuationImpl);
        Object obj3 = fallbackExperimentInteractorImpl$getExperimentOrDefault$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fallbackExperimentInteractorImpl$getExperimentOrDefault$1.label;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        FallbackExperimentInteractorImpl$requestExperiment$1 fallbackExperimentInteractorImpl$requestExperiment$1;
        int i;
        if (continuationImpl instanceof FallbackExperimentInteractorImpl$requestExperiment$1) {
            fallbackExperimentInteractorImpl$requestExperiment$1 = (FallbackExperimentInteractorImpl$requestExperiment$1) continuationImpl;
            int i2 = fallbackExperimentInteractorImpl$requestExperiment$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fallbackExperimentInteractorImpl$requestExperiment$1.label = i2 - Integer.MIN_VALUE;
                Object obj = fallbackExperimentInteractorImpl$requestExperiment$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fallbackExperimentInteractorImpl$requestExperiment$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    FallbackExperimentInteractorImpl$requestExperiment$param$1 fallbackExperimentInteractorImpl$requestExperiment$param$1 = new FallbackExperimentInteractorImpl$requestExperiment$param$1(this, str, null);
                    fallbackExperimentInteractorImpl$requestExperiment$1.L$0 = null;
                    fallbackExperimentInteractorImpl$requestExperiment$1.label = 1;
                    obj = bvf0.n(fallbackExperimentInteractorImpl$requestExperiment$param$1, fallbackExperimentInteractorImpl$requestExperiment$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    kotlin.b.b(obj);
                }
                cmt<FallbackExperimentResponse> a = ((FallbackExperimentApi) this.c.get()).a((FallbackExperimentParam) obj);
                fallbackExperimentInteractorImpl$requestExperiment$1.L$0 = null;
                fallbackExperimentInteractorImpl$requestExperiment$1.L$1 = null;
                fallbackExperimentInteractorImpl$requestExperiment$1.L$2 = null;
                fallbackExperimentInteractorImpl$requestExperiment$1.label = 2;
                Object a2 = ru.yandex.taxi.network.api.a.a(a, null, fallbackExperimentInteractorImpl$requestExperiment$1);
                return a2 != coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        fallbackExperimentInteractorImpl$requestExperiment$1 = new FallbackExperimentInteractorImpl$requestExperiment$1(this, continuationImpl);
        Object obj2 = fallbackExperimentInteractorImpl$requestExperiment$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fallbackExperimentInteractorImpl$requestExperiment$1.label;
        if (i != 0) {
        }
        cmt<FallbackExperimentResponse> a3 = ((FallbackExperimentApi) this.c.get()).a((FallbackExperimentParam) obj2);
        fallbackExperimentInteractorImpl$requestExperiment$1.L$0 = null;
        fallbackExperimentInteractorImpl$requestExperiment$1.L$1 = null;
        fallbackExperimentInteractorImpl$requestExperiment$1.L$2 = null;
        fallbackExperimentInteractorImpl$requestExperiment$1.label = 2;
        Object a22 = ru.yandex.taxi.network.api.a.a(a3, null, fallbackExperimentInteractorImpl$requestExperiment$1);
        if (a22 != coroutineSingletons2) {
        }
    }
}
