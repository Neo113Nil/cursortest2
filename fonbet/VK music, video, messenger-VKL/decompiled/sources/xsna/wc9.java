package xsna;

import com.vk.log.L;
import com.vk.voip.api.metrics.CallsMetricsTracker;

/* compiled from: CallsDauMetricImpl.kt */
/* loaded from: classes7.dex */
public final class wc9 {
    public final CallsMetricsTracker a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;

    public wc9(CallsMetricsTracker callsMetricsTracker) {
        this.a = callsMetricsTracker;
    }

    public final void a() {
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = false;
    }

    public final void b() {
        this.c = true;
        if (!this.b || this.e) {
            return;
        }
        L.e("CallsDauMetric", "camera in call tracked");
        this.a.c(yc9.d);
        this.e = true;
    }

    public final void c(vc9 vc9Var) {
        if (vc9Var.b || vc9Var.c || this.d) {
            return;
        }
        this.b = true;
        boolean z = this.c;
        CallsMetricsTracker callsMetricsTracker = this.a;
        if (z && !this.e) {
            L.e("CallsDauMetric", "camera in call tracked");
            callsMetricsTracker.c(yc9.d);
            this.e = true;
        }
        if (vc9Var.a) {
            L.e("CallsDauMetric", "group call connected tracked");
            callsMetricsTracker.c(yc9.c);
        } else {
            L.e("CallsDauMetric", "one to one call connected tracked");
            callsMetricsTracker.c(yc9.b);
        }
        this.d = true;
    }
}
