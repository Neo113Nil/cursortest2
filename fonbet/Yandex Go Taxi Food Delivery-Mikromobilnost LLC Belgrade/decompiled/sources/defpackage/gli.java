package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.delivery_state.DeliveryPushParams;

/* loaded from: classes12.dex */
public final class gli {
    public final String a;
    public final String b;
    public final DeliveryPushParams c;

    public gli(String str, String str2, DeliveryPushParams deliveryPushParams) {
        this.a = str;
        this.b = str2;
        this.c = deliveryPushParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gli)) {
            return false;
        }
        gli gliVar = (gli) obj;
        return jl40.l(this.a, gliVar.a) && jl40.l(this.b, gliVar.b) && jl40.l(this.c, gliVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        DeliveryPushParams deliveryPushParams = this.c;
        return hashCode2 + (deliveryPushParams != null ? deliveryPushParams.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("NotificationData(group=", this.a, ", deliveryId=", this.b, ", deliveryPushParams=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
