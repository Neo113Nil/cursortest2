package com.yandex.go.payments_widgets.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"com/yandex/go/payments_widgets/api/PaymentWidgetsSectionActionRepository$PaymentWidgetsSectionAction", "", "Lcom/yandex/go/payments_widgets/api/PaymentWidgetsSectionActionRepository$PaymentWidgetsSectionAction;", "SCROLL_TO_SECTION", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaymentWidgetsSectionActionRepository$PaymentWidgetsSectionAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PaymentWidgetsSectionActionRepository$PaymentWidgetsSectionAction[] $VALUES;
    public static final PaymentWidgetsSectionActionRepository$PaymentWidgetsSectionAction SCROLL_TO_SECTION;

    static {
        PaymentWidgetsSectionActionRepository$PaymentWidgetsSectionAction paymentWidgetsSectionActionRepository$PaymentWidgetsSectionAction = new PaymentWidgetsSectionActionRepository$PaymentWidgetsSectionAction("SCROLL_TO_SECTION", 0);
        SCROLL_TO_SECTION = paymentWidgetsSectionActionRepository$PaymentWidgetsSectionAction;
        PaymentWidgetsSectionActionRepository$PaymentWidgetsSectionAction[] paymentWidgetsSectionActionRepository$PaymentWidgetsSectionActionArr = {paymentWidgetsSectionActionRepository$PaymentWidgetsSectionAction};
        $VALUES = paymentWidgetsSectionActionRepository$PaymentWidgetsSectionActionArr;
        $ENTRIES = a.a(paymentWidgetsSectionActionRepository$PaymentWidgetsSectionActionArr);
    }

    public static PaymentWidgetsSectionActionRepository$PaymentWidgetsSectionAction valueOf(String str) {
        return (PaymentWidgetsSectionActionRepository$PaymentWidgetsSectionAction) Enum.valueOf(PaymentWidgetsSectionActionRepository$PaymentWidgetsSectionAction.class, str);
    }

    public static PaymentWidgetsSectionActionRepository$PaymentWidgetsSectionAction[] values() {
        return (PaymentWidgetsSectionActionRepository$PaymentWidgetsSectionAction[]) $VALUES.clone();
    }
}
