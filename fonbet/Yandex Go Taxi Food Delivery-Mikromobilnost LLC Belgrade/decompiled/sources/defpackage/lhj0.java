package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class lhj0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final mhj0 d;
    public final boolean e;
    public final String f;
    public final String g;

    public lhj0(String str, String str2, boolean z, mhj0 mhj0Var, boolean z2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = mhj0Var;
        this.e = z2;
        this.f = str3;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lhj0)) {
            return false;
        }
        lhj0 lhj0Var = (lhj0) obj;
        return jl40.l(this.a, lhj0Var.a) && jl40.l(this.b, lhj0Var.b) && this.c == lhj0Var.c && jl40.l(this.d, lhj0Var.d) && this.e == lhj0Var.e && jl40.l(this.f, lhj0Var.f) && jl40.l(this.g, lhj0Var.g);
    }

    public final int hashCode() {
        int e = unr0.e(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        mhj0 mhj0Var = this.d;
        int b = unr0.b(unr0.e((e + (mhj0Var == null ? 0 : mhj0Var.hashCode())) * 31, 31, this.e), 31, this.f);
        String str = this.g;
        return b + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("Requirement(title=", this.a, ", subtitle=", this.b, ", isChecked=");
        v.append(this.c);
        v.append(", requirementCommentModel=");
        v.append(this.d);
        v.append(", isLast=");
        unr0.A(", requirementName=", this.f, ", accessibilityAlert=", v, this.e);
        return oyr.t(v, this.g, Extension.C_BRAKE);
    }
}
