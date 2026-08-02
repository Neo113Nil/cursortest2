package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class jdj0 {
    public final CharSequence a;
    public final CharSequence b;

    public jdj0(CharSequence charSequence, CharSequence charSequence2) {
        this.a = charSequence;
        this.b = charSequence2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jdj0)) {
            return false;
        }
        jdj0 jdj0Var = (jdj0) obj;
        return jl40.l(this.a, jdj0Var.a) && jl40.l(this.b, jdj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return ly3.l(this.a, this.b, "RequirementBodyUiState(title=", ", subtitle=", Extension.C_BRAKE);
    }
}
