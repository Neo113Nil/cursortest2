package com.yandex.go.inapp_calls.experiment;

import defpackage.jbh;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.t1b0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class p {
    public final t1b0 a;

    public p(rqo rqoVar) {
        InAppCallExperiment.Companion.getClass();
        this.a = ((jbh) rqoVar).e(InAppCallExperiment.r);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        InAppCallExperimentRepositoryImpl$getIsInAppCallEnabled$1 inAppCallExperimentRepositoryImpl$getIsInAppCallEnabled$1;
        int i;
        if (continuationImpl instanceof InAppCallExperimentRepositoryImpl$getIsInAppCallEnabled$1) {
            inAppCallExperimentRepositoryImpl$getIsInAppCallEnabled$1 = (InAppCallExperimentRepositoryImpl$getIsInAppCallEnabled$1) continuationImpl;
            int i2 = inAppCallExperimentRepositoryImpl$getIsInAppCallEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                inAppCallExperimentRepositoryImpl$getIsInAppCallEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = inAppCallExperimentRepositoryImpl$getIsInAppCallEnabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = inAppCallExperimentRepositoryImpl$getIsInAppCallEnabled$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    inAppCallExperimentRepositoryImpl$getIsInAppCallEnabled$1.label = 1;
                    obj = this.a.b(inAppCallExperimentRepositoryImpl$getIsInAppCallEnabled$1);
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
                return Boolean.valueOf(((InAppCallExperiment) obj).b);
            }
        }
        inAppCallExperimentRepositoryImpl$getIsInAppCallEnabled$1 = new InAppCallExperimentRepositoryImpl$getIsInAppCallEnabled$1(this, continuationImpl);
        Object obj2 = inAppCallExperimentRepositoryImpl$getIsInAppCallEnabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = inAppCallExperimentRepositoryImpl$getIsInAppCallEnabled$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(((InAppCallExperiment) obj2).b);
    }
}
