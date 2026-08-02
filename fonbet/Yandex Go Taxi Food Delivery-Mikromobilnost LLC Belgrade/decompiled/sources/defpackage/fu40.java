package defpackage;

import com.yandex.go.multimodal_route.api.MultimodalRouteRootPayload$Source;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class fu40 implements ju40 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final lz6 e;
    public final as40 f;
    public final MultimodalRouteRootPayload$Source g;
    public final List h;
    public final Long i;

    public fu40(String str, String str2, String str3, String str4, lz6 lz6Var, as40 as40Var, MultimodalRouteRootPayload$Source multimodalRouteRootPayload$Source, List list, Long l) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = lz6Var;
        this.f = as40Var;
        this.g = multimodalRouteRootPayload$Source;
        this.h = list;
        this.i = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fu40)) {
            return false;
        }
        fu40 fu40Var = (fu40) obj;
        return jl40.l(this.a, fu40Var.a) && jl40.l(this.b, fu40Var.b) && jl40.l(this.c, fu40Var.c) && jl40.l(this.d, fu40Var.d) && jl40.l(this.e, fu40Var.e) && jl40.l(this.f, fu40Var.f) && this.g == fu40Var.g && this.h.equals(fu40Var.h) && jl40.l(this.i, fu40Var.i);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        lz6 lz6Var = this.e;
        int hashCode2 = (hashCode + (lz6Var == null ? 0 : lz6Var.hashCode())) * 31;
        as40 as40Var = this.f;
        int c = unr0.c((this.g.hashCode() + ((hashCode2 + (as40Var == null ? 0 : as40Var.hashCode())) * 31)) * 31, 31, this.h);
        Long l = this.i;
        return c + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("DetailedCard(routeUri=", this.a, ", routeType=", this.b, ", taxiTariffClass=");
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
