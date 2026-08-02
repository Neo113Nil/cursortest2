package xsna;

/* compiled from: MiniAppLaunchDto.kt */
/* loaded from: classes7.dex */
public final class mq20 {
    public String a;
    public final String b;
    public final String c;
    public final String d;
    public String e;
    public final String f;
    public final String g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mq20() {
        this(r1, r2, r3, r4, 127, (String) null, (String) null);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mq20)) {
            return false;
        }
        mq20 mq20Var = (mq20) obj;
        return epx.f(this.a, mq20Var.a) && epx.f(this.b, mq20Var.b) && epx.f(this.c, mq20Var.c) && epx.f(this.d, mq20Var.d) && epx.f(this.e, mq20Var.e) && epx.f(this.f, mq20Var.f) && epx.f(this.g, mq20Var.g);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.g;
        return hashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MiniAppUrls(viewUrl=");
        sb.append(this.a);
        sb.append(", originalUrl=");
        sb.append(this.b);
        sb.append(", appUrl=");
        sb.append(this.c);
        sb.append(", sourceUrl=");
        sb.append(this.d);
        sb.append(", specialUrl=");
        sb.append(this.e);
        sb.append(", actionUrl=");
        sb.append(this.f);
        sb.append(", linkParams=");
        return ho8.a(sb, this.g, ')');
    }

    public /* synthetic */ mq20(String str, String str2, String str3, String str4, int i, String str5, String str6) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (String) null, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6);
    }

    public mq20(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }
}
