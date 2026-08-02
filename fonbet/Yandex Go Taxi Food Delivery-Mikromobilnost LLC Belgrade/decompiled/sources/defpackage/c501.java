package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class c501 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public c501(String str, String str2, String str3, String str4, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str3;
        this.f = str4;
        this.g = str3;
        this.h = str4;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c501)) {
            return false;
        }
        c501 c501Var = (c501) obj;
        return jl40.l(this.a, c501Var.a) && jl40.l(this.b, c501Var.b) && jl40.l(this.c, c501Var.c) && jl40.l(this.d, c501Var.d) && jl40.l(this.e, c501Var.e) && jl40.l(this.f, c501Var.f) && jl40.l(this.g, c501Var.g) && jl40.l(this.h, c501Var.h);
    }

    public final String f() {
        return this.f;
    }

    public final String g() {
        return this.g;
    }

    public final String h() {
        return this.h;
    }

    public final int hashCode() {
        return this.h.hashCode() + unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder v = b64.v("TrackingCardStyledColors(focus=", this.a, ", focusUltima=", this.b, ", long=");
        g8e.D(v, this.c, ", longUltima=", this.d, ", mapMainScreen=");
        g8e.D(v, this.e, ", mapMainScreenUltima=", this.f, ", superappMainScreen=");
        return g8e.r(v, this.g, ", superappMainScreenUltima=", this.h, Extension.C_BRAKE);
    }

    public c501(String str) {
        this(str, str, str, str, 0);
    }

    public c501(String str, String str2, String str3, String str4) {
        this(str, str2 == null ? str : str2, str3, str4 == null ? str3 : str4, 0);
    }
}
