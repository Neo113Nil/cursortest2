package com.yandex.go.places.impl.analytics;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/places/impl/analytics/DiscoveryOrganizationsListAnalyticsProxy$ShortcutChipType", "", "Lcom/yandex/go/places/impl/analytics/DiscoveryOrganizationsListAnalyticsProxy$ShortcutChipType;", "", "analyticsName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "SHORTCUT_FILTER_CHIP", "SHORTCUT_MODAL_CHIP", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DiscoveryOrganizationsListAnalyticsProxy$ShortcutChipType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DiscoveryOrganizationsListAnalyticsProxy$ShortcutChipType[] $VALUES;
    public static final DiscoveryOrganizationsListAnalyticsProxy$ShortcutChipType SHORTCUT_FILTER_CHIP;
    public static final DiscoveryOrganizationsListAnalyticsProxy$ShortcutChipType SHORTCUT_MODAL_CHIP;
    private final String analyticsName;

    static {
        DiscoveryOrganizationsListAnalyticsProxy$ShortcutChipType discoveryOrganizationsListAnalyticsProxy$ShortcutChipType = new DiscoveryOrganizationsListAnalyticsProxy$ShortcutChipType("SHORTCUT_FILTER_CHIP", 0, "shortcut_filter_chip");
        SHORTCUT_FILTER_CHIP = discoveryOrganizationsListAnalyticsProxy$ShortcutChipType;
        DiscoveryOrganizationsListAnalyticsProxy$ShortcutChipType discoveryOrganizationsListAnalyticsProxy$ShortcutChipType2 = new DiscoveryOrganizationsListAnalyticsProxy$ShortcutChipType("SHORTCUT_MODAL_CHIP", 1, "shortcut_modal_chip");
        SHORTCUT_MODAL_CHIP = discoveryOrganizationsListAnalyticsProxy$ShortcutChipType2;
        DiscoveryOrganizationsListAnalyticsProxy$ShortcutChipType[] discoveryOrganizationsListAnalyticsProxy$ShortcutChipTypeArr = {discoveryOrganizationsListAnalyticsProxy$ShortcutChipType, discoveryOrganizationsListAnalyticsProxy$ShortcutChipType2};
        $VALUES = discoveryOrganizationsListAnalyticsProxy$ShortcutChipTypeArr;
        $ENTRIES = kotlin.enums.a.a(discoveryOrganizationsListAnalyticsProxy$ShortcutChipTypeArr);
    }

    public DiscoveryOrganizationsListAnalyticsProxy$ShortcutChipType(String str, int i, String str2) {
        this.analyticsName = str2;
    }

    public static DiscoveryOrganizationsListAnalyticsProxy$ShortcutChipType valueOf(String str) {
        return (DiscoveryOrganizationsListAnalyticsProxy$ShortcutChipType) Enum.valueOf(DiscoveryOrganizationsListAnalyticsProxy$ShortcutChipType.class, str);
    }

    public static DiscoveryOrganizationsListAnalyticsProxy$ShortcutChipType[] values() {
        return (DiscoveryOrganizationsListAnalyticsProxy$ShortcutChipType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }
}
