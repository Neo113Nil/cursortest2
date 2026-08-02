package com.ybsdk.core.analytics.generated.delegates;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/TechEvents$TechFullscreenSkipScreen", "", "Lcom/ybsdk/core/analytics/generated/delegates/TechEvents$TechFullscreenSkipScreen;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", "PRODUCTS", "DASHBOARD", "MERCHANT_OFFERS", "AUTOTOPUP", "AUTOTOPUP_V2", "COMMON_DIVKIT", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TechEvents$TechFullscreenSkipScreen {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TechEvents$TechFullscreenSkipScreen[] $VALUES;
    private final String originalValue;
    public static final TechEvents$TechFullscreenSkipScreen PRODUCTS = new TechEvents$TechFullscreenSkipScreen("PRODUCTS", 0, "products");
    public static final TechEvents$TechFullscreenSkipScreen DASHBOARD = new TechEvents$TechFullscreenSkipScreen("DASHBOARD", 1, "dashboard");
    public static final TechEvents$TechFullscreenSkipScreen MERCHANT_OFFERS = new TechEvents$TechFullscreenSkipScreen("MERCHANT_OFFERS", 2, "merchant_offers");
    public static final TechEvents$TechFullscreenSkipScreen AUTOTOPUP = new TechEvents$TechFullscreenSkipScreen("AUTOTOPUP", 3, "autotopup");
    public static final TechEvents$TechFullscreenSkipScreen AUTOTOPUP_V2 = new TechEvents$TechFullscreenSkipScreen("AUTOTOPUP_V2", 4, "autotopup_v2");
    public static final TechEvents$TechFullscreenSkipScreen COMMON_DIVKIT = new TechEvents$TechFullscreenSkipScreen("COMMON_DIVKIT", 5, "common_divkit");

    private static final /* synthetic */ TechEvents$TechFullscreenSkipScreen[] $values() {
        return new TechEvents$TechFullscreenSkipScreen[]{PRODUCTS, DASHBOARD, MERCHANT_OFFERS, AUTOTOPUP, AUTOTOPUP_V2, COMMON_DIVKIT};
    }

    static {
        TechEvents$TechFullscreenSkipScreen[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private TechEvents$TechFullscreenSkipScreen(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static TechEvents$TechFullscreenSkipScreen valueOf(String str) {
        return (TechEvents$TechFullscreenSkipScreen) Enum.valueOf(TechEvents$TechFullscreenSkipScreen.class, str);
    }

    public static TechEvents$TechFullscreenSkipScreen[] values() {
        return (TechEvents$TechFullscreenSkipScreen[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
