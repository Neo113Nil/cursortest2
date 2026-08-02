package xsna;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Objects;

/* compiled from: DisplayShapeCompat.java */
/* loaded from: classes.dex */
public final class egn {
    public final a a;

    /* compiled from: DisplayShapeCompat.java */
    public static class a {
        public final String a;
        public final int b;
        public final int c;

        public a(String str, int i, int i2) {
            this.a = str;
            this.b = i;
            this.c = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            Integer valueOf = Integer.valueOf(this.b);
            Integer valueOf2 = Integer.valueOf(this.c);
            Float valueOf3 = Float.valueOf(1.0f);
            return Objects.hash(this.a, valueOf, valueOf2, valueOf3, 0, 0, 0, valueOf3);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DisplayShapeCompat{ spec=");
            String str = this.a;
            sb.append(str != null ? Integer.valueOf(str.hashCode()) : "null");
            sb.append(" displayWidth=");
            sb.append(this.b);
            sb.append(" displayHeight=");
            return h5s.c(this.c, " physicalPixelDisplaySizeRatio=1.0 rotation=0 offsetX=0 offsetY=0 scale=1.0}", sb);
        }
    }

    static {
        new egn("", 0, 0);
    }

    public egn(String str, int i, int i2) {
        this.a = new a(str, i, i2);
    }

    public static egn a(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        String sb;
        if (z) {
            int i7 = i / 2;
            int i8 = i2 / 2;
            StringBuilder a2 = odj.a(i8, i7, "M0,", " A", StringUtils.COMMA);
            cgn.a(i8, i, " 0 1,1 ", StringUtils.COMMA, a2);
            cgn.a(i8, i7, " A", StringUtils.COMMA, a2);
            sb = rzl.a(i8, i8, " 0 1,1 0,", " Z", a2);
        } else {
            StringBuilder sb2 = new StringBuilder("M ");
            int min = Math.min(i / 2, i2 / 2);
            int min2 = Math.min(min, i3);
            int min3 = Math.min(min, i4);
            int min4 = Math.min(min, i5);
            int min5 = Math.min(min, i6);
            sb2.append(min2);
            sb2.append(",0 L ");
            sb2.append(i - min3);
            sb2.append(",0");
            if (min3 > 0) {
                dgn.a(min3, min3, " A ", StringUtils.COMMA, sb2);
                dgn.a(i, min3, " 0 0,1 ", StringUtils.COMMA, sb2);
            }
            sb2.append(" L ");
            sb2.append(i);
            sb2.append(StringUtils.COMMA);
            sb2.append(i2 - min4);
            if (min4 > 0) {
                dgn.a(min4, min4, " A ", StringUtils.COMMA, sb2);
                sb2.append(" 0 0,1 ");
                sb2.append(i - min4);
                sb2.append(StringUtils.COMMA);
                sb2.append(i2);
            }
            dgn.a(min5, i2, " L ", StringUtils.COMMA, sb2);
            if (min5 > 0) {
                dgn.a(min5, min5, " A ", StringUtils.COMMA, sb2);
                sb2.append(" 0 0,1 0,");
                sb2.append(i2 - min5);
            }
            if (min2 > 0) {
                dgn.a(min2, min2, " L 0,", " A ", sb2);
                dgn.a(min2, min2, StringUtils.COMMA, " 0 0,1 ", sb2);
                sb2.append(",0");
            }
            sb2.append(" Z");
            sb = sb2.toString();
        }
        return new egn(sb, i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof egn) {
            return this.a.equals(((egn) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
