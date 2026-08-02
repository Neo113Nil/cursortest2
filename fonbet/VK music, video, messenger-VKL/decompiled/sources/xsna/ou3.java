package xsna;

import java.util.List;

/* compiled from: AspectRatio.kt */
/* loaded from: classes7.dex */
public final class ou3 {
    public final int a;
    public final int b;

    /* compiled from: AspectRatio.kt */
    public static final class a {
        public static ou3 a(String str) {
            List b0 = drm0.b0(str, new char[]{':'}, 0, 6);
            String str2 = (String) j5g.b0(0, b0);
            Integer m = str2 != null ? arm0.m(10, str2) : null;
            String str3 = (String) j5g.b0(1, b0);
            Integer m2 = str3 != null ? arm0.m(10, str3) : null;
            if (m == null || m.intValue() <= 0 || m2 == null || m2.intValue() <= 0) {
                throw new IllegalArgumentException("Illegal aspect ratio format: ".concat(str));
            }
            return new ou3(m.intValue(), m2.intValue());
        }
    }

    public ou3(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ou3)) {
            return false;
        }
        ou3 ou3Var = (ou3) obj;
        return this.a == ou3Var.a && this.b == ou3Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(':');
        sb.append(this.b);
        return sb.toString();
    }
}
