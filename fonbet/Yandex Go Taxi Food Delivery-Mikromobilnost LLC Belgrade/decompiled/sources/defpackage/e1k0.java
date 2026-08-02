package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class e1k0 {
    public final boolean a;
    public final double b;

    public e1k0(double d, boolean z) {
        this.a = z;
        this.b = d;
    }

    public final boolean a() {
        return this.a;
    }

    public final double b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1k0)) {
            return false;
        }
        e1k0 e1k0Var = (e1k0) obj;
        return this.a == e1k0Var.a && Double.compare(this.b, e1k0Var.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AcquireResult(acquired=" + this.a + ", remainingTokens=" + this.b + Extension.C_BRAKE;
    }
}
