package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class gq4 {
    public final String a;
    public final String b;
    public final boolean c;

    public gq4(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gq4)) {
            return false;
        }
        gq4 gq4Var = (gq4) obj;
        return jl40.l(this.a, gq4Var.a) && jl40.l(this.b, gq4Var.b) && this.c == gq4Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return x4e.i(b64.v("BankInfo(bankName=", this.a, ", bankId=", this.b, ", hasWeb="), this.c, Extension.C_BRAKE);
    }
}
