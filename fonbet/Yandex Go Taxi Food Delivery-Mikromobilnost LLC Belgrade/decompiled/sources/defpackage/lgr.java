package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class lgr {
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;
    public final int g;
    public final int h;
    public final String i;
    public final String j;

    public lgr(int i, int i2, int i3, int i4, int i5, String str, String str2, String str3, String str4, String str5) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = i3;
        this.e = str2;
        this.f = str3;
        this.g = i4;
        this.h = i5;
        this.i = str4;
        this.j = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lgr)) {
            return false;
        }
        lgr lgrVar = (lgr) obj;
        return this.a == lgrVar.a && jl40.l(this.b, lgrVar.b) && this.c == lgrVar.c && this.d == lgrVar.d && jl40.l(this.e, lgrVar.e) && jl40.l(this.f, lgrVar.f) && this.g == lgrVar.g && this.h == lgrVar.h && jl40.l(this.i, lgrVar.i) && jl40.l(this.j, lgrVar.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + unr0.b(oyr.b(this.h, oyr.b(this.g, unr0.b(unr0.b(oyr.b(this.d, oyr.b(this.c, unr0.b(Integer.hashCode(this.a) * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f), 31), 31), 31, this.i);
    }

    public final String toString() {
        StringBuilder v = unr0.v(this.a, "WriteCardKey(block=", ", value=", this.b, ", readKeyId=");
        vfc.u(this.c, this.d, ", readKeyVersion=", ", readKeyValue=", v);
        g8e.D(v, this.e, ", readKeyType=", this.f, ", writeKeyId=");
        vfc.u(this.g, this.h, ", writeKeyVersion=", ", writeKeyValue=", v);
        return g8e.r(v, this.i, ", writeKeyType=", this.j, Extension.C_BRAKE);
    }
}
