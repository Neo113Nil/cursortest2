package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class jfl0 {
    public final uu30 a;
    public final uu30 b;

    public jfl0(uu30 uu30Var, uu30 uu30Var2) {
        this.a = uu30Var;
        this.b = uu30Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jfl0)) {
            return false;
        }
        jfl0 jfl0Var = (jfl0) obj;
        return jl40.l(this.a, jfl0Var.a) && jl40.l(this.b, jfl0Var.b);
    }

    public final int hashCode() {
        uu30 uu30Var = this.a;
        int hashCode = (uu30Var == null ? 0 : uu30Var.hashCode()) * 31;
        uu30 uu30Var2 = this.b;
        return hashCode + (uu30Var2 != null ? uu30Var2.hashCode() : 0);
    }

    public final String toString() {
        return "RouteUpdate(previousRoute=" + this.a + ", currentRoute=" + this.b + Extension.C_BRAKE;
    }

    public jfl0() {
        this(null, null);
    }
}
