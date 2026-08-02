package xsna;

import android.health.connect.LocalTimeRangeFilter;
import android.health.connect.TimeInstantRangeFilter;
import android.health.connect.TimeRangeFilter;
import android.health.connect.datatypes.AggregationType;
import androidx.health.connect.client.aggregate.AggregateMetric;
import java.time.LocalDateTime;

/* compiled from: RequestConverters.kt */
/* loaded from: classes12.dex */
public final class l7g0 {
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.Map] */
    public static final AggregationType<Object> a(AggregateMetric<? extends Object> aggregateMetric) {
        AggregationType<Object> b = vw6.b(ib1.a.get(aggregateMetric));
        if (b != null || (b = vw6.b(ib1.b.get(aggregateMetric))) != null || (b = vw6.b(ib1.c.get(aggregateMetric))) != null || (b = vw6.b(ib1.f.get(aggregateMetric))) != null || (b = vw6.b(ib1.d.get(aggregateMetric))) != null || (b = vw6.b(ib1.e.get(aggregateMetric))) != null || (b = vw6.b(ib1.g.get(aggregateMetric))) != null || (b = vw6.b(ib1.h.get(aggregateMetric))) != null || (b = vw6.b(ib1.i.get(aggregateMetric))) != null || (b = vw6.b(ib1.j.get(aggregateMetric))) != null || (b = vw6.b(ib1.k.get(aggregateMetric))) != null) {
            return b;
        }
        AggregationType<Object> b2 = vw6.b(ib1.l.get(aggregateMetric));
        if (b2 != null) {
            return b2;
        }
        throw new IllegalArgumentException("Unsupported aggregation type " + aggregateMetric.a());
    }

    public static final TimeRangeFilter b(dvo0 dvo0Var) {
        LocalTimeRangeFilter.Builder startTime;
        LocalTimeRangeFilter.Builder endTime;
        LocalTimeRangeFilter build;
        TimeInstantRangeFilter.Builder startTime2;
        TimeInstantRangeFilter.Builder endTime2;
        TimeInstantRangeFilter build2;
        LocalDateTime localDateTime = dvo0Var.c;
        LocalDateTime localDateTime2 = dvo0Var.d;
        if (localDateTime == null && localDateTime2 == null) {
            startTime2 = t81.a().setStartTime(dvo0Var.a);
            endTime2 = startTime2.setEndTime(dvo0Var.b);
            build2 = endTime2.build();
            return g81.a(build2);
        }
        startTime = s81.a().setStartTime(dvo0Var.c);
        endTime = startTime.setEndTime(localDateTime2);
        build = endTime.build();
        return g81.a(build);
    }
}
