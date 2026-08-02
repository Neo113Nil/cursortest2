package com.ybsdk.core.utils.network.retryPolicy;

import com.ybsdk.core.analytics.generated.delegates.TechEvents$TechApiCallAttemptResultResult;
import defpackage.c2k0;
import defpackage.e1k0;
import defpackage.fcy0;
import defpackage.g8e;
import defpackage.i5z0;
import defpackage.imz;
import defpackage.k1k0;
import defpackage.lp50;
import defpackage.ny61;
import defpackage.oqp0;
import defpackage.oyr;
import defpackage.pyy0;
import defpackage.sne;
import defpackage.trp0;
import defpackage.u0k0;
import defpackage.y6i0;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.random.Random;

/* loaded from: classes8.dex */
public final class c {
    public final String a;
    public final k1k0 b;
    public final lp50 c;
    public final b d;
    public final a e;

    public c(String str, k1k0 k1k0Var, lp50 lp50Var, b bVar, a aVar) {
        this.a = str;
        this.b = k1k0Var;
        this.c = lp50Var;
        this.d = bVar;
        this.e = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, String str, Throwable th, ContinuationImpl continuationImpl) {
        RetryPolicy$shouldContinueRetrying$1 retryPolicy$shouldContinueRetrying$1;
        int i;
        e1k0 e1k0Var;
        cVar.getClass();
        if (continuationImpl instanceof RetryPolicy$shouldContinueRetrying$1) {
            retryPolicy$shouldContinueRetrying$1 = (RetryPolicy$shouldContinueRetrying$1) continuationImpl;
            int i2 = retryPolicy$shouldContinueRetrying$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                retryPolicy$shouldContinueRetrying$1.label = i2 - Integer.MIN_VALUE;
                Object obj = retryPolicy$shouldContinueRetrying$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = retryPolicy$shouldContinueRetrying$1.label;
                boolean z = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!cVar.b.c.a(th)) {
                        return Boolean.FALSE;
                    }
                    b bVar = cVar.d;
                    retryPolicy$shouldContinueRetrying$1.L$0 = str;
                    retryPolicy$shouldContinueRetrying$1.label = 1;
                    obj = bVar.c(retryPolicy$shouldContinueRetrying$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) retryPolicy$shouldContinueRetrying$1.L$0;
                    kotlin.b.b(obj);
                }
                e1k0Var = (e1k0) obj;
                if (e1k0Var != null) {
                    return Boolean.TRUE;
                }
                if (e1k0Var.a()) {
                    lp50 lp50Var = cVar.c;
                    String str2 = cVar.a;
                    double b = e1k0Var.b();
                    fcy0 fcy0Var = ((u0k0) lp50Var).a.m0;
                    String str3 = str != null ? str : null;
                    double rint = Math.rint(b * 10.0d) / 10.0d;
                    LinkedHashMap w = g8e.w(3, "url", str2);
                    if (str3 != null) {
                        w.put("retry_id", str3);
                    }
                    w.put("budget", Double.valueOf(rint));
                    fcy0Var.a.a("tech.api_call.retry_bucket.token_consumed", w);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }
        retryPolicy$shouldContinueRetrying$1 = new RetryPolicy$shouldContinueRetrying$1(cVar, continuationImpl);
        Object obj2 = retryPolicy$shouldContinueRetrying$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = retryPolicy$shouldContinueRetrying$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        e1k0Var = (e1k0) obj2;
        if (e1k0Var != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0075, code lost:
    
        if (r9 != r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(zls zlsVar, ContinuationImpl continuationImpl) {
        RetryPolicy$call$1 retryPolicy$call$1;
        int i;
        String uuid;
        zls zlsVar2;
        String str;
        Object c;
        if (continuationImpl instanceof RetryPolicy$call$1) {
            retryPolicy$call$1 = (RetryPolicy$call$1) continuationImpl;
            int i2 = retryPolicy$call$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                retryPolicy$call$1.label = i2 - Integer.MIN_VALUE;
                Object obj = retryPolicy$call$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = retryPolicy$call$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    synchronized (c2k0.class) {
                        uuid = UUID.randomUUID().toString();
                    }
                    retryPolicy$call$1.L$0 = zlsVar;
                    retryPolicy$call$1.L$1 = uuid;
                    retryPolicy$call$1.label = 1;
                    if (e(uuid, retryPolicy$call$1) != obj2) {
                        zlsVar2 = zlsVar;
                        str = uuid;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Object obj3 = retryPolicy$call$1.L$0;
                        kotlin.b.b(obj);
                        return obj3;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                    Throwable a = Result.a(c);
                    if (a != null) {
                        retryPolicy$call$1.L$0 = c;
                        retryPolicy$call$1.label = 3;
                        if (d(a, retryPolicy$call$1) == obj2) {
                            return obj2;
                        }
                    }
                    return c;
                }
                str = (String) retryPolicy$call$1.L$1;
                zlsVar2 = (zls) retryPolicy$call$1.L$0;
                kotlin.b.b(obj);
                retryPolicy$call$1.L$0 = null;
                retryPolicy$call$1.L$1 = null;
                retryPolicy$call$1.label = 2;
                c = c(str, zlsVar2, retryPolicy$call$1);
            }
        }
        retryPolicy$call$1 = new RetryPolicy$call$1(this, continuationImpl);
        Object obj4 = retryPolicy$call$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = retryPolicy$call$1.label;
        if (i != 0) {
        }
        retryPolicy$call$1.L$0 = null;
        retryPolicy$call$1.L$1 = null;
        retryPolicy$call$1.label = 2;
        c = c(str, zlsVar2, retryPolicy$call$1);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, zls zlsVar, ContinuationImpl continuationImpl) {
        RetryPolicy$executeWithRetries$1 retryPolicy$executeWithRetries$1;
        int i;
        String str2;
        Ref$IntRef ref$IntRef;
        List list;
        Result result;
        if (continuationImpl instanceof RetryPolicy$executeWithRetries$1) {
            retryPolicy$executeWithRetries$1 = (RetryPolicy$executeWithRetries$1) continuationImpl;
            int i2 = retryPolicy$executeWithRetries$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                retryPolicy$executeWithRetries$1.label = i2 - Integer.MIN_VALUE;
                RetryPolicy$executeWithRetries$1 retryPolicy$executeWithRetries$12 = retryPolicy$executeWithRetries$1;
                Object obj = retryPolicy$executeWithRetries$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = retryPolicy$executeWithRetries$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Ref$IntRef ref$IntRef2 = new Ref$IntRef();
                    ref$IntRef2.element = 0;
                    ArrayList arrayList = new ArrayList();
                    long j = this.b.a;
                    RetryPolicy$executeWithRetries$2 retryPolicy$executeWithRetries$2 = new RetryPolicy$executeWithRetries$2(this, zlsVar, str, ref$IntRef2, arrayList, null);
                    retryPolicy$executeWithRetries$12.L$0 = str;
                    retryPolicy$executeWithRetries$12.L$1 = ref$IntRef2;
                    retryPolicy$executeWithRetries$12.L$2 = arrayList;
                    retryPolicy$executeWithRetries$12.label = 1;
                    obj = com.ybsdk.core.utils.coroutines.b.a(j, new pyy0(14), retryPolicy$executeWithRetries$2, retryPolicy$executeWithRetries$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str2 = str;
                    ref$IntRef = ref$IntRef2;
                    list = arrayList;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = (List) retryPolicy$executeWithRetries$12.L$2;
                    ref$IntRef = (Ref$IntRef) retryPolicy$executeWithRetries$12.L$1;
                    String str3 = (String) retryPolicy$executeWithRetries$12.L$0;
                    kotlin.b.b(obj);
                    str2 = str3;
                }
                result = (Result) obj;
                if (result == null) {
                    return result.getValue();
                }
                int i3 = ref$IntRef.element;
                int i4 = RetryTimeoutException.a;
                RetryTimeoutException a = d.a(list);
                u0k0 u0k0Var = (u0k0) this.c;
                u0k0Var.getClass();
                Throwable lastException = a.getLastException();
                if (lastException == null) {
                    lastException = a;
                }
                String traceId = a.getTraceId();
                String str4 = this.a;
                oqp0 oqp0Var = new oqp0(str4, traceId, str2, lastException);
                trp0 trp0Var = trp0.a;
                trp0.e(oqp0Var);
                fcy0 fcy0Var = u0k0Var.a.m0;
                TechEvents$TechApiCallAttemptResultResult techEvents$TechApiCallAttemptResultResult = TechEvents$TechApiCallAttemptResultResult.TIMEOUT;
                Throwable lastException2 = a.getLastException();
                fcy0.b(fcy0Var, str2, str4, i3, techEvents$TechApiCallAttemptResultResult, null, lastException2 != null ? lastException2.getMessage() : null, a.getTraceId(), 48);
                i5z0.a.a(oyr.p("Call to ", str4, " failed with timeout"), new Object[0]);
                return new Result.Failure(a);
            }
        }
        retryPolicy$executeWithRetries$1 = new RetryPolicy$executeWithRetries$1(this, continuationImpl);
        RetryPolicy$executeWithRetries$1 retryPolicy$executeWithRetries$122 = retryPolicy$executeWithRetries$1;
        Object obj2 = retryPolicy$executeWithRetries$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = retryPolicy$executeWithRetries$122.label;
        if (i != 0) {
        }
        result = (Result) obj2;
        if (result == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Throwable th, ContinuationImpl continuationImpl) {
        RetryPolicy$startCooldownIfNeeded$1 retryPolicy$startCooldownIfNeeded$1;
        int i;
        Object obj;
        Long l;
        Throwable lastException;
        if (continuationImpl instanceof RetryPolicy$startCooldownIfNeeded$1) {
            retryPolicy$startCooldownIfNeeded$1 = (RetryPolicy$startCooldownIfNeeded$1) continuationImpl;
            int i2 = retryPolicy$startCooldownIfNeeded$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                retryPolicy$startCooldownIfNeeded$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = retryPolicy$startCooldownIfNeeded$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = retryPolicy$startCooldownIfNeeded$1.label;
                String str = this.a;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    RetryTimeoutException retryTimeoutException = th instanceof RetryTimeoutException ? (RetryTimeoutException) th : null;
                    if (retryTimeoutException != null && (lastException = retryTimeoutException.getLastException()) != null) {
                        th = lastException;
                    }
                    Iterator it = this.b.e.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((sne) obj).c(th)) {
                            break;
                        }
                    }
                    sne sneVar = (sne) obj;
                    Long l2 = sneVar != null ? new Long(y6i0.k(new imz(sneVar.b(), sneVar.a()), Random.a)) : null;
                    if (l2 == null) {
                        return zy11Var;
                    }
                    long longValue = l2.longValue();
                    retryPolicy$startCooldownIfNeeded$1.L$0 = l2;
                    retryPolicy$startCooldownIfNeeded$1.label = 1;
                    if (this.e.b(longValue, str, retryPolicy$startCooldownIfNeeded$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    l = l2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    l = (Long) retryPolicy$startCooldownIfNeeded$1.L$0;
                    kotlin.b.b(obj2);
                }
                long longValue2 = l.longValue();
                fcy0 fcy0Var = ((u0k0) this.c).a.m0;
                LinkedHashMap w = g8e.w(2, "url", str);
                w.put("duration_ms", Double.valueOf(longValue2));
                fcy0Var.a.a("tech.api_call.cooldown_started", w);
                return zy11Var;
            }
        }
        retryPolicy$startCooldownIfNeeded$1 = new RetryPolicy$startCooldownIfNeeded$1(this, continuationImpl);
        Object obj22 = retryPolicy$startCooldownIfNeeded$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = retryPolicy$startCooldownIfNeeded$1.label;
        String str2 = this.a;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        long longValue22 = l.longValue();
        fcy0 fcy0Var2 = ((u0k0) this.c).a.m0;
        LinkedHashMap w2 = g8e.w(2, "url", str2);
        w2.put("duration_ms", Double.valueOf(longValue22));
        fcy0Var2.a.a("tech.api_call.cooldown_started", w2);
        return zy11Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0098, code lost:
    
