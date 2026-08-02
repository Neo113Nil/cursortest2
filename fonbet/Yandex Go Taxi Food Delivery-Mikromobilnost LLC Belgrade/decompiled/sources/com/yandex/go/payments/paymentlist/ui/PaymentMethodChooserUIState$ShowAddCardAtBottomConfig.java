package com.yandex.go.payments.paymentlist.ui;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/payments/paymentlist/ui/PaymentMethodChooserUIState$ShowAddCardAtBottomConfig", "", "Lcom/yandex/go/payments/paymentlist/ui/PaymentMethodChooserUIState$ShowAddCardAtBottomConfig;", "GONE", "VISIBLE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PaymentMethodChooserUIState$ShowAddCardAtBottomConfig {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PaymentMethodChooserUIState$ShowAddCardAtBottomConfig[] $VALUES;
    public static final PaymentMethodChooserUIState$ShowAddCardAtBottomConfig GONE;
    public static final PaymentMethodChooserUIState$ShowAddCardAtBottomConfig VISIBLE;

    static {
        PaymentMethodChooserUIState$ShowAddCardAtBottomConfig paymentMethodChooserUIState$ShowAddCardAtBottomConfig = new PaymentMethodChooserUIState$ShowAddCardAtBottomConfig("GONE", 0);
        GONE = paymentMethodChooserUIState$ShowAddCardAtBottomConfig;
        PaymentMethodChooserUIState$ShowAddCardAtBottomConfig paymentMethodChooserUIState$ShowAddCardAtBottomConfig2 = new PaymentMethodChooserUIState$ShowAddCardAtBottomConfig("VISIBLE", 1);
        VISIBLE = paymentMethodChooserUIState$ShowAddCardAtBottomConfig2;
        PaymentMethodChooserUIState$ShowAddCardAtBottomConfig[] paymentMethodChooserUIState$ShowAddCardAtBottomConfigArr = {paymentMethodChooserUIState$ShowAddCardAtBottomConfig, paymentMethodChooserUIState$ShowAddCardAtBottomConfig2};
        $VALUES = paymentMethodChooserUIState$ShowAddCardAtBottomConfigArr;
        $ENTRIES = kotlin.enums.a.a(paymentMethodChooserUIState$ShowAddCardAtBottomConfigArr);
    }

    public static PaymentMethodChooserUIState$ShowAddCardAtBottomConfig valueOf(String str) {
        return (PaymentMethodChooserUIState$ShowAddCardAtBottomConfig) Enum.valueOf(PaymentMethodChooserUIState$ShowAddCardAtBottomConfig.class, str);
    }

    public static PaymentMethodChooserUIState$ShowAddCardAtBottomConfig[] values() {
        return (PaymentMethodChooserUIState$ShowAddCardAtBottomConfig[]) $VALUES.clone();
    }
}
