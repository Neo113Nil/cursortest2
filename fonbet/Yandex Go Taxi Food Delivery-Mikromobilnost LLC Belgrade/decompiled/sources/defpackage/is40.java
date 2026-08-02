package defpackage;

import com.yandex.go.multimodal_route.analytics.MultimodalRouteAnalytics$MultimodalRouteSource;
import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class is40 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final lz6 e;
    public final as40 f;
    public final MultimodalRouteAnalytics$MultimodalRouteSource g;
    public final ArrayList h;
    public final Long i;

    public is40(String str, String str2, String str3, String str4, lz6 lz6Var, as40 as40Var, MultimodalRouteAnalytics$MultimodalRouteSource multimodalRouteAnalytics$MultimodalRouteSource, ArrayList arrayList, Long l) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = lz6Var;
        this.f = as40Var;
        this.g = multimodalRouteAnalytics$MultimodalRouteSource;
        this.h = arrayList;
        this.i = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof is40)) {
            return false;
        }
        is40 is40Var = (is40) obj;
        return jl40.l(this.a, is40Var.a) && jl40.l(this.b, is40Var.b) && jl40.l(this.c, is40Var.c) && jl40.l(this.d, is40Var.d) && jl40.l(this.e, is40Var.e) && jl40.l(this.f, is40Var.f) && this.g == is40Var.g && this.h.equals(is40Var.h) && jl40.l(this.i, is40Var.i);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        lz6 lz6Var = this.e;
        int hashCode2 = (hashCode + (lz6Var == null ? 0 : lz6Var.hashCode())) * 31;
        as40 as40Var = this.f;
        int b2 = ly3.b((this.g.hashCode() + ((hashCode2 + (as40Var == null ? 0 : as40Var.hashCode())) * 31)) * 31, 31, this.h);
        Long l = this.i;
        return b2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("MultimodalRouteDetailedCardPayload(routeUri=", this.a, ", routeType=", this.b, ", taxiTariffClass=");
        g8e.D(v, this.c, ", mmOfferId=", this.d, ", button=");
        v.append(this.e);
        v.append(", multimodalPoints=");
        v.append(this.f);
        v.append(", source=");
        v.append(this.g);
        v.append(", mmValue=");
        v.append(this.h);
        v.append(", totalDurationMs=");
        v.append(this.i);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
