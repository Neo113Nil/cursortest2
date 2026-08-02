package xsna;

import androidx.health.platform.client.proto.b1;
import java.time.Instant;
import java.time.LocalDateTime;

/* compiled from: TimeRangeFilterConverter.kt */
/* loaded from: classes12.dex */
public final class evo0 {
    public static final androidx.health.platform.client.proto.b1 a(dvo0 dvo0Var) {
        b1.a x = androidx.health.platform.client.proto.b1.x();
        Instant instant = dvo0Var.a;
        if (instant != null) {
            long epochMilli = instant.toEpochMilli();
            x.j();
            androidx.health.platform.client.proto.b1.t((androidx.health.platform.client.proto.b1) x.c, epochMilli);
        }
        Instant instant2 = dvo0Var.b;
        if (instant2 != null) {
            long epochMilli2 = instant2.toEpochMilli();
            x.j();
            androidx.health.platform.client.proto.b1.u((androidx.health.platform.client.proto.b1) x.c, epochMilli2);
        }
        LocalDateTime localDateTime = dvo0Var.c;
        if (localDateTime != null) {
            String localDateTime2 = localDateTime.toString();
            x.j();
            androidx.health.platform.client.proto.b1.v((androidx.health.platform.client.proto.b1) x.c, localDateTime2);
        }
        LocalDateTime localDateTime3 = dvo0Var.d;
        if (localDateTime3 != null) {
            String localDateTime4 = localDateTime3.toString();
            x.j();
            androidx.health.platform.client.proto.b1.w((androidx.health.platform.client.proto.b1) x.c, localDateTime4);
        }
        return x.e();
    }
}
