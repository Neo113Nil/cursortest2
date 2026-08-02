package defpackage;

import java.util.Collections;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class poc0 extends qoc0 {
    public final String b;
    public final g0k c;
    public final n0d0 d;
    public final gf20 e;
    public final ofe f;
    public final ooc0 g;

    public poc0(g0k g0kVar, n0d0 n0d0Var, gf20 gf20Var, ofe ofeVar, ooc0 ooc0Var) {
        super(Collections.singletonList(gf20Var));
        this.b = "v2_plaque:client:tablet";
        this.c = g0kVar;
        this.d = n0d0Var;
        this.e = gf20Var;
        this.f = ofeVar;
        this.g = ooc0Var;
    }

    @Override // defpackage.qoc0
    public final q0d0 a() {
        return this.d;
    }

    @Override // defpackage.qoc0
    public final ofe b() {
        return this.f;
    }

    @Override // defpackage.qoc0
    public final g0k c() {
        return this.c;
    }

    @Override // defpackage.qoc0
    public final String d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof poc0)) {
            return false;
        }
        poc0 poc0Var = (poc0) obj;
        return jl40.l(this.b, poc0Var.b) && jl40.l(this.c, poc0Var.c) && jl40.l(this.d, poc0Var.d) && jl40.l(this.e, poc0Var.e) && jl40.l(this.f, poc0Var.f) && jl40.l(this.g, poc0Var.g);
    }

    @Override // defpackage.qoc0
    public final ooc0 f() {
        return this.g;
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31)) * 31;
        ofe ofeVar = this.f;
        int hashCode2 = (hashCode + (ofeVar == null ? 0 : ofeVar.hashCode())) * 31;
        ooc0 ooc0Var = this.g;
        return hashCode2 + (ooc0Var != null ? ooc0Var.hashCode() : 0);
    }

    public final String toString() {
        return "TabletPlaqueModel(id=" + this.b + ", displaySettings=" + this.c + ", action=" + this.d + ", level=" + this.e + ", contentDescription=" + this.f + ", notification=" + this.g + Extension.C_BRAKE;
    }
}
