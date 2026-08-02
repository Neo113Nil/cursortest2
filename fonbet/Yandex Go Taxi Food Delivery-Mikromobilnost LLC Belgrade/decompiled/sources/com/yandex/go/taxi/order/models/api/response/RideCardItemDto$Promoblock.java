package com.yandex.go.taxi.order.models.api.response;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.communications.model.CommunicationItem;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/models/api/response/RideCardItemDto$Promoblock", "Lcom/yandex/go/taxi/order/models/api/response/a7;", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/k5", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RideCardItemDto$Promoblock extends a7 {
    public static final k5 Companion = new k5();
    public final String a;
    public final String b;
    public final CommunicationItem c;

    public RideCardItemDto$Promoblock(int i, String str, String str2, CommunicationItem communicationItem) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = communicationItem;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideCardItemDto$Promoblock)) {
            return false;
        }
        RideCardItemDto$Promoblock rideCardItemDto$Promoblock = (RideCardItemDto$Promoblock) obj;
        return jl40.l(this.a, rideCardItemDto$Promoblock.a) && jl40.l(this.b, rideCardItemDto$Promoblock.b) && jl40.l(this.c, rideCardItemDto$Promoblock.c);
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
        CommunicationItem communicationItem = this.c;
        return hashCode2 + (communicationItem != null ? communicationItem.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("Promoblock(id=", this.a, ", analyticsId=", this.b, ", promotion=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public RideCardItemDto$Promoblock() {
        this.a = "";
        this.b = null;
        this.c = null;
    }
}
