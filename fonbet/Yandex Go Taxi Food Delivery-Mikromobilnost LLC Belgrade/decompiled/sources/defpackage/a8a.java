package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class a8a {
    public final String a;
    public final CharSequence b;
    public final CharSequence c;
    public final String d;
    public final String e;
    public final tn9 f;
    public final uj9 g;
    public final n9a h;

    public a8a(String str, CharSequence charSequence, CharSequence charSequence2, String str2, String str3, tn9 tn9Var, g7a g7aVar, n9a n9aVar) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = str2;
        this.e = str3;
        this.f = tn9Var;
        this.g = g7aVar;
        this.h = n9aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8a)) {
            return false;
        }
        a8a a8aVar = (a8a) obj;
        return jl40.l(this.a, a8aVar.a) && jl40.l(this.b, a8aVar.b) && jl40.l(this.c, a8aVar.c) && jl40.l(this.d, a8aVar.d) && jl40.l(this.e, a8aVar.e) && jl40.l(this.f, a8aVar.f) && jl40.l(this.g, a8aVar.g) && jl40.l(this.h, a8aVar.h);
    }

    public final int hashCode() {
        int b = smw0.b(this.a.hashCode() * 31, 31, this.b);
        CharSequence charSequence = this.c;
        int hashCode = (b + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        tn9 tn9Var = this.f;
        int hashCode4 = (hashCode3 + (tn9Var == null ? 0 : tn9Var.hashCode())) * 31;
        uj9 uj9Var = this.g;
        int hashCode5 = (hashCode4 + (uj9Var == null ? 0 : uj9Var.hashCode())) * 31;
        n9a n9aVar = this.h;
        return hashCode5 + (n9aVar != null ? n9aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder t = ly3.t(this.b, "PromoPlate(id=", this.a, ", title=", ", subtitle=");
        t.append((Object) this.c);
        t.append(", leadImageUrl=");
        t.append(this.d);
        t.append(", leadIconTag=");
        t.append(this.e);
        t.append(", attribute=");
        t.append(this.f);
        t.append(", action=");
        t.append(this.g);
        t.append(", toggle=");
        t.append(this.h);
        t.append(Extension.C_BRAKE);
        return t.toString();
    }
}
