package com.yandex.go.superapp.discovery.map.impl.analytics.generated;

import com.adjust.sdk.Constants;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"com/yandex/go/superapp/discovery/map/impl/analytics/generated/SuperMapAnalytics$SuperMapSearchActionType", "", "Lcom/yandex/go/superapp/discovery/map/impl/analytics/generated/SuperMapAnalytics$SuperMapSearchActionType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Deeplink", "OpenOrganizationCard", "OpenOrganizationsList", "OpenStop", "OpenVehicle", "Back", "Search", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SuperMapAnalytics$SuperMapSearchActionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SuperMapAnalytics$SuperMapSearchActionType[] $VALUES;
    public static final SuperMapAnalytics$SuperMapSearchActionType Back;
    public static final SuperMapAnalytics$SuperMapSearchActionType Deeplink;
    public static final SuperMapAnalytics$SuperMapSearchActionType OpenOrganizationCard;
    public static final SuperMapAnalytics$SuperMapSearchActionType OpenOrganizationsList;
    public static final SuperMapAnalytics$SuperMapSearchActionType OpenStop;
    public static final SuperMapAnalytics$SuperMapSearchActionType OpenVehicle;
    public static final SuperMapAnalytics$SuperMapSearchActionType Search;
    private final String eventValue;

    static {
        SuperMapAnalytics$SuperMapSearchActionType superMapAnalytics$SuperMapSearchActionType = new SuperMapAnalytics$SuperMapSearchActionType("Deeplink", 0, Constants.DEEPLINK);
        Deeplink = superMapAnalytics$SuperMapSearchActionType;
        SuperMapAnalytics$SuperMapSearchActionType superMapAnalytics$SuperMapSearchActionType2 = new SuperMapAnalytics$SuperMapSearchActionType("OpenOrganizationCard", 1, "open_organization_card");
        OpenOrganizationCard = superMapAnalytics$SuperMapSearchActionType2;
        SuperMapAnalytics$SuperMapSearchActionType superMapAnalytics$SuperMapSearchActionType3 = new SuperMapAnalytics$SuperMapSearchActionType("OpenOrganizationsList", 2, "open_organizations_list");
        OpenOrganizationsList = superMapAnalytics$SuperMapSearchActionType3;
        SuperMapAnalytics$SuperMapSearchActionType superMapAnalytics$SuperMapSearchActionType4 = new SuperMapAnalytics$SuperMapSearchActionType("OpenStop", 3, "open_stop");
        OpenStop = superMapAnalytics$SuperMapSearchActionType4;
        SuperMapAnalytics$SuperMapSearchActionType superMapAnalytics$SuperMapSearchActionType5 = new SuperMapAnalytics$SuperMapSearchActionType("OpenVehicle", 4, "open_vehicle");
        OpenVehicle = superMapAnalytics$SuperMapSearchActionType5;
        SuperMapAnalytics$SuperMapSearchActionType superMapAnalytics$SuperMapSearchActionType6 = new SuperMapAnalytics$SuperMapSearchActionType("Back", 5, "back");
        Back = superMapAnalytics$SuperMapSearchActionType6;
        SuperMapAnalytics$SuperMapSearchActionType superMapAnalytics$SuperMapSearchActionType7 = new SuperMapAnalytics$SuperMapSearchActionType("Search", 6, "search");
        Search = superMapAnalytics$SuperMapSearchActionType7;
        SuperMapAnalytics$SuperMapSearchActionType[] superMapAnalytics$SuperMapSearchActionTypeArr = {superMapAnalytics$SuperMapSearchActionType, superMapAnalytics$SuperMapSearchActionType2, superMapAnalytics$SuperMapSearchActionType3, superMapAnalytics$SuperMapSearchActionType4, superMapAnalytics$SuperMapSearchActionType5, superMapAnalytics$SuperMapSearchActionType6, superMapAnalytics$SuperMapSearchActionType7};
        $VALUES = superMapAnalytics$SuperMapSearchActionTypeArr;
        $ENTRIES = a.a(superMapAnalytics$SuperMapSearchActionTypeArr);
    }

    public SuperMapAnalytics$SuperMapSearchActionType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static SuperMapAnalytics$SuperMapSearchActionType valueOf(String str) {
        return (SuperMapAnalytics$SuperMapSearchActionType) Enum.valueOf(SuperMapAnalytics$SuperMapSearchActionType.class, str);
    }

    public static SuperMapAnalytics$SuperMapSearchActionType[] values() {
        return (SuperMapAnalytics$SuperMapSearchActionType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
