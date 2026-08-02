package com.yandex.go.call_order_fallback.experiments;

import defpackage.d6z;
import defpackage.evu0;
import defpackage.jbh;
import defpackage.ny61;
import defpackage.rqo;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.experiments.q;

/* loaded from: classes12.dex */
public final class b {
    public final q a;

    public b(rqo rqoVar) {
        CallOrderFallbackExperiment.Companion.getClass();
        this.a = ((jbh) rqoVar).d(CallOrderFallbackExperiment.j);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        CallOrderFallbackExperimentRepository$experimentSuspend$1 callOrderFallbackExperimentRepository$experimentSuspend$1;
        int i;
        CallOrderFallbackExperiment callOrderFallbackExperiment;
        if (continuationImpl instanceof CallOrderFallbackExperimentRepository$experimentSuspend$1) {
            callOrderFallbackExperimentRepository$experimentSuspend$1 = (CallOrderFallbackExperimentRepository$experimentSuspend$1) continuationImpl;
            int i2 = callOrderFallbackExperimentRepository$experimentSuspend$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                callOrderFallbackExperimentRepository$experimentSuspend$1.label = i2 - Integer.MIN_VALUE;
                Object obj = callOrderFallbackExperimentRepository$experimentSuspend$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = callOrderFallbackExperimentRepository$experimentSuspend$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    callOrderFallbackExperimentRepository$experimentSuspend$1.label = 1;
                    obj = this.a.b(callOrderFallbackExperimentRepository$experimentSuspend$1);
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
                callOrderFallbackExperiment = (CallOrderFallbackExperiment) obj;
                if (callOrderFallbackExperiment.b) {
                    String[] strArr = {callOrderFallbackExperiment.d, callOrderFallbackExperiment.f};
                    int i3 = 0;
                    while (true) {
                        if (i3 < 2) {
                            if (!d6z.Z(callOrderFallbackExperiment, strArr[i3])) {
                                break;
                            }
                            i3++;
                        } else if (!evu0.J(callOrderFallbackExperiment.g)) {
                            return obj;
                        }
                    }
                }
                return null;
            }
        }
        callOrderFallbackExperimentRepository$experimentSuspend$1 = new CallOrderFallbackExperimentRepository$experimentSuspend$1(this, continuationImpl);
        Object obj2 = callOrderFallbackExperimentRepository$experimentSuspend$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = callOrderFallbackExperimentRepository$experimentSuspend$1.label;
        if (i != 0) {
        }
        callOrderFallbackExperiment = (CallOrderFallbackExperiment) obj2;
        if (callOrderFallbackExperiment.b) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        CallOrderFallbackExperimentRepository$isEnabled$1 callOrderFallbackExperimentRepository$isEnabled$1;
        int i;
        if (continuationImpl instanceof CallOrderFallbackExperimentRepository$isEnabled$1) {
            callOrderFallbackExperimentRepository$isEnabled$1 = (CallOrderFallbackExperimentRepository$isEnabled$1) continuationImpl;
            int i2 = callOrderFallbackExperimentRepository$isEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                callOrderFallbackExperimentRepository$isEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = callOrderFallbackExperimentRepository$isEnabled$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = callOrderFallbackExperimentRepository$isEnabled$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    callOrderFallbackExperimentRepository$isEnabled$1.label = 1;
                    obj = a(callOrderFallbackExperimentRepository$isEnabled$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                CallOrderFallbackExperiment callOrderFallbackExperiment = (CallOrderFallbackExperiment) obj;
                return Boolean.valueOf(callOrderFallbackExperiment == null && callOrderFallbackExperiment.b);
            }
        }
        callOrderFallbackExperimentRepository$isEnabled$1 = new CallOrderFallbackExperimentRepository$isEnabled$1(this, continuationImpl);
        Object obj3 = callOrderFallbackExperimentRepository$isEnabled$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = callOrderFallbackExperimentRepository$isEnabled$1.label;
        if (i != 0) {
        }
        CallOrderFallbackExperiment callOrderFallbackExperiment2 = (CallOrderFallbackExperiment) obj3;
        return Boolean.valueOf(callOrderFallbackExperiment2 == null && callOrderFallbackExperiment2.b);
    }
}
