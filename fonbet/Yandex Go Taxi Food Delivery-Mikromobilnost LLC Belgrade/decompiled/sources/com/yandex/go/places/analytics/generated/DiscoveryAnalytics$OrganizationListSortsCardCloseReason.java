package com.yandex.go.places.analytics.generated;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/yandex/go/places/analytics/generated/DiscoveryAnalytics$OrganizationListSortsCardCloseReason", "", "Lcom/yandex/go/places/analytics/generated/DiscoveryAnalytics$OrganizationListSortsCardCloseReason;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "SelectSortItem", "SlidedOut", "TouchOutside", "BackPressed", "analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DiscoveryAnalytics$OrganizationListSortsCardCloseReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DiscoveryAnalytics$OrganizationListSortsCardCloseReason[] $VALUES;
    public static final DiscoveryAnalytics$OrganizationListSortsCardCloseReason BackPressed;
    public static final DiscoveryAnalytics$OrganizationListSortsCardCloseReason SelectSortItem;
    public static final DiscoveryAnalytics$OrganizationListSortsCardCloseReason SlidedOut;
    public static final DiscoveryAnalytics$OrganizationListSortsCardCloseReason TouchOutside;
    private final String eventValue;

    static {
        DiscoveryAnalytics$OrganizationListSortsCardCloseReason discoveryAnalytics$OrganizationListSortsCardCloseReason = new DiscoveryAnalytics$OrganizationListSortsCardCloseReason("SelectSortItem", 0, "select_sort_item");
        SelectSortItem = discoveryAnalytics$OrganizationListSortsCardCloseReason;
        DiscoveryAnalytics$OrganizationListSortsCardCloseReason discoveryAnalytics$OrganizationListSortsCardCloseReason2 = new DiscoveryAnalytics$OrganizationListSortsCardCloseReason("SlidedOut", 1, "slided_out");
        SlidedOut = discoveryAnalytics$OrganizationListSortsCardCloseReason2;
        DiscoveryAnalytics$OrganizationListSortsCardCloseReason discoveryAnalytics$OrganizationListSortsCardCloseReason3 = new DiscoveryAnalytics$OrganizationListSortsCardCloseReason("TouchOutside", 2, "touch_outside");
        TouchOutside = discoveryAnalytics$OrganizationListSortsCardCloseReason3;
        DiscoveryAnalytics$OrganizationListSortsCardCloseReason discoveryAnalytics$OrganizationListSortsCardCloseReason4 = new DiscoveryAnalytics$OrganizationListSortsCardCloseReason("BackPressed", 3, "back_pressed");
        BackPressed = discoveryAnalytics$OrganizationListSortsCardCloseReason4;
        DiscoveryAnalytics$OrganizationListSortsCardCloseReason[] discoveryAnalytics$OrganizationListSortsCardCloseReasonArr = {discoveryAnalytics$OrganizationListSortsCardCloseReason, discoveryAnalytics$OrganizationListSortsCardCloseReason2, discoveryAnalytics$OrganizationListSortsCardCloseReason3, discoveryAnalytics$OrganizationListSortsCardCloseReason4};
        $VALUES = discoveryAnalytics$OrganizationListSortsCardCloseReasonArr;
        $ENTRIES = a.a(discoveryAnalytics$OrganizationListSortsCardCloseReasonArr);
    }

    public DiscoveryAnalytics$OrganizationListSortsCardCloseReason(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static DiscoveryAnalytics$OrganizationListSortsCardCloseReason valueOf(String str) {
        return (DiscoveryAnalytics$OrganizationListSortsCardCloseReason) Enum.valueOf(DiscoveryAnalytics$OrganizationListSortsCardCloseReason.class, str);
    }

    public static DiscoveryAnalytics$OrganizationListSortsCardCloseReason[] values() {
        return (DiscoveryAnalytics$OrganizationListSortsCardCloseReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
