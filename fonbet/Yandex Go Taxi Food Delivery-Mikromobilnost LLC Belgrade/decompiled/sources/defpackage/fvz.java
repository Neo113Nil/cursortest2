package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class fvz {
    public final String a;
    public final String b;

    public fvz(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fvz)) {
            return false;
        }
        fvz fvzVar = (fvz) obj;
        return jl40.l(this.a, fvzVar.a) && jl40.l(this.b, fvzVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("LoyaltyProgramAuth(url=", this.a, ", finishUrl=", this.b, Extension.C_BRAKE);
    }
}
