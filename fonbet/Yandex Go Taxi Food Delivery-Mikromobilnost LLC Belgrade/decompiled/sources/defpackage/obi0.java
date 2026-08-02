package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class obi0 {
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final int e;

    public obi0(String str, int i, String str2, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof obi0)) {
            return false;
        }
        obi0 obi0Var = (obi0) obj;
        return this.a == obi0Var.a && this.b == obi0Var.b && jl40.l(this.c, obi0Var.c) && jl40.l(this.d, obi0Var.d) && this.e == obi0Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + unr0.b(unr0.b(oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder s = b64.s(this.a, this.b, "ReadKey(block=", ", id=", ", type=");
        g8e.D(s, this.c, ", value=", this.d, ", version=");
        return oyr.m(this.e, Extension.C_BRAKE, s);
    }
}
