package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class pud {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final String f;
    public final idj0 g;

    public pud(int i, String str, String str2, String str3, boolean z, String str4, idj0 idj0Var) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = str4;
        this.g = idj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pud)) {
            return false;
        }
        pud pudVar = (pud) obj;
        return this.a == pudVar.a && jl40.l(this.b, pudVar.b) && jl40.l(this.c, pudVar.c) && jl40.l(this.d, pudVar.d) && this.e == pudVar.e && this.f.equals(pudVar.f) && jl40.l(this.g, pudVar.g);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        int b = unr0.b(unr0.e(unr0.b(unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        idj0 idj0Var = this.g;
        return b + (idj0Var != null ? idj0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = unr0.v(this.a, "CompoundOptionItem(itemIndex=", ", iconUrl=", this.b, ", title=");
        g8e.D(v, this.c, ", subtitle=", this.d, ", removeMode=");
        unr0.A(", name=", this.f, ", badge=", v, this.e);
        v.append(this.g);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
