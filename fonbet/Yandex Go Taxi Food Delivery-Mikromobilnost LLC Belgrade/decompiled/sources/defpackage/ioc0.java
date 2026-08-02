package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ioc0 extends qoc0 {
    public final String b;
    public final List c;
    public final g0k d;
    public final q0d0 e;
    public final hoc0 f;
    public final ofe g;
    public final ooc0 h;

    public ioc0(String str, List list, g0k g0kVar, q0d0 q0d0Var, hoc0 hoc0Var, ooc0 ooc0Var) {
        super(list);
        this.b = str;
        this.c = list;
        this.d = g0kVar;
        this.e = q0d0Var;
        this.f = hoc0Var;
        this.g = ofe.e;
        this.h = ooc0Var;
    }

    @Override // defpackage.qoc0
    public final q0d0 a() {
        return this.e;
    }

    @Override // defpackage.qoc0
    public final ofe b() {
        return this.g;
    }

    @Override // defpackage.qoc0
    public final g0k c() {
        return this.d;
    }

    @Override // defpackage.qoc0
    public final String d() {
        return this.b;
    }

    @Override // defpackage.qoc0
    public final List e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ioc0)) {
            return false;
        }
        ioc0 ioc0Var = (ioc0) obj;
        return jl40.l(this.b, ioc0Var.b) && jl40.l(this.c, ioc0Var.c) && jl40.l(this.d, ioc0Var.d) && jl40.l(this.e, ioc0Var.e) && jl40.l(this.f, ioc0Var.f) && jl40.l(this.g, ioc0Var.g) && jl40.l(this.h, ioc0Var.h);
    }

    @Override // defpackage.qoc0
    public final ooc0 f() {
        return this.h;
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + unr0.c(this.b.hashCode() * 31, 31, this.c)) * 31)) * 31)) * 31;
        ofe ofeVar = this.g;
        int hashCode2 = (hashCode + (ofeVar == null ? 0 : ofeVar.hashCode())) * 31;
        ooc0 ooc0Var = this.h;
        return hashCode2 + (ooc0Var != null ? ooc0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder r = xvz.r("MicroWidgetsPlaqueModel(id=", this.b, ", levels=", this.c, ", displaySettings=");
        r.append(this.d);
        r.append(", action=");
        r.append(this.e);
        r.append(", params=");
        r.append(this.f);
        r.append(", contentDescription=");
        r.append(this.g);
        r.append(", notification=");
        r.append(this.h);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
