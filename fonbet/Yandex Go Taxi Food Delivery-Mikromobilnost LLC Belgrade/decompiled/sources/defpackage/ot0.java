package defpackage;

import java.util.List;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.address_details.api.ui.AddressDetailsState;

/* loaded from: classes5.dex */
public final class ot0 {
    public final g2q0 a;
    public final g2q0 b;
    public final g2q0 c;
    public final List d;
    public final j17 e;
    public final vu0 f;
    public final AddressDetailsState g;
    public final String h;
    public final Map i;
    public final y7m j;
    public final ldc k;
    public final vs0 l;

    public ot0(g2q0 g2q0Var, g2q0 g2q0Var2, g2q0 g2q0Var3, List list, j17 j17Var, vu0 vu0Var, AddressDetailsState addressDetailsState, String str, Map map, y7m y7mVar, ldc ldcVar, vs0 vs0Var) {
        this.a = g2q0Var;
        this.b = g2q0Var2;
        this.c = g2q0Var3;
        this.d = list;
        this.e = j17Var;
        this.f = vu0Var;
        this.g = addressDetailsState;
        this.h = str;
        this.i = map;
        this.j = y7mVar;
        this.k = ldcVar;
        this.l = vs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ot0)) {
            return false;
        }
        ot0 ot0Var = (ot0) obj;
        return jl40.l(this.a, ot0Var.a) && jl40.l(this.b, ot0Var.b) && jl40.l(this.c, ot0Var.c) && jl40.l(this.d, ot0Var.d) && jl40.l(this.e, ot0Var.e) && jl40.l(this.f, ot0Var.f) && this.g == ot0Var.g && jl40.l(this.h, ot0Var.h) && jl40.l(this.i, ot0Var.i) && jl40.l(this.j, ot0Var.j) && jl40.l(this.k, ot0Var.k) && jl40.l(this.l, ot0Var.l);
    }

    public final int hashCode() {
        g2q0 g2q0Var = this.a;
        int hashCode = (g2q0Var == null ? 0 : g2q0Var.hashCode()) * 31;
        g2q0 g2q0Var2 = this.b;
        int hashCode2 = (hashCode + (g2q0Var2 == null ? 0 : g2q0Var2.hashCode())) * 31;
        g2q0 g2q0Var3 = this.c;
        int c = unr0.c((hashCode2 + (g2q0Var3 == null ? 0 : g2q0Var3.hashCode())) * 31, 31, this.d);
        j17 j17Var = this.e;
        int hashCode3 = (c + (j17Var == null ? 0 : j17Var.hashCode())) * 31;
        vu0 vu0Var = this.f;
        int hashCode4 = (this.g.hashCode() + ((hashCode3 + (vu0Var == null ? 0 : vu0Var.hashCode())) * 31)) * 31;
        String str = this.h;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Map map = this.i;
        int hashCode6 = (hashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        y7m y7mVar = this.j;
        int hashCode7 = (hashCode6 + (y7mVar == null ? 0 : Float.hashCode(y7mVar.a))) * 31;
        ldc ldcVar = this.k;
        int hashCode8 = (hashCode7 + (ldcVar == null ? 0 : Long.hashCode(ldcVar.a))) * 31;
        vs0 vs0Var = this.l;
        return hashCode8 + (vs0Var != null ? vs0Var.hashCode() : 0);
    }

    public final String toString() {
        return "AddressDetailsScreenState(contentTopSection=" + this.a + ", contentBottomSection=" + this.b + ", stickyBottomSection=" + this.c + ", routePoints=" + this.d + ", buttonModel=" + this.e + ", addressFlow=" + this.f + ", state=" + this.g + ", metricaLabel=" + this.h + ", meta=" + this.i + ", spacingHeight=" + this.j + ", spacingColor=" + this.k + ", header=" + this.l + Extension.C_BRAKE;
    }
}
