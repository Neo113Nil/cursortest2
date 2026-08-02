package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class pu51 implements ru51 {
    public final boolean a;
    public final String b;
    public final String c;

    public pu51(boolean z, String str, String str2) {
        this.a = z;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pu51)) {
            return false;
        }
        pu51 pu51Var = (pu51) obj;
        return this.a == pu51Var.a && jl40.l(this.b, pu51Var.b) && jl40.l(this.c, pu51Var.c);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return oyr.t(ly3.v("SaverAvailable(shouldShowPromo=", ", maxInterestRate=", this.b, ", action=", this.a), this.c, Extension.C_BRAKE);
    }
}
