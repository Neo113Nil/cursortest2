package com.ybsdk.core.analytics.generated.delegates;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/CommonEvents$FullscreenNotificationCloseScreen", "", "Lcom/ybsdk/core/analytics/generated/delegates/CommonEvents$FullscreenNotificationCloseScreen;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", "PRODUCTS", "DASHBOARD", "MERCHANT_OFFERS", "AUTOTOPUP", "COMMON_DIVKIT", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CommonEvents$FullscreenNotificationCloseScreen {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CommonEvents$FullscreenNotificationCloseScreen[] $VALUES;
    private final String originalValue;
    public static final CommonEvents$FullscreenNotificationCloseScreen PRODUCTS = new CommonEvents$FullscreenNotificationCloseScreen("PRODUCTS", 0, "products");
    public static final CommonEvents$FullscreenNotificationCloseScreen DASHBOARD = new CommonEvents$FullscreenNotificationCloseScreen("DASHBOARD", 1, "dashboard");
    public static final CommonEvents$FullscreenNotificationCloseScreen MERCHANT_OFFERS = new CommonEvents$FullscreenNotificationCloseScreen("MERCHANT_OFFERS", 2, "merchant_offers");
    public static final CommonEvents$FullscreenNotificationCloseScreen AUTOTOPUP = new CommonEvents$FullscreenNotificationCloseScreen("AUTOTOPUP", 3, "autotopup");
    public static final CommonEvents$FullscreenNotificationCloseScreen COMMON_DIVKIT = new CommonEvents$FullscreenNotificationCloseScreen("COMMON_DIVKIT", 4, "common_divkit");

    private static final /* synthetic */ CommonEvents$FullscreenNotificationCloseScreen[] $values() {
        return new CommonEvents$FullscreenNotificationCloseScreen[]{PRODUCTS, DASHBOARD, MERCHANT_OFFERS, AUTOTOPUP, COMMON_DIVKIT};
    }

    static {
        CommonEvents$FullscreenNotificationCloseScreen[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private CommonEvents$FullscreenNotificationCloseScreen(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static CommonEvents$FullscreenNotificationCloseScreen valueOf(String str) {
        return (CommonEvents$FullscreenNotificationCloseScreen) Enum.valueOf(CommonEvents$FullscreenNotificationCloseScreen.class, str);
    }

    public static CommonEvents$FullscreenNotificationCloseScreen[] values() {
        return (CommonEvents$FullscreenNotificationCloseScreen[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
