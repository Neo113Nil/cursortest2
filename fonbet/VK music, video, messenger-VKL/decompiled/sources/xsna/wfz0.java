package xsna;

import java.util.Map;

/* loaded from: classes9.dex */
public final class wfz0 {
    public final String a;
    public final String b;
    public final Map<String, String> c;

    public wfz0() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wfz0)) {
            return false;
        }
        wfz0 wfz0Var = (wfz0) obj;
        return epx.f(this.a, wfz0Var.a) && epx.f(this.b, wfz0Var.b) && epx.f(this.c, wfz0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MigrationDtoVer1(uuid=");
        sb.append((Object) ("MetricsEventUuid(value=" + this.a + ')'));
        sb.append(", eventName=");
        sb.append(this.b);
        sb.append(", eventData=");
        return cjl0.a(sb, this.c, ')');
    }

    public wfz0(String str, String str2, Map map) {
        this.a = str;
        this.b = str2;
        this.c = map;
    }
}
