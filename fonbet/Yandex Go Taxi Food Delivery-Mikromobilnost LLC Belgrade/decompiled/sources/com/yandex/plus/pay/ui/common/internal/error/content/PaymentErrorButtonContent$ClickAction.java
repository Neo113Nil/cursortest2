package com.yandex.plus.pay.ui.common.internal.error.content;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/plus/pay/ui/common/internal/error/content/PaymentErrorButtonContent$ClickAction", "", "Lcom/yandex/plus/pay/ui/common/internal/error/content/PaymentErrorButtonContent$ClickAction;", "CLOSE", "RETRY", "CHANGE_PAYMENT_METHOD", "pay-sdk-ui-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PaymentErrorButtonContent$ClickAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PaymentErrorButtonContent$ClickAction[] $VALUES;
    public static final PaymentErrorButtonContent$ClickAction CHANGE_PAYMENT_METHOD;
    public static final PaymentErrorButtonContent$ClickAction CLOSE;
    public static final PaymentErrorButtonContent$ClickAction RETRY;

    static {
        PaymentErrorButtonContent$ClickAction paymentErrorButtonContent$ClickAction = new PaymentErrorButtonContent$ClickAction("CLOSE", 0);
        CLOSE = paymentErrorButtonContent$ClickAction;
        PaymentErrorButtonContent$ClickAction paymentErrorButtonContent$ClickAction2 = new PaymentErrorButtonContent$ClickAction("RETRY", 1);
        RETRY = paymentErrorButtonContent$ClickAction2;
        PaymentErrorButtonContent$ClickAction paymentErrorButtonContent$ClickAction3 = new PaymentErrorButtonContent$ClickAction("CHANGE_PAYMENT_METHOD", 2);
        CHANGE_PAYMENT_METHOD = paymentErrorButtonContent$ClickAction3;
        PaymentErrorButtonContent$ClickAction[] paymentErrorButtonContent$ClickActionArr = {paymentErrorButtonContent$ClickAction, paymentErrorButtonContent$ClickAction2, paymentErrorButtonContent$ClickAction3};
        $VALUES = paymentErrorButtonContent$ClickActionArr;
        $ENTRIES = a.a(paymentErrorButtonContent$ClickActionArr);
    }

    public static PaymentErrorButtonContent$ClickAction valueOf(String str) {
        return (PaymentErrorButtonContent$ClickAction) Enum.valueOf(PaymentErrorButtonContent$ClickAction.class, str);
    }

    public static PaymentErrorButtonContent$ClickAction[] values() {
        return (PaymentErrorButtonContent$ClickAction[]) $VALUES.clone();
    }
}
