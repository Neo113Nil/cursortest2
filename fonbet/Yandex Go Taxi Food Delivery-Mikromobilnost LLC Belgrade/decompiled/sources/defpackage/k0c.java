package defpackage;

import com.yandex.pulse.metrics.MetricsState;

/* loaded from: classes8.dex */
public final class k0c {
    public final MetricsState a;
    public final boolean b;

    public k0c(MetricsState metricsState) {
        this.a = metricsState;
        qd20 qd20Var = metricsState.d;
        this.b = (qd20Var.q() && qd20Var.o().hasIsExitedCleanly()) ? qd20Var.o().getIsExitedCleanly() : true;
    }

    public final void a(boolean z) {
        MetricsState metricsState = this.a;
        qd20 qd20Var = metricsState.d;
        sd20 sd20Var = (sd20) qd20Var.o().toBuilder();
        sd20Var.g(z);
        qd20Var.t((td20) sd20Var.build());
        metricsState.a();
    }
}
