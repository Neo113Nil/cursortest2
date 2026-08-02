package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class cuj0 extends ra90 {
    public final int a;
    public final String b;
    public final Boolean c;
    public final bfz0 d;
    public final jt1 e;

    public cuj0(int i, String str, Boolean bool, bfz0 bfz0Var, int i2) {
        str = (i2 & 2) != 0 ? null : str;
        bool = (i2 & 4) != 0 ? Boolean.FALSE : bool;
        bfz0Var = (i2 & 8) != 0 ? null : bfz0Var;
        uo5 uo5Var = x4c.y;
        this.a = i;
        this.b = str;
        this.c = bool;
        this.d = bfz0Var;
        this.e = uo5Var;
    }

    @Override // defpackage.v4v
    public final String a() {
        return this.b;
    }

    @Override // defpackage.v4v
    public final Boolean b() {
        return this.c;
    }

    @Override // defpackage.v4v
    public final bfz0 c() {
        return this.d;
    }

    @Override // defpackage.ra90
    public final jt1 d() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cuj0)) {
            return false;
        }
        cuj0 cuj0Var = (cuj0) obj;
        return this.a == cuj0Var.a && jl40.l(this.b, cuj0Var.b) && jl40.l(this.c, cuj0Var.c) && jl40.l(this.d, cuj0Var.d) && jl40.l(this.e, cuj0Var.e);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.c;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        bfz0 bfz0Var = this.d;
        return this.e.hashCode() + ((hashCode3 + (bfz0Var != null ? bfz0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = unr0.v(this.a, "ResourceIconModel(id=", ", contentDescription=", this.b, ", monochrome=");
        v.append(this.c);
        v.append(", tintColor=");
        v.append(this.d);
        v.append(", contentAlignment=");
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
