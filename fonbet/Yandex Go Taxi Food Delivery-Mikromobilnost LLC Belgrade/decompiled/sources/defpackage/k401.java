package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class k401 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public k401(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public final String a() {
        return this.g;
    }

    public final String b() {
        return this.f;
    }

    public final String c() {
        return this.e;
    }

    public final String d() {
        return this.a;
    }

    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k401)) {
            return false;
        }
        k401 k401Var = (k401) obj;
        return this.a.equals(k401Var.a) && this.b.equals(k401Var.b) && this.c.equals(k401Var.c) && this.d.equals(k401Var.d) && this.e.equals(k401Var.e) && this.f.equals(k401Var.f) && this.g.equals(k401Var.g);
    }

    public final String f() {
        return this.d;
    }

    public final String g() {
        return this.c;
    }

    public final int hashCode() {
        return this.g.hashCode() + unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder v = b64.v("Layers(mask=", this.a, ", shadow=", this.b, ", warmLight=");
        g8e.D(v, this.c, ", softLight=", this.d, ", hardLight=");
        g8e.D(v, this.e, ", glossy=", this.f, ", details=");
        return oyr.t(v, this.g, Extension.C_BRAKE);
    }
}
