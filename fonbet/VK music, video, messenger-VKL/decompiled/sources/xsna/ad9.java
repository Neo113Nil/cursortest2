package xsna;

import com.vk.voip.api.metrics.CallsMetricsTracker;

/* compiled from: CallsMetricsImpl.kt */
/* loaded from: classes7.dex */
public final class ad9 implements zc9 {
    public final wc9 a;
    public final dc9 b;

    public ad9(CallsMetricsTracker callsMetricsTracker) {
        this.a = new wc9(callsMetricsTracker);
        this.b = new dc9(callsMetricsTracker);
    }

    @Override // xsna.zc9
    public final dc9 a() {
        return this.b;
    }

    @Override // xsna.zc9
    public final wc9 b() {
        return this.a;
    }
}
