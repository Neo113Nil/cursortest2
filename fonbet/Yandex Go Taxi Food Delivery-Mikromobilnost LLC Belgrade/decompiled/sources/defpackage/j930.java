package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class j930 {
    public final Integer a;
    public final String b;
    public final Integer c;

    public j930(String str, Integer num, Integer num2) {
        this.a = num;
        this.b = str;
        this.c = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j930)) {
            return false;
        }
        j930 j930Var = (j930) obj;
        return jl40.l(this.a, j930Var.a) && jl40.l(this.b, j930Var.b) && jl40.l(this.c, j930Var.c);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.c;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MosmetroOtpPasswordParameters(attemptCount=");
        sb.append(this.a);
        sb.append(", expiresAt=");
        sb.append(this.b);
        sb.append(", length=");
        return oo31.j(sb, this.c, Extension.C_BRAKE);
    }

    public j930() {
        this(null, null, null);
    }
}
