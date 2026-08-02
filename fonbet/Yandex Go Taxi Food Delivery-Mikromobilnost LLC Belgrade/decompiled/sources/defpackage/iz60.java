package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class iz60 {
    public final long a;
    public final vy60 b;

    public iz60(long j, vy60 vy60Var) {
        this.a = j;
        this.b = vy60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iz60)) {
            return false;
        }
        iz60 iz60Var = (iz60) obj;
        return e3n.d(this.a, iz60Var.a) && jl40.l(this.b, iz60Var.b);
    }

    public final int hashCode() {
        o430 o430Var = e3n.b;
        int hashCode = Long.hashCode(this.a) * 31;
        vy60 vy60Var = this.b;
        return hashCode + (vy60Var == null ? 0 : vy60Var.hashCode());
    }

    public final String toString() {
        return "Timeout(duration=" + e3n.p(this.a) + ", accuracyEstimation=" + this.b + Extension.C_BRAKE;
    }
}
