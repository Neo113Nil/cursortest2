package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: LineHeightStyle.kt */
/* loaded from: classes11.dex */
public final class t7z {
    public static final t7z d = new t7z(a.c, 17, 0);
    public final float a;
    public final int b;
    public final int c;

    /* compiled from: LineHeightStyle.kt */
    @vby
    public static final class a {
        public static final float b;
        public static final float c;
        public static final float d;
        public final float a;

        static {
            a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            a(0.5f);
            b = 0.5f;
            a(-1.0f);
            c = -1.0f;
            a(1.0f);
            d = 1.0f;
        }

        public static void a(float f) {
            if ((UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT > f || f > 1.0f) && f != -1.0f) {
                vzw.c("topRatio should be in [0..1] range or -1");
            }
        }

        public static String b(float f) {
            if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return "LineHeightStyle.Alignment.Top";
            }
            if (f == b) {
                return "LineHeightStyle.Alignment.Center";
            }
            if (f == c) {
                return "LineHeightStyle.Alignment.Proportional";
            }
            if (f == d) {
                return "LineHeightStyle.Alignment.Bottom";
            }
            return "LineHeightStyle.Alignment(topPercentage = " + f + ')';
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return Float.compare(this.a, ((a) obj).a) == 0;
            }
            return false;
        }

        public final int hashCode() {
            return Float.hashCode(this.a);
        }

        public final String toString() {
            return b(this.a);
        }
    }

    /* compiled from: LineHeightStyle.kt */
    @vby
    public static final class b {
        public final int a;

        public /* synthetic */ b(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.a == ((b) obj).a;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            int i = this.a;
            return i == 0 ? "LineHeightStyle.Mode.Fixed" : i == 1 ? "LineHeightStyle.Mode.Minimum" : i == 2 ? "LineHeightStyle.Mode.Tight" : "Invalid";
        }
    }

    /* compiled from: LineHeightStyle.kt */
    @vby
    public static final class c {
        public final int a;

        public final boolean equals(Object obj) {
            if (obj instanceof c) {
                return this.a == ((c) obj).a;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            int i = this.a;
            return i == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i == 17 ? "LineHeightStyle.Trim.Both" : i == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
        }
    }

    public t7z(float f, int i, int i2) {
        this.a = f;
        this.b = i;
        this.c = i2;
    }

    public static t7z a(t7z t7zVar) {
        float f = t7zVar.a;
        int i = t7zVar.c;
        t7zVar.getClass();
        return new t7z(f, 0, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t7z)) {
            return false;
        }
        t7z t7zVar = (t7z) obj;
        float f = t7zVar.a;
        float f2 = a.b;
        return Float.compare(this.a, f) == 0 && this.b == t7zVar.b && this.c == t7zVar.c;
    }

    public final int hashCode() {
        float f = a.b;
        return Integer.hashCode(this.c) + shy.a(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineHeightStyle(alignment=");
        sb.append((Object) a.b(this.a));
        sb.append(", trim=");
        String str = "Invalid";
        int i = this.b;
        sb.append((Object) (i == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i == 17 ? "LineHeightStyle.Trim.Both" : i == 0 ? "LineHeightStyle.Trim.None" : "Invalid"));
        sb.append(",mode=");
        int i2 = this.c;
        if (i2 == 0) {
            str = "LineHeightStyle.Mode.Fixed";
        } else if (i2 == 1) {
            str = "LineHeightStyle.Mode.Minimum";
        } else if (i2 == 2) {
            str = "LineHeightStyle.Mode.Tight";
        }
        return tq.f(sb, str, ')');
    }
}
