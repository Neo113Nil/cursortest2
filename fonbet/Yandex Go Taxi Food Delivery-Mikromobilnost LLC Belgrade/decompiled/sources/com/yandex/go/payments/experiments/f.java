package com.yandex.go.payments.experiments;

import com.yandex.go.payments.experiments.PaymentMethodsServiceExperiment;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class f {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = PaymentMethodsServiceExperiment.ServiceEndpoint.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
