package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class lj7 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public lj7(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lj7)) {
            return false;
        }
        lj7 lj7Var = (lj7) obj;
        return this.a.equals(lj7Var.a) && jl40.l(this.b, lj7Var.b) && this.c.equals(lj7Var.c) && jl40.l(this.d, lj7Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        return g8e.r(b64.v("CallOrderFallbackPayload(title=", this.a, ", subtitle=", this.b, ", buttonTitle="), this.c, ", phoneNumber=", this.d, Extension.C_BRAKE);
    }
}
