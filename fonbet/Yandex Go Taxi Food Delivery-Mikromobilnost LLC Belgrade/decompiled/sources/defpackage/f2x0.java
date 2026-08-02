package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class f2x0 {
    public final boolean a;
    public final Boolean b;

    public f2x0(boolean z, Boolean bool) {
        this.a = z;
        this.b = bool;
    }

    public final Boolean a() {
        return this.b;
    }

    public final boolean b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2x0)) {
            return false;
        }
        f2x0 f2x0Var = (f2x0) obj;
        return this.a == f2x0Var.a && jl40.l(this.b, f2x0Var.b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        Boolean bool = this.b;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        return "ForcedNavigationBar(isNavigationBarContrastEnforced=" + this.a + ", isLight=" + this.b + Extension.C_BRAKE;
    }
}
