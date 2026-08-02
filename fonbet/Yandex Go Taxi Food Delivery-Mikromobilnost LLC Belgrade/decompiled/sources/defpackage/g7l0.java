package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class g7l0 {
    public final int a;
    public final sbv b;

    public g7l0(int i, sbv sbvVar) {
        this.a = i;
        this.b = sbvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g7l0)) {
            return false;
        }
        g7l0 g7l0Var = (g7l0) obj;
        return this.a == g7l0Var.a && jl40.l(this.b, g7l0Var.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        sbv sbvVar = this.b;
        return hashCode + (sbvVar == null ? 0 : sbvVar.hashCode());
    }

    public final String toString() {
        return "RoutePoint(index=" + this.a + ", pinIcon=" + this.b + Extension.C_BRAKE;
    }
}
