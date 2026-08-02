package xsna;

import com.vk.ecomm.cart.api.model.DeliveryPoint;
import com.vk.ecomm.cart.impl.common.models.DeliveryPointId;
import com.vk.ecomm.cart.impl.common.models.geo.Coordinates;
import java.util.List;
import java.util.Map;

/* compiled from: DeliveryPointsInfo.kt */
/* loaded from: classes18.dex */
public final class twl {
    public final int a;
    public final Map<DeliveryPointId, DeliveryPoint> b;
    public final Coordinates c;
    public final List<dcr> d;

    /* JADX WARN: Multi-variable type inference failed */
    public twl(int i, Map<DeliveryPointId, DeliveryPoint> map, Coordinates coordinates, List<? extends dcr> list) {
        this.a = i;
        this.b = map;
        this.c = coordinates;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof twl)) {
            return false;
        }
        twl twlVar = (twl) obj;
        return this.a == twlVar.a && epx.f(this.b, twlVar.b) && epx.f(this.c, twlVar.c) && epx.f(this.d, twlVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + v11.a(Integer.hashCode(this.a) * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeliveryPointsInfo(count=");
        sb.append(this.a);
        sb.append(", points=");
        sb.append(this.b);
        sb.append(", cityCoordinates=");
        sb.append(this.c);
        sb.append(", filters=");
        return ms9.a(')', sb, this.d);
    }
}
