package com.yandex.go.safety.center.analytics;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/safety/center/analytics/SafetyCenterAnalytics$LostItemsAnalyticsTappedViewType", "", "Lcom/yandex/go/safety/center/analytics/SafetyCenterAnalytics$LostItemsAnalyticsTappedViewType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "BtnCallDriver", "BtnOpenHistory", "ViewOrderDetails", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SafetyCenterAnalytics$LostItemsAnalyticsTappedViewType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SafetyCenterAnalytics$LostItemsAnalyticsTappedViewType[] $VALUES;
    public static final SafetyCenterAnalytics$LostItemsAnalyticsTappedViewType BtnCallDriver;
    public static final SafetyCenterAnalytics$LostItemsAnalyticsTappedViewType BtnOpenHistory;
    public static final SafetyCenterAnalytics$LostItemsAnalyticsTappedViewType ViewOrderDetails;
    private final String eventValue;

    static {
        SafetyCenterAnalytics$LostItemsAnalyticsTappedViewType safetyCenterAnalytics$LostItemsAnalyticsTappedViewType = new SafetyCenterAnalytics$LostItemsAnalyticsTappedViewType("BtnCallDriver", 0, "btn_call_driver");
        BtnCallDriver = safetyCenterAnalytics$LostItemsAnalyticsTappedViewType;
        SafetyCenterAnalytics$LostItemsAnalyticsTappedViewType safetyCenterAnalytics$LostItemsAnalyticsTappedViewType2 = new SafetyCenterAnalytics$LostItemsAnalyticsTappedViewType("BtnOpenHistory", 1, "btn_open_history");
        BtnOpenHistory = safetyCenterAnalytics$LostItemsAnalyticsTappedViewType2;
        SafetyCenterAnalytics$LostItemsAnalyticsTappedViewType safetyCenterAnalytics$LostItemsAnalyticsTappedViewType3 = new SafetyCenterAnalytics$LostItemsAnalyticsTappedViewType("ViewOrderDetails", 2, "view_order_details");
        ViewOrderDetails = safetyCenterAnalytics$LostItemsAnalyticsTappedViewType3;
        SafetyCenterAnalytics$LostItemsAnalyticsTappedViewType[] safetyCenterAnalytics$LostItemsAnalyticsTappedViewTypeArr = {safetyCenterAnalytics$LostItemsAnalyticsTappedViewType, safetyCenterAnalytics$LostItemsAnalyticsTappedViewType2, safetyCenterAnalytics$LostItemsAnalyticsTappedViewType3};
        $VALUES = safetyCenterAnalytics$LostItemsAnalyticsTappedViewTypeArr;
        $ENTRIES = kotlin.enums.a.a(safetyCenterAnalytics$LostItemsAnalyticsTappedViewTypeArr);
    }

    public SafetyCenterAnalytics$LostItemsAnalyticsTappedViewType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static SafetyCenterAnalytics$LostItemsAnalyticsTappedViewType valueOf(String str) {
        return (SafetyCenterAnalytics$LostItemsAnalyticsTappedViewType) Enum.valueOf(SafetyCenterAnalytics$LostItemsAnalyticsTappedViewType.class, str);
    }

    public static SafetyCenterAnalytics$LostItemsAnalyticsTappedViewType[] values() {
        return (SafetyCenterAnalytics$LostItemsAnalyticsTappedViewType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
