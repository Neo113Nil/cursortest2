package xsna;

import androidx.health.connect.client.aggregate.AggregateMetric;
import com.huawei.hms.hihealth.HiHealthActivities;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.Map;
import kotlin.Pair;

/* compiled from: MindfulnessSessionRecord.kt */
/* loaded from: classes12.dex */
public final class mo20 implements oox {
    public static final Object i;
    public final Instant a;
    public final ZoneOffset b;
    public final Instant c;
    public final ZoneOffset d;
    public final hi20 e;
    public final int f;
    public final String g;
    public final String h;

    static {
        AggregateMetric.AggregationType aggregationType = AggregateMetric.AggregationType.DURATION;
        Map k = pn00.k(new Pair("breathing", 2), new Pair(HiHealthActivities.MEDITATION, 1), new Pair("movement", 4), new Pair("music", 3), new Pair("unguided", 5), new Pair("unknown", 0));
        i = k;
        v3r0.g(k);
    }

    public mo20(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, hi20 hi20Var, int i2, String str, String str2) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = instant2;
        this.d = zoneOffset2;
        this.e = hi20Var;
        this.f = i2;
        this.g = str;
        this.h = str2;
        if (!instant.isBefore(instant2)) {
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
        if (!(obj instanceof mo20)) {
            return false;
        }
        mo20 mo20Var = (mo20) obj;
        return this.f == mo20Var.f && epx.f(this.g, mo20Var.g) && epx.f(this.h, mo20Var.h) && epx.f(this.a, mo20Var.a) && epx.f(this.b, mo20Var.b) && epx.f(this.c, mo20Var.c) && epx.f(this.d, mo20Var.d) && epx.f(this.e, mo20Var.e);
    }

    @Override // xsna.zef0
    public final hi20 getMetadata() {
        throw null;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f) * 31;
        String str = this.g;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.h;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        ZoneOffset zoneOffset = this.b;
        int c = w11.c(this.c, (hashCode3 + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.d;
        return this.e.hashCode() + ((c + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MindfulnessSessionRecord(startTime=");
        sb.append(this.a);
        sb.append(", startZoneOffset=");
        sb.append(this.b);
        sb.append(", endTime=");
        sb.append(this.c);
        sb.append(", endZoneOffset=");
        sb.append(this.d);
        sb.append(", mindfulnessSessionType=");
        sb.append(this.f);
        sb.append(", title=");
        sb.append(this.g);
        sb.append(", notes=");
        sb.append(this.h);
        sb.append(", metadata=");
        return defpackage.j0.c(sb, this.e, ')');
    }
}
