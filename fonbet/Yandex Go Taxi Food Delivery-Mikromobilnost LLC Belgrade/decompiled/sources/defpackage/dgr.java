package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class dgr {
    public final int a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;

    public dgr(String str, int i, String str2, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dgr)) {
            return false;
        }
        dgr dgrVar = (dgr) obj;
        return this.a == dgrVar.a && this.b == dgrVar.b && this.c == dgrVar.c && jl40.l(this.d, dgrVar.d) && jl40.l(this.e, dgrVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.b(oyr.b(this.c, oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder s = b64.s(this.a, this.b, "ReadCardKey(block=", ", id=", ", version=");
        smw0.t(this.c, ", type=", this.d, ", value=", s);
        return oyr.t(s, this.e, Extension.C_BRAKE);
    }
}
