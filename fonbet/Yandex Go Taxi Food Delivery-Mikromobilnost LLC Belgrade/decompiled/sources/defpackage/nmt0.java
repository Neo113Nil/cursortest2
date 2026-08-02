package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class nmt0 {
    public final y4z0 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public nmt0(y4z0 y4z0Var, int i, int i2, int i3, int i4) {
        this.a = y4z0Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nmt0)) {
            return false;
        }
        nmt0 nmt0Var = (nmt0) obj;
        return this.a.equals(nmt0Var.a) && this.b == nmt0Var.b && this.c == nmt0Var.c && this.d == nmt0Var.d && this.e == nmt0Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + oyr.b(this.d, oyr.b(this.c, oyr.b(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpannableGridTileModel(tile=");
        sb.append(this.a);
        sb.append(", column=");
        sb.append(this.b);
        sb.append(", row=");
        vfc.u(this.c, this.d, ", width=", ", height=", sb);
        return oyr.m(this.e, Extension.C_BRAKE, sb);
    }
}
