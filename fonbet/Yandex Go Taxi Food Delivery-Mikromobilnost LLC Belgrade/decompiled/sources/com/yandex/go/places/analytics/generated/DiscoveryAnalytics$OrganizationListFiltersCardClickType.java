package com.yandex.go.places.analytics.generated;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/yandex/go/places/analytics/generated/DiscoveryAnalytics$OrganizationListFiltersCardClickType", "", "Lcom/yandex/go/places/analytics/generated/DiscoveryAnalytics$OrganizationListFiltersCardClickType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "FilterToggleChip", "FilterSelectionChip", "ResetFilters", "SearchWithFilters", "analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DiscoveryAnalytics$OrganizationListFiltersCardClickType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DiscoveryAnalytics$OrganizationListFiltersCardClickType[] $VALUES;
    public static final DiscoveryAnalytics$OrganizationListFiltersCardClickType FilterSelectionChip;
    public static final DiscoveryAnalytics$OrganizationListFiltersCardClickType FilterToggleChip;
    public static final DiscoveryAnalytics$OrganizationListFiltersCardClickType ResetFilters;
    public static final DiscoveryAnalytics$OrganizationListFiltersCardClickType SearchWithFilters;
    private final String eventValue;

    static {
        DiscoveryAnalytics$OrganizationListFiltersCardClickType discoveryAnalytics$OrganizationListFiltersCardClickType = new DiscoveryAnalytics$OrganizationListFiltersCardClickType("FilterToggleChip", 0, "filter_toggle_chip");
        FilterToggleChip = discoveryAnalytics$OrganizationListFiltersCardClickType;
        DiscoveryAnalytics$OrganizationListFiltersCardClickType discoveryAnalytics$OrganizationListFiltersCardClickType2 = new DiscoveryAnalytics$OrganizationListFiltersCardClickType("FilterSelectionChip", 1, "filter_selection_chip");
        FilterSelectionChip = discoveryAnalytics$OrganizationListFiltersCardClickType2;
        DiscoveryAnalytics$OrganizationListFiltersCardClickType discoveryAnalytics$OrganizationListFiltersCardClickType3 = new DiscoveryAnalytics$OrganizationListFiltersCardClickType("ResetFilters", 2, "reset_filters");
        ResetFilters = discoveryAnalytics$OrganizationListFiltersCardClickType3;
        DiscoveryAnalytics$OrganizationListFiltersCardClickType discoveryAnalytics$OrganizationListFiltersCardClickType4 = new DiscoveryAnalytics$OrganizationListFiltersCardClickType("SearchWithFilters", 3, "search_with_filters");
        SearchWithFilters = discoveryAnalytics$OrganizationListFiltersCardClickType4;
        DiscoveryAnalytics$OrganizationListFiltersCardClickType[] discoveryAnalytics$OrganizationListFiltersCardClickTypeArr = {discoveryAnalytics$OrganizationListFiltersCardClickType, discoveryAnalytics$OrganizationListFiltersCardClickType2, discoveryAnalytics$OrganizationListFiltersCardClickType3, discoveryAnalytics$OrganizationListFiltersCardClickType4};
        $VALUES = discoveryAnalytics$OrganizationListFiltersCardClickTypeArr;
        $ENTRIES = a.a(discoveryAnalytics$OrganizationListFiltersCardClickTypeArr);
    }

    public DiscoveryAnalytics$OrganizationListFiltersCardClickType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static DiscoveryAnalytics$OrganizationListFiltersCardClickType valueOf(String str) {
        return (DiscoveryAnalytics$OrganizationListFiltersCardClickType) Enum.valueOf(DiscoveryAnalytics$OrganizationListFiltersCardClickType.class, str);
    }

    public static DiscoveryAnalytics$OrganizationListFiltersCardClickType[] values() {
        return (DiscoveryAnalytics$OrganizationListFiltersCardClickType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
