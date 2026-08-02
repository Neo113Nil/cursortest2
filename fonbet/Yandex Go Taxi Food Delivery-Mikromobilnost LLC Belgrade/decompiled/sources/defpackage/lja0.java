package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class lja0 {
    public final CharSequence a;
    public final t510 b;
    public final yte0 c;

    public lja0(CharSequence charSequence, t510 t510Var, yte0 yte0Var) {
        this.a = charSequence;
        this.b = t510Var;
        this.c = yte0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lja0)) {
            return false;
        }
        lja0 lja0Var = (lja0) obj;
        return jl40.l(this.a, lja0Var.a) && jl40.l(this.b, lja0Var.b) && jl40.l(this.c, lja0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        t510 t510Var = this.b;
        int hashCode2 = (hashCode + (t510Var == null ? 0 : t510Var.hashCode())) * 31;
        yte0 yte0Var = this.c;
        return hashCode2 + (yte0Var != null ? yte0Var.hashCode() : 0);
    }

    public final String toString() {
        return "PaymentSection(title=" + ((Object) this.a) + ", totalPrice=" + this.b + ", paymentMethod=" + this.c + Extension.C_BRAKE;
    }

    public lja0() {
        this("", null, null);
    }
}
