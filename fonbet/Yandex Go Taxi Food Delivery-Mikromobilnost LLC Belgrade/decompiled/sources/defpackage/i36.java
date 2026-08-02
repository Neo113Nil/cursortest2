package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class i36 {
    public final String a;
    public final int b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;
    public final wp2 g;
    public final wp2 h;
    public final wp2 i;

    public i36(String str, int i, String str2, int i2, int i3, String str3, wp2 wp2Var, wp2 wp2Var2, wp2 wp2Var3) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = str3;
        this.g = wp2Var;
        this.h = wp2Var2;
        this.i = wp2Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i36)) {
            return false;
        }
        i36 i36Var = (i36) obj;
        return jl40.l(this.a, i36Var.a) && this.b == i36Var.b && jl40.l(this.c, i36Var.c) && this.d == i36Var.d && this.e == i36Var.e && jl40.l(this.f, i36Var.f) && jl40.l(this.g, i36Var.g) && jl40.l(this.h, i36Var.h) && jl40.l(this.i, i36Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + n.b(this.h, n.b(this.g, unr0.b(oyr.b(this.e, oyr.b(this.d, unr0.b(oyr.b(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31), 31), 31, this.f), 31), 31);
    }

    public final String toString() {
        StringBuilder u = b64.u(this.b, "BlizzardUiState(text=", this.a, ", textColor=", ", buttonTitle=");
        b64.A(this.d, this.c, ", buttonTitleColor=", ", buttonBackgroundColor=", u);
        smw0.t(this.e, ", deeplink=", this.f, ", textAppColor=", u);
        u.append(this.g);
        u.append(", buttonTitleAppColor=");
        u.append(this.h);
        u.append(", buttonBackgroundAppColor=");
        u.append(this.i);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
