package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class hty0 {
    public final Integer a;
    public final String b;
    public final String c;

    public hty0(Integer num, String str, String str2) {
        this.a = num;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hty0)) {
            return false;
        }
        hty0 hty0Var = (hty0) obj;
        return jl40.l(this.a, hty0Var.a) && jl40.l(this.b, hty0Var.b) && jl40.l(this.c, hty0Var.c);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyleModel(size=");
        sb.append(this.a);
        sb.append(", weight=");
        sb.append(this.b);
        sb.append(", color=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
