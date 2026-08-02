package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ps0 {
    public final vs0 a;
    public final qkg b;
    public final j17 c;
    public final qkg d;
    public final y7m e;
    public final ldc f;
    public final String g;
    public final Map h;

    public ps0(vs0 vs0Var, qkg qkgVar, j17 j17Var, qkg qkgVar2, y7m y7mVar, ldc ldcVar, String str, Map map) {
        this.a = vs0Var;
        this.b = qkgVar;
        this.c = j17Var;
        this.d = qkgVar2;
        this.e = y7mVar;
        this.f = ldcVar;
        this.g = str;
        this.h = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ps0)) {
            return false;
        }
        ps0 ps0Var = (ps0) obj;
        return jl40.l(this.a, ps0Var.a) && this.b.equals(ps0Var.b) && jl40.l(this.c, ps0Var.c) && this.d.equals(ps0Var.d) && jl40.l(this.e, ps0Var.e) && jl40.l(this.f, ps0Var.f) && jl40.l(this.g, ps0Var.g) && jl40.l(this.h, ps0Var.h);
    }

    public final int hashCode() {
        vs0 vs0Var = this.a;
        int hashCode = (this.b.hashCode() + ((vs0Var == null ? 0 : vs0Var.hashCode()) * 31)) * 31;
        j17 j17Var = this.c;
        int hashCode2 = (this.d.hashCode() + ((hashCode + (j17Var == null ? 0 : j17Var.hashCode())) * 31)) * 31;
        y7m y7mVar = this.e;
        int hashCode3 = (hashCode2 + (y7mVar == null ? 0 : Float.hashCode(y7mVar.a))) * 31;
        ldc ldcVar = this.f;
        int hashCode4 = (hashCode3 + (ldcVar == null ? 0 : Long.hashCode(ldcVar.a))) * 31;
        String str = this.g;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Map map = this.h;
        return hashCode5 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "AddressDetailsDashboardState(header=" + this.a + ", mainSectionModel=" + this.b + ", buttonModel=" + this.c + ", bottomSectionModel=" + this.d + ", spacingHeight=" + this.e + ", spacingColor=" + this.f + ", metricaLabel=" + this.g + ", meta=" + this.h + Extension.C_BRAKE;
    }
}
