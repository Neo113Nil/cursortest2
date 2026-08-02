package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class mxz {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;

    public mxz(String str, String str2, String str3, String str4, String str5, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.a;
    }

    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mxz)) {
            return false;
        }
        mxz mxzVar = (mxz) obj;
        return jl40.l(this.a, mxzVar.a) && jl40.l(this.b, mxzVar.b) && jl40.l(this.c, mxzVar.c) && jl40.l(this.d, mxzVar.d) && jl40.l(this.e, mxzVar.e) && this.f == mxzVar.f;
    }

    public final boolean f() {
        return this.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + unr0.b(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder v = b64.v("LoyaltyStateBalance(loyaltyProgramName=", this.a, ", balance=", this.b, ", formattedBalance=");
        g8e.D(v, this.c, ", balanceDescription=", this.d, ", walletId=");
        return nnm.i(this.e, ", isEnabled=", Extension.C_BRAKE, v, this.f);
    }
}
