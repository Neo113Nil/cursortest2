package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class gea {
    public final CharSequence a;
    public final CharSequence b;

    public gea(CharSequence charSequence, CharSequence charSequence2) {
        this.a = charSequence;
        this.b = charSequence2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gea)) {
            return false;
        }
        gea geaVar = (gea) obj;
        return jl40.l(this.a, geaVar.a) && jl40.l(this.b, geaVar.b);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.b;
        return hashCode + (charSequence2 != null ? charSequence2.hashCode() : 0);
    }

    public final String toString() {
        return ly3.l(this.a, this.b, "ChargersPartnerDetailsUiState(title=", ", text=", Extension.C_BRAKE);
    }
}
