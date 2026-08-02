package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.experiment.f;

/* loaded from: classes6.dex */
public final class ey30 {
    public final uu30 a;
    public final f b;
    public final pd01 c;
    public final boolean d;

    public ey30(uu30 uu30Var, f fVar, pd01 pd01Var, boolean z) {
        this.a = uu30Var;
        this.b = fVar;
        this.c = pd01Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey30)) {
            return false;
        }
        ey30 ey30Var = (ey30) obj;
        return jl40.l(this.a, ey30Var.a) && jl40.l(this.b, ey30Var.b) && jl40.l(this.c, ey30Var.c) && this.d == ey30Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Configs(mtRouteAddresses=" + this.a + ", transportOnSummaryConfig=" + this.b + ", trainsFlowConfig=" + this.c + ", syncInProgress=" + this.d + Extension.C_BRAKE;
    }
}
