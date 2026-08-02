package xsna;

/* compiled from: NativeAdAnalyticsData.kt */
/* loaded from: classes14.dex */
public final class av50 {
    public final String a;
    public final double b;
    public final String c;
    public final String d;

    public av50(double d, String str, String str2, String str3) {
        this.a = str;
        this.b = d;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof av50)) {
            return false;
        }
        av50 av50Var = (av50) obj;
        return epx.f(this.a, av50Var.a) && Double.compare(this.b, av50Var.b) == 0 && epx.f(this.c, av50Var.c) && epx.f(this.d, av50Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int b = zjh0.b(this.b, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.c;
        int hashCode = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return hashCode + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NativeAdAnalyticsData(revenuePrecision=");
        sb.append(this.a);
        sb.append(", revenue=");
        sb.append(this.b);
        sb.append(", creativeId=");
        sb.append(this.c);
        sb.append(", dspName=");
        return ho8.a(sb, this.d, ')');
    }
}
