package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class gf01 implements jf01 {
    public final stz0 a;
    public final rr51 b;
    public final rr51 c;
    public final cf01 d;

    public gf01(stz0 stz0Var, rr51 rr51Var, rr51 rr51Var2, cf01 cf01Var) {
        this.a = stz0Var;
        this.b = rr51Var;
        this.c = rr51Var2;
        this.d = cf01Var;
    }

    public final rr51 a() {
        return this.c;
    }

    public final rr51 b() {
        return this.b;
    }

    public final cf01 c() {
        return this.d;
    }

    public final stz0 d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf01)) {
            return false;
        }
        gf01 gf01Var = (gf01) obj;
        return jl40.l(this.a, gf01Var.a) && jl40.l(this.b, gf01Var.b) && jl40.l(this.c, gf01Var.c) && this.d.equals(gf01Var.d);
    }

    public final int hashCode() {
        stz0 stz0Var = this.a;
        int hashCode = (stz0Var == null ? 0 : stz0Var.hashCode()) * 31;
        rr51 rr51Var = this.b;
        int hashCode2 = (hashCode + (rr51Var == null ? 0 : rr51Var.hashCode())) * 31;
        rr51 rr51Var2 = this.c;
        return this.d.hashCode() + ((hashCode2 + (rr51Var2 != null ? rr51Var2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Content(toolbarState=" + this.a + ", headerDivData=" + this.b + ", filtersDivData=" + this.c + ", listViewState=" + this.d + Extension.C_BRAKE;
    }
}
