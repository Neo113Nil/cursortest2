package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class exz implements gxz {
    public final CharSequence a;
    public final String b;

    public exz(CharSequence charSequence, String str) {
        this.a = charSequence;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof exz)) {
            return false;
        }
        exz exzVar = (exz) obj;
        return jl40.l(this.a, exzVar.a) && jl40.l(this.b, exzVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LoyaltyProgramSelectorStateBadge(text=" + ((Object) this.a) + ", textDescription=" + this.b + Extension.C_BRAKE;
    }
}
