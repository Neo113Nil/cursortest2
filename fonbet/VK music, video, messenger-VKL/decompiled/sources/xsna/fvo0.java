package xsna;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.temporal.TemporalAmount;

/* compiled from: TimeRangeFilterUtils.kt */
/* loaded from: classes12.dex */
public final class fvo0 {
    public static final Duration a = Duration.ofDays(1);

    public static final cvo0<?> a(dvo0 dvo0Var) {
        LocalDateTime localDateTime = dvo0Var.d;
        LocalDateTime localDateTime2 = dvo0Var.c;
        if (localDateTime2 != null || localDateTime != null) {
            if (localDateTime2 == null && localDateTime == null) {
                throw new IllegalArgumentException("TimeRangeFilter should be based on local time");
            }
            if (localDateTime2 == null) {
                localDateTime2 = LocalDateTime.ofInstant(Instant.EPOCH, ZoneOffset.MIN);
            }
            if (localDateTime == null) {
                localDateTime = LocalDateTime.ofInstant(Instant.now().plus((TemporalAmount) Duration.ofDays(1L)), ZoneOffset.MAX);
            }
            return new zvz(localDateTime2, localDateTime);
        }
        if (localDateTime2 != null || localDateTime != null) {
            throw new IllegalArgumentException("TimeRangeFilter should be based on instant time");
        }
        Instant instant = dvo0Var.a;
        if (instant == null) {
            instant = Instant.EPOCH;
        }
        Instant instant2 = dvo0Var.b;
        if (instant2 == null) {
            instant2 = Instant.now();
        }
        return new u7x(instant, instant2);
    }

    public static final dvo0 b(dvo0 dvo0Var) {
        Instant instant = dvo0Var.a;
        Duration duration = a;
        Instant minus = instant != null ? instant.minus((TemporalAmount) duration) : null;
        Instant instant2 = dvo0Var.b;
        LocalDateTime localDateTime = dvo0Var.c;
        return new dvo0(minus, instant2, localDateTime != null ? localDateTime.minus((TemporalAmount) duration) : null, dvo0Var.d);
    }
}
