package com.yandex.go.payments.payment;

import defpackage.jl40;
import defpackage.k4o;
import defpackage.oyr;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class PaymentInfo$PaymentInfoTitle {
    public final String a;
    public final PaymentTitleState b;
    public final String c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/payments/payment/PaymentInfo$PaymentInfoTitle$PaymentTitleState;", "", "NORMAL", "ERROR", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class PaymentTitleState {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ PaymentTitleState[] $VALUES;
        public static final PaymentTitleState ERROR;
        public static final PaymentTitleState NORMAL;

        static {
            PaymentTitleState paymentTitleState = new PaymentTitleState("NORMAL", 0);
            NORMAL = paymentTitleState;
            PaymentTitleState paymentTitleState2 = new PaymentTitleState("ERROR", 1);
            ERROR = paymentTitleState2;
            PaymentTitleState[] paymentTitleStateArr = {paymentTitleState, paymentTitleState2};
            $VALUES = paymentTitleStateArr;
            $ENTRIES = a.a(paymentTitleStateArr);
        }

        public static PaymentTitleState valueOf(String str) {
            return (PaymentTitleState) Enum.valueOf(PaymentTitleState.class, str);
        }

        public static PaymentTitleState[] values() {
            return (PaymentTitleState[]) $VALUES.clone();
        }
    }

    public /* synthetic */ PaymentInfo$PaymentInfoTitle(String str, int i) {
        this((i & 1) != 0 ? null : str, PaymentTitleState.NORMAL, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentInfo$PaymentInfoTitle)) {
            return false;
        }
        PaymentInfo$PaymentInfoTitle paymentInfo$PaymentInfoTitle = (PaymentInfo$PaymentInfoTitle) obj;
        return jl40.l(this.a, paymentInfo$PaymentInfoTitle.a) && this.b == paymentInfo$PaymentInfoTitle.b && jl40.l(this.c, paymentInfo$PaymentInfoTitle.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        String str2 = this.c;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentInfoTitle(displayedTitle=");
        sb.append(this.a);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", accessibilityForErrorState=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }

    public PaymentInfo$PaymentInfoTitle(String str, PaymentTitleState paymentTitleState, String str2) {
        this.a = str;
        this.b = paymentTitleState;
        this.c = str2;
    }

    public PaymentInfo$PaymentInfoTitle() {
        this(null, 7);
    }
}
