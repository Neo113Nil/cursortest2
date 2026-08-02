package defpackage;

import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.geopayment.analytics.TransportPaymentAnalytics$VehicleType;

/* loaded from: classes6.dex */
public final class c411 {
    public final String a;
    public final TransportPaymentAnalytics$VehicleType b;
    public final MapBuilder c;

    public c411(String str, TransportPaymentAnalytics$VehicleType transportPaymentAnalytics$VehicleType) {
        this.a = str;
        this.b = transportPaymentAnalytics$VehicleType;
        MapBuilder y = qv10.y("id", str);
        y.put("vehicle_type", transportPaymentAnalytics$VehicleType.getEventValue());
        this.c = y.j();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c411)) {
            return false;
        }
        c411 c411Var = (c411) obj;
        return jl40.l(this.a, c411Var.a) && this.b == c411Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "VehicleItem(id=" + this.a + ", vehicleType=" + this.b + Extension.C_BRAKE;
    }
}
