package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class n2m0 {
    public final boolean a;
    public final String b;
    public final String c;

    public n2m0(boolean z, String str, String str2) {
        this.a = z;
        this.b = str;
        this.c = str2;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final boolean c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2m0)) {
            return false;
        }
        n2m0 n2m0Var = (n2m0) obj;
        return this.a == n2m0Var.a && jl40.l(this.b, n2m0Var.b) && jl40.l(this.c, n2m0Var.c);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return oyr.t(ly3.v("SaverInfo(shouldShowPromo=", ", maxInterestRate=", this.b, ", action=", this.a), this.c, Extension.C_BRAKE);
    }
}
