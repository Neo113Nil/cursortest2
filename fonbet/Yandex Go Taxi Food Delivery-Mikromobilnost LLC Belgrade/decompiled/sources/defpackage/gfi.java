package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class gfi {
    public final boolean a;
    public final boolean b;
    public final oxa0 c;
    public final boolean d;
    public final List e;
    public final boolean f;

    public gfi(boolean z, boolean z2, oxa0 oxa0Var, boolean z3, List list, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = oxa0Var;
        this.d = z3;
        this.e = list;
        this.f = z4;
    }

    public final boolean a() {
        return this.d;
    }

    public final List b() {
        return this.e;
    }

    public final oxa0 c() {
        return this.c;
    }

    public final boolean d() {
        return this.f;
    }

    public final boolean e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gfi)) {
            return false;
        }
        gfi gfiVar = (gfi) obj;
        return this.a == gfiVar.a && this.b == gfiVar.b && jl40.l(this.c, gfiVar.c) && this.d == gfiVar.d && this.e.equals(gfiVar.e) && this.f == gfiVar.f;
    }

    public final boolean f() {
        return this.a;
    }

    public final int hashCode() {
        int e = unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b);
        oxa0 oxa0Var = this.c;
        return Boolean.hashCode(this.f) + unr0.c(unr0.e((e + (oxa0Var == null ? 0 : oxa0Var.hashCode())) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder u = qv10.u("DeliveryContext(isPerformerPositionAvailable=", ", isCompleted=", ", performerSearch=", this.a, this.b);
        u.append(this.c);
        u.append(", autoOpenPostcard=");
        u.append(this.d);
        u.append(", displayTargets=");
        u.append(this.e);
        u.append(", shouldTrackGeo=");
        u.append(this.f);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
