package defpackage;

/* loaded from: classes2.dex */
public final class fed0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public fed0(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fed0)) {
            return false;
        }
        fed0 fed0Var = (fed0) obj;
        return this.a.equals(fed0Var.a) && jl40.l(this.b, fed0Var.b) && jl40.l(this.c, fed0Var.c) && jl40.l(this.d, fed0Var.d) && jl40.l(this.e, fed0Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlusPayPaymentLoadingContent(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", firstPaymentText=");
        sb.append(this.c);
        sb.append(", nextPaymentText=");
        sb.append(this.d);
        sb.append(", footerText=");
        return b64.p(sb, this.e, ')');
    }
}
