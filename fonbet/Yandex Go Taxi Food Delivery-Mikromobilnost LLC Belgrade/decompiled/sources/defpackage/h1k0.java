package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class h1k0 {
    public final double a;
    public final double b;
    public final double c;

    public h1k0(double d, double d2, double d3) {
        this.a = d;
        this.b = d2;
        this.c = d3;
    }

    public final double a() {
        return this.a;
    }

    public final double b() {
        return this.b;
    }

    public final double c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1k0)) {
            return false;
        }
        h1k0 h1k0Var = (h1k0) obj;
        return Double.compare(this.a, h1k0Var.a) == 0 && Double.compare(this.b, h1k0Var.b) == 0 && Double.compare(this.c, h1k0Var.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + unr0.a(Double.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder u = oyr.u(this.a, "RetryBudgetData(initialTokens=", ", maxTokens=");
        u.append(this.b);
        u.append(", tokenRefillRatio=");
        u.append(this.c);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
