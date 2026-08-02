package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class h071 {
    public final Integer a;
    public final Integer b;

    public h071(Integer num, Integer num2) {
        this.a = num;
        this.b = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h071)) {
            return false;
        }
        h071 h071Var = (h071) obj;
        return jl40.l(this.a, h071Var.a) && jl40.l(this.b, h071Var.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "LayoutParamsSize(width=" + this.a + ", height=" + this.b + Extension.C_BRAKE;
    }
}
