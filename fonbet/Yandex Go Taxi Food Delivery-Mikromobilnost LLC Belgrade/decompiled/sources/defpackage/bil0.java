package defpackage;

/* loaded from: classes8.dex */
public final class bil0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public bil0(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bil0)) {
            return false;
        }
        bil0 bil0Var = (bil0) obj;
        return jl40.l(this.a, bil0Var.a) && jl40.l(this.b, bil0Var.b) && jl40.l(this.c, bil0Var.c) && jl40.l(this.d, bil0Var.d);
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
        StringBuilder sb = new StringBuilder("Params(service=");
        sb.append(this.a);
        sb.append(", version=");
        sb.append(this.b);
        sb.append(", requestId=");
        sb.append(this.c);
        sb.append(", additional=");
        return b64.p(sb, this.d, ')');
    }
}
