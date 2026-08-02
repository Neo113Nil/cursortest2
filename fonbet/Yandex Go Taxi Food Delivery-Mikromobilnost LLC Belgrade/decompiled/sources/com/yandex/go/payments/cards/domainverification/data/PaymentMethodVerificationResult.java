package com.yandex.go.payments.cards.domainverification.data;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.t7a0;
import defpackage.unr0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/cards/domainverification/data/PaymentMethodVerificationResult;", "", "Companion", "$serializer", "com/yandex/go/payments/cards/domainverification/data/h", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PaymentMethodVerificationResult {
    public static final h Companion = new h();
    public static final i3y[] h = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new t7a0(1)), null, null, null, null};
    public final String a;
    public final String b;
    public final PaymentMethodVerificationStatus c;
    public final String d;
    public final Integer e;
    public final PaymentMethodVerificationError f;
    public final String g;

    public /* synthetic */ PaymentMethodVerificationResult(int i, String str, String str2, PaymentMethodVerificationStatus paymentMethodVerificationStatus, String str3, Integer num, PaymentMethodVerificationError paymentMethodVerificationError, String str4) {
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
            this.c = PaymentMethodVerificationStatus.UNKNOWN;
        } else {
            this.c = paymentMethodVerificationStatus;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = paymentMethodVerificationError;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentMethodVerificationResult)) {
            return false;
        }
        PaymentMethodVerificationResult paymentMethodVerificationResult = (PaymentMethodVerificationResult) obj;
        return jl40.l(this.a, paymentMethodVerificationResult.a) && jl40.l(this.b, paymentMethodVerificationResult.b) && this.c == paymentMethodVerificationResult.c && jl40.l(this.d, paymentMethodVerificationResult.d) && jl40.l(this.e, paymentMethodVerificationResult.e) && jl40.l(this.f, paymentMethodVerificationResult.f) && jl40.l(this.g, paymentMethodVerificationResult.g);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.e;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        PaymentMethodVerificationError paymentMethodVerificationError = this.f;
        int hashCode4 = (hashCode3 + (paymentMethodVerificationError == null ? 0 : paymentMethodVerificationError.hashCode())) * 31;
        String str2 = this.g;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("PaymentMethodVerificationResult(verificationId=", this.a, ", method=", this.b, ", status=");
        v.append(this.c);
        v.append(", challengeUrl=");
        v.append(this.d);
        v.append(", randomAmountTriesLeft=");
        v.append(this.e);
        v.append(", error=");
        v.append(this.f);
        v.append(", currency=");
        return oyr.t(v, this.g, Extension.C_BRAKE);
    }

    public PaymentMethodVerificationResult() {
        this(0);
    }

    public PaymentMethodVerificationResult(int i) {
        PaymentMethodVerificationStatus paymentMethodVerificationStatus = PaymentMethodVerificationStatus.UNKNOWN;
        this.a = "";
        this.b = "";
        this.c = paymentMethodVerificationStatus;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
    }
}
