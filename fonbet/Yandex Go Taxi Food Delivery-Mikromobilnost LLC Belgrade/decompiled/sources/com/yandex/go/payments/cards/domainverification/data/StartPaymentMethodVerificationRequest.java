package com.yandex.go.payments.cards.domainverification.data;

import defpackage.g8e;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/cards/domainverification/data/StartPaymentMethodVerificationRequest;", "", "Companion", "$serializer", "com/yandex/go/payments/cards/domainverification/data/j", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class StartPaymentMethodVerificationRequest {
    public static final j Companion = new j();
    public final String a;
    public final BoundPaymentMethodRequest b;
    public final String c;
    public final String d;
    public final PaymentMethodVerificationAntifraudPayload e;

    public /* synthetic */ StartPaymentMethodVerificationRequest(int i, String str, BoundPaymentMethodRequest boundPaymentMethodRequest, String str2, String str3, PaymentMethodVerificationAntifraudPayload paymentMethodVerificationAntifraudPayload) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = new BoundPaymentMethodRequest(null, 3);
        } else {
            this.b = boundPaymentMethodRequest;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = paymentMethodVerificationAntifraudPayload;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StartPaymentMethodVerificationRequest)) {
            return false;
        }
        StartPaymentMethodVerificationRequest startPaymentMethodVerificationRequest = (StartPaymentMethodVerificationRequest) obj;
        return jl40.l(this.a, startPaymentMethodVerificationRequest.a) && jl40.l(this.b, startPaymentMethodVerificationRequest.b) && jl40.l(this.c, startPaymentMethodVerificationRequest.c) && jl40.l(this.d, startPaymentMethodVerificationRequest.d) && jl40.l(this.e, startPaymentMethodVerificationRequest.e);
    }

    public final int hashCode() {
        int b = unr0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        String str = this.d;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        PaymentMethodVerificationAntifraudPayload paymentMethodVerificationAntifraudPayload = this.e;
        return hashCode + (paymentMethodVerificationAntifraudPayload != null ? paymentMethodVerificationAntifraudPayload.a.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartPaymentMethodVerificationRequest(verificationIntentId=");
        sb.append(this.a);
        sb.append(", paymentMethod=");
        sb.append(this.b);
        sb.append(", currency=");
        g8e.D(sb, this.c, ", countryCode=", this.d, ", antifraudPayload=");
        sb.append(this.e);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public StartPaymentMethodVerificationRequest(String str, BoundPaymentMethodRequest boundPaymentMethodRequest, String str2, String str3, PaymentMethodVerificationAntifraudPayload paymentMethodVerificationAntifraudPayload) {
        this.a = str;
        this.b = boundPaymentMethodRequest;
        this.c = str2;
        this.d = str3;
        this.e = paymentMethodVerificationAntifraudPayload;
    }

    public StartPaymentMethodVerificationRequest() {
        this("", new BoundPaymentMethodRequest(null, 3), "", null, null);
    }
}
