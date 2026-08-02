package ru.ok.tracer.lite.performance.metrics;

import java.util.Map;
import xsna.bh10;
import xsna.epx;
import xsna.jh;
import xsna.rqi;
import xsna.urd0;

/* compiled from: PerfSampleLite.kt */
/* loaded from: classes9.dex */
public final class PerfSampleLite {
    private final Map<String, Object> attributes;
    private final String name;
    private final String sessionUuid;
    private final long timeUnixNano;
    private final String unit;
    private final long value;

    public PerfSampleLite(String str, long j, String str2, long j2, String str3, Map<String, ? extends Object> map) {
        this.sessionUuid = str;
        this.timeUnixNano = j;
        this.name = str2;
        this.value = j2;
        this.unit = str3;
        this.attributes = map;
    }

    public static /* synthetic */ PerfSampleLite copy$default(PerfSampleLite perfSampleLite, String str, long j, String str2, long j2, String str3, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = perfSampleLite.sessionUuid;
        }
        if ((i & 2) != 0) {
            j = perfSampleLite.timeUnixNano;
        }
        if ((i & 4) != 0) {
            str2 = perfSampleLite.name;
        }
        if ((i & 8) != 0) {
            j2 = perfSampleLite.value;
        }
        if ((i & 16) != 0) {
            str3 = perfSampleLite.unit;
        }
        if ((i & 32) != 0) {
            map = perfSampleLite.attributes;
        }
        String str4 = str2;
        return perfSampleLite.copy(str, j, str4, j2, str3, map);
    }

    public final String component1() {
        return this.sessionUuid;
    }

    public final long component2() {
        return this.timeUnixNano;
    }

    public final String component3() {
        return this.name;
    }

    public final long component4() {
        return this.value;
    }

    public final String component5() {
        return this.unit;
    }

    public final Map<String, Object> component6() {
        return this.attributes;
    }

    public final PerfSampleLite copy(String str, long j, String str2, long j2, String str3, Map<String, ? extends Object> map) {
        return new PerfSampleLite(str, j, str2, j2, str3, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PerfSampleLite)) {
            return false;
        }
        PerfSampleLite perfSampleLite = (PerfSampleLite) obj;
        return epx.f(this.sessionUuid, perfSampleLite.sessionUuid) && this.timeUnixNano == perfSampleLite.timeUnixNano && epx.f(this.name, perfSampleLite.name) && this.value == perfSampleLite.value && epx.f(this.unit, perfSampleLite.unit) && epx.f(this.attributes, perfSampleLite.attributes);
    }

    public final Map<String, Object> getAttributes() {
        return this.attributes;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSessionUuid() {
        return this.sessionUuid;
    }

    public final long getTimeUnixNano() {
        return this.timeUnixNano;
    }

    public final String getUnit() {
        return this.unit;
    }

    public final long getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.attributes.hashCode() + urd0.a(bh10.a(urd0.a(bh10.a(this.sessionUuid.hashCode() * 31, 31, this.timeUnixNano), 31, this.name), 31, this.value), 31, this.unit);
    }

    public String toString() {
        String str = this.sessionUuid;
        long j = this.timeUnixNano;
        String str2 = this.name;
        long j2 = this.value;
        String str3 = this.unit;
        Map<String, Object> map = this.attributes;
        StringBuilder d = rqi.d(j, "PerfSampleLite(sessionUuid=", str, ", timeUnixNano=");
        jh.f(d, ", name=", str2, ", value=");
        d.append(j2);
        d.append(", unit=");
        d.append(str3);
        d.append(", attributes=");
        d.append(map);
        d.append(")");
        return d.toString();
    }
}
