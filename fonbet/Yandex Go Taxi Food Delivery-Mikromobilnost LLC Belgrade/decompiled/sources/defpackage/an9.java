package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class an9 {
    public final CharSequence a;
    public final CharSequence b;
    public final String c;

    public an9(CharSequence charSequence, CharSequence charSequence2, String str) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof an9)) {
            return false;
        }
        an9 an9Var = (an9) obj;
        return jl40.l(this.a, an9Var.a) && jl40.l(this.b, an9Var.b) && jl40.l(this.c, an9Var.c);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.b;
        int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        String str = this.c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return oyr.t(vfc.r(this.a, this.b, "ChargersAttentionInfoDetailsUiState(title=", ", body=", ", iconUrl="), this.c, Extension.C_BRAKE);
    }

    public an9() {
        this(null, null, null);
    }
}
