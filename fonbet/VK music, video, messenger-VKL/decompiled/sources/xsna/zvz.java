package xsna;

import java.time.LocalDateTime;

/* compiled from: TimeRange.kt */
/* loaded from: classes12.dex */
public final class zvz implements cvo0<LocalDateTime> {
    public final LocalDateTime a;
    public final LocalDateTime b;

    public zvz(LocalDateTime localDateTime, LocalDateTime localDateTime2) {
        this.a = localDateTime;
        this.b = localDateTime2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zvz)) {
            return false;
        }
        zvz zvzVar = (zvz) obj;
        return epx.f(this.a, zvzVar.a) && epx.f(this.b, zvzVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LocalTimeRange(startTime=" + this.a + ", endTime=" + this.b + ')';
    }
}
