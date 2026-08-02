package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class cr51 {
    public final tx51 a;
    public final op51 b;
    public final qs51 c;
    public final bs51 d;
    public final rp51 e;
    public final rs51 f;
    public final ir51 g;
    public final vs51 h;
    public final ss51 i;
    public final rt51 j;
    public final uq51 k;

    public cr51(tx51 tx51Var, op51 op51Var, qs51 qs51Var, bs51 bs51Var, rp51 rp51Var, rs51 rs51Var, ir51 ir51Var, vs51 vs51Var, ss51 ss51Var, rt51 rt51Var, uq51 uq51Var) {
        this.a = tx51Var;
        this.b = op51Var;
        this.c = qs51Var;
        this.d = bs51Var;
        this.e = rp51Var;
        this.f = rs51Var;
        this.g = ir51Var;
        this.h = vs51Var;
        this.i = ss51Var;
        this.j = rt51Var;
        this.k = uq51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cr51)) {
            return false;
        }
        cr51 cr51Var = (cr51) obj;
        return this.a.equals(cr51Var.a) && this.b.equals(cr51Var.b) && this.c.equals(cr51Var.c) && this.d.equals(cr51Var.d) && this.e.equals(cr51Var.e) && this.f.equals(cr51Var.f) && this.g.equals(cr51Var.g) && this.h.equals(cr51Var.h) && this.i.equals(cr51Var.i) && this.j.equals(cr51Var.j) && this.k.equals(cr51Var.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "YbColors(textIcon=" + this.a + ", background=" + this.b + ", newMainBackground=" + this.c + ", fill=" + this.d + ", button=" + this.e + ", newMainButton=" + this.f + ", control=" + this.g + ", other=" + this.h + ", newMainOther=" + this.i + ", product=" + this.j + ", cards=" + this.k + Extension.C_BRAKE;
    }
}
