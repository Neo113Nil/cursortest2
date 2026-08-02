package defpackage;

import com.yandex.go.places.models.domain.entities.DeliveryRoutePointType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class agi {
    public final DeliveryRoutePointType a;
    public final String b;
    public final coe c;
    public final Integer d;

    public agi(DeliveryRoutePointType deliveryRoutePointType, String str, coe coeVar, Integer num) {
        this.a = deliveryRoutePointType;
        this.b = str;
        this.c = coeVar;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agi)) {
            return false;
        }
        agi agiVar = (agi) obj;
        return this.a == agiVar.a && jl40.l(this.b, agiVar.b) && this.c.equals(agiVar.c) && jl40.l(this.d, agiVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        Integer num = this.d;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "DeliveryOrderFormRoutePoint(pointType=" + this.a + ", uri=" + this.b + ", coordinates=" + this.c + ", pointIndex=" + this.d + Extension.C_BRAKE;
    }
}
