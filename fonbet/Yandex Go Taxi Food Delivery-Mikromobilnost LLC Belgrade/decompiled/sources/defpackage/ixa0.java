package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ixa0 {
    public final rm91 a;
    public final String b;
    public final double c;
    public final double d;
    public final Double e;
    public final Double f;
    public final long g;

    public ixa0(rm91 rm91Var, String str, double d, double d2, Double d3, Double d4, long j) {
        this.a = rm91Var;
        this.b = str;
        this.c = d;
        this.d = d2;
        this.e = d3;
        this.f = d4;
        this.g = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ixa0)) {
            return false;
        }
        ixa0 ixa0Var = (ixa0) obj;
        return this.a.equals(ixa0Var.a) && jl40.l(this.b, ixa0Var.b) && Double.compare(this.c, ixa0Var.c) == 0 && Double.compare(this.d, ixa0Var.d) == 0 && jl40.l(this.e, ixa0Var.e) && jl40.l(this.f, ixa0Var.f) && this.g == ixa0Var.g;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int a = unr0.a(unr0.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d);
        Double d = this.e;
        int hashCode2 = (a + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.f;
        return Long.hashCode(this.g) + ((hashCode2 + (d2 != null ? d2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PerformerPosition(pinStrategy=");
        sb.append(this.a);
        sb.append(", bubbleText=");
        sb.append(this.b);
        sb.append(", latitude=");
        sb.append(this.c);
        nzs.o(sb, ", longitude=", this.d, ", speed=");
        sb.append(this.e);
        sb.append(", direction=");
        sb.append(this.f);
        sb.append(", timestamp=");
        return oyr.n(this.g, Extension.C_BRAKE, sb);
    }
}
