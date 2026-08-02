package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class oi70 implements pi70 {
    public final kdc a;
    public final wp2 b;

    public oi70(kdc kdcVar, wp2 wp2Var) {
        this.a = kdcVar;
        this.b = wp2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oi70)) {
            return false;
        }
        oi70 oi70Var = (oi70) obj;
        return this.a.equals(oi70Var.a) && jl40.l(this.b, oi70Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Solid(color=" + this.a + ", appColor=" + this.b + Extension.C_BRAKE;
    }
}