        if (kotlinx.coroutines.a.i(r12, r2) == r3) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, ContinuationImpl continuationImpl) {
        RetryPolicy$waitForCooldownIfNeeded$1 retryPolicy$waitForCooldownIfNeeded$1;
        int i;
        String str2;
        long longValue;
        if (continuationImpl instanceof RetryPolicy$waitForCooldownIfNeeded$1) {
            retryPolicy$waitForCooldownIfNeeded$1 = (RetryPolicy$waitForCooldownIfNeeded$1) continuationImpl;
            int i2 = retryPolicy$waitForCooldownIfNeeded$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                retryPolicy$waitForCooldownIfNeeded$1.label = i2 - Integer.MIN_VALUE;
                Object obj = retryPolicy$waitForCooldownIfNeeded$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = retryPolicy$waitForCooldownIfNeeded$1.label;
                lp50 lp50Var = this.c;
                zy11 zy11Var = zy11.a;
                String str3 = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    retryPolicy$waitForCooldownIfNeeded$1.L$0 = str;
                    retryPolicy$waitForCooldownIfNeeded$1.label = 1;
                    Object a = this.e.a(str3, retryPolicy$waitForCooldownIfNeeded$1);
                    if (a != coroutineSingletons) {
                        obj = a;
                        str2 = str;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    ((u0k0) lp50Var).a.m0.a.a("tech.api_call.cooldown_ended", g8e.w(1, "url", str3));
                    return zy11Var;
                }
                str2 = (String) retryPolicy$waitForCooldownIfNeeded$1.L$0;
                kotlin.b.b(obj);
                longValue = ((Number) obj).longValue();
                if (longValue > 0) {
                    return zy11Var;
                }
                fcy0 fcy0Var = ((u0k0) lp50Var).a.m0;
                if (str2 == null) {
                    str2 = null;
                }
                double d = longValue;
                LinkedHashMap w = g8e.w(3, "url", str3);
                if (str2 != null) {
                    w.put("retry_id", str2);
                }
                w.put("remaining_cooldown_duration_ms", Double.valueOf(d));
                fcy0Var.a.a("tech.api_call.suspended_by_cooldown", w);
                retryPolicy$waitForCooldownIfNeeded$1.L$0 = null;
                retryPolicy$waitForCooldownIfNeeded$1.label = 2;
            }
        }
        retryPolicy$waitForCooldownIfNeeded$1 = new RetryPolicy$waitForCooldownIfNeeded$1(this, continuationImpl);
        Object obj2 = retryPolicy$waitForCooldownIfNeeded$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = retryPolicy$waitForCooldownIfNeeded$1.label;
        lp50 lp50Var2 = this.c;
        zy11 zy11Var2 = zy11.a;
        String str32 = this.a;
        if (i != 0) {
        }
        longValue = ((Number) obj2).longValue();
        if (longValue > 0) {
        }
    }
}
