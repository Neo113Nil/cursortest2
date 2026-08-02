package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class q0c0 {
    public final wp2 a;
    public final wp2 b;

    public q0c0(wp2 wp2Var, wp2 wp2Var2) {
        this.a = wp2Var;
        this.b = wp2Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0c0)) {
            return false;
        }
        q0c0 q0c0Var = (q0c0) obj;
        return jl40.l(this.a, q0c0Var.a) && jl40.l(this.b, q0c0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PinStyle(bgColor=" + this.a + ", contentColor=" + this.b + Extension.C_BRAKE;
    }
}
