package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class g36 {
    public final String a;
    public final int b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;

    public g36(int i, int i2, int i3, String str, String str2, String str3) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g36)) {
            return false;
        }
        g36 g36Var = (g36) obj;
        return jl40.l(this.a, g36Var.a) && this.b == g36Var.b && jl40.l(this.c, g36Var.c) && this.d == g36Var.d && this.e == g36Var.e && jl40.l(this.f, g36Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + oyr.b(this.e, oyr.b(this.d, unr0.b(oyr.b(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31), 31);
    }

    public final String toString() {
        StringBuilder u = b64.u(this.b, "BlizzardState(text=", this.a, ", textColor=", ", buttonTitle=");
        b64.A(this.d, this.c, ", buttonTitleColor=", ", buttonBackgroundColor=", u);
        return xvz.h(this.e, ", deeplink=", this.f, Extension.C_BRAKE, u);
    }
}
