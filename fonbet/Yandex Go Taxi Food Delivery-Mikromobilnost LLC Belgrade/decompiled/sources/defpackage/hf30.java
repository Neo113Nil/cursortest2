package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class hf30 implements jf30 {
    public final y540 a;
    public final bzy0 b;

    public hf30(y540 y540Var, bzy0 bzy0Var) {
        this.a = y540Var;
        this.b = bzy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hf30) {
            hf30 hf30Var = (hf30) obj;
            if (this.a == hf30Var.a && jl40.l(this.b, hf30Var.b)) {
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
