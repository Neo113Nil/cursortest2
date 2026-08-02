package xsna;

/* compiled from: AppPerfInfo.kt */
/* loaded from: classes6.dex */
public final class v73 {
    public final long a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Boolean h;

    public v73(long j, String str, boolean z, String str2, String str3, String str4, String str5, Boolean bool) {
        this.a = j;
        this.b = str;
        this.c = z;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = bool;
    }

    public final long a() {
        return this.a;
    }

    public final boolean b() {
        return this.c;
    }

    public final String c() {
        return this.e;
    }

    public final String d() {
        return this.f;
    }

    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v73)) {
            return false;
        }
        v73 v73Var = (v73) obj;
        return this.a == v73Var.a && epx.f(this.b, v73Var.b) && this.c == v73Var.c && epx.f(this.d, v73Var.d) && epx.f(this.e, v73Var.e) && epx.f(this.f, v73Var.f) && epx.f(this.g, v73Var.g) && epx.f(this.h, v73Var.h);
    }

    public final String f() {
        return this.d;
    }

    public final String g() {
        return this.g;
    }

    public final Boolean h() {
        return this.h;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        int b = qoy.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        int hashCode2 = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.h;
        return hashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppPerfInfo(appId=");
        sb.append(this.a);
        sb.append(", trackCode=");
        sb.append(this.b);
        sb.append(", fromCache=");
        sb.append(this.c);
        sb.append(", urlToLoad=");
        sb.append(this.d);
        sb.append(", sourceUrl=");
        sb.append(this.e);
        sb.append(", specialUrl=");
        sb.append(this.f);
        sb.append(", webViewUrl=");
        sb.append(this.g);
        sb.append(", isApp=");
        return tn.a(sb, this.h, ')');
    }
}
