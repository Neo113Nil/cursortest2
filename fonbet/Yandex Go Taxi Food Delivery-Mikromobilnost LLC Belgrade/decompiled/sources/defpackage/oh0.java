package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class oh0 {
    public final CharSequence a;
    public final jh0 b;

    public oh0(CharSequence charSequence, ah0 ah0Var) {
        this.a = charSequence;
        this.b = ah0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oh0)) {
            return false;
        }
        oh0 oh0Var = (oh0) obj;
        return jl40.l(this.a, oh0Var.a) && jl40.l(this.b, oh0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        jh0 jh0Var = this.b;
        return hashCode + (jh0Var == null ? 0 : jh0Var.hashCode());
    }

    public final String toString() {
        return "FooterUiState(formattedText=" + ((Object) this.a) + ", action=" + this.b + Extension.C_BRAKE;
    }
}
