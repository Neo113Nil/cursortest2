package com.ybsdk.core.utils.ext;

import com.ybsdk.core.utils.dto.common.FailDataException;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tls;
import defpackage.tpr;
import defpackage.tse;
import defpackage.vpr;
import defpackage.x4c;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public abstract class c {
    public static final pzt0 a(tpr tprVar, tse tseVar, vpr vprVar) {
        return tje.N(tseVar, null, null, new FlowExtKt$collectIn$1(tprVar, vprVar, null), 3);
    }

    public static final boolean b(Throwable th) {
        if (th instanceof FailDataException) {
            return true;
        }
        if (!(th instanceof ErrorResponseException)) {
            return false;
        }
        ErrorResponseException errorResponseException = (ErrorResponseException) th;
        return errorResponseException.getErrorResponse().getCode() < 500 && errorResponseException.getErrorResponse().getCode() != 429;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(tls tlsVar, Continuation continuation) {
        ResponseExtKt$safeCall$1 responseExtKt$safeCall$1;
        int i;
        if (continuation instanceof ResponseExtKt$safeCall$1) {
            responseExtKt$safeCall$1 = (ResponseExtKt$safeCall$1) continuation;
            int i2 = responseExtKt$safeCall$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                responseExtKt$safeCall$1.label = i2 - Integer.MIN_VALUE;
                Object obj = responseExtKt$safeCall$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = responseExtKt$safeCall$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    responseExtKt$safeCall$1.label = 1;
                    Object d = d("SAFE_CALL", tlsVar, responseExtKt$safeCall$1);
                    return d == coroutineSingletons ? coroutineSingletons : d;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        responseExtKt$safeCall$1 = new ResponseExtKt$safeCall$1(continuation);
        Object obj2 = responseExtKt$safeCall$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = responseExtKt$safeCall$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(String str, tls tlsVar, ContinuationImpl continuationImpl) {
        ResponseExtKt$safeInvokeWithResultReturn$1 responseExtKt$safeInvokeWithResultReturn$1;
        int i;
        if (continuationImpl instanceof ResponseExtKt$safeInvokeWithResultReturn$1) {
            responseExtKt$safeInvokeWithResultReturn$1 = (ResponseExtKt$safeInvokeWithResultReturn$1) continuationImpl;
            int i2 = responseExtKt$safeInvokeWithResultReturn$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                responseExtKt$safeInvokeWithResultReturn$1.label = i2 - Integer.MIN_VALUE;
                Object obj = responseExtKt$safeInvokeWithResultReturn$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = responseExtKt$safeInvokeWithResultReturn$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    responseExtKt$safeInvokeWithResultReturn$1.label = 1;
                    Object e = e(str, tlsVar, true, responseExtKt$safeInvokeWithResultReturn$1);
                    return e == coroutineSingletons ? coroutineSingletons : e;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        responseExtKt$safeInvokeWithResultReturn$1 = new ResponseExtKt$safeInvokeWithResultReturn$1(continuationImpl);
        Object obj2 = responseExtKt$safeInvokeWithResultReturn$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = responseExtKt$safeInvokeWithResultReturn$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:(2:11|12)(2:14|15))(2:16|17))(3:44|45|(2:47|31))|18|19|(2:21|(3:(1:24)(1:36)|25|(2:27|(2:29|(1:31)(1:32))(2:33|34))(1:35))(1:37))(2:38|(2:40|41)(1:42))))|50|6|7|(0)(0)|18|19|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0046, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0066, code lost:
    
        r2 = new kotlin.Result.Failure(r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(String str, tls tlsVar, boolean z, ContinuationImpl continuationImpl) {
        ResponseExtKt$safeInvokeWithResultReturn$2 responseExtKt$safeInvokeWithResultReturn$2;
        int i;
        Throwable a;
        if (continuationImpl instanceof ResponseExtKt$safeInvokeWithResultReturn$2) {
            responseExtKt$safeInvokeWithResultReturn$2 = (ResponseExtKt$safeInvokeWithResultReturn$2) continuationImpl;
            int i2 = responseExtKt$safeInvokeWithResultReturn$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                responseExtKt$safeInvokeWithResultReturn$2.label = i2 - Integer.MIN_VALUE;
                Object obj = responseExtKt$safeInvokeWithResultReturn$2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = responseExtKt$safeInvokeWithResultReturn$2.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    responseExtKt$safeInvokeWithResultReturn$2.L$0 = str;
                    responseExtKt$safeInvokeWithResultReturn$2.L$1 = tlsVar;
                    responseExtKt$safeInvokeWithResultReturn$2.Z$0 = z;
                    responseExtKt$safeInvokeWithResultReturn$2.label = 1;
                    obj = tlsVar.invoke(responseExtKt$safeInvokeWithResultReturn$2);
                    if (obj == coroutineSingletons) {
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = responseExtKt$safeInvokeWithResultReturn$2.Z$0;
                    tlsVar = (tls) responseExtKt$safeInvokeWithResultReturn$2.L$1;
                    str = (String) responseExtKt$safeInvokeWithResultReturn$2.L$0;
                    kotlin.b.b(obj);
                }
                Object failure = new Result(((Result) obj).getValue());
                a = Result.a(failure);
                if (a == null) {
                    if (a instanceof CancellationException) {
                        throw a;
                    }
                    x4c.g("Exception when trying to safe invoke suspend block().", a, str, null, 8);
                    return new Result.Failure(a);
                }
                Object value = ((Result) failure).getValue();
                boolean z2 = value instanceof Result.Failure;
                if (z2) {
                    return value;
                }
                if (!((z2 ? null : value) instanceof Result)) {
                    return value;
                }
                x4c.g("Return type of block() not matching excepted return type. Actual return type kotlin.Result", null, str, null, 10);
                if (!z) {
                    return new Result.Failure(new IllegalStateException("Invalid return type"));
                }
                responseExtKt$safeInvokeWithResultReturn$2.L$0 = null;
                responseExtKt$safeInvokeWithResultReturn$2.L$1 = null;
                responseExtKt$safeInvokeWithResultReturn$2.label = 2;
                Object e = e(str, tlsVar, false, responseExtKt$safeInvokeWithResultReturn$2);
                return e == coroutineSingletons ? coroutineSingletons : e;
            }
        }
        responseExtKt$safeInvokeWithResultReturn$2 = new ResponseExtKt$safeInvokeWithResultReturn$2(continuationImpl);
        Object obj2 = responseExtKt$safeInvokeWithResultReturn$2.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = responseExtKt$safeInvokeWithResultReturn$2.label;
        if (i != 0) {
        }
        Object failure2 = new Result(((Result) obj2).getValue());
        a = Result.a(failure2);
        if (a == null) {
        }
    }
}
