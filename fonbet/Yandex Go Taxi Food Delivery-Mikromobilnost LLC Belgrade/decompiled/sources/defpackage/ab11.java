package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ab11 {
    public final CharSequence a;
    public final bpl0 b;
    public final flq0 c;

    public ab11(CharSequence charSequence, bpl0 bpl0Var, flq0 flq0Var) {
        this.a = charSequence;
        this.b = bpl0Var;
        this.c = flq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab11)) {
            return false;
        }
        ab11 ab11Var = (ab11) obj;
        return jl40.l(this.a, ab11Var.a) && this.b.equals(ab11Var.b) && jl40.l(this.c, ab11Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b.a);
    }

    public final String toString() {
        return "TransportTypeSelectorUiState(title=" + ((Object) this.a) + ", options=" + this.b + ", footerState=" + this.c + Extension.C_BRAKE;
    }
}
