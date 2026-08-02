package xsna;

import androidx.health.connect.client.aggregate.AggregateMetric;
import androidx.health.platform.client.proto.q0;

/* compiled from: AggregateMetricToProto.kt */
/* loaded from: classes12.dex */
public final class r71 {
    public static final androidx.health.platform.client.proto.q0 a(AggregateMetric<?> aggregateMetric) {
        q0.a w = androidx.health.platform.client.proto.q0.w();
        String str = aggregateMetric.b;
        w.j();
        androidx.health.platform.client.proto.q0.v((androidx.health.platform.client.proto.q0) w.c, str);
        String h = aggregateMetric.c.h();
        w.j();
        androidx.health.platform.client.proto.q0.s((androidx.health.platform.client.proto.q0) w.c, h);
        String str2 = aggregateMetric.d;
        if (str2 != null) {
            w.j();
            androidx.health.platform.client.proto.q0.t((androidx.health.platform.client.proto.q0) w.c, str2);
        }
        return w.e();
    }
}
