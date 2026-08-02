package com.yandex.go.taxi.order.models.api.response;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/models/api/response/RideCardItemDto$PickupCode", "Lcom/yandex/go/taxi/order/models/api/response/a7;", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/g5", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RideCardItemDto$PickupCode extends a7 {
    public static final g5 Companion = new g5();
    public final String a;
    public final String b;
    public final com.yandex.go.slot.dto.b2 c;
    public final String d;
    public final FormattedText e;
    public final FormattedText f;

    public RideCardItemDto$PickupCode(int i, String str, String str2, com.yandex.go.slot.dto.b2 b2Var, String str3, FormattedText formattedText, FormattedText formattedText2) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = com.yandex.go.slot.dto.y0.INSTANCE;
        } else {
            this.c = b2Var;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = FormattedText.c;
        } else {
            this.e = formattedText;
        }
        if ((i & 32) == 0) {
            this.f = FormattedText.c;
        } else {
            this.f = formattedText2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideCardItemDto$PickupCode)) {
            return false;
        }
        RideCardItemDto$PickupCode rideCardItemDto$PickupCode = (RideCardItemDto$PickupCode) obj;
        return jl40.l(this.a, rideCardItemDto$PickupCode.a) && jl40.l(this.b, rideCardItemDto$PickupCode.b) && jl40.l(this.c, rideCardItemDto$PickupCode.c) && jl40.l(this.d, rideCardItemDto$PickupCode.d) && jl40.l(this.e, rideCardItemDto$PickupCode.e) && jl40.l(this.f, rideCardItemDto$PickupCode.f);
    }

    @Override // com.yandex.go.taxi.order.models.api.response.a7
    /* renamed from: getId, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.f.a.hashCode() + unr0.c(unr0.b((this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.d), 31, this.e.a);
    }

    public final String toString() {
        StringBuilder v = b64.v("PickupCode(id=", this.a, ", analyticsId=", this.b, ", action=");
        v.append(this.c);
        v.append(", accessibility=");
        v.append(this.d);
        v.append(", text=");
        v.append(this.e);
        v.append(", code=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public RideCardItemDto$PickupCode() {
        com.yandex.go.slot.dto.y0 y0Var = com.yandex.go.slot.dto.y0.INSTANCE;
        FormattedText formattedText = FormattedText.c;
        this.a = "";
        this.b = null;
        this.c = y0Var;
        this.d = "";
        this.e = formattedText;
        this.f = formattedText;
    }
}
