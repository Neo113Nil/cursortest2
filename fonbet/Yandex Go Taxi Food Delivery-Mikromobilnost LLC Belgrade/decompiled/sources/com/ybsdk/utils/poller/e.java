package com.ybsdk.utils.poller;

import com.ybsdk.core.utils.poller.PollerTimeoutException;
import defpackage.acu;
import defpackage.jl40;
import defpackage.n2e0;
import defpackage.ny61;
import defpackage.q2e0;
import defpackage.r2e0;
import defpackage.s2e0;
import defpackage.tpr;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public abstract class e {
    public static final boolean a(s2e0 s2e0Var) {
        if (s2e0Var.equals(r2e0.a) || (s2e0Var instanceof n2e0)) {
            return true;
        }
        if (s2e0Var instanceof q2e0) {
            return ((q2e0) s2e0Var).b;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(tpr tprVar, ContinuationImpl continuationImpl) {
        PollingStateExtKt$toResult$1 pollingStateExtKt$toResult$1;
        int i;
        if (continuationImpl instanceof PollingStateExtKt$toResult$1) {
            pollingStateExtKt$toResult$1 = (PollingStateExtKt$toResult$1) continuationImpl;
            int i2 = pollingStateExtKt$toResult$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pollingStateExtKt$toResult$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pollingStateExtKt$toResult$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pollingStateExtKt$toResult$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    acu acuVar = new acu(tprVar, 12);
                    pollingStateExtKt$toResult$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.y(acuVar, pollingStateExtKt$toResult$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                s2e0 s2e0Var = (s2e0) obj;
                return !(s2e0Var instanceof q2e0) ? ((q2e0) s2e0Var).a : s2e0Var instanceof n2e0 ? new Result.Failure(((n2e0) s2e0Var).a) : jl40.l(s2e0Var, r2e0.a) ? new Result.Failure(new PollerTimeoutException()) : new Result.Failure(new IllegalStateException("polling finished with illegal state"));
            }
        }
        pollingStateExtKt$toResult$1 = new PollingStateExtKt$toResult$1(continuationImpl);
        Object obj2 = pollingStateExtKt$toResult$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pollingStateExtKt$toResult$1.label;
        if (i != 0) {
        }
        s2e0 s2e0Var2 = (s2e0) obj2;
        if (!(s2e0Var2 instanceof q2e0)) {
        }
    }
}
