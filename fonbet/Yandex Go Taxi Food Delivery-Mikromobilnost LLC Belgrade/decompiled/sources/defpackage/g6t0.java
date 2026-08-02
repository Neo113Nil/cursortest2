package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class g6t0 {
    public final wi70 a;
    public final boolean b;
    public final boolean c;

    public g6t0(wi70 wi70Var, boolean z, boolean z2) {
        this.a = wi70Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g6t0)) {
            return false;
        }
        g6t0 g6t0Var = (g6t0) obj;
        return jl40.l(this.a, g6t0Var.a) && this.b == g6t0Var.b && this.c == g6t0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SolidSummaryButtonModel(button=");
        sb.append(this.a);
        sb.append(", paymentsVisible=");
        sb.append(this.b);
        sb.append(", requirementsVisible=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
