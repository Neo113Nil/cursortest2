package com.ybsdk.core.utils.coroutines;

import defpackage.bvf0;
import defpackage.ny61;
import defpackage.pyy0;
import defpackage.wls;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public abstract class b {
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(long j, pyy0 pyy0Var, wls wlsVar, ContinuationImpl continuationImpl) {
        TimeoutKt$scopeWithTimeout$1 timeoutKt$scopeWithTimeout$1;
        int i;
        try {
            if (continuationImpl instanceof TimeoutKt$scopeWithTimeout$1) {
                timeoutKt$scopeWithTimeout$1 = (TimeoutKt$scopeWithTimeout$1) continuationImpl;
                int i2 = timeoutKt$scopeWithTimeout$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    timeoutKt$scopeWithTimeout$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = timeoutKt$scopeWithTimeout$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = timeoutKt$scopeWithTimeout$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        timeoutKt$scopeWithTimeout$1.label = 1;
                        Object n = bvf0.n(new TimeoutKt$setupTimeout$2(pyy0Var, j, wlsVar, null), timeoutKt$scopeWithTimeout$1);
                        return n == coroutineSingletons ? coroutineSingletons : n;
                    }
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return obj;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            if (i != 0) {
            }
        } catch (TimeoutCancellationException unused) {
            return null;
        }
        timeoutKt$scopeWithTimeout$1 = new TimeoutKt$scopeWithTimeout$1(continuationImpl);
        Object obj2 = timeoutKt$scopeWithTimeout$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = timeoutKt$scopeWithTimeout$1.label;
    }
}
