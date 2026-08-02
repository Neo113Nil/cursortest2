package com.yandex.go.payments.cards.domainverification.data;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/cards/domainverification/data/PaymentMethodVerificationResponse;", "", "Companion", "$serializer", "com/yandex/go/payments/cards/domainverification/data/g", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PaymentMethodVerificationResponse {
    public static final g Companion = new g();
    public final PaymentMethodVerificationResult a;
    public final String b;

    public /* synthetic */ PaymentMethodVerificationResponse(int i, PaymentMethodVerificationResult paymentMethodVerificationResult, String str) {
        this.a = (i & 1) == 0 ? new PaymentMethodVerificationResult(0) : paymentMethodVerificationResult;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentMethodVerificationResponse)) {
            return false;
        }
        PaymentMethodVerificationResponse paymentMethodVerificationResponse = (PaymentMethodVerificationResponse) obj;
        return jl40.l(this.a, paymentMethodVerificationResponse.a) && jl40.l(this.b, paymentMethodVerificationResponse.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PaymentMethodVerificationResponse(verification=" + this.a + ", paymentMethodId=" + this.b + Extension.C_BRAKE;
    }

    public PaymentMethodVerificationResponse() {
        this(0);
    }

    public PaymentMethodVerificationResponse(int i) {
        this.a = new PaymentMethodVerificationResult(0);
        this.b = "";
    }
}
