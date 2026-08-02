package com.yandex.go.safety.center.analytics;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/safety/center/analytics/SafetyCenterAnalytics$LostItemsAnalyticsDismissType", "", "Lcom/yandex/go/safety/center/analytics/SafetyCenterAnalytics$LostItemsAnalyticsDismissType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Swipe", "BackgroundTapped", "CloseButtonTapped", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SafetyCenterAnalytics$LostItemsAnalyticsDismissType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SafetyCenterAnalytics$LostItemsAnalyticsDismissType[] $VALUES;
    public static final SafetyCenterAnalytics$LostItemsAnalyticsDismissType BackgroundTapped;
    public static final SafetyCenterAnalytics$LostItemsAnalyticsDismissType CloseButtonTapped;
    public static final SafetyCenterAnalytics$LostItemsAnalyticsDismissType Swipe;
    private final String eventValue;

    static {
        SafetyCenterAnalytics$LostItemsAnalyticsDismissType safetyCenterAnalytics$LostItemsAnalyticsDismissType = new SafetyCenterAnalytics$LostItemsAnalyticsDismissType("Swipe", 0, "swipe");
        Swipe = safetyCenterAnalytics$LostItemsAnalyticsDismissType;
        SafetyCenterAnalytics$LostItemsAnalyticsDismissType safetyCenterAnalytics$LostItemsAnalyticsDismissType2 = new SafetyCenterAnalytics$LostItemsAnalyticsDismissType("BackgroundTapped", 1, "background_tapped");
        BackgroundTapped = safetyCenterAnalytics$LostItemsAnalyticsDismissType2;
        SafetyCenterAnalytics$LostItemsAnalyticsDismissType safetyCenterAnalytics$LostItemsAnalyticsDismissType3 = new SafetyCenterAnalytics$LostItemsAnalyticsDismissType("CloseButtonTapped", 2, "close_button_tapped");
        CloseButtonTapped = safetyCenterAnalytics$LostItemsAnalyticsDismissType3;
        SafetyCenterAnalytics$LostItemsAnalyticsDismissType[] safetyCenterAnalytics$LostItemsAnalyticsDismissTypeArr = {safetyCenterAnalytics$LostItemsAnalyticsDismissType, safetyCenterAnalytics$LostItemsAnalyticsDismissType2, safetyCenterAnalytics$LostItemsAnalyticsDismissType3};
        $VALUES = safetyCenterAnalytics$LostItemsAnalyticsDismissTypeArr;
        $ENTRIES = kotlin.enums.a.a(safetyCenterAnalytics$LostItemsAnalyticsDismissTypeArr);
    }

    public SafetyCenterAnalytics$LostItemsAnalyticsDismissType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static SafetyCenterAnalytics$LostItemsAnalyticsDismissType valueOf(String str) {
        return (SafetyCenterAnalytics$LostItemsAnalyticsDismissType) Enum.valueOf(SafetyCenterAnalytics$LostItemsAnalyticsDismissType.class, str);
    }

    public static SafetyCenterAnalytics$LostItemsAnalyticsDismissType[] values() {
        return (SafetyCenterAnalytics$LostItemsAnalyticsDismissType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
