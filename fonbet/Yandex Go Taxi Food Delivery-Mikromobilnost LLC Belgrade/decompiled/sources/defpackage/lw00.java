package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class lw00 {
    public final Integer a;
    public final Integer b;
    public final Integer c;
    public final Integer d;

    public lw00(Integer num, Integer num2, Integer num3, Integer num4) {
        this.a = num;
        this.b = num2;
        this.c = num3;
        this.d = num4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lw00)) {
            return false;
        }
        lw00 lw00Var = (lw00) obj;
        return jl40.l(this.a, lw00Var.a) && jl40.l(this.b, lw00Var.b) && jl40.l(this.c, lw00Var.c) && jl40.l(this.d, lw00Var.d);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.d;
        return hashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        return "MarginsEntity(left=" + this.a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + Extension.C_BRAKE;
    }
}
