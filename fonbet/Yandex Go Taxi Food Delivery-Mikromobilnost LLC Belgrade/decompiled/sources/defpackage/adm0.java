package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class adm0 {
    public final b9m0 a;
    public final boolean b;

    public adm0(b9m0 b9m0Var, boolean z) {
        this.a = b9m0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof adm0)) {
            return false;
        }
        adm0 adm0Var = (adm0) obj;
        return jl40.l(this.a, adm0Var.a) && this.b == adm0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "State(widget=" + this.a + ", appearanceAnimationAllowed=" + this.b + Extension.C_BRAKE;
    }
}
