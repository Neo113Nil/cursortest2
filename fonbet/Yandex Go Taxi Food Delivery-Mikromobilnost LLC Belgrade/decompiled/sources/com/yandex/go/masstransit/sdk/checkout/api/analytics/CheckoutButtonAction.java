package com.yandex.go.masstransit.sdk.checkout.api.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/go/masstransit/sdk/checkout/api/analytics/CheckoutButtonAction;", "", "Back", "StopSelector", "DirectionSelector", "NumericInputUp", "NumericInputDown", "PaymentMethod", "PaymentButton", "ErrorButton", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CheckoutButtonAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CheckoutButtonAction[] $VALUES;
    public static final CheckoutButtonAction Back;
    public static final CheckoutButtonAction DirectionSelector;
    public static final CheckoutButtonAction ErrorButton;
    public static final CheckoutButtonAction NumericInputDown;
    public static final CheckoutButtonAction NumericInputUp;
    public static final CheckoutButtonAction PaymentButton;
    public static final CheckoutButtonAction PaymentMethod;
    public static final CheckoutButtonAction StopSelector;

    static {
        CheckoutButtonAction checkoutButtonAction = new CheckoutButtonAction("Back", 0);
        Back = checkoutButtonAction;
        CheckoutButtonAction checkoutButtonAction2 = new CheckoutButtonAction("StopSelector", 1);
        StopSelector = checkoutButtonAction2;
        CheckoutButtonAction checkoutButtonAction3 = new CheckoutButtonAction("DirectionSelector", 2);
        DirectionSelector = checkoutButtonAction3;
        CheckoutButtonAction checkoutButtonAction4 = new CheckoutButtonAction("NumericInputUp", 3);
        NumericInputUp = checkoutButtonAction4;
        CheckoutButtonAction checkoutButtonAction5 = new CheckoutButtonAction("NumericInputDown", 4);
        NumericInputDown = checkoutButtonAction5;
        CheckoutButtonAction checkoutButtonAction6 = new CheckoutButtonAction("PaymentMethod", 5);
        PaymentMethod = checkoutButtonAction6;
        CheckoutButtonAction checkoutButtonAction7 = new CheckoutButtonAction("PaymentButton", 6);
        PaymentButton = checkoutButtonAction7;
        CheckoutButtonAction checkoutButtonAction8 = new CheckoutButtonAction("ErrorButton", 7);
        ErrorButton = checkoutButtonAction8;
        CheckoutButtonAction[] checkoutButtonActionArr = {checkoutButtonAction, checkoutButtonAction2, checkoutButtonAction3, checkoutButtonAction4, checkoutButtonAction5, checkoutButtonAction6, checkoutButtonAction7, checkoutButtonAction8};
        $VALUES = checkoutButtonActionArr;
        $ENTRIES = a.a(checkoutButtonActionArr);
    }

    public static CheckoutButtonAction valueOf(String str) {
        return (CheckoutButtonAction) Enum.valueOf(CheckoutButtonAction.class, str);
    }

    public static CheckoutButtonAction[] values() {
        return (CheckoutButtonAction[]) $VALUES.clone();
    }
}
