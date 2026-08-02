package xsna;

import com.vk.log.L;
import com.vk.voip.api.metrics.CallsMetricsTracker;

/* compiled from: CallsActiveCallMetricImpl.kt */
/* loaded from: classes7.dex */
public final class dc9 {
    public final CallsMetricsTracker a;
    public boolean b;

    public dc9(CallsMetricsTracker callsMetricsTracker) {
        this.a = callsMetricsTracker;
    }

    public final void a() {
        if (this.b) {
            L.e("CallsActiveCallMetric", "stop tracked");
            this.a.a(yc9.a);
            this.b = false;
        }
    }

    public final void b(cc9 cc9Var) {
        if (this.b || cc9Var.a || cc9Var.b) {
            return;
        }
        L.e("CallsActiveCallMetric", "start tracked");
        this.a.b(yc9.a);
        this.b = true;
    }
}
