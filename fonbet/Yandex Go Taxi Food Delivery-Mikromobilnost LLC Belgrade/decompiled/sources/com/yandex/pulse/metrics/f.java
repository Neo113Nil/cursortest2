package com.yandex.pulse.metrics;

import defpackage.i3y;
import defpackage.qd20;
import defpackage.sd20;
import defpackage.td20;
import defpackage.tls;

/* loaded from: classes8.dex */
public final class f {
    public final MetricsState a;
    public boolean b;
    public final i3y c = kotlin.a.a(StabilityMetricsProvider$appResumeHistogram$2.w);

    public f(MetricsState metricsState) {
        this.a = metricsState;
    }

    public final void a(tls tlsVar, boolean z) {
        MetricsState metricsState = this.a;
        qd20 qd20Var = metricsState.d;
        com.google.protobuf.n builder = qd20Var.o().toBuilder();
        tlsVar.invoke(builder);
        qd20Var.t((td20) ((sd20) builder).build());
        if (z) {
            metricsState.a();
        }
    }
}
