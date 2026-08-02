package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class iij0 implements kij0, e6v, k1c {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final String h;

    public iij0(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = str4;
        this.f = z2;
        this.g = z3;
        this.h = str;
    }

    @Override // defpackage.k1c
    public final String c() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iij0)) {
            return false;
        }
        iij0 iij0Var = (iij0) obj;
        return jl40.l(this.a, iij0Var.a) && jl40.l(this.b, iij0Var.b) && jl40.l(this.c, iij0Var.c) && this.d == iij0Var.d && jl40.l(this.e, iij0Var.e) && this.f == iij0Var.f && this.g == iij0Var.g;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.h;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return Boolean.hashCode(this.g) + unr0.e(unr0.b(unr0.e((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.d), 31, this.e), 31, this.f);
    }

    @Override // defpackage.k1c
    public final boolean isChecked() {
        return this.d;
    }

    public final String toString() {
        StringBuilder v = b64.v("Transfer(title=", this.a, ", subtitle=", this.b, ", iconTag=");
        tse0.y(this.c, ", isChecked=", ", trailAccessibilityTitle=", v, this.d);
        tse0.y(this.e, ", isFirst=", ", isLast=", v, this.f);
        return x4e.i(v, this.g, Extension.C_BRAKE);
    }
}
