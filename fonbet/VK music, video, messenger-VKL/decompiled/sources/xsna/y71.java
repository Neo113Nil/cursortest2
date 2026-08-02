package xsna;

import android.os.ext.SdkExtensions;
import androidx.health.connect.client.aggregate.AggregateMetric;
import java.util.Set;

/* compiled from: AggregationExtensions.kt */
/* loaded from: classes12.dex */
public final class y71 {
    public static final Set<AggregateMetric<?>> a = rl3.y0(new AggregateMetric[]{jg7.q, jg7.s, jg7.r, jg7.n, jg7.p, jg7.o, dqk.g, dqk.i, dqk.h, yn70.I0, gkk0.h, gkk0.j, gkk0.i, r0l0.g, r0l0.i, r0l0.h});

    public static final boolean a(AggregateMetric<?> aggregateMetric) {
        int extensionVersion;
        extensionVersion = SdkExtensions.getExtensionVersion(34);
        return extensionVersion >= 10 || !a.contains(aggregateMetric);
    }
}
