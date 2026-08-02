package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class elq0 implements flq0 {
    public final CharSequence a;
    public final CharSequence b;

    public elq0(CharSequence charSequence, CharSequence charSequence2) {
        this.a = charSequence;
        this.b = charSequence2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof elq0)) {
            return false;
        }
        elq0 elq0Var = (elq0) obj;
        return jl40.l(this.a, elq0Var.a) && jl40.l(this.b, elq0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return ly3.l(this.a, this.b, "EnabledFooterState(applyButtonText=", ", resetButtonText=", Extension.C_BRAKE);
    }
}
