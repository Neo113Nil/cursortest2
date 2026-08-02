package defpackage;

import com.yandex.go.logistics.cargo_flow.api.DeliveryCargoFlowPlacesNavigator$PointType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class hyh {
    public final double a;
    public final double b;
    public final String c;
    public final DeliveryCargoFlowPlacesNavigator$PointType d;
    public final Integer e;

    public hyh(double d, double d2, String str, DeliveryCargoFlowPlacesNavigator$PointType deliveryCargoFlowPlacesNavigator$PointType, Integer num) {
        this.a = d;
        this.b = d2;
        this.c = str;
        this.d = deliveryCargoFlowPlacesNavigator$PointType;
        this.e = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hyh)) {
            return false;
        }
        hyh hyhVar = (hyh) obj;
        return Double.compare(this.a, hyhVar.a) == 0 && Double.compare(this.b, hyhVar.b) == 0 && jl40.l(this.c, hyhVar.c) && this.d == hyhVar.d && jl40.l(this.e, hyhVar.e);
    }

    public final int hashCode() {
        int a = unr0.a(Double.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int hashCode = (this.d.hashCode() + ((a + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        Integer num = this.e;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder u = oyr.u(this.a, "PresetPoint(lat=", ", lon=");
        u.append(this.b);
        u.append(", uri=");
        u.append(this.c);
        u.append(", pointType=");
        u.append(this.d);
        u.append(", pointIndex=");
        u.append(this.e);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
