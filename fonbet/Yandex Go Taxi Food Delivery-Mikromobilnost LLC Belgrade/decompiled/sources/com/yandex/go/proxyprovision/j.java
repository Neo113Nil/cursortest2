package com.yandex.go.proxyprovision;

import defpackage.ny61;
import defpackage.yws;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class j {
    public final yws a;

    public j(yws ywsVar) {
        this.a = ywsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        InAppCallsForceDisableInteractorImpl$isInAppCallsForceDisabled$1 inAppCallsForceDisableInteractorImpl$isInAppCallsForceDisabled$1;
        int i;
        if (continuationImpl instanceof InAppCallsForceDisableInteractorImpl$isInAppCallsForceDisabled$1) {
            inAppCallsForceDisableInteractorImpl$isInAppCallsForceDisabled$1 = (InAppCallsForceDisableInteractorImpl$isInAppCallsForceDisabled$1) continuationImpl;
            int i2 = inAppCallsForceDisableInteractorImpl$isInAppCallsForceDisabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                inAppCallsForceDisableInteractorImpl$isInAppCallsForceDisabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = inAppCallsForceDisableInteractorImpl$isInAppCallsForceDisabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = inAppCallsForceDisableInteractorImpl$isInAppCallsForceDisabled$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    inAppCallsForceDisableInteractorImpl$isInAppCallsForceDisabled$1.label = 1;
                    obj = this.a.a.b(inAppCallsForceDisableInteractorImpl$isInAppCallsForceDisabled$1);
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
                return Boolean.valueOf(!((GeProxyProvisionExperiment) obj).f);
            }
        }
        inAppCallsForceDisableInteractorImpl$isInAppCallsForceDisabled$1 = new InAppCallsForceDisableInteractorImpl$isInAppCallsForceDisabled$1(this, continuationImpl);
        Object obj2 = inAppCallsForceDisableInteractorImpl$isInAppCallsForceDisabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = inAppCallsForceDisableInteractorImpl$isInAppCallsForceDisabled$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(!((GeProxyProvisionExperiment) obj2).f);
    }
}
