package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class dk40 implements fk40 {
    public final y540 a;
    public final bzy0 b;

    public dk40(y540 y540Var, bzy0 bzy0Var) {
        this.a = y540Var;
        this.b = bzy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dk40) {
            dk40 dk40Var = (dk40) obj;
            if (this.a == dk40Var.a && jl40.l(this.b, dk40Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        bzy0 bzy0Var = this.b;
        return hashCode + (bzy0Var == null ? 0 : bzy0Var.hashCode());
    }

    public final String toString() {
        return "Schedule(state=" + this.a + ", prevState=" + this.b + Extension.C_BRAKE;
    }
}
