package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$InitiatedPaymentMethod;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$TripType;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$VehicleType;

/* loaded from: classes6.dex */
public final class fa40 {
    public final String a;
    public final String b;
    public final TransportRouteAnalytics$VehicleType c;
    public final String d;
    public final TransportRouteAnalytics$TripType e;
    public final int f;
    public final Integer g;
    public final String h;
    public final String i;
    public final Boolean j;
    public final TransportRouteAnalytics$InitiatedPaymentMethod k;
    public final String l;
    public final String m;
    public final String n;

    public fa40(String str, String str2, TransportRouteAnalytics$VehicleType transportRouteAnalytics$VehicleType, String str3, TransportRouteAnalytics$TripType transportRouteAnalytics$TripType, int i, Integer num, String str4, String str5, Boolean bool, TransportRouteAnalytics$InitiatedPaymentMethod transportRouteAnalytics$InitiatedPaymentMethod, String str6, String str7, String str8) {
        this.a = str;
        this.b = str2;
        this.c = transportRouteAnalytics$VehicleType;
        this.d = str3;
        this.e = transportRouteAnalytics$TripType;
        this.f = i;
        this.g = num;
        this.h = str4;
        this.i = str5;
        this.j = bool;
        this.k = transportRouteAnalytics$InitiatedPaymentMethod;
        this.l = str6;
        this.m = str7;
        this.n = str8;
    }

    public static fa40 a(fa40 fa40Var, String str, String str2, TransportRouteAnalytics$VehicleType transportRouteAnalytics$VehicleType, String str3, TransportRouteAnalytics$TripType transportRouteAnalytics$TripType, int i, Integer num, String str4, String str5, Boolean bool, TransportRouteAnalytics$InitiatedPaymentMethod transportRouteAnalytics$InitiatedPaymentMethod, String str6, String str7, String str8, int i2) {
        String str9 = (i2 & 1) != 0 ? fa40Var.a : str;
        String str10 = (i2 & 2) != 0 ? fa40Var.b : str2;
        TransportRouteAnalytics$VehicleType transportRouteAnalytics$VehicleType2 = (i2 & 4) != 0 ? fa40Var.c : transportRouteAnalytics$VehicleType;
        String str11 = (i2 & 8) != 0 ? fa40Var.d : str3;
        TransportRouteAnalytics$TripType transportRouteAnalytics$TripType2 = (i2 & 16) != 0 ? fa40Var.e : transportRouteAnalytics$TripType;
        int i3 = (i2 & 32) != 0 ? fa40Var.f : i;
        Integer num2 = (i2 & 64) != 0 ? fa40Var.g : num;
        String str12 = (i2 & 128) != 0 ? fa40Var.h : str4;
        String str13 = (i2 & 256) != 0 ? fa40Var.i : str5;
        Boolean bool2 = (i2 & 512) != 0 ? fa40Var.j : bool;
        TransportRouteAnalytics$InitiatedPaymentMethod transportRouteAnalytics$InitiatedPaymentMethod2 = (i2 & 1024) != 0 ? fa40Var.k : transportRouteAnalytics$InitiatedPaymentMethod;
        String str14 = (i2 & 2048) != 0 ? fa40Var.l : str6;
        String str15 = (i2 & 4096) != 0 ? fa40Var.m : str7;
        String str16 = (i2 & 8192) != 0 ? fa40Var.n : str8;
        fa40Var.getClass();
        return new fa40(str9, str10, transportRouteAnalytics$VehicleType2, str11, transportRouteAnalytics$TripType2, i3, num2, str12, str13, bool2, transportRouteAnalytics$InitiatedPaymentMethod2, str14, str15, str16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fa40)) {
            return false;
        }
        fa40 fa40Var = (fa40) obj;
        return jl40.l(this.a, fa40Var.a) && jl40.l(this.b, fa40Var.b) && this.c == fa40Var.c && jl40.l(this.d, fa40Var.d) && this.e == fa40Var.e && this.f == fa40Var.f && jl40.l(this.g, fa40Var.g) && jl40.l(this.h, fa40Var.h) && jl40.l(this.i, fa40Var.i) && jl40.l(this.j, fa40Var.j) && this.k == fa40Var.k && jl40.l(this.l, fa40Var.l) && jl40.l(this.m, fa40Var.m) && jl40.l(this.n, fa40Var.n);
    }

    public final int hashCode() {
        int b = oyr.b(this.f, (this.e.hashCode() + unr0.b((this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d)) * 31, 31);
        Integer num = this.g;
        int b2 = unr0.b(unr0.b((b + (num == null ? 0 : num.hashCode())) * 31, 31, this.h), 31, this.i);
        Boolean bool = this.j;
        int hashCode = (b2 + (bool == null ? 0 : bool.hashCode())) * 31;
        TransportRouteAnalytics$InitiatedPaymentMethod transportRouteAnalytics$InitiatedPaymentMethod = this.k;
        int hashCode2 = (hashCode + (transportRouteAnalytics$InitiatedPaymentMethod == null ? 0 : transportRouteAnalytics$InitiatedPaymentMethod.hashCode())) * 31;
        String str = this.l;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.m;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.n;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("MtTrainCheckoutAnalyticModel(price=", this.a, ", selectedDate=", this.b, ", vehicleType=");
        v.append(this.c);
        v.append(", tariffId=");
        v.append(this.d);
        v.append(", tripType=");
        v.append(this.e);
        v.append(", adultTicketCount=");
        v.append(this.f);
        v.append(", childrenTicketCount=");
        tse0.w(this.g, ", startingStopId=", this.h, ", destinationStopId=", v);
        tse0.A(v, this.i, ", paymentMethodAvailable=", this.j, ", paymentMethod=");
        v.append(this.k);
        v.append(", tariffType=");
        v.append(this.l);
        v.append(", checkoutInfoRequestId=");
        return g8e.r(v, this.m, ", checkoutRequestId=", this.n, Extension.C_BRAKE);
    }
}
