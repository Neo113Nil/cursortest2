package com.yandex.go.taxi.order.models.api.response;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.n121;
import defpackage.ug2;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/models/api/response/RideCardItemDto$TipsWishSelector$Content$ContentAnimation", "Lcom/yandex/go/taxi/order/models/api/response/w6;", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/t6", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RideCardItemDto$TipsWishSelector$Content$ContentAnimation extends w6 {
    public static final t6 Companion = new t6();
    public final ug2 a;

    public RideCardItemDto$TipsWishSelector$Content$ContentAnimation(int i, ug2 ug2Var) {
        if ((i & 1) == 0) {
            this.a = n121.INSTANCE;
        } else {
            this.a = ug2Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RideCardItemDto$TipsWishSelector$Content$ContentAnimation) && jl40.l(this.a, ((RideCardItemDto$TipsWishSelector$Content$ContentAnimation) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ContentAnimation(animation=" + this.a + Extension.C_BRAKE;
    }

    public RideCardItemDto$TipsWishSelector$Content$ContentAnimation() {
        this.a = n121.INSTANCE;
    }
}
