package com.yandex.go.payments.paymentlist.experiments;

import com.yandex.go.payments.paymentlist.experiments.YbWalletTopUpRuleExperiment;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class y {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = YbWalletTopUpRuleExperiment.TopUpRule.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
