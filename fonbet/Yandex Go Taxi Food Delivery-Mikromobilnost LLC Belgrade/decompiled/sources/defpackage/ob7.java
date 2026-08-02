package defpackage;

import com.yandex.go.taxi.order.map.overlay.traffic.TrafficLightWithSignal$Signal;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ob7 {
    public final TrafficLightWithSignal$Signal a;
    public final Integer b;
    public final Integer c;

    public ob7(TrafficLightWithSignal$Signal trafficLightWithSignal$Signal, Integer num, Integer num2, int i) {
        trafficLightWithSignal$Signal = (i & 1) != 0 ? TrafficLightWithSignal$Signal.UNKNOWN : trafficLightWithSignal$Signal;
        num = (i & 2) != 0 ? null : num;
        num2 = (i & 4) != 0 ? null : num2;
        this.a = trafficLightWithSignal$Signal;
        this.b = num;
        this.c = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ob7)) {
            return false;
        }
        ob7 ob7Var = (ob7) obj;
        return this.a == ob7Var.a && jl40.l(this.b, ob7Var.b) && jl40.l(this.c, ob7Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CacheKey(signal=");
        sb.append(this.a);
        sb.append(", countDown=");
        sb.append(this.b);
        sb.append(", resourceId=");
        return oo31.j(sb, this.c, Extension.C_BRAKE);
    }

    public ob7() {
        this(null, null, null, 7);
    }
}
