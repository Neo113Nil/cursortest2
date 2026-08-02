package xsna;

import java.util.Map;

/* loaded from: classes9.dex */
public final class jiy0 extends be {
    public final String b;
    public final Map<String, String> c;

    public jiy0(String str, Map<String, String> map) {
        this.b = str;
        this.c = map;
    }

    @Override // xsna.be
    public final Map<String, String> P() {
        return this.c;
    }

    @Override // xsna.be
    public final String Q() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jiy0)) {
            return false;
        }
        jiy0 jiy0Var = (jiy0) obj;
        return epx.f(this.b, jiy0Var.b) && epx.f(this.c, jiy0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppUpdateAnalyticsEvent(eventName=");
        sb.append(this.b);
        sb.append(", eventData=");
        return cjl0.a(sb, this.c, ')');
    }
}
