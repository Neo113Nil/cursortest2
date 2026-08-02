package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class g4b0 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;

    public g4b0(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = i2;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4b0)) {
            return false;
        }
        g4b0 g4b0Var = (g4b0) obj;
        return jl40.l(this.a, g4b0Var.a) && jl40.l(this.b, g4b0Var.b) && jl40.l(this.c, g4b0Var.c) && this.d == g4b0Var.d && this.e == g4b0Var.e && jl40.l(this.f, g4b0Var.f) && jl40.l(this.g, g4b0Var.g) && jl40.l(this.h, g4b0Var.h) && jl40.l(this.i, g4b0Var.i) && jl40.l(this.j, g4b0Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + unr0.b(unr0.b(unr0.b(unr0.b(oyr.b(this.e, oyr.b(this.d, unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder v = b64.v("Goal(id=", this.a, ", title=", this.b, ", subtitle=");
        b64.A(this.d, this.c, ", progressTotalCount=", ", progressCurrentCount=", v);
        smw0.t(this.e, ", progressImageTag=", this.f, ", prizeImageTag=", v);
        g8e.D(v, this.g, ", prizeInfoDeeplink=", this.h, ", promoBlockTitleOverride=");
        return g8e.r(v, this.i, ", promoBlockSubtitleOverride=", this.j, Extension.C_BRAKE);
    }
}
