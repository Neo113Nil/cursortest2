package xsna;

/* compiled from: ProfileShortInfo.kt */
/* loaded from: classes6.dex */
public final class pzd0 {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public pzd0(String str, String str2, String str3, String str4, String str5, long j) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final String a() {
        String str = this.b;
        String str2 = this.c;
        if (str2 == null || drm0.N(str2)) {
            if (str == null || drm0.N(str)) {
                return null;
            }
            return str;
        }
        return str + ' ' + str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pzd0)) {
            return false;
        }
        pzd0 pzd0Var = (pzd0) obj;
        return this.a == pzd0Var.a && epx.f(this.b, pzd0Var.b) && epx.f(this.c, pzd0Var.c) && epx.f(this.d, pzd0Var.d) && epx.f(this.e, pzd0Var.e) && epx.f(this.f, pzd0Var.f);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        return (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 961;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProfileShortInfo(userId=");
        sb.append(this.a);
        sb.append(", firstName=");
        sb.append(this.b);
        sb.append(", lastName=");
        sb.append(this.c);
        sb.append(", phone=");
        sb.append(this.d);
        sb.append(", photo200=");
        sb.append(this.e);
        sb.append(", email=");
        return i5s.a(sb, this.f, ", userHash=null, payload=null)");
    }
}
