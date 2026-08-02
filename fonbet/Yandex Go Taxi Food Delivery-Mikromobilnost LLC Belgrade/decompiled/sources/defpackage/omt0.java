package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class omt0 {
    public final a5z0 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public omt0(a5z0 a5z0Var, int i, int i2, int i3, int i4) {
        this.a = a5z0Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof omt0)) {
            return false;
        }
        omt0 omt0Var = (omt0) obj;
        return jl40.l(this.a, omt0Var.a) && this.b == omt0Var.b && this.c == omt0Var.c && this.d == omt0Var.d && this.e == omt0Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + oyr.b(this.d, oyr.b(this.c, oyr.b(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpannableGridTileState(tile=");
        sb.append(this.a);
        sb.append(", column=");
        sb.append(this.b);
        sb.append(", row=");
        vfc.u(this.c, this.d, ", width=", ", height=", sb);
        return oyr.m(this.e, Extension.C_BRAKE, sb);
    }
}
