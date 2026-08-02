package defpackage;

import com.yandex.pulse.metrics.MetricsState;
import java.util.UUID;

/* loaded from: classes8.dex */
public final class ld20 {
    public final MetricsState a;

    public ld20(MetricsState metricsState) {
        this.a = metricsState;
        qd20 qd20Var = metricsState.d;
        if (qd20Var.p()) {
            return;
        }
        qd20Var.r(UUID.randomUUID().toString());
        metricsState.a();
    }
}
