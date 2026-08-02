package com.yandex.go.taxi.order.change.price.data.dto;

import com.yandex.go.taxi.order.models.api.response.OrderChangesDto;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.ly1;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/change/price/data/dto/ApplyAdditionalPaymentResponse;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/change/price/data/dto/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ApplyAdditionalPaymentResponse {
    public static final b Companion = new b();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ly1(28))};
    public final String a;
    public final OrderChangesDto.Status b;

    public /* synthetic */ ApplyAdditionalPaymentResponse(int i, String str, OrderChangesDto.Status status) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = OrderChangesDto.Status.UNAVAILABLE;
        } else {
            this.b = status;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplyAdditionalPaymentResponse)) {
            return false;
        }
        ApplyAdditionalPaymentResponse applyAdditionalPaymentResponse = (ApplyAdditionalPaymentResponse) obj;
        return jl40.l(this.a, applyAdditionalPaymentResponse.a) && this.b == applyAdditionalPaymentResponse.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ApplyAdditionalPaymentResponse(changeId=" + this.a + ", status=" + this.b + Extension.C_BRAKE;
    }

    public ApplyAdditionalPaymentResponse() {
        OrderChangesDto.Status status = OrderChangesDto.Status.UNAVAILABLE;
        this.a = "";
        this.b = status;
    }
}
