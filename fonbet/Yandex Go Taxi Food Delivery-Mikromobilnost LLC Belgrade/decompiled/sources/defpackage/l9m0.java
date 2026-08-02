package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class l9m0 {
    public final double a;
    public final String b;
    public final String c;
    public final String d;

    public l9m0(double d, String str, String str2, String str3) {
        this.a = d;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l9m0)) {
            return false;
        }
        l9m0 l9m0Var = (l9m0) obj;
        return Double.compare(this.a, l9m0Var.a) == 0 && jl40.l(this.b, l9m0Var.b) && jl40.l(this.c, l9m0Var.c) && jl40.l(this.d, l9m0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(Double.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Point(amount=");
        sb.append(this.a);
        sb.append(", incomeText=");
        sb.append(this.b);
        g8e.D(sb, ", description=", this.c, ", dailyIncome=", this.d);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
