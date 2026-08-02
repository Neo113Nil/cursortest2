package com.yandex.go.payments.paymentlist.experiments;

import defpackage.f9a0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.w96;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/payments/paymentlist/experiments/PaymentMethodsAddButtonExperiment;", "Lw96;", "Companion", "PaymentMethodsAddButtonPosition", "com/yandex/go/payments/paymentlist/experiments/p", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PaymentMethodsAddButtonExperiment extends w96 {
    public static final p Companion = new p();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new f9a0(0))};
    public static final PaymentMethodsAddButtonExperiment e = new PaymentMethodsAddButtonExperiment(0);
    public final boolean b;
    public final PaymentMethodsAddButtonPosition c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/payments/paymentlist/experiments/PaymentMethodsAddButtonExperiment$PaymentMethodsAddButtonPosition;", "", "Companion", "com/yandex/go/payments/paymentlist/experiments/q", "LIST", "FOOTER", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class PaymentMethodsAddButtonPosition {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ PaymentMethodsAddButtonPosition[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final q Companion;
        public static final PaymentMethodsAddButtonPosition FOOTER;
        public static final PaymentMethodsAddButtonPosition LIST;

        static {
            PaymentMethodsAddButtonPosition paymentMethodsAddButtonPosition = new PaymentMethodsAddButtonPosition("LIST", 0);
            LIST = paymentMethodsAddButtonPosition;
            PaymentMethodsAddButtonPosition paymentMethodsAddButtonPosition2 = new PaymentMethodsAddButtonPosition("FOOTER", 1);
            FOOTER = paymentMethodsAddButtonPosition2;
            PaymentMethodsAddButtonPosition[] paymentMethodsAddButtonPositionArr = {paymentMethodsAddButtonPosition, paymentMethodsAddButtonPosition2};
            $VALUES = paymentMethodsAddButtonPositionArr;
            $ENTRIES = kotlin.enums.a.a(paymentMethodsAddButtonPositionArr);
            Companion = new q();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new f9a0(1));
        }

        public static PaymentMethodsAddButtonPosition valueOf(String str) {
            return (PaymentMethodsAddButtonPosition) Enum.valueOf(PaymentMethodsAddButtonPosition.class, str);
        }

        public static PaymentMethodsAddButtonPosition[] values() {
            return (PaymentMethodsAddButtonPosition[]) $VALUES.clone();
        }
    }

    public /* synthetic */ PaymentMethodsAddButtonExperiment(int i, boolean z, PaymentMethodsAddButtonPosition paymentMethodsAddButtonPosition) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = PaymentMethodsAddButtonPosition.LIST;
        } else {
            this.c = paymentMethodsAddButtonPosition;
        }
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public PaymentMethodsAddButtonExperiment() {
        this(0);
    }

    public PaymentMethodsAddButtonExperiment(int i) {
        PaymentMethodsAddButtonPosition paymentMethodsAddButtonPosition = PaymentMethodsAddButtonPosition.LIST;
        this.b = false;
        this.c = paymentMethodsAddButtonPosition;
    }
}
