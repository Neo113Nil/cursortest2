package defpackage;

/* loaded from: classes2.dex */
public final class jod0 implements kod0 {
    public final String a;
    public final String b;

    public jod0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jod0)) {
            return false;
        }
        jod0 jod0Var = (jod0) obj;
        return jl40.l(this.a, jod0Var.a) && jl40.l(this.b, jod0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(invoiceId=");
        sb.append(this.a);
        sb.append(", paymentMethodId=");
        return b64.p(sb, this.b, ')');
    }
}
