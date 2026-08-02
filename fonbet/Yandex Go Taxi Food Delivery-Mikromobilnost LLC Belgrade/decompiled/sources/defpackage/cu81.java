package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class cu81 {
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final y681 e;
    public final boolean f;
    public final String g;

    public cu81(int i, int i2, String str, String str2, y681 y681Var, boolean z, String str3) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = y681Var;
        this.f = z;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cu81)) {
            return false;
        }
        cu81 cu81Var = (cu81) obj;
        return this.a == cu81Var.a && this.b == cu81Var.b && this.c.equals(cu81Var.c) && jl40.l(this.d, cu81Var.d) && jl40.l(this.e, cu81Var.e) && this.f == cu81Var.f && jl40.l(this.g, cu81Var.g);
    }

    public final int hashCode() {
        int b = unr0.b(fia1.b(this.b, Integer.hashCode(this.a) * 31), 31, this.c);
        String str = this.d;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        y681 y681Var = this.e;
        int e = unr0.e((hashCode + (y681Var == null ? 0 : y681Var.hashCode())) * 31, 31, this.f);
        String str2 = this.g;
        return e + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder s = b64.s(this.a, this.b, "ImageValue(width=", ", height=", ", url=");
        g8e.D(s, this.c, ", sizeType=", this.d, ", smartCenterSettings=");
        s.append(this.e);
        s.append(", preload=");
        s.append(this.f);
        s.append(", preview=");
        return oyr.t(s, this.g, Extension.C_BRAKE);
    }
}
