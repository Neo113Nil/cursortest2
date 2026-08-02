package com.yandex.go.places.analytics.generated;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/yandex/go/places/analytics/generated/DiscoveryAnalytics$OrganizationListFiltersCardCloseReason", "", "Lcom/yandex/go/places/analytics/generated/DiscoveryAnalytics$OrganizationListFiltersCardCloseReason;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "SearchFiltersButton", "ResetFiltersButton", "SlidedOut", "TouchOutside", "BackPressed", "analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DiscoveryAnalytics$OrganizationListFiltersCardCloseReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DiscoveryAnalytics$OrganizationListFiltersCardCloseReason[] $VALUES;
    public static final DiscoveryAnalytics$OrganizationListFiltersCardCloseReason BackPressed;
    public static final DiscoveryAnalytics$OrganizationListFiltersCardCloseReason ResetFiltersButton;
    public static final DiscoveryAnalytics$OrganizationListFiltersCardCloseReason SearchFiltersButton;
    public static final DiscoveryAnalytics$OrganizationListFiltersCardCloseReason SlidedOut;
    public static final DiscoveryAnalytics$OrganizationListFiltersCardCloseReason TouchOutside;
    private final String eventValue;

    static {
        DiscoveryAnalytics$OrganizationListFiltersCardCloseReason discoveryAnalytics$OrganizationListFiltersCardCloseReason = new DiscoveryAnalytics$OrganizationListFiltersCardCloseReason("SearchFiltersButton", 0, "search_filters_button");
        SearchFiltersButton = discoveryAnalytics$OrganizationListFiltersCardCloseReason;
        DiscoveryAnalytics$OrganizationListFiltersCardCloseReason discoveryAnalytics$OrganizationListFiltersCardCloseReason2 = new DiscoveryAnalytics$OrganizationListFiltersCardCloseReason("ResetFiltersButton", 1, "reset_filters_button");
        ResetFiltersButton = discoveryAnalytics$OrganizationListFiltersCardCloseReason2;
        DiscoveryAnalytics$OrganizationListFiltersCardCloseReason discoveryAnalytics$OrganizationListFiltersCardCloseReason3 = new DiscoveryAnalytics$OrganizationListFiltersCardCloseReason("SlidedOut", 2, "slided_out");
        SlidedOut = discoveryAnalytics$OrganizationListFiltersCardCloseReason3;
        DiscoveryAnalytics$OrganizationListFiltersCardCloseReason discoveryAnalytics$OrganizationListFiltersCardCloseReason4 = new DiscoveryAnalytics$OrganizationListFiltersCardCloseReason("TouchOutside", 3, "touch_outside");
        TouchOutside = discoveryAnalytics$OrganizationListFiltersCardCloseReason4;
        DiscoveryAnalytics$OrganizationListFiltersCardCloseReason discoveryAnalytics$OrganizationListFiltersCardCloseReason5 = new DiscoveryAnalytics$OrganizationListFiltersCardCloseReason("BackPressed", 4, "back_pressed");
        BackPressed = discoveryAnalytics$OrganizationListFiltersCardCloseReason5;
        DiscoveryAnalytics$OrganizationListFiltersCardCloseReason[] discoveryAnalytics$OrganizationListFiltersCardCloseReasonArr = {discoveryAnalytics$OrganizationListFiltersCardCloseReason, discoveryAnalytics$OrganizationListFiltersCardCloseReason2, discoveryAnalytics$OrganizationListFiltersCardCloseReason3, discoveryAnalytics$OrganizationListFiltersCardCloseReason4, discoveryAnalytics$OrganizationListFiltersCardCloseReason5};
        $VALUES = discoveryAnalytics$OrganizationListFiltersCardCloseReasonArr;
        $ENTRIES = a.a(discoveryAnalytics$OrganizationListFiltersCardCloseReasonArr);
    }

    public DiscoveryAnalytics$OrganizationListFiltersCardCloseReason(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static DiscoveryAnalytics$OrganizationListFiltersCardCloseReason valueOf(String str) {
        return (DiscoveryAnalytics$OrganizationListFiltersCardCloseReason) Enum.valueOf(DiscoveryAnalytics$OrganizationListFiltersCardCloseReason.class, str);
    }

    public static DiscoveryAnalytics$OrganizationListFiltersCardCloseReason[] values() {
        return (DiscoveryAnalytics$OrganizationListFiltersCardCloseReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
