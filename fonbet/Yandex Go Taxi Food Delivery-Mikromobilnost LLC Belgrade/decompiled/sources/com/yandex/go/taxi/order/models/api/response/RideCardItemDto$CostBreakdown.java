package com.yandex.go.taxi.order.models.api.response;

import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/models/api/response/RideCardItemDto$CostBreakdown", "Lcom/yandex/go/taxi/order/models/api/response/a7;", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/v4", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RideCardItemDto$CostBreakdown extends a7 {
    public static final v4 Companion = new v4();
    public final String a;
    public final String b;
    public final OrderStatusInfo.CostMessageDetails c;

    public RideCardItemDto$CostBreakdown(int i, String str, String str2, OrderStatusInfo.CostMessageDetails costMessageDetails) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = costMessageDetails;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideCardItemDto$CostBreakdown)) {
            return false;
        }
        RideCardItemDto$CostBreakdown rideCardItemDto$CostBreakdown = (RideCardItemDto$CostBreakdown) obj;
        return jl40.l(this.a, rideCardItemDto$CostBreakdown.a) && jl40.l(this.b, rideCardItemDto$CostBreakdown.b) && jl40.l(this.c, rideCardItemDto$CostBreakdown.c);
    }

    @Override // com.yandex.go.taxi.order.models.api.response.a7
    /* renamed from: getId, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        OrderStatusInfo.CostMessageDetails costMessageDetails = this.c;
        return hashCode2 + (costMessageDetails != null ? costMessageDetails.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("CostBreakdown(id=", this.a, ", analyticsId=", this.b, ", costMessageDetails=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public RideCardItemDto$CostBreakdown() {
        this.a = "";
        this.b = null;
        this.c = null;
    }
}
