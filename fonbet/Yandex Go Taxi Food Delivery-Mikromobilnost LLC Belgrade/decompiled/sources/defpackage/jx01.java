package defpackage;

import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class jx01 {
    public final String a;
    public final int b;
    public final Integer c;
    public final Double d;
    public final String e;
    public final String f;
    public final Integer g;
    public final Integer h;
    public final MapBuilder i;

    public jx01(String str, int i, Integer num, Double d, String str2, String str3, Integer num2, Integer num3) {
        this.a = str;
        this.b = i;
        this.c = num;
        this.d = d;
        this.e = str2;
        this.f = str3;
        this.g = num2;
        this.h = num3;
        MapBuilder y = qv10.y(Constants.KEY_SERVICE, str);
        y.put("route_duration_min", Integer.valueOf(i));
        if (num != null) {
            y.put("eta_min", num);
        }
        if (d != null) {
            y.put("price", d);
        }
        if (str2 != null) {
            y.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, str2);
        }
        if (str3 != null) {
            y.put("offer_id", str3);
        }
        if (num2 != null) {
            y.put("walk_duration", num2);
        }
        if (num3 != null) {
            y.put("transfers", num3);
        }
        this.i = y.j();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jx01)) {
            return false;
        }
        jx01 jx01Var = (jx01) obj;
        return jl40.l(this.a, jx01Var.a) && this.b == jx01Var.b && jl40.l(this.c, jx01Var.c) && jl40.l(this.d, jx01Var.d) && jl40.l(this.e, jx01Var.e) && jl40.l(this.f, jx01Var.f) && jl40.l(this.g, jx01Var.g) && jl40.l(this.h, jx01Var.h);
    }

    public final int hashCode() {
        int b = oyr.b(this.b, this.a.hashCode() * 31, 31);
        Integer num = this.c;
        int hashCode = (b + (num == null ? 0 : num.hashCode())) * 31;
        Double d = this.d;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.e;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.g;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.h;
        return hashCode5 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder u = b64.u(this.b, "MultimodalRouteOption(service=", this.a, ", routeDurationMin=", ", etaMin=");
        u.append(this.c);
        u.append(", price=");
        u.append(this.d);
        u.append(", tariff=");
        g8e.D(u, this.e, ", offerId=", this.f, ", walkDuration=");
        u.append(this.g);
        u.append(", transfers=");
        u.append(this.h);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
