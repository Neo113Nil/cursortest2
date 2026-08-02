package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class kdx0 implements ldx0 {
    public final String a;
    public final int b;
    public final int c;

    public kdx0(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kdx0)) {
            return false;
        }
        kdx0 kdx0Var = (kdx0) obj;
        return jl40.l(this.a, kdx0Var.a) && this.b == kdx0Var.b && this.c == kdx0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + oyr.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return oyr.m(this.c, Extension.C_BRAKE, b64.u(this.b, "VisibleAnimated(text=", this.a, ", jumpCount=", ", jumpDelayMs="));
    }
}
