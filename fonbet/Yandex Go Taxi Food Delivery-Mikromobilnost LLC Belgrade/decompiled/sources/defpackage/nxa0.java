package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class nxa0 {
    public final rfl0 a;
    public final cxa0 b;
    public final ArrayList c;
    public final boolean d;

    public nxa0(rfl0 rfl0Var, cxa0 cxa0Var, ArrayList arrayList, boolean z) {
        this.a = rfl0Var;
        this.b = cxa0Var;
        this.c = arrayList;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nxa0)) {
            return false;
        }
        nxa0 nxa0Var = (nxa0) obj;
        return this.a.equals(nxa0Var.a) && jl40.l(this.b, nxa0Var.b) && this.c.equals(nxa0Var.c) && this.d == nxa0Var.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        cxa0 cxa0Var = this.b;
        return Boolean.hashCode(this.d) + ly3.b((hashCode + (cxa0Var == null ? 0 : cxa0Var.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        return "PerformerRouteVo(routeWay=" + this.a + ", performerPin=" + this.b + ", deliveryPins=" + this.c + ", isVisible=" + this.d + Extension.C_BRAKE;
    }
}
