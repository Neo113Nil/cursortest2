package com.yandex.go.payments.paymentlist.domain.converter;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/payments/paymentlist/domain/converter/PaymentMethodsConverter$ConvertMode", "", "Lcom/yandex/go/payments/paymentlist/domain/converter/PaymentMethodsConverter$ConvertMode;", "NORMAL", "EDIT", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
final class PaymentMethodsConverter$ConvertMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PaymentMethodsConverter$ConvertMode[] $VALUES;
    public static final PaymentMethodsConverter$ConvertMode EDIT;
    public static final PaymentMethodsConverter$ConvertMode NORMAL;

    static {
        PaymentMethodsConverter$ConvertMode paymentMethodsConverter$ConvertMode = new PaymentMethodsConverter$ConvertMode("NORMAL", 0);
        NORMAL = paymentMethodsConverter$ConvertMode;
        PaymentMethodsConverter$ConvertMode paymentMethodsConverter$ConvertMode2 = new PaymentMethodsConverter$ConvertMode("EDIT", 1);
        EDIT = paymentMethodsConverter$ConvertMode2;
        PaymentMethodsConverter$ConvertMode[] paymentMethodsConverter$ConvertModeArr = {paymentMethodsConverter$ConvertMode, paymentMethodsConverter$ConvertMode2};
        $VALUES = paymentMethodsConverter$ConvertModeArr;
        $ENTRIES = kotlin.enums.a.a(paymentMethodsConverter$ConvertModeArr);
    }

    public static PaymentMethodsConverter$ConvertMode valueOf(String str) {
        return (PaymentMethodsConverter$ConvertMode) Enum.valueOf(PaymentMethodsConverter$ConvertMode.class, str);
    }

    public static PaymentMethodsConverter$ConvertMode[] values() {
        return (PaymentMethodsConverter$ConvertMode[]) $VALUES.clone();
    }
}
