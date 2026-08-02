package defpackage;

/* loaded from: classes2.dex */
public final class a7e0 {
    public final String a;
    public final String b;
    public final y6e0 c;
    public final String d;

    public a7e0(String str, String str2, y6e0 y6e0Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = y6e0Var;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a7e0)) {
            return false;
        }
        a7e0 a7e0Var = (a7e0) obj;
        return jl40.l(this.a, a7e0Var.a) && jl40.l(this.b, a7e0Var.b) && jl40.l(this.c, a7e0Var.c) && jl40.l(this.d, a7e0Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        y6e0 y6e0Var = this.c;
        int hashCode3 = (hashCode2 + (y6e0Var == null ? 0 : y6e0Var.hashCode())) * 31;
        String str3 = this.d;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Button(textColor=");
        sb.append(this.a);
        sb.append(", backgroundColor=");
        sb.append(this.b);
        sb.append(", action=");
        sb.append(this.c);
        sb.append(", subscriptionProductTarget=");
        return b64.p(sb, this.d, ')');
    }
}
