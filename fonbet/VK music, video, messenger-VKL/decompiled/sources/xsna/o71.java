package xsna;

import androidx.health.connect.client.aggregate.AggregateMetric;
import java.time.Duration;
import java.util.Set;

/* compiled from: AggregateGroupByDurationRequest.kt */
/* loaded from: classes12.dex */
public final class o71 {
    public final Set<AggregateMetric<?>> a;
    public final dvo0 b;
    public final Duration c;
    public final Set<luk> d;

    /* JADX WARN: Multi-variable type inference failed */
    public o71(Set<? extends AggregateMetric<?>> set, dvo0 dvo0Var, Duration duration, Set<luk> set2) {
        this.a = set;
        this.b = dvo0Var;
        this.c = duration;
        this.d = set2;
        if ((dvo0Var.c != null || dvo0Var.d != null) && !duration.equals(Duration.ofMinutes(duration.toMinutes()))) {
            throw new IllegalArgumentException("Either set Duration with at least MINUTE units or use AggregateGroupByPeriodRequest");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!o71.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        o71 o71Var = (o71) obj;
        return epx.f(this.a, o71Var.a) && epx.f(this.b, o71Var.b) && epx.f(this.c, o71Var.c) && epx.f(this.d, o71Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
