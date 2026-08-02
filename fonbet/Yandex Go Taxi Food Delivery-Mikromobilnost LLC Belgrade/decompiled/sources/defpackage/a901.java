package defpackage;

import com.yandex.go.taxi.order.map.overlay.traffic.TrafficLightWithSignal$Signal;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.PolylinePosition;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class a901 {
    public final TrafficLightWithSignal$Signal a;
    public final Point b;
    public final Integer c;
    public final PolylinePosition d;

    public a901(TrafficLightWithSignal$Signal trafficLightWithSignal$Signal, Point point, Integer num, PolylinePosition polylinePosition) {
        this.a = trafficLightWithSignal$Signal;
        this.b = point;
        this.c = num;
        this.d = polylinePosition;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a901)) {
            return false;
        }
        a901 a901Var = (a901) obj;
        return this.a == a901Var.a && jl40.l(this.b, a901Var.b) && jl40.l(this.c, a901Var.c) && jl40.l(this.d, a901Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Integer num = this.c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        PolylinePosition polylinePosition = this.d;
        return hashCode2 + (polylinePosition != null ? polylinePosition.hashCode() : 0);
    }

    public final String toString() {
        return "TrafficLightWithSignal(signal=" + this.a + ", point=" + this.b + ", countDown=" + this.c + ", position=" + this.d + Extension.C_BRAKE;
    }
}
