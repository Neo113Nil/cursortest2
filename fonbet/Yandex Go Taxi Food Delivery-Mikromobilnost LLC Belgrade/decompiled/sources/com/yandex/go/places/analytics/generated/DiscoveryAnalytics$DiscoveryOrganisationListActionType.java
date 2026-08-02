package com.yandex.go.places.analytics.generated;

import com.adjust.sdk.Constants;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/yandex/go/places/analytics/generated/DiscoveryAnalytics$DiscoveryOrganisationListActionType", "", "Lcom/yandex/go/places/analytics/generated/DiscoveryAnalytics$DiscoveryOrganisationListActionType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Back", "Filter", "ShareNative", "OrganizationCard", "Deeplink", "ShortcutModalChip", "analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DiscoveryAnalytics$DiscoveryOrganisationListActionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DiscoveryAnalytics$DiscoveryOrganisationListActionType[] $VALUES;
    public static final DiscoveryAnalytics$DiscoveryOrganisationListActionType Back;
    public static final DiscoveryAnalytics$DiscoveryOrganisationListActionType Deeplink;
    public static final DiscoveryAnalytics$DiscoveryOrganisationListActionType Filter;
    public static final DiscoveryAnalytics$DiscoveryOrganisationListActionType OrganizationCard;
    public static final DiscoveryAnalytics$DiscoveryOrganisationListActionType ShareNative;
    public static final DiscoveryAnalytics$DiscoveryOrganisationListActionType ShortcutModalChip;
    private final String eventValue;

    static {
        DiscoveryAnalytics$DiscoveryOrganisationListActionType discoveryAnalytics$DiscoveryOrganisationListActionType = new DiscoveryAnalytics$DiscoveryOrganisationListActionType("Back", 0, "back");
        Back = discoveryAnalytics$DiscoveryOrganisationListActionType;
        DiscoveryAnalytics$DiscoveryOrganisationListActionType discoveryAnalytics$DiscoveryOrganisationListActionType2 = new DiscoveryAnalytics$DiscoveryOrganisationListActionType("Filter", 1, "filter");
        Filter = discoveryAnalytics$DiscoveryOrganisationListActionType2;
        DiscoveryAnalytics$DiscoveryOrganisationListActionType discoveryAnalytics$DiscoveryOrganisationListActionType3 = new DiscoveryAnalytics$DiscoveryOrganisationListActionType("ShareNative", 2, "share_native");
        ShareNative = discoveryAnalytics$DiscoveryOrganisationListActionType3;
        DiscoveryAnalytics$DiscoveryOrganisationListActionType discoveryAnalytics$DiscoveryOrganisationListActionType4 = new DiscoveryAnalytics$DiscoveryOrganisationListActionType("OrganizationCard", 3, "organization_card");
        OrganizationCard = discoveryAnalytics$DiscoveryOrganisationListActionType4;
        DiscoveryAnalytics$DiscoveryOrganisationListActionType discoveryAnalytics$DiscoveryOrganisationListActionType5 = new DiscoveryAnalytics$DiscoveryOrganisationListActionType("Deeplink", 4, Constants.DEEPLINK);
        Deeplink = discoveryAnalytics$DiscoveryOrganisationListActionType5;
        DiscoveryAnalytics$DiscoveryOrganisationListActionType discoveryAnalytics$DiscoveryOrganisationListActionType6 = new DiscoveryAnalytics$DiscoveryOrganisationListActionType("ShortcutModalChip", 5, "shortcut_modal_chip");
        ShortcutModalChip = discoveryAnalytics$DiscoveryOrganisationListActionType6;
        DiscoveryAnalytics$DiscoveryOrganisationListActionType[] discoveryAnalytics$DiscoveryOrganisationListActionTypeArr = {discoveryAnalytics$DiscoveryOrganisationListActionType, discoveryAnalytics$DiscoveryOrganisationListActionType2, discoveryAnalytics$DiscoveryOrganisationListActionType3, discoveryAnalytics$DiscoveryOrganisationListActionType4, discoveryAnalytics$DiscoveryOrganisationListActionType5, discoveryAnalytics$DiscoveryOrganisationListActionType6};
        $VALUES = discoveryAnalytics$DiscoveryOrganisationListActionTypeArr;
        $ENTRIES = a.a(discoveryAnalytics$DiscoveryOrganisationListActionTypeArr);
    }

    public DiscoveryAnalytics$DiscoveryOrganisationListActionType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static DiscoveryAnalytics$DiscoveryOrganisationListActionType valueOf(String str) {
        return (DiscoveryAnalytics$DiscoveryOrganisationListActionType) Enum.valueOf(DiscoveryAnalytics$DiscoveryOrganisationListActionType.class, str);
    }

    public static DiscoveryAnalytics$DiscoveryOrganisationListActionType[] values() {
        return (DiscoveryAnalytics$DiscoveryOrganisationListActionType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
