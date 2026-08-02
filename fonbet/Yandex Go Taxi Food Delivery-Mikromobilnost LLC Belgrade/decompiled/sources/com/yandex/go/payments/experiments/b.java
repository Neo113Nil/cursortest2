package com.yandex.go.payments.experiments;

import com.yandex.go.payments.experiments.AddPaymentMethodButtonInMenuExperiment;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class b {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = AddPaymentMethodButtonInMenuExperiment.PaymentMethodType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
