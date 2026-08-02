package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class aps0 {
    public final CharSequence a;
    public final CharSequence b;
    public final ldc c;
    public final jps0 d;
    public final boolean e;
    public final boolean f;
    public final x9x0 g;

    public aps0(CharSequence charSequence, CharSequence charSequence2, ldc ldcVar, jps0 jps0Var, boolean z, boolean z2, x9x0 x9x0Var) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = ldcVar;
        this.d = jps0Var;
        this.e = z;
        this.f = z2;
        this.g = x9x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aps0)) {
            return false;
        }
        aps0 aps0Var = (aps0) obj;
        return jl40.l(this.a, aps0Var.a) && jl40.l(this.b, aps0Var.b) && jl40.l(this.c, aps0Var.c) && jl40.l(this.d, aps0Var.d) && this.e == aps0Var.e && this.f == aps0Var.f && this.g.equals(aps0Var.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        ldc ldcVar = this.c;
        int hashCode3 = (hashCode2 + (ldcVar == null ? 0 : Long.hashCode(ldcVar.a))) * 31;
        jps0 jps0Var = this.d;
        return this.g.hashCode() + unr0.e(unr0.e((hashCode3 + (jps0Var != null ? jps0Var.hashCode() : 0)) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "SliderButtonState(title=", ", subtitle=", ", backgroundColor=");
        r.append(this.c);
        r.append(", handler=");
        r.append(this.d);
        r.append(", isEnabled=");
        nnm.v(", isShimmering=", ", action=", r, this.e, this.f);
        r.append(this.g);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
