package com.yandex.go.payments.yb.experiments;

import com.yandex.go.payments.yb.experiments.YbInPaymentsPromotionExperiment;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class h {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = YbInPaymentsPromotionExperiment.ImageType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
