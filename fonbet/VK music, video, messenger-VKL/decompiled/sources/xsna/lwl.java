package xsna;

import android.graphics.Bitmap;
import com.vk.ecomm.cart.impl.common.models.DeliveryPointId;
import com.vk.ecomm.cart.impl.common.models.geo.Coordinates;

/* compiled from: DeliveryPointsMapViewState.kt */
/* loaded from: classes18.dex */
public final class lwl implements twf {
    public final String a;
    public final Coordinates b;
    public final DeliveryPointId c;
    public final Bitmap d;

    public lwl(String str, Coordinates coordinates, DeliveryPointId deliveryPointId, Bitmap bitmap) {
        this.a = str;
        this.b = coordinates;
        this.c = deliveryPointId;
        this.d = bitmap;
    }

    @Override // xsna.twf
    public final String a() {
        return null;
    }

    @Override // xsna.twf
    public final String b() {
        return this.a;
    }

    @Override // xsna.twf
    public final edr0 c() {
        Coordinates coordinates = this.b;
        return new edr0(coordinates.b, coordinates.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lwl)) {
            return false;
        }
        lwl lwlVar = (lwl) obj;
        return this.a.equals(lwlVar.a) && this.b.equals(lwlVar.b) && this.c.equals(lwlVar.c) && epx.f(this.d, lwlVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + qoy.b((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeliveryPointMarker(pointTitle=");
        sb.append(this.a);
        sb.append(", coordinates=");
        sb.append(this.b);
        sb.append(", pointId=");
        sb.append(this.c);
        sb.append(", isSelected=false, bitmap=");
        return qr.c(sb, this.d, ')');
    }
}
