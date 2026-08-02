package com.yandex.go.payments.cards.experiments;

import com.yandex.go.payments.cards.experiments.CreditCard3dsVerificationRetryPollicyExperiment;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class c {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = CreditCard3dsVerificationRetryPollicyExperiment.SuccessVerificationPolicy.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
