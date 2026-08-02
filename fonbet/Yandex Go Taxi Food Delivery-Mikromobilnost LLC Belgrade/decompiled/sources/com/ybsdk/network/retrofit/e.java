package com.ybsdk.network.retrofit;

import android.os.SystemClock;
import defpackage.ak7;
import defpackage.gy4;
import defpackage.k1k0;
import defpackage.ny61;
import defpackage.qda0;
import defpackage.sls;
import defpackage.tls;
import defpackage.u0k0;
import defpackage.vez0;
import defpackage.zls;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import retrofit2.Call;

/* loaded from: classes8.dex */
public final class e {
    public final b a;
    public final u0k0 b;
    public final com.ybsdk.core.utils.network.retryPolicy.b c;
    public final com.ybsdk.core.utils.network.retryPolicy.a d;

    public e(b bVar, u0k0 u0k0Var, com.ybsdk.core.utils.network.retryPolicy.b bVar2, com.ybsdk.core.utils.network.retryPolicy.a aVar) {
        this.a = bVar;
        this.b = u0k0Var;
        this.c = bVar2;
        this.d = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Call call, sls slsVar, tls tlsVar, ContinuationImpl continuationImpl) {
        RetryCallExecutor$execute$1 retryCallExecutor$execute$1;
        int i;
        if (continuationImpl instanceof RetryCallExecutor$execute$1) {
            retryCallExecutor$execute$1 = (RetryCallExecutor$execute$1) continuationImpl;
            int i2 = retryCallExecutor$execute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                retryCallExecutor$execute$1.label = i2 - Integer.MIN_VALUE;
                Object obj = retryCallExecutor$execute$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = retryCallExecutor$execute$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                zls retryCallExecutor$execute$3 = new RetryCallExecutor$execute$3(this, tlsVar, null);
                retryCallExecutor$execute$1.label = 1;
                Object c = c(call, slsVar, retryCallExecutor$execute$3, retryCallExecutor$execute$1);
                return c == obj2 ? obj2 : c;
            }
        }
        retryCallExecutor$execute$1 = new RetryCallExecutor$execute$1(this, continuationImpl);
        Object obj3 = retryCallExecutor$execute$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = retryCallExecutor$execute$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Call call, gy4 gy4Var, qda0 qda0Var, ContinuationImpl continuationImpl) {
        RetryCallExecutor$executePollable$1 retryCallExecutor$executePollable$1;
        int i;
        if (continuationImpl instanceof RetryCallExecutor$executePollable$1) {
            retryCallExecutor$executePollable$1 = (RetryCallExecutor$executePollable$1) continuationImpl;
            int i2 = retryCallExecutor$executePollable$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                retryCallExecutor$executePollable$1.label = i2 - Integer.MIN_VALUE;
                Object obj = retryCallExecutor$executePollable$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = retryCallExecutor$executePollable$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                zls retryCallExecutor$executePollable$3 = new RetryCallExecutor$executePollable$3(this, qda0Var, null);
                retryCallExecutor$executePollable$1.label = 1;
                Object c = c(call, gy4Var, retryCallExecutor$executePollable$3, retryCallExecutor$executePollable$1);
                return c == obj2 ? obj2 : c;
            }
        }
        retryCallExecutor$executePollable$1 = new RetryCallExecutor$executePollable$1(this, continuationImpl);
        Object obj3 = retryCallExecutor$executePollable$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = retryCallExecutor$executePollable$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        if (r3 == r5) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Call call, sls slsVar, zls zlsVar, ContinuationImpl continuationImpl) {
        RetryCallExecutor$executeWithRetry$1 retryCallExecutor$executeWithRetry$1;
        int i;
        if (continuationImpl instanceof RetryCallExecutor$executeWithRetry$1) {
            retryCallExecutor$executeWithRetry$1 = (RetryCallExecutor$executeWithRetry$1) continuationImpl;
            int i2 = retryCallExecutor$executeWithRetry$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                retryCallExecutor$executeWithRetry$1.label = i2 - Integer.MIN_VALUE;
                Object obj = retryCallExecutor$executeWithRetry$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = retryCallExecutor$executeWithRetry$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    k1k0 k1k0Var = (k1k0) slsVar.invoke();
                    if (k1k0Var == null) {
                        Object ak7Var = new ak7(SystemClock.elapsedRealtime());
                        retryCallExecutor$executeWithRetry$1.label = 1;
                        obj = zlsVar.invoke(call, ak7Var, retryCallExecutor$executeWithRetry$1);
                    } else {
                        com.ybsdk.core.utils.network.retryPolicy.c cVar = new com.ybsdk.core.utils.network.retryPolicy.c(vez0.C(call), k1k0Var, this.b, this.c, this.d);
                        RetryCallExecutor$executeWithRetry$2 retryCallExecutor$executeWithRetry$2 = new RetryCallExecutor$executeWithRetry$2(call, k1k0Var, zlsVar, null);
                        retryCallExecutor$executeWithRetry$1.label = 2;
                        Object b = cVar.b(retryCallExecutor$executeWithRetry$2, retryCallExecutor$executeWithRetry$1);
                        if (b != obj2) {
                            return b;
                        }
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return ((Result) obj).getValue();
            }
        }
        retryCallExecutor$executeWithRetry$1 = new RetryCallExecutor$executeWithRetry$1(this, continuationImpl);
        Object obj3 = retryCallExecutor$executeWithRetry$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = retryCallExecutor$executeWithRetry$1.label;
        if (i != 0) {
        }
        return ((Result) obj3).getValue();
    }
}
