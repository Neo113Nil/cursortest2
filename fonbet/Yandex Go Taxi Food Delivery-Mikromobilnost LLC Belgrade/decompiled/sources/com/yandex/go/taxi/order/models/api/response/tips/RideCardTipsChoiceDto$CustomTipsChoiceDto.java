package com.yandex.go.taxi.order.models.api.response.tips;

import com.yandex.go.taxi.order.models.api.feedback.TaxiOrderSelectedTipsChoiceState;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.sjk0;
import defpackage.smw0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/models/api/response/tips/RideCardTipsChoiceDto$CustomTipsChoiceDto", "Lcom/yandex/go/taxi/order/models/api/response/tips/e;", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/tips/a", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RideCardTipsChoiceDto$CustomTipsChoiceDto extends e {
    public static final a Companion = new a();
    public static final i3y[] f = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new sjk0(28)), null, null, null, null};
    public final TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;

    public RideCardTipsChoiceDto$CustomTipsChoiceDto(int i, TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType taxiOrderTipsValueType, String str, int i2, String str2, String str3) {
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
        if ((i & 4) == 0) {
            this.c = 0;
        } else {
            this.c = i2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideCardTipsChoiceDto$CustomTipsChoiceDto)) {
            return false;
        }
        RideCardTipsChoiceDto$CustomTipsChoiceDto rideCardTipsChoiceDto$CustomTipsChoiceDto = (RideCardTipsChoiceDto$CustomTipsChoiceDto) obj;
        return this.a == rideCardTipsChoiceDto$CustomTipsChoiceDto.a && jl40.l(this.b, rideCardTipsChoiceDto$CustomTipsChoiceDto.b) && this.c == rideCardTipsChoiceDto$CustomTipsChoiceDto.c && jl40.l(this.d, rideCardTipsChoiceDto$CustomTipsChoiceDto.d) && jl40.l(this.e, rideCardTipsChoiceDto$CustomTipsChoiceDto.e);
    }

    public final int hashCode() {
        TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType taxiOrderTipsValueType = this.a;
        int hashCode = (taxiOrderTipsValueType == null ? 0 : taxiOrderTipsValueType.hashCode()) * 31;
        String str = this.b;
        int b = oyr.b(this.c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.d;
        int hashCode2 = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomTipsChoiceDto(tipsType=");
        sb.append(this.a);
        sb.append(", defaultText=");
        sb.append(this.b);
        sb.append(", decimalDigits=");
        smw0.t(this.c, ", minValue=", this.d, ", maxValue=", sb);
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }

    public RideCardTipsChoiceDto$CustomTipsChoiceDto() {
        this.a = null;
        this.b = null;
        this.c = 0;
        this.d = null;
        this.e = null;
    }
}
