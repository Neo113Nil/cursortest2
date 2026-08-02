package xsna;

import java.time.Instant;
import java.time.LocalDateTime;

/* compiled from: TimeRangeFilter.kt */
/* loaded from: classes12.dex */
public final class dvo0 {
    public final Instant a;
    public final Instant b;
    public final LocalDateTime c;
    public final LocalDateTime d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public dvo0() {
        this(r0, r0, 15);
        Instant instant = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dvo0)) {
            return false;
        }
        dvo0 dvo0Var = (dvo0) obj;
        return epx.f(this.a, dvo0Var.a) && epx.f(this.b, dvo0Var.b) && epx.f(this.c, dvo0Var.c) && epx.f(this.d, dvo0Var.d);
    }

    public final int hashCode() {
        Instant instant = this.a;
        int hashCode = (instant != null ? instant.hashCode() : 0) * 31;
        Instant instant2 = this.b;
        int hashCode2 = (hashCode + (instant2 != null ? instant2.hashCode() : 0)) * 31;
        LocalDateTime localDateTime = this.c;
        int hashCode3 = (hashCode2 + (localDateTime != null ? localDateTime.hashCode() : 0)) * 31;
        LocalDateTime localDateTime2 = this.d;
        return hashCode3 + (localDateTime2 != null ? localDateTime2.hashCode() : 0);
    }

    public /* synthetic */ dvo0(Instant instant, Instant instant2, int i) {
        this((i & 1) != 0 ? null : instant, (i & 2) != 0 ? null : instant2, null, null);
    }

    public dvo0(Instant instant, Instant instant2, LocalDateTime localDateTime, LocalDateTime localDateTime2) {
        this.a = instant;
        this.b = instant2;
        this.c = localDateTime;
        this.d = localDateTime2;
    }
}
