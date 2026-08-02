package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class o0q0 extends t0q0 {
    public final CharSequence a;
    public final kdc b;
    public final s0q0 c;

    public o0q0(CharSequence charSequence, kdc kdcVar, s0q0 s0q0Var) {
        this.a = charSequence;
        this.b = kdcVar;
        this.c = s0q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0q0)) {
            return false;
        }
        o0q0 o0q0Var = (o0q0) obj;
        return jl40.l(this.a, o0q0Var.a) && jl40.l(this.b, o0q0Var.b) && this.c.equals(o0q0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        kdc kdcVar = this.b;
        return this.c.hashCode() + ((hashCode + (kdcVar == null ? 0 : kdcVar.hashCode())) * 31);
    }

    public final String toString() {
        return "Content(title=" + ((Object) this.a) + ", backgroundColor=" + this.b + ", iconState=" + this.c + Extension.C_BRAKE;
    }
}
