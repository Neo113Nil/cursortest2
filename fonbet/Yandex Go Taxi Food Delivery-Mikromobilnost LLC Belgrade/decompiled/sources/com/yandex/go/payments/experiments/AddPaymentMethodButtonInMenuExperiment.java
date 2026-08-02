package com.yandex.go.payments.experiments;

import defpackage.ar;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.w96;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/payments/experiments/AddPaymentMethodButtonInMenuExperiment;", "Lw96;", "Companion", "PaymentMethodType", "com/yandex/go/payments/experiments/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class AddPaymentMethodButtonInMenuExperiment extends w96 {
    public static final a Companion = new a();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ar(19))};
    public static final AddPaymentMethodButtonInMenuExperiment e = new AddPaymentMethodButtonInMenuExperiment(0);
    public final boolean b;
    public final PaymentMethodType c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/payments/experiments/AddPaymentMethodButtonInMenuExperiment$PaymentMethodType;", "", "Companion", "com/yandex/go/payments/experiments/b", "CARD", "SBP_TOKEN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class PaymentMethodType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ PaymentMethodType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final PaymentMethodType CARD;
        public static final b Companion;
        public static final PaymentMethodType SBP_TOKEN;

        static {
            PaymentMethodType paymentMethodType = new PaymentMethodType("CARD", 0);
            CARD = paymentMethodType;
            PaymentMethodType paymentMethodType2 = new PaymentMethodType("SBP_TOKEN", 1);
            SBP_TOKEN = paymentMethodType2;
            PaymentMethodType[] paymentMethodTypeArr = {paymentMethodType, paymentMethodType2};
            $VALUES = paymentMethodTypeArr;
            $ENTRIES = kotlin.enums.a.a(paymentMethodTypeArr);
            Companion = new b();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ar(20));
        }

        public static PaymentMethodType valueOf(String str) {
            return (PaymentMethodType) Enum.valueOf(PaymentMethodType.class, str);
        }

        public static PaymentMethodType[] values() {
            return (PaymentMethodType[]) $VALUES.clone();
        }
    }

    public /* synthetic */ AddPaymentMethodButtonInMenuExperiment(int i, boolean z, PaymentMethodType paymentMethodType) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = PaymentMethodType.CARD;
        } else {
            this.c = paymentMethodType;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddPaymentMethodButtonInMenuExperiment)) {
            return false;
        }
        AddPaymentMethodButtonInMenuExperiment addPaymentMethodButtonInMenuExperiment = (AddPaymentMethodButtonInMenuExperiment) obj;
        return this.b == addPaymentMethodButtonInMenuExperiment.b && this.c == addPaymentMethodButtonInMenuExperiment.c;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + (Boolean.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "AddPaymentMethodButtonInMenuExperiment(enabled=" + this.b + ", paymentMethodType=" + this.c + Extension.C_BRAKE;
    }

    public AddPaymentMethodButtonInMenuExperiment() {
        this(0);
    }

    public AddPaymentMethodButtonInMenuExperiment(int i) {
        PaymentMethodType paymentMethodType = PaymentMethodType.CARD;
        this.b = false;
        this.c = paymentMethodType;
    }
}
