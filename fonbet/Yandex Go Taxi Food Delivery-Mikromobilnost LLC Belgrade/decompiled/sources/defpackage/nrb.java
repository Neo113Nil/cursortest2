package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class nrb {
    public final String a;
    public final boolean b;

    public nrb(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nrb)) {
            return false;
        }
        nrb nrbVar = (nrb) obj;
        return jl40.l(this.a, nrbVar.a) && this.b == nrbVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.k("ChoosePointPresentation(title=", this.a, ", showFavoriteIcon=", this.b, Extension.C_BRAKE);
    }
}
