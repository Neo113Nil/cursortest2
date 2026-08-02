package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class p6p0 {
    public static final p6p0 i = new p6p0(false, false, null, false, null, fef.e, ysn0.e, null);
    public final boolean a;
    public final boolean b;
    public final o6p0 c;
    public final boolean d;
    public final Boolean e;
    public final fef f;
    public final ysn0 g;
    public final Integer h;

    public p6p0(boolean z, boolean z2, o6p0 o6p0Var, boolean z3, Boolean bool, fef fefVar, ysn0 ysn0Var, Integer num) {
        this.a = z;
        this.b = z2;
        this.c = o6p0Var;
        this.d = z3;
        this.e = bool;
        this.f = fefVar;
        this.g = ysn0Var;
        this.h = num;
    }

    public final Boolean a() {
        return this.e;
    }

    public final ysn0 b() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6p0)) {
            return false;
        }
        p6p0 p6p0Var = (p6p0) obj;
        return this.a == p6p0Var.a && this.b == p6p0Var.b && jl40.l(this.c, p6p0Var.c) && this.d == p6p0Var.d && jl40.l(this.e, p6p0Var.e) && jl40.l(this.f, p6p0Var.f) && jl40.l(this.g, p6p0Var.g) && jl40.l(this.h, p6p0Var.h);
    }

    public final int hashCode() {
        int e = unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b);
        o6p0 o6p0Var = this.c;
        int e2 = unr0.e((e + (o6p0Var == null ? 0 : o6p0Var.hashCode())) * 31, 31, this.d);
        Boolean bool = this.e;
        int hashCode = (this.g.hashCode() + ((this.f.hashCode() + ((e2 + (bool == null ? 0 : bool.hashCode())) * 31)) * 31)) * 31;
        Integer num = this.h;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder u = qv10.u("ScootersUserState(fromSessionsCurrent=", ", fromUserState=", ", debt=", this.a, this.b);
        u.append(this.c);
        u.append(", isNewbie=");
        u.append(this.d);
        u.append(", ignitionKeyAllowed=");
        u.append(this.e);
        u.append(", currencyRules=");
        u.append(this.f);
        u.append(", scootersInsurance=");
        u.append(this.g);
        u.append(", superPassGraceDaysLeft=");
        u.append(this.h);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
