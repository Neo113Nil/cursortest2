package com.yandex.go.taxi.order.models.api.response.tips;

import com.yandex.go.taxi.order.models.api.feedback.TaxiOrderSelectedTipsChoiceState;
import defpackage.apk0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/models/api/response/tips/RideCardTipsChoiceDto$ZeroTipsChoiceDto", "Lcom/yandex/go/taxi/order/models/api/response/tips/e;", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/tips/d", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RideCardTipsChoiceDto$ZeroTipsChoiceDto extends e {
    public static final d Companion = new d();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new apk0(1)), null};
    public final TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType a;
    public final String b;

    public RideCardTipsChoiceDto$ZeroTipsChoiceDto(int i, TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType taxiOrderTipsValueType, String str) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = taxiOrderTipsValueType;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideCardTipsChoiceDto$ZeroTipsChoiceDto)) {
            return false;
        }
        RideCardTipsChoiceDto$ZeroTipsChoiceDto rideCardTipsChoiceDto$ZeroTipsChoiceDto = (RideCardTipsChoiceDto$ZeroTipsChoiceDto) obj;
        return this.a == rideCardTipsChoiceDto$ZeroTipsChoiceDto.a && jl40.l(this.b, rideCardTipsChoiceDto$ZeroTipsChoiceDto.b);
    }

    public final int hashCode() {
        TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType taxiOrderTipsValueType = this.a;
        int hashCode = (taxiOrderTipsValueType == null ? 0 : taxiOrderTipsValueType.hashCode()) * 31;
        String str = this.b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "ZeroTipsChoiceDto(tipsType=" + this.a + ", text=" + this.b + Extension.C_BRAKE;
    }

    public RideCardTipsChoiceDto$ZeroTipsChoiceDto() {
        this.a = null;
        this.b = null;
    }
}
