package com.yandex.go.overdraft.data.model;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.x4e;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/overdraft/data/model/OrderPaymentMethodSettingsDto;", "", "Companion", "$serializer", "com/yandex/go/overdraft/data/model/v", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OrderPaymentMethodSettingsDto {
    public static final v Companion = new v();
    public final String a;
    public final String b;
    public final boolean c;

    public /* synthetic */ OrderPaymentMethodSettingsDto(String str, int i, String str2, boolean z) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getB() {
        return this.b;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getC() {
        return this.c;
    }

    /* renamed from: c, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderPaymentMethodSettingsDto)) {
            return false;
        }
        OrderPaymentMethodSettingsDto orderPaymentMethodSettingsDto = (OrderPaymentMethodSettingsDto) obj;
        return jl40.l(this.a, orderPaymentMethodSettingsDto.a) && jl40.l(this.b, orderPaymentMethodSettingsDto.b) && this.c == orderPaymentMethodSettingsDto.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return x4e.i(b64.v("OrderPaymentMethodSettingsDto(type=", this.a, ", paymentMethodId=", this.b, ", showModalWindow="), this.c, Extension.C_BRAKE);
    }

    public OrderPaymentMethodSettingsDto() {
        this.a = "";
        this.b = "";
        this.c = false;
    }
}
