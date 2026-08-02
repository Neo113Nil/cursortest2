package com.yandex.pulse.metrics;

import defpackage.nlu;
import defpackage.vku;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public /* synthetic */ class MetricsService$initializeAndStartService$3 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ((MetricsService) this.receiver).recordDelta((vku) obj, (nlu) obj2);
        return zy11.a;
    }
}
