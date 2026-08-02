package xsna;

import java.time.Instant;

/* compiled from: TimeRange.kt */
/* loaded from: classes12.dex */
public final class u7x implements cvo0<Instant> {
    public final Instant a;
    public final Instant b;

    public u7x(Instant instant, Instant instant2) {
        this.a = instant;
        this.b = instant2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7x)) {
            return false;
        }
        u7x u7xVar = (u7x) obj;
        return epx.f(this.a, u7xVar.a) && epx.f(this.b, u7xVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InstantTimeRange(startTime=" + this.a + ", endTime=" + this.b + ')';
    }
}
