package com.yandex.go.payments.cards.domainverification.data;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/cards/domainverification/data/PaymentMethodVerificationAntifraudPayload;", "", "Companion", "$serializer", "com/yandex/go/payments/cards/domainverification/data/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PaymentMethodVerificationAntifraudPayload {
    public static final b Companion = new b();
    public final String a;

    public /* synthetic */ PaymentMethodVerificationAntifraudPayload(int i, String str) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaymentMethodVerificationAntifraudPayload) && jl40.l(this.a, ((PaymentMethodVerificationAntifraudPayload) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("PaymentMethodVerificationAntifraudPayload(cardNumber=", this.a, Extension.C_BRAKE);
    }

    public PaymentMethodVerificationAntifraudPayload(String str) {
        this.a = str;
    }

    public PaymentMethodVerificationAntifraudPayload() {
        this("");
    }
}
