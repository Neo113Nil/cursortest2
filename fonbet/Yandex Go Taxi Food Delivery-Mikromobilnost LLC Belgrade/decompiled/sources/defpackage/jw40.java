package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class jw40 {
    public final String a;
    public final String b;
    public final kw40 c;
    public final kw40 d;
    public final boolean e;
    public final String f;

    public jw40(String str, String str2, kw40 kw40Var, kw40 kw40Var2, boolean z, String str3) {
        this.a = str;
        this.b = str2;
        this.c = kw40Var;
        this.d = kw40Var2;
        this.e = z;
        this.f = str3;
    }

    public final String a() {
        return this.f;
    }

    public final kw40 b() {
        return this.c;
    }

    public final kw40 c() {
        return this.d;
    }

    public final String d() {
        return this.b;
    }

    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jw40)) {
            return false;
        }
        jw40 jw40Var = (jw40) obj;
        return jl40.l(this.a, jw40Var.a) && jl40.l(this.b, jw40Var.b) && jl40.l(this.c, jw40Var.c) && jl40.l(this.d, jw40Var.d) && this.e == jw40Var.e && jl40.l(this.f, jw40Var.f);
    }

    public final boolean f() {
        return this.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        kw40 kw40Var = this.d;
        int e = unr0.e((hashCode2 + (kw40Var == null ? 0 : kw40Var.hashCode())) * 31, 31, this.e);
        String str2 = this.f;
        return e + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("MultiorderDialog(title=", this.a, ", text=", this.b, ", primaryButton=");
        v.append(this.c);
        v.append(", secondaryButton=");
        v.append(this.d);
        v.append(", isShimmering=");
        return n.m(", imageTag=", this.f, Extension.C_BRAKE, v, this.e);
    }
}
