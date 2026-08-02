package com.yandex.go.masstransit.sdk.client_api.data.dto;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/masstransit/sdk/client_api/data/dto/PaymentMethodsInfoDto;", "", "Companion", "$serializer", "com/yandex/go/masstransit/sdk/client_api/data/dto/s", "client_api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PaymentMethodsInfoDto {
    public static final s Companion = new s();
    public final String a;
    public final String b;

    public /* synthetic */ PaymentMethodsInfoDto(int i, String str, String str2) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, PaymentMethodsInfoDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentMethodsInfoDto)) {
            return false;
        }
        PaymentMethodsInfoDto paymentMethodsInfoDto = (PaymentMethodsInfoDto) obj;
        return jl40.l(this.a, paymentMethodsInfoDto.a) && jl40.l(this.b, paymentMethodsInfoDto.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return unr0.p("PaymentMethodsInfoDto(property=", this.a, ", title=", this.b, Extension.C_BRAKE);
    }
}
