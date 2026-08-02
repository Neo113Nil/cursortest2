package xsna;

import java.util.List;
import java.util.Locale;

/* compiled from: OverrideDomainConfig.kt */
/* loaded from: classes.dex */
public final class hil0 {
    public final String a;
    public final String b;
    public final int c;

    /* compiled from: OverrideDomainConfig.kt */
    public static final class a {
        public static hil0 a(String str) {
            String obj = drm0.p0(str).toString();
            String str2 = null;
            if (obj.length() <= 0) {
                obj = null;
            }
            if (obj == null) {
                return null;
            }
            Locale locale = Locale.ROOT;
            List c0 = drm0.c0(obj.toLowerCase(locale), new String[]{"="}, 3, 2);
            int size = c0.size();
            int i = 0;
            if (size == 2) {
                return new hil0((String) c0.get(0), (String) c0.get(1), 4, i);
            }
            if (size != 3) {
                return new hil0(obj.toLowerCase(locale), str2, 6, i);
            }
            String str3 = (String) c0.get(0);
            String str4 = (String) c0.get(1);
            Integer m = arm0.m(10, (String) c0.get(2));
            return new hil0(str3, str4, m != null ? m.intValue() : Integer.MAX_VALUE);
        }
    }

    public hil0(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hil0)) {
            return false;
        }
        hil0 hil0Var = (hil0) obj;
        return epx.f(this.a, hil0Var.a) && epx.f(this.b, hil0Var.b) && this.c == hil0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + urd0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoreBuild(store=");
        sb.append(this.a);
        sb.append(", buildType=");
        sb.append(this.b);
        sb.append(", minBuild=");
        return vu5.b(sb, this.c, ')');
    }

    public /* synthetic */ hil0(String str, String str2, int i, int i2) {
        this(str, (i & 2) != 0 ? "" : str2, Integer.MAX_VALUE);
    }
}
