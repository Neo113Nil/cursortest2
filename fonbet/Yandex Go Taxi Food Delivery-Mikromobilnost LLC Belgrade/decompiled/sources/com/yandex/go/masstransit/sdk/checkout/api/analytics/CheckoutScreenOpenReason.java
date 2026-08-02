package com.yandex.go.masstransit.sdk.checkout.api.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/masstransit/sdk/checkout/api/analytics/CheckoutScreenOpenReason;", "", "QrScan", "BleVehiclesScreen", "Deeplink", "Other", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CheckoutScreenOpenReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CheckoutScreenOpenReason[] $VALUES;
    public static final CheckoutScreenOpenReason BleVehiclesScreen;
    public static final CheckoutScreenOpenReason Deeplink;
    public static final CheckoutScreenOpenReason Other;
    public static final CheckoutScreenOpenReason QrScan;

    static {
        CheckoutScreenOpenReason checkoutScreenOpenReason = new CheckoutScreenOpenReason("QrScan", 0);
        QrScan = checkoutScreenOpenReason;
        CheckoutScreenOpenReason checkoutScreenOpenReason2 = new CheckoutScreenOpenReason("BleVehiclesScreen", 1);
        BleVehiclesScreen = checkoutScreenOpenReason2;
        CheckoutScreenOpenReason checkoutScreenOpenReason3 = new CheckoutScreenOpenReason("Deeplink", 2);
        Deeplink = checkoutScreenOpenReason3;
        CheckoutScreenOpenReason checkoutScreenOpenReason4 = new CheckoutScreenOpenReason("Other", 3);
        Other = checkoutScreenOpenReason4;
        CheckoutScreenOpenReason[] checkoutScreenOpenReasonArr = {checkoutScreenOpenReason, checkoutScreenOpenReason2, checkoutScreenOpenReason3, checkoutScreenOpenReason4};
        $VALUES = checkoutScreenOpenReasonArr;
        $ENTRIES = a.a(checkoutScreenOpenReasonArr);
    }

    public static CheckoutScreenOpenReason valueOf(String str) {
        return (CheckoutScreenOpenReason) Enum.valueOf(CheckoutScreenOpenReason.class, str);
    }

    public static CheckoutScreenOpenReason[] values() {
        return (CheckoutScreenOpenReason[]) $VALUES.clone();
    }
}
