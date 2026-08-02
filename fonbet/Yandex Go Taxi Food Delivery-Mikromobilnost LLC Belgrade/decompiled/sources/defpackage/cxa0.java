package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class cxa0 {
    public final double a;
    public final double b;
    public final Double c;
    public final rm91 d;
    public final String e;
    public final boolean f;

    public cxa0(double d, double d2, Double d3, rm91 rm91Var, String str, boolean z) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = rm91Var;
        this.e = str;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cxa0)) {
            return false;
        }
        cxa0 cxa0Var = (cxa0) obj;
        return Double.compare(this.a, cxa0Var.a) == 0 && Double.compare(this.b, cxa0Var.b) == 0 && jl40.l(this.c, cxa0Var.c) && this.d.equals(cxa0Var.d) && jl40.l(this.e, cxa0Var.e) && this.f == cxa0Var.f;
    }

    public final int hashCode() {
        int a = unr0.a(Double.hashCode(this.a) * 31, 31, this.b);
        Double d = this.c;
        int hashCode = (this.d.hashCode() + ((a + (d == null ? 0 : d.hashCode())) * 31)) * 31;
        String str = this.e;
        return Boolean.hashCode(this.f) + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder u = oyr.u(this.a, "PerformerPinVo(latitude=", ", longitude=");
        u.append(this.b);
        u.append(", direction=");
        u.append(this.c);
        u.append(", pinStrategy=");
        u.append(this.d);
        u.append(", bubbleText=");
        u.append(this.e);
        return xra1.a(u, ", showBubble=", this.f, Extension.C_BRAKE);
    }
}
