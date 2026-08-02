package xsna;

/* compiled from: ConfirmPhoneArgs.kt */
/* loaded from: classes15.dex */
public final class v2j {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String g;

    public v2j(String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
        this.g = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2j)) {
            return false;
        }
        v2j v2jVar = (v2j) obj;
        return epx.f(this.a, v2jVar.a) && epx.f(this.b, v2jVar.b) && epx.f(this.c, v2jVar.c) && epx.f(this.d, v2jVar.d) && epx.f(this.e, v2jVar.e) && this.f == v2jVar.f && epx.f(this.g, v2jVar.g);
    }

    public final int hashCode() {
        String str = this.a;
        int a = urd0.a((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        int hashCode = (a + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int b = qoy.b((hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f);
        String str5 = this.g;
        return b + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConfirmPhoneArgs(phone=");
        sb.append(this.a);
        sb.append(", sid=");
        sb.append(this.b);
        sb.append(", code=");
        sb.append(this.c);
        sb.append(", sessionId=");
        sb.append(this.d);
        sb.append(", token=");
        sb.append(this.e);
        sb.append(", isCodeAutocomplete=");
        sb.append(this.f);
        sb.append(", verificationType=");
        return ho8.a(sb, this.g, ')');
    }
}
