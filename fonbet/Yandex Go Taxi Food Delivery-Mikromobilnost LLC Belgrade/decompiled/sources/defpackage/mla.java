package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class mla {
    public final wj90 a;
    public final CharSequence b;

    public mla(wj90 wj90Var, CharSequence charSequence) {
        this.a = wj90Var;
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mla)) {
            return false;
        }
        mla mlaVar = (mla) obj;
        return jl40.l(this.a, mlaVar.a) && jl40.l(this.b, mlaVar.b);
    }

    public final int hashCode() {
        wj90 wj90Var = this.a;
        int hashCode = (wj90Var == null ? 0 : wj90Var.hashCode()) * 31;
        CharSequence charSequence = this.b;
        return hashCode + (charSequence != null ? charSequence.hashCode() : 0);
    }

    public final String toString() {
        return "Bottom(button=" + this.a + ", legalText=" + ((Object) this.b) + Extension.C_BRAKE;
    }
}
