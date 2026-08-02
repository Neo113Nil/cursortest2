package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class hf20 extends sf20 {
    public final String b;
    public final q0d0 c;
    public final ofe d;
    public final o151 e;
    public final bg20 f;
    public final bg20 g;
    public final bg20 h;

    public hf20(String str, q0d0 q0d0Var, ofe ofeVar, o151 o151Var, bg20 bg20Var, bg20 bg20Var2, bg20 bg20Var3) {
        super(q0d0Var);
        this.b = str;
        this.c = q0d0Var;
        this.d = ofeVar;
        this.e = o151Var;
        this.f = bg20Var;
        this.g = bg20Var2;
        this.h = bg20Var3;
    }

    @Override // defpackage.sf20, defpackage.dg20
    public final q0d0 a() {
        return this.c;
    }

    @Override // defpackage.dg20
    public final String b() {
        return this.b;
    }

    @Override // defpackage.sf20
    public final o151 c() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hf20)) {
            return false;
        }
        hf20 hf20Var = (hf20) obj;
        return jl40.l(this.b, hf20Var.b) && jl40.l(this.c, hf20Var.c) && this.d.equals(hf20Var.d) && jl40.l(this.e, hf20Var.e) && this.f.equals(hf20Var.f) && jl40.l(this.g, hf20Var.g) && jl40.l(this.h, hf20Var.h);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        q0d0 q0d0Var = this.c;
        int hashCode2 = (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((hashCode + (q0d0Var == null ? 0 : q0d0Var.hashCode())) * 31)) * 31)) * 31)) * 31;
        bg20 bg20Var = this.g;
        int hashCode3 = (hashCode2 + (bg20Var == null ? 0 : bg20Var.hashCode())) * 31;
        bg20 bg20Var2 = this.h;
        return hashCode3 + (bg20Var2 != null ? bg20Var2.hashCode() : 0);
    }

    public final String toString() {
        return "BalanceMicroWidgetModel(id=" + this.b + ", action=" + this.c + ", contentDescription=" + this.d + ", widgetDisplaySettings=" + this.e + ", balance=" + this.f + ", title=" + this.g + ", subtitle=" + this.h + Extension.C_BRAKE;
    }
}
