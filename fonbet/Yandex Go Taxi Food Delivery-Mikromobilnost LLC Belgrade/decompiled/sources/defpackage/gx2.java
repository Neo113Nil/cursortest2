package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class gx2 implements kx2 {
    public final double a;
    public final String b;

    public gx2(double d, String str) {
        this.a = d;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gx2)) {
            return false;
        }
        gx2 gx2Var = (gx2) obj;
        return Double.compare(this.a, gx2Var.a) == 0 && jl40.l(this.b, gx2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Loaded(timeSinceOpenScreen=" + this.a + ", source=" + this.b + Extension.C_BRAKE;
    }
}
