package xsna;

/* compiled from: QrInfoResponse.kt */
/* loaded from: classes6.dex */
public final class rtd0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public rtd0(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rtd0)) {
            return false;
        }
        rtd0 rtd0Var = (rtd0) obj;
        return epx.f(this.a, rtd0Var.a) && epx.f(this.b, rtd0Var.b) && epx.f(this.c, rtd0Var.c) && epx.f(this.d, rtd0Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Profile(userFirstName=");
        sb.append(this.a);
        sb.append(", userLastName=");
        sb.append(this.b);
        sb.append(", phone=");
        sb.append(this.c);
        sb.append(", userAvatarUrl=");
        return ho8.a(sb, this.d, ')');
    }
}
