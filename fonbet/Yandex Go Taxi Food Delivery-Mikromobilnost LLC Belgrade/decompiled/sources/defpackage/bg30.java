package defpackage;

import com.yandex.mapkit.transport.masstransit.Route;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class bg30 {
    public final Route a;
    public final fay0 b;
    public final List c;
    public final boolean d;
    public final q6s0 e;
    public final List f;
    public final boolean g;
    public final xi40 h;

    public bg30(Route route, fay0 fay0Var, List list, q6s0 q6s0Var, List list2, int i) {
        xi40 xi40Var = bei.w;
        boolean z = (i & 8) != 0;
        q6s0Var = (i & 16) != 0 ? new q6s0(true, true) : q6s0Var;
        list2 = (i & 32) != 0 ? null : list2;
        boolean z2 = (i & 64) != 0;
        xi40Var = (i & 128) != 0 ? wfz.B : xi40Var;
        this.a = route;
        this.b = fay0Var;
        this.c = list;
        this.d = z;
        this.e = q6s0Var;
        this.f = list2;
        this.g = z2;
        this.h = xi40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bg30)) {
            return false;
        }
        bg30 bg30Var = (bg30) obj;
        return jl40.l(this.a, bg30Var.a) && jl40.l(this.b, bg30Var.b) && jl40.l(this.c, bg30Var.c) && this.d == bg30Var.d && jl40.l(this.e, bg30Var.e) && jl40.l(this.f, bg30Var.f) && this.g == bg30Var.g && jl40.l(this.h, bg30Var.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        fay0 fay0Var = this.b;
        int hashCode2 = (this.e.hashCode() + unr0.e(unr0.c((hashCode + (fay0Var == null ? 0 : fay0Var.hashCode())) * 31, 31, this.c), 31, this.d)) * 31;
        List list = this.f;
        return this.h.hashCode() + unr0.e((hashCode2 + (list != null ? list.hashCode() : 0)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Payload(route=");
        sb.append(this.a);
        sb.append(", taxiSectionData=");
        sb.append(this.b);
        sb.append(", addresses=");
        nzs.p(sb, this.c, ", handleRouteFocus=", this.d, ", showEndpointPins=");
        sb.append(this.e);
        sb.append(", hubRoutePins=");
        sb.append(this.f);
        sb.append(", showUserLocation=");
        sb.append(this.g);
        sb.append(", transferBubbleVisibilityPolicy=");
        sb.append(this.h);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
