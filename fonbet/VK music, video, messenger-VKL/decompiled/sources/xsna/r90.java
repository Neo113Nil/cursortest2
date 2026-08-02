package xsna;

import android.os.Build;
import androidx.health.connect.client.aggregate.AggregateMetric;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.Map;
import kotlin.Pair;
import ru.ok.android.onelog.NetworkClass;

/* compiled from: ActivityIntensityRecord.kt */
/* loaded from: classes12.dex */
public final class r90 implements oox {
    public static final Object g;
    public final Instant a;
    public final ZoneOffset b;
    public final Instant c;
    public final ZoneOffset d;
    public final hi20 e;
    public final int f;

    static {
        AggregateMetric.AggregationType aggregationType = AggregateMetric.AggregationType.DURATION;
        Map k = pn00.k(new Pair(NetworkClass.MODERATE, 0), new Pair("vigorous", 1));
        g = k;
        v3r0.g(k);
    }

    public r90(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, hi20 hi20Var, int i) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = instant2;
        this.d = zoneOffset2;
        this.e = hi20Var;
        this.f = i;
        if (Build.VERSION.SDK_INT >= 34) {
            dhf0.b(this);
        } else if (!instant.isBefore(instant2)) {
            throw new IllegalArgumentException("startTime must be before endTime.");
        }
    }

    @Override // xsna.oox
    public final Instant a() {
        return this.a;
    }

    @Override // xsna.oox
    public final Instant b() {
        return this.c;
    }

    @Override // xsna.oox
    public final ZoneOffset c() {
        return this.d;
    }

    @Override // xsna.oox
    public final ZoneOffset d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r90)) {
            return false;
        }
        r90 r90Var = (r90) obj;
        return this.f == r90Var.f && epx.f(this.a, r90Var.a) && epx.f(this.b, r90Var.b) && epx.f(this.c, r90Var.c) && epx.f(this.d, r90Var.d) && epx.f(this.e, r90Var.e);
    }

    @Override // xsna.zef0
    public final hi20 getMetadata() {
        throw null;
    }

    public final int hashCode() {
        int c = w11.c(this.a, Integer.hashCode(this.f) * 31, 31);
        ZoneOffset zoneOffset = this.b;
        int c2 = w11.c(this.c, (c + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.d;
        return this.e.hashCode() + ((c2 + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityIntensityRecord(startTime=");
        sb.append(this.a);
        sb.append(", startZoneOffset=");
        sb.append(this.b);
        sb.append(", endTime=");
        sb.append(this.c);
        sb.append(", endZoneOffset=");
        sb.append(this.d);
        sb.append(", activityIntensityType=");
        sb.append(this.f);
        sb.append(", metadata=");
        return defpackage.j0.c(sb, this.e, ')');
    }
}
