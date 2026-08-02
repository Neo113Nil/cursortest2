package com.ybsdk.core.analytics.generated.delegates;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/CommonEvents$FullscreenNotificationShownScreen", "", "Lcom/ybsdk/core/analytics/generated/delegates/CommonEvents$FullscreenNotificationShownScreen;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", "PRODUCTS", "DASHBOARD", "MERCHANT_OFFERS", "AUTOTOPUP", "AUTOTOPUP_V2", "COMMON_DIVKIT", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CommonEvents$FullscreenNotificationShownScreen {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CommonEvents$FullscreenNotificationShownScreen[] $VALUES;
    private final String originalValue;
    public static final CommonEvents$FullscreenNotificationShownScreen PRODUCTS = new CommonEvents$FullscreenNotificationShownScreen("PRODUCTS", 0, "products");
    public static final CommonEvents$FullscreenNotificationShownScreen DASHBOARD = new CommonEvents$FullscreenNotificationShownScreen("DASHBOARD", 1, "dashboard");
    public static final CommonEvents$FullscreenNotificationShownScreen MERCHANT_OFFERS = new CommonEvents$FullscreenNotificationShownScreen("MERCHANT_OFFERS", 2, "merchant_offers");
    public static final CommonEvents$FullscreenNotificationShownScreen AUTOTOPUP = new CommonEvents$FullscreenNotificationShownScreen("AUTOTOPUP", 3, "autotopup");
    public static final CommonEvents$FullscreenNotificationShownScreen AUTOTOPUP_V2 = new CommonEvents$FullscreenNotificationShownScreen("AUTOTOPUP_V2", 4, "autotopup_v2");
    public static final CommonEvents$FullscreenNotificationShownScreen COMMON_DIVKIT = new CommonEvents$FullscreenNotificationShownScreen("COMMON_DIVKIT", 5, "common_divkit");

    private static final /* synthetic */ CommonEvents$FullscreenNotificationShownScreen[] $values() {
        return new CommonEvents$FullscreenNotificationShownScreen[]{PRODUCTS, DASHBOARD, MERCHANT_OFFERS, AUTOTOPUP, AUTOTOPUP_V2, COMMON_DIVKIT};
    }

    static {
        CommonEvents$FullscreenNotificationShownScreen[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private CommonEvents$FullscreenNotificationShownScreen(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static CommonEvents$FullscreenNotificationShownScreen valueOf(String str) {
        return (CommonEvents$FullscreenNotificationShownScreen) Enum.valueOf(CommonEvents$FullscreenNotificationShownScreen.class, str);
    }

    public static CommonEvents$FullscreenNotificationShownScreen[] values() {
        return (CommonEvents$FullscreenNotificationShownScreen[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
