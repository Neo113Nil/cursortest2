package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import io.jsonwebtoken.JwtParser;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Version.kt */
/* loaded from: classes12.dex */
public final class aor0 implements Comparable<aor0> {
    public static final aor0 g;
    public final int b;
    public final int c;
    public final int d;
    public final String e;
    public final bpn0 f = new bpn0(new qkd0(this, 18));

    /* compiled from: Version.kt */
    public static final class a {
        public static aor0 a(String str) {
            String group;
            if (str == null || drm0.N(str)) {
                return null;
            }
            Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
            if (!matcher.matches() || (group = matcher.group(1)) == null) {
                return null;
            }
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            if (group2 == null) {
                return null;
            }
            int parseInt2 = Integer.parseInt(group2);
            String group3 = matcher.group(3);
            if (group3 != null) {
                return new aor0(parseInt, parseInt2, Integer.parseInt(group3), matcher.group(4) != null ? matcher.group(4) : "");
            }
            return null;
        }
    }

    static {
        new aor0(0, 0, 0, "");
        g = new aor0(0, 1, 0, "");
        new aor0(1, 0, 0, "");
    }

    public aor0(int i, int i2, int i3, String str) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(aor0 aor0Var) {
        return ((BigInteger) this.f.getValue()).compareTo((BigInteger) aor0Var.f.getValue());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aor0)) {
            return false;
        }
        aor0 aor0Var = (aor0) obj;
        return this.b == aor0Var.b && this.c == aor0Var.c && this.d == aor0Var.d;
    }

    public final int hashCode() {
        return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        String str = this.e;
        String b = !drm0.N(str) ? go9.b("-", str) : "";
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append(JwtParser.SEPARATOR_CHAR);
        sb.append(this.c);
        sb.append(JwtParser.SEPARATOR_CHAR);
        return h5s.c(this.d, b, sb);
    }
}
