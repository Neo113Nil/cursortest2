package com.yandex.go.payments.cards.experiments;

import com.yandex.go.payments.cards.experiments.CreditCard3dsVerificationRetryPollicyExperiment;
import defpackage.jbh;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.t1b0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a {
    public final t1b0 a;

    public a(rqo rqoVar) {
        CreditCard3dsVerificationRetryPollicyExperiment.Companion.getClass();
        this.a = ((jbh) rqoVar).e(CreditCard3dsVerificationRetryPollicyExperiment.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        CreditCard3dsVerificationExperimentRepository$isPollingEnabled$1 creditCard3dsVerificationExperimentRepository$isPollingEnabled$1;
        int i;
        if (continuationImpl instanceof CreditCard3dsVerificationExperimentRepository$isPollingEnabled$1) {
            creditCard3dsVerificationExperimentRepository$isPollingEnabled$1 = (CreditCard3dsVerificationExperimentRepository$isPollingEnabled$1) continuationImpl;
            int i2 = creditCard3dsVerificationExperimentRepository$isPollingEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                creditCard3dsVerificationExperimentRepository$isPollingEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = creditCard3dsVerificationExperimentRepository$isPollingEnabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = creditCard3dsVerificationExperimentRepository$isPollingEnabled$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    creditCard3dsVerificationExperimentRepository$isPollingEnabled$1.label = 1;
                    obj = this.a.b(creditCard3dsVerificationExperimentRepository$isPollingEnabled$1);
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
                CreditCard3dsVerificationRetryPollicyExperiment creditCard3dsVerificationRetryPollicyExperiment = (CreditCard3dsVerificationRetryPollicyExperiment) obj;
                return Boolean.valueOf(!creditCard3dsVerificationRetryPollicyExperiment.b && creditCard3dsVerificationRetryPollicyExperiment.c == CreditCard3dsVerificationRetryPollicyExperiment.SuccessVerificationPolicy.POLLING);
            }
        }
        creditCard3dsVerificationExperimentRepository$isPollingEnabled$1 = new CreditCard3dsVerificationExperimentRepository$isPollingEnabled$1(this, continuationImpl);
        Object obj2 = creditCard3dsVerificationExperimentRepository$isPollingEnabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = creditCard3dsVerificationExperimentRepository$isPollingEnabled$1.label;
        if (i != 0) {
        }
        CreditCard3dsVerificationRetryPollicyExperiment creditCard3dsVerificationRetryPollicyExperiment2 = (CreditCard3dsVerificationRetryPollicyExperiment) obj2;
        return Boolean.valueOf(!creditCard3dsVerificationRetryPollicyExperiment2.b && creditCard3dsVerificationRetryPollicyExperiment2.c == CreditCard3dsVerificationRetryPollicyExperiment.SuccessVerificationPolicy.POLLING);
    }
}
