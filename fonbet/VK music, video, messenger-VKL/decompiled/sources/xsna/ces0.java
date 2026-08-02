package xsna;

/* compiled from: VideoDebugInfo.kt */
/* loaded from: classes3.dex */
public final class ces0 {
    public static final ces0 g = new ces0(0, "", "", null, false, 0);
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final int e;
    public final int f;

    public ces0(int i, String str, String str2, String str3, boolean z, int i2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = i;
        this.f = i2;
    }

    public static ces0 a(ces0 ces0Var, String str, String str2, boolean z, String str3, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            str = ces0Var.a;
        }
        String str4 = str;
        if ((i3 & 2) != 0) {
            str2 = ces0Var.b;
        }
        String str5 = str2;
        if ((i3 & 4) != 0) {
            z = ces0Var.c;
        }
        boolean z2 = z;
        if ((i3 & 8) != 0) {
            str3 = ces0Var.d;
        }
        String str6 = str3;
        if ((i3 & 16) != 0) {
            i = ces0Var.e;
        }
        int i4 = i;
        if ((i3 & 32) != 0) {
            i2 = ces0Var.f;
        }
        ces0Var.getClass();
        return new ces0(i4, str4, str5, str6, z2, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ces0)) {
            return false;
        }
        ces0 ces0Var = (ces0) obj;
        return epx.f(this.a, ces0Var.a) && epx.f(this.b, ces0Var.b) && this.c == ces0Var.c && epx.f(this.d, ces0Var.d) && this.e == ces0Var.e && this.f == ces0Var.f;
    }

    public final int hashCode() {
        int b = qoy.b(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return Integer.hashCode(this.f) + shy.a(this.e, (b + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoDebugInfo(contentId=");
        sb.append(this.a);
        sb.append(", sessionId=");
        sb.append(this.b);
        sb.append(", isOndemand=");
        sb.append(this.c);
        sb.append(", interactiveChapterVid=");
        sb.append(this.d);
        sb.append(", currentPoolSize=");
        sb.append(this.e);
        sb.append(", maxPoolSize=");
        return vu5.b(sb, this.f, ')');
    }
}
