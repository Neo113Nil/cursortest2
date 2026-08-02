package com.yandex.go.masstransit.sdk.core.dto;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/masstransit/sdk/core/dto/PaymentMethodDto;", "", "Companion", "$serializer", "com/yandex/go/masstransit/sdk/core/dto/b", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PaymentMethodDto {
    public static final b Companion = new b();
    public final String a;
    public final String b;

    public /* synthetic */ PaymentMethodDto(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
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
        if (!(obj instanceof PaymentMethodDto)) {
            return false;
        }
        PaymentMethodDto paymentMethodDto = (PaymentMethodDto) obj;
        return jl40.l(this.a, paymentMethodDto.a) && jl40.l(this.b, paymentMethodDto.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return unr0.p("PaymentMethodDto(type=", this.a, ", id=", this.b, Extension.C_BRAKE);
    }

    public PaymentMethodDto(int i) {
        this.a = null;
        this.b = null;
    }

    public PaymentMethodDto() {
        this(0);
    }
}
