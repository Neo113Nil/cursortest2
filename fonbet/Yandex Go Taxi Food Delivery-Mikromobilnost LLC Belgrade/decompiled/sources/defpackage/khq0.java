package defpackage;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemAnalyticsV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubOfferType;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.ScooterPriceDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.t0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class khq0 {
    public final String a;
    public final String b;
    public final HubOfferType c;
    public final String d;
    public final atj0 e;
    public final btj0 f;
    public final List g;
    public final kz6 h;
    public final List i;
    public final List j;
    public final List k;
    public final Integer l;
    public final ScooterPriceDto m;
    public final String n;
    public final String o;

    static {
        t0 t0Var = HubItemAnalyticsV2.Companion;
    }

    public khq0(String str, String str2, HubOfferType hubOfferType, String str3, atj0 atj0Var, btj0 btj0Var, List list, kz6 kz6Var, List list2, List list3, List list4, Integer num, ScooterPriceDto scooterPriceDto, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = hubOfferType;
        this.d = str3;
        this.e = atj0Var;
        this.f = btj0Var;
        this.g = list;
        this.h = kz6Var;
        this.i = list2;
        this.j = list3;
        this.k = list4;
        this.l = num;
        this.m = scooterPriceDto;
        this.n = str4;
        this.o = str5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    public final fx01 a() {
        ?? r0;
        List list = this.j;
        if (list != null) {
            List list2 = list;
            r0 = new ArrayList(tcc.n(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                r0.add(hta1.d((HubItemAnalyticsV2) it.next(), null));
            }
        } else {
            r0 = EmptyList.a;
        }
        return new fx01(r0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof khq0)) {
            return false;
        }
        khq0 khq0Var = (khq0) obj;
        return jl40.l(this.a, khq0Var.a) && jl40.l(this.b, khq0Var.b) && this.c == khq0Var.c && jl40.l(this.d, khq0Var.d) && jl40.l(this.e, khq0Var.e) && jl40.l(this.f, khq0Var.f) && jl40.l(this.g, khq0Var.g) && jl40.l(this.h, khq0Var.h) && jl40.l(this.i, khq0Var.i) && jl40.l(this.j, khq0Var.j) && jl40.l(this.k, khq0Var.k) && jl40.l(this.l, khq0Var.l) && jl40.l(this.m, khq0Var.m) && jl40.l(this.n, khq0Var.n) && jl40.l(this.o, khq0Var.o);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        atj0 atj0Var = this.e;
        int hashCode4 = (hashCode3 + (atj0Var == null ? 0 : atj0Var.hashCode())) * 31;
        btj0 btj0Var = this.f;
        int hashCode5 = (hashCode4 + (btj0Var == null ? 0 : btj0Var.hashCode())) * 31;
        List list = this.g;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        kz6 kz6Var = this.h;
        int c = unr0.c((hashCode6 + (kz6Var == null ? 0 : kz6Var.hashCode())) * 31, 31, this.i);
        List list2 = this.j;
        int c2 = unr0.c((c + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.k);
        Integer num = this.l;
        int hashCode7 = (c2 + (num == null ? 0 : num.hashCode())) * 31;
        ScooterPriceDto scooterPriceDto = this.m;
        int hashCode8 = (hashCode7 + (scooterPriceDto == null ? 0 : scooterPriceDto.hashCode())) * 31;
        String str3 = this.n;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.o;
        return hashCode9 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("SelectedOfferData(offerItemId=", this.a, ", tariffClass=", this.b, ", offerType=");
        v.append(this.c);
        v.append(", routeUri=");
        v.append(this.d);
        v.append(", resolvedRoute=");
        v.append(this.e);
        v.append(", mainRoute=");
        v.append(this.f);
        v.append(", alternativeResolvedRoutes=");
        v.append(this.g);
        v.append(", buttonContainer=");
        v.append(this.h);
        v.append(", pins=");
        nnm.w(v, this.i, ", analytics=", this.j, ", routeParts=");
        v.append(this.k);
        v.append(", freeReservationMinutes=");
        v.append(this.l);
        v.append(", scooterPrice=");
        v.append(this.m);
        v.append(", scooterReservationIconTag=");
        v.append(this.n);
        v.append(", onboardingId=");
        return oyr.t(v, this.o, Extension.C_BRAKE);
    }
}
