package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class bq5 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public bq5(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bq5)) {
            return false;
        }
        bq5 bq5Var = (bq5) obj;
        return jl40.l(this.a, bq5Var.a) && jl40.l(this.b, bq5Var.b) && jl40.l(this.c, bq5Var.c) && jl40.l(this.d, bq5Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int b = unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        return b + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return g8e.r(b64.v("AddressBlock(sourceTitle=", this.a, ", sourceAddress=", this.b, ", destinationTitle="), this.c, ", destinationAddress=", this.d, Extension.C_BRAKE);
    }
}
