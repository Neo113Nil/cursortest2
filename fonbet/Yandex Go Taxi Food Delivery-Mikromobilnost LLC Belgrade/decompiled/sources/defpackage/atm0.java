package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class atm0 {
    public final CharSequence a;
    public final CharSequence b;

    public atm0(CharSequence charSequence, CharSequence charSequence2) {
        this.a = charSequence;
        this.b = charSequence2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof atm0)) {
            return false;
        }
        atm0 atm0Var = (atm0) obj;
        return jl40.l(this.a, atm0Var.a) && jl40.l(this.b, atm0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        return hashCode + (charSequence == null ? 0 : charSequence.hashCode());
    }

    public final String toString() {
        return ly3.l(this.a, this.b, "RenewItem(text=", ", buttonText=", Extension.C_BRAKE);
    }
}
