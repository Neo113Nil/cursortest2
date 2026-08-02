package xsna;

import java.time.Instant;

/* compiled from: ResultGroupByDurationAggregator.kt */
/* loaded from: classes12.dex */
public final class mb1 {
    public final lb1 a;
    public final Instant b;

    public mb1(lb1 lb1Var, Instant instant) {
        this.a = lb1Var;
        this.b = instant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mb1)) {
            return false;
        }
        mb1 mb1Var = (mb1) obj;
        return epx.f(this.a, mb1Var.a) && epx.f(this.b, mb1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AggregationResultGroupedByDurationWithMinTime(aggregationResultGroupedByDuration=" + this.a + ", minTime=" + this.b + ')';
    }
}
