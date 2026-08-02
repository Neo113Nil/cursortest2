package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class g8l0 {
    public final int a;
    public final int b;

    public g8l0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g8l0)) {
            return false;
        }
        g8l0 g8l0Var = (g8l0) obj;
        return this.a == g8l0Var.a && this.b == g8l0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "RoutePointsInterval(firstIndex=", ", lastIndex=", Extension.C_BRAKE);
    }
}
