package xsna;

import java.time.Instant;
import java.time.ZoneOffset;

/* compiled from: AggregationResultGroupedByDuration.kt */
/* loaded from: classes12.dex */
public final class lb1 {
    public final androidx.health.connect.client.aggregate.c a;
    public final Instant b;
    public final Instant c;
    public final ZoneOffset d;

    public lb1(androidx.health.connect.client.aggregate.c cVar, Instant instant, Instant instant2, ZoneOffset zoneOffset, boolean z) {
        this.a = cVar;
        this.b = instant;
        this.c = instant2;
        this.d = zoneOffset;
        if (!z && !instant.isBefore(instant2)) {
            throw new IllegalArgumentException("start time must be before end time");
        }
    }

    public final androidx.health.connect.client.aggregate.c a() {
        return this.a;
    }

    public final Instant b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!lb1.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        lb1 lb1Var = (lb1) obj;
        return epx.f(this.a, lb1Var.a) && epx.f(this.b, lb1Var.b) && epx.f(this.c, lb1Var.c) && epx.f(this.d, lb1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + w11.c(this.c, w11.c(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "AggregationResultGroupedByDuration(result=" + this.a + ", startTime=" + this.b + ", endTime=" + this.c + ", zoneOffset=" + this.d + ')';
    }
}
