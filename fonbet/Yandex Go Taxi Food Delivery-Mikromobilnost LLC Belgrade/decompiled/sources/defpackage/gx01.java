package defpackage;

import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.reprov.x509.AuthorityKeyIdentifierExtension;

/* loaded from: classes14.dex */
public final class gx01 {
    public final String a;
    public final int b;
    public final Double c;
    public final Integer d;
    public final String e;
    public final String f;
    public final Integer g;
    public final String h;
    public final Integer i;
    public final MapBuilder j;

    public gx01(String str, int i, Double d, Integer num, String str2, String str3, Integer num2, String str4, Integer num3) {
        this.a = str;
        this.b = i;
        this.c = d;
        this.d = num;
        this.e = str2;
        this.f = str3;
        this.g = num2;
        this.h = str4;
        this.i = num3;
        MapBuilder y = qv10.y(Constants.KEY_SERVICE, str);
        y.put("route_duration_min", Integer.valueOf(i));
        if (d != null) {
            y.put("price", d);
        }
        if (num != null) {
            y.put("eta_min", num);
        }
        if (str2 != null) {
            y.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, str2);
        }
        if (str3 != null) {
            y.put("section_id", str3);
        }
        if (num2 != null) {
            y.put(AuthorityKeyIdentifierExtension.SERIAL_NUMBER, num2);
        }
        if (str4 != null) {
            y.put("offer_id", str4);
        }
        if (num3 != null) {
            y.put("walk_duration", num3);
        }
        this.j = y.j();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gx01)) {
            return false;
        }
        gx01 gx01Var = (gx01) obj;
        return jl40.l(this.a, gx01Var.a) && this.b == gx01Var.b && jl40.l(this.c, gx01Var.c) && jl40.l(this.d, gx01Var.d) && jl40.l(this.e, gx01Var.e) && jl40.l(this.f, gx01Var.f) && jl40.l(this.g, gx01Var.g) && jl40.l(this.h, gx01Var.h) && jl40.l(this.i, gx01Var.i);
    }

    public final int hashCode() {
        int b = oyr.b(this.b, this.a.hashCode() * 31, 31);
        Double d = this.c;
        int hashCode = (b + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.d;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.e;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.g;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.h;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num3 = this.i;
        return hashCode6 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder u = b64.u(this.b, "MobilityHubRouteOptionV2(service=", this.a, ", routeDurationMin=", ", price=");
        u.append(this.c);
        u.append(", etaMin=");
        u.append(this.d);
        u.append(", tariff=");
        g8e.D(u, this.e, ", sectionId=", this.f, ", serialNumber=");
        tse0.w(this.g, ", offerId=", this.h, ", walkDuration=", u);
        return oo31.j(u, this.i, Extension.C_BRAKE);
    }
}
