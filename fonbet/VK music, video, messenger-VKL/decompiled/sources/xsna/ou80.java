package xsna;

import com.vk.ecomm.cart.api.model.DeliveryPoint;

/* compiled from: Order.kt */
/* loaded from: classes18.dex */
public final class ou80 {
    public final String a;
    public final String b;
    public final DeliveryPoint c;
    public final String d;
    public final String e;

    public ou80(String str, String str2, DeliveryPoint deliveryPoint, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = deliveryPoint;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ou80)) {
            return false;
        }
        ou80 ou80Var = (ou80) obj;
        return epx.f(this.a, ou80Var.a) && epx.f(this.b, ou80Var.b) && epx.f(this.c, ou80Var.c) && epx.f(this.d, ou80Var.d) && epx.f(this.e, ou80Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        DeliveryPoint deliveryPoint = this.c;
        int hashCode3 = (hashCode2 + (deliveryPoint == null ? 0 : deliveryPoint.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrderDelivery(address=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", deliveryPoint=");
        sb.append(this.c);
        sb.append(", trackNumber=");
        sb.append(this.d);
        sb.append(", trackLink=");
        return ho8.a(sb, this.e, ')');
    }
}
