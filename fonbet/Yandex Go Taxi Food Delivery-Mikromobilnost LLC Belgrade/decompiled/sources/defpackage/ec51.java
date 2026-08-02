package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ec51 {
    public final int a;
    public final int b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final int g;
    public final String h;
    public final int i;
    public final String j;

    public ec51(int i, int i2, int i3, int i4, int i5, String str, String str2, String str3, String str4, String str5) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = i3;
        this.e = str2;
        this.f = str3;
        this.g = i4;
        this.h = str4;
        this.i = i5;
        this.j = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ec51)) {
            return false;
        }
        ec51 ec51Var = (ec51) obj;
        return this.a == ec51Var.a && this.b == ec51Var.b && jl40.l(this.c, ec51Var.c) && this.d == ec51Var.d && jl40.l(this.e, ec51Var.e) && jl40.l(this.f, ec51Var.f) && this.g == ec51Var.g && jl40.l(this.h, ec51Var.h) && this.i == ec51Var.i && jl40.l(this.j, ec51Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + oyr.b(this.i, unr0.b(oyr.b(this.g, unr0.b(unr0.b(oyr.b(this.d, unr0.b(oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31), 31, this.e), 31, this.f), 31), 31, this.h), 31);
    }

    public final String toString() {
        StringBuilder s = b64.s(this.a, this.b, "WriteKey(block=", ", readKeyId=", ", readKeyType=");
        b64.A(this.d, this.c, ", readKeyVersion=", ", readKeyValue=", s);
        g8e.D(s, this.e, ", value=", this.f, ", writeKeyId=");
        smw0.t(this.g, ", writeKeyType=", this.h, ", writeKeyVersion=", s);
        return xvz.h(this.i, ", writeKeyValue=", this.j, Extension.C_BRAKE, s);
    }
}
