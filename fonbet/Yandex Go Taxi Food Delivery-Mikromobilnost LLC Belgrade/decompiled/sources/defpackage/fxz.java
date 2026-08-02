package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class fxz implements gxz {
    public final CharSequence a;
    public final boolean b;
    public final uiy c;

    public fxz(CharSequence charSequence, boolean z, uiy uiyVar) {
        this.a = charSequence;
        this.b = z;
        this.c = uiyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxz)) {
            return false;
        }
        fxz fxzVar = (fxz) obj;
        return jl40.l(this.a, fxzVar.a) && this.b == fxzVar.b && jl40.l(this.c, fxzVar.c);
    }

    public final int hashCode() {
        int e = unr0.e(this.a.hashCode() * 31, 31, this.b);
        uiy uiyVar = this.c;
        return e + (uiyVar == null ? 0 : uiyVar.hashCode());
    }

    public final String toString() {
        return "LoyaltyProgramSelectorStateButton(text=" + ((Object) this.a) + ", isLoading=" + this.b + ", gradientConfig=" + this.c + Extension.C_BRAKE;
    }
}
