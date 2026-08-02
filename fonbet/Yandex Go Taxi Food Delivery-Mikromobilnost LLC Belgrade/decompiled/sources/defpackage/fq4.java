package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class fq4 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final String f;

    public fq4(String str, String str2, boolean z, boolean z2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fq4)) {
            return false;
        }
        fq4 fq4Var = (fq4) obj;
        return jl40.l(this.a, fq4Var.a) && this.b.equals(fq4Var.b) && this.c.equals(fq4Var.c) && this.d == fq4Var.d && this.e == fq4Var.e && this.f.equals(fq4Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + unr0.e(unr0.e(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder v = b64.v("BankInfo(bankName=", this.a, ", logoUrl=", this.b, ", scheme=");
        tse0.y(this.c, ", isFavorite=", ", isInstalled=", v, this.d);
        return n.m(", urlTemplate=", this.f, Extension.C_BRAKE, v, this.e);
    }
}
