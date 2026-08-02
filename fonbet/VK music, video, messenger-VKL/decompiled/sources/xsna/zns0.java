package xsna;

/* compiled from: VideoGrowthBombingFeatureConfig.kt */
/* loaded from: classes6.dex */
public final class zns0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public zns0(String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zns0)) {
            return false;
        }
        zns0 zns0Var = (zns0) obj;
        return epx.f(this.a, zns0Var.a) && epx.f(this.b, zns0Var.b) && epx.f(this.c, zns0Var.c) && epx.f(this.d, zns0Var.d) && epx.f(this.e, zns0Var.e) && epx.f(this.f, zns0Var.f);
    }

    public final int hashCode() {
        int a = urd0.a(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoGrowthBombConfig(id=");
        sb.append(this.a);
        sb.append(", link=");
        sb.append(this.b);
        sb.append(", huaweiLink=");
        sb.append(this.c);
        sb.append(", rustoreLink=");
        sb.append(this.d);
        sb.append(", samsungLink=");
        sb.append(this.e);
        sb.append(", xiaomiLink=");
        return ho8.a(sb, this.f, ')');
    }
}
