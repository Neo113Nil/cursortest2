package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class iqo0 {
    public final CharSequence a;
    public final CharSequence b;

    public iqo0(CharSequence charSequence, CharSequence charSequence2) {
        this.a = charSequence;
        this.b = charSequence2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iqo0)) {
            return false;
        }
        iqo0 iqo0Var = (iqo0) obj;
        return jl40.l(this.a, iqo0Var.a) && jl40.l(this.b, iqo0Var.b);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.b;
        return hashCode + (charSequence2 != null ? charSequence2.hashCode() : 0);
    }

    public final String toString() {
        return ly3.l(this.a, this.b, "NumberFlow(hintTitle=", ", hintSubtitle=", Extension.C_BRAKE);
    }
}
