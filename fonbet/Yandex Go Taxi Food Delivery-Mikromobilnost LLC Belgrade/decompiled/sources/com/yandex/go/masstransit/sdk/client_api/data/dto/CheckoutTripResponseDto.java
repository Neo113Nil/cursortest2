package com.yandex.go.masstransit.sdk.client_api.data.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.qje;
import defpackage.qlb;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/masstransit/sdk/client_api/data/dto/CheckoutTripResponseDto;", "", "Companion", "$serializer", "com/yandex/go/masstransit/sdk/client_api/data/dto/l", "client_api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CheckoutTripResponseDto {
    public static final l Companion = new l();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new qlb(13))};
    public final String a;
    public final CheckoutOrderStatusDto b;

    public /* synthetic */ CheckoutTripResponseDto(int i, CheckoutOrderStatusDto checkoutOrderStatusDto, String str) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, CheckoutTripResponseDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = checkoutOrderStatusDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutTripResponseDto)) {
            return false;
        }
        CheckoutTripResponseDto checkoutTripResponseDto = (CheckoutTripResponseDto) obj;
        return jl40.l(this.a, checkoutTripResponseDto.a) && this.b == checkoutTripResponseDto.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CheckoutTripResponseDto(orderId=" + this.a + ", checkoutStatus=" + this.b + Extension.C_BRAKE;
    }
}
