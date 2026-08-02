package com.yandex.go.taxi.order.models.api.response;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.n7v;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/models/api/response/RideCardItemDto$TipsWishSelector$Content$ContentImage", "Lcom/yandex/go/taxi/order/models/api/response/w6;", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/u6", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RideCardItemDto$TipsWishSelector$Content$ContentImage extends w6 {
    public static final u6 Companion = new u6();
    public final n7v a;

    public RideCardItemDto$TipsWishSelector$Content$ContentImage(int i, n7v n7vVar) {
        if ((i & 1) == 0) {
            this.a = n7v.f;
        } else {
            this.a = n7vVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RideCardItemDto$TipsWishSelector$Content$ContentImage) && jl40.l(this.a, ((RideCardItemDto$TipsWishSelector$Content$ContentImage) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ContentImage(image=" + this.a + Extension.C_BRAKE;
    }

    public RideCardItemDto$TipsWishSelector$Content$ContentImage() {
        this.a = n7v.f;
    }
}
