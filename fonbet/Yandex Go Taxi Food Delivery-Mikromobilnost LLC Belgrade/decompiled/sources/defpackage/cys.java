package defpackage;

import flex.animation.player.interpolator.InterpolationType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class cys extends tg2 {
    public final String a;
    public final long b;
    public final long c;
    public final InterpolationType d;
    public final lu1 e;
    public final gw01 f;
    public final tg2 g;

    public cys(String str, long j, long j2, InterpolationType interpolationType, lu1 lu1Var, gw01 gw01Var, tg2 tg2Var) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = interpolationType;
        this.e = lu1Var;
        this.f = gw01Var;
        this.g = tg2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cys.class != obj.getClass()) {
            return false;
        }
        cys cysVar = (cys) obj;
        return jl40.l(this.a, cysVar.a) && this.b == cysVar.b && this.c == cysVar.c && this.d == cysVar.d && jl40.l(this.e, cysVar.e) && jl40.l(this.f, cysVar.f) && jl40.l(this.g, cysVar.g);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + qv10.c(qv10.c(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        lu1 lu1Var = this.e;
        int hashCode2 = (hashCode + (lu1Var != null ? lu1Var.hashCode() : 0)) * 31;
        gw01 gw01Var = this.f;
        int hashCode3 = (hashCode2 + (gw01Var != null ? gw01Var.hashCode() : 0)) * 31;
        tg2 tg2Var = this.g;
        return hashCode3 + (tg2Var != null ? tg2Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder l = x4e.l("GenericAnimation(type=", this.a, ", duration=", this.b);
        x4e.A(this.c, ", delay=", ", interpolator=", l);
        l.append(this.d);
        l.append(", alpha=");
        l.append(this.e);
        l.append(", transform=");
        l.append(this.f);
        l.append(", onComplete=");
        l.append(this.g);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
