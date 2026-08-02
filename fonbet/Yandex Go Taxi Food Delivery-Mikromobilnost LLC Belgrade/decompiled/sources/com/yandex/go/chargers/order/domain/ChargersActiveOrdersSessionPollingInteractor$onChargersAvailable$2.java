package com.yandex.go.chargers.order.domain;

import com.yandex.go.chargers.data.model.ChargersExperiment;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class ChargersActiveOrdersSessionPollingInteractor$onChargersAvailable$2 extends FunctionReferenceImpl implements tls {
    public static final ChargersActiveOrdersSessionPollingInteractor$onChargersAvailable$2 b = new ChargersActiveOrdersSessionPollingInteractor$onChargersAvailable$2(1, 0, ChargersExperiment.class, "isEnabled", "isEnabled()Z");

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return Boolean.valueOf(((ChargersExperiment) obj).getB());
    }
}
