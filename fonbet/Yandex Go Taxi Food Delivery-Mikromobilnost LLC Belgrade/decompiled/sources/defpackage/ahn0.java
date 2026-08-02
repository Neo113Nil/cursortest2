package defpackage;

import com.yandex.go.scooters.api.domain.model.b;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ahn0 {
    public final boolean a;
    public final yfn0 b;
    public final rgn0 c;
    public final zuo0 d;
    public final shn0 e;
    public final List f;
    public final wgn0 g;
    public final zgn0 h;

    public ahn0(boolean z, yfn0 yfn0Var, rgn0 rgn0Var, zuo0 zuo0Var, shn0 shn0Var, List list, wgn0 wgn0Var, zgn0 zgn0Var) {
        this.a = z;
        this.b = yfn0Var;
        this.c = rgn0Var;
        this.d = zuo0Var;
        this.e = shn0Var;
        this.f = list;
        this.g = wgn0Var;
        this.h = zgn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahn0)) {
            return false;
        }
        ahn0 ahn0Var = (ahn0) obj;
        return this.a == ahn0Var.a && jl40.l(this.b, ahn0Var.b) && jl40.l(this.c, ahn0Var.c) && jl40.l(this.d, ahn0Var.d) && jl40.l(this.e, ahn0Var.e) && jl40.l(this.f, ahn0Var.f) && jl40.l(this.g, ahn0Var.g) && jl40.l(this.h, ahn0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + unr0.c((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.f)) * 31);
    }

    public final String toString() {
        return "ScootersDetailedOrderV2(isLoading=" + this.a + ", header=" + this.b + ", actionsHolder=" + this.c + ", scootersSessionState=" + this.d + ", scootersDetailedStatusBar=" + this.e + ", scootersSlowdownsInfo=" + b.b(this.f) + ", scootersOrderSelector=" + this.g + ", scootersVehicleActualPhotoState=" + this.h + Extension.C_BRAKE;
    }
}
