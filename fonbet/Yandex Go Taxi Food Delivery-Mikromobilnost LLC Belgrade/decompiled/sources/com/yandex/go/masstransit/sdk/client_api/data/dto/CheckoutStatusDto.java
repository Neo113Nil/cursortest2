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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/masstransit/sdk/client_api/data/dto/CheckoutStatusDto;", "", "Companion", "$serializer", "com/yandex/go/masstransit/sdk/client_api/data/dto/k", "client_api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CheckoutStatusDto {
    public static final k Companion = new k();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new qlb(12)), null};
    public final CheckoutOrderStatusDto a;
    public final String b;

    public /* synthetic */ CheckoutStatusDto(int i, CheckoutOrderStatusDto checkoutOrderStatusDto, String str) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, CheckoutStatusDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = checkoutOrderStatusDto;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutStatusDto)) {
            return false;
        }
        CheckoutStatusDto checkoutStatusDto = (CheckoutStatusDto) obj;
        return this.a == checkoutStatusDto.a && jl40.l(this.b, checkoutStatusDto.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CheckoutStatusDto(checkoutStatus=" + this.a + ", orderId=" + this.b + Extension.C_BRAKE;
    }
}
