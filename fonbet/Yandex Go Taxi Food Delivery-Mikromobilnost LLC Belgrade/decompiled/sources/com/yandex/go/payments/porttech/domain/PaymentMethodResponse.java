package com.yandex.go.payments.porttech.domain;

import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/porttech/domain/PaymentMethodResponse;", "", "Companion", "$serializer", "com/yandex/go/payments/porttech/domain/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PaymentMethodResponse {
    public static final a Companion = new a();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ PaymentMethodResponse(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, PaymentMethodResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentMethodResponse)) {
            return false;
        }
        PaymentMethodResponse paymentMethodResponse = (PaymentMethodResponse) obj;
        return jl40.l(this.a, paymentMethodResponse.a) && jl40.l(this.b, paymentMethodResponse.b) && jl40.l(this.c, paymentMethodResponse.c) && jl40.l(this.d, paymentMethodResponse.d);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.d.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return g8e.r(b64.v("PaymentMethodResponse(id=", this.a, ", type=", this.b, ", imageBase64="), this.c, ", title=", this.d, Extension.C_BRAKE);
    }

    public PaymentMethodResponse(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }
}
