package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class lz6 {
    public final CharSequence a;
    public final aw40 b;

    public lz6(CharSequence charSequence, aw40 aw40Var) {
        this.a = charSequence;
        this.b = aw40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lz6)) {
            return false;
        }
        lz6 lz6Var = (lz6) obj;
        return jl40.l(this.a, lz6Var.a) && jl40.l(this.b, lz6Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        aw40 aw40Var = this.b;
        return hashCode + (aw40Var == null ? 0 : aw40Var.hashCode());
    }

    public final String toString() {
        return "ButtonContainer(buttonText=" + ((Object) this.a) + ", action=" + this.b + Extension.C_BRAKE;
    }
}
