package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class lvi0 extends ra90 {
    public final String a;
    public final kvi0 b;
    public final String c;
    public final Boolean d;
    public final bfz0 e;
    public final jt1 f;

    public lvi0(String str, kvi0 kvi0Var, String str2, Boolean bool, bfz0 bfz0Var, int i) {
        str = (i & 1) != 0 ? null : str;
        kvi0Var = (i & 2) != 0 ? null : kvi0Var;
        str2 = (i & 4) != 0 ? null : str2;
        bool = (i & 8) != 0 ? Boolean.FALSE : bool;
        bfz0Var = (i & 16) != 0 ? null : bfz0Var;
        uo5 uo5Var = x4c.y;
        this.a = str;
        this.b = kvi0Var;
        this.c = str2;
        this.d = bool;
        this.e = bfz0Var;
        this.f = uo5Var;
    }

    @Override // defpackage.v4v
    public final String a() {
        return this.c;
    }

    @Override // defpackage.v4v
    public final Boolean b() {
        return this.d;
    }

    @Override // defpackage.v4v
    public final bfz0 c() {
        return this.e;
    }

    @Override // defpackage.ra90
    public final jt1 d() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lvi0)) {
            return false;
        }
        lvi0 lvi0Var = (lvi0) obj;
        return jl40.l(this.a, lvi0Var.a) && jl40.l(this.b, lvi0Var.b) && jl40.l(this.c, lvi0Var.c) && jl40.l(this.d, lvi0Var.d) && jl40.l(this.e, lvi0Var.e) && jl40.l(this.f, lvi0Var.f);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        kvi0 kvi0Var = this.b;
        int hashCode2 = (hashCode + (kvi0Var == null ? 0 : Integer.hashCode(kvi0Var.a))) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.d;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        bfz0 bfz0Var = this.e;
        return this.f.hashCode() + ((hashCode4 + (bfz0Var != null ? bfz0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RemoteIconModel(url=");
        sb.append(this.a);
        sb.append(", fallbackRes=");
        sb.append(this.b);
        sb.append(", contentDescription=");
        tse0.A(sb, this.c, ", monochrome=", this.d, ", tintColor=");
        sb.append(this.e);
        sb.append(", contentAlignment=");
        sb.append(this.f);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public lvi0() {
        this(null, null, null, null, null, 63);
    }
}
