package com.yandex.go.taxi.order.models.api.preorder.delivery;

import defpackage.apk0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/preorder/delivery/RouteDeliveryInfo;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/preorder/delivery/b", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class RouteDeliveryInfo {
    public static final b Companion = new b();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new apk0(9))};
    public final AddressDeliveryInfo a;
    public final List b;

    public /* synthetic */ RouteDeliveryInfo(int i, AddressDeliveryInfo addressDeliveryInfo, List list) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = addressDeliveryInfo;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteDeliveryInfo)) {
            return false;
        }
        RouteDeliveryInfo routeDeliveryInfo = (RouteDeliveryInfo) obj;
        return jl40.l(this.a, routeDeliveryInfo.a) && jl40.l(this.b, routeDeliveryInfo.b);
    }

    public final int hashCode() {
        AddressDeliveryInfo addressDeliveryInfo = this.a;
        int hashCode = (addressDeliveryInfo == null ? 0 : addressDeliveryInfo.hashCode()) * 31;
        List list = this.b;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "RouteDeliveryInfo(sourcePointInfo=" + this.a + ", destinationPointsInfo=" + this.b + Extension.C_BRAKE;
    }

    public RouteDeliveryInfo(AddressDeliveryInfo addressDeliveryInfo, ArrayList arrayList) {
        this.a = addressDeliveryInfo;
        this.b = arrayList;
    }

    public RouteDeliveryInfo() {
        this(null, null);
    }
}
