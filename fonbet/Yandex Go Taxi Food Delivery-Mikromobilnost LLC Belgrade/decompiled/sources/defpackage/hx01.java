package defpackage;

import com.yandex.go.taxi.summary.mobilityhub.analytics.TransitRoutesHubAnalytics$PresentationType;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.reprov.x509.AuthorityKeyIdentifierExtension;

/* loaded from: classes14.dex */
public final class hx01 {
    public final String a;
    public final int b;
    public final TransitRoutesHubAnalytics$PresentationType c;
    public final Double d;
    public final Integer e;
    public final String f;
    public final String g;
    public final Integer h;
    public final String i;
    public final Integer j;
    public final String k;
    public final String l;
    public final Integer m;
    public final String n;
    public final MapBuilder o;

    public hx01(String str, int i, TransitRoutesHubAnalytics$PresentationType transitRoutesHubAnalytics$PresentationType, Double d, Integer num, String str2, String str3, Integer num2, String str4, Integer num3, String str5, String str6, Integer num4, String str7) {
        this.a = str;
        this.b = i;
        this.c = transitRoutesHubAnalytics$PresentationType;
        this.d = d;
        this.e = num;
        this.f = str2;
        this.g = str3;
        this.h = num2;
        this.i = str4;
        this.j = num3;
        this.k = str5;
        this.l = str6;
        this.m = num4;
        this.n = str7;
        MapBuilder y = qv10.y(Constants.KEY_SERVICE, str);
        y.put("route_duration_min", Integer.valueOf(i));
        y.put("presentation", transitRoutesHubAnalytics$PresentationType.getEventValue());
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
        if (str5 != null) {
            y.put("item_id", str5);
        }
        if (str6 != null) {
            y.put("id_hint", str6);
        }
        if (num4 != null) {
            y.put("transfers", num4);
        }
        if (str7 != null) {
            y.put("multimodal_id", str7);
        }
        this.o = y.j();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hx01)) {
            return false;
        }
        hx01 hx01Var = (hx01) obj;
        return jl40.l(this.a, hx01Var.a) && this.b == hx01Var.b && this.c == hx01Var.c && jl40.l(this.d, hx01Var.d) && jl40.l(this.e, hx01Var.e) && jl40.l(this.f, hx01Var.f) && jl40.l(this.g, hx01Var.g) && jl40.l(this.h, hx01Var.h) && jl40.l(this.i, hx01Var.i) && jl40.l(this.j, hx01Var.j) && jl40.l(this.k, hx01Var.k) && jl40.l(this.l, hx01Var.l) && jl40.l(this.m, hx01Var.m) && jl40.l(this.n, hx01Var.n);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + oyr.b(this.b, this.a.hashCode() * 31, 31)) * 31;
        Double d = this.d;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.e;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.h;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.i;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num3 = this.j;
        int hashCode8 = (hashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str4 = this.k;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.l;
        int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num4 = this.m;
        int hashCode11 = (hashCode10 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str6 = this.n;
        return hashCode11 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder u = b64.u(this.b, "MobilityHubRouteOptionV3(service=", this.a, ", routeDurationMin=", ", presentation=");
        u.append(this.c);
        u.append(", price=");
        u.append(this.d);
        u.append(", etaMin=");
        tse0.w(this.e, ", tariff=", this.f, ", sectionId=", u);
        vfc.w(this.h, this.g, ", serialNumber=", ", offerId=", u);
        vfc.w(this.j, this.i, ", walkDuration=", ", itemId=", u);
        g8e.D(u, this.k, ", idHint=", this.l, ", transfers=");
        u.append(this.m);
        u.append(", multimodalId=");
        u.append(this.n);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
