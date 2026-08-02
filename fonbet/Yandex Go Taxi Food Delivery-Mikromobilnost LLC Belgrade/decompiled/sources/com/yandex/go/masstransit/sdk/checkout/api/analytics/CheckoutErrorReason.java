package com.yandex.go.masstransit.sdk.checkout.api.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/go/masstransit/sdk/checkout/api/analytics/CheckoutErrorReason;", "", "VehicleSearchFailure", "TripInitFailure", "TripUpdateFailure", "CheckoutFailure", "CheckoutStatusFailure", "OrderPaymentFailure", "TripCopyFailure", "PaymentMethodsFailure", "Other", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CheckoutErrorReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CheckoutErrorReason[] $VALUES;
    public static final CheckoutErrorReason CheckoutFailure;
    public static final CheckoutErrorReason CheckoutStatusFailure;
    public static final CheckoutErrorReason OrderPaymentFailure;
    public static final CheckoutErrorReason Other;
    public static final CheckoutErrorReason PaymentMethodsFailure;
    public static final CheckoutErrorReason TripCopyFailure;
    public static final CheckoutErrorReason TripInitFailure;
    public static final CheckoutErrorReason TripUpdateFailure;
    public static final CheckoutErrorReason VehicleSearchFailure;

    static {
        CheckoutErrorReason checkoutErrorReason = new CheckoutErrorReason("VehicleSearchFailure", 0);
        VehicleSearchFailure = checkoutErrorReason;
        CheckoutErrorReason checkoutErrorReason2 = new CheckoutErrorReason("TripInitFailure", 1);
        TripInitFailure = checkoutErrorReason2;
        CheckoutErrorReason checkoutErrorReason3 = new CheckoutErrorReason("TripUpdateFailure", 2);
        TripUpdateFailure = checkoutErrorReason3;
        CheckoutErrorReason checkoutErrorReason4 = new CheckoutErrorReason("CheckoutFailure", 3);
        CheckoutFailure = checkoutErrorReason4;
        CheckoutErrorReason checkoutErrorReason5 = new CheckoutErrorReason("CheckoutStatusFailure", 4);
        CheckoutStatusFailure = checkoutErrorReason5;
        CheckoutErrorReason checkoutErrorReason6 = new CheckoutErrorReason("OrderPaymentFailure", 5);
        OrderPaymentFailure = checkoutErrorReason6;
        CheckoutErrorReason checkoutErrorReason7 = new CheckoutErrorReason("TripCopyFailure", 6);
        TripCopyFailure = checkoutErrorReason7;
        CheckoutErrorReason checkoutErrorReason8 = new CheckoutErrorReason("PaymentMethodsFailure", 7);
        PaymentMethodsFailure = checkoutErrorReason8;
        CheckoutErrorReason checkoutErrorReason9 = new CheckoutErrorReason("Other", 8);
        Other = checkoutErrorReason9;
        CheckoutErrorReason[] checkoutErrorReasonArr = {checkoutErrorReason, checkoutErrorReason2, checkoutErrorReason3, checkoutErrorReason4, checkoutErrorReason5, checkoutErrorReason6, checkoutErrorReason7, checkoutErrorReason8, checkoutErrorReason9};
        $VALUES = checkoutErrorReasonArr;
        $ENTRIES = a.a(checkoutErrorReasonArr);
    }

    public static CheckoutErrorReason valueOf(String str) {
        return (CheckoutErrorReason) Enum.valueOf(CheckoutErrorReason.class, str);
    }

    public static CheckoutErrorReason[] values() {
        return (CheckoutErrorReason[]) $VALUES.clone();
    }
}
