package com.yandex.go.permission.location_with_agreement.analytics;

import defpackage.cho;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/permission/location_with_agreement/analytics/LocationWithAgreementAnalytics$MarkedEvents", "Lcho;", "", "Lcom/yandex/go/permission/location_with_agreement/analytics/LocationWithAgreementAnalytics$MarkedEvents;", "Permission", "HttpRequest", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final class LocationWithAgreementAnalytics$MarkedEvents implements cho {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LocationWithAgreementAnalytics$MarkedEvents[] $VALUES;
    public static final LocationWithAgreementAnalytics$MarkedEvents HttpRequest;
    public static final LocationWithAgreementAnalytics$MarkedEvents Permission;

    static {
        LocationWithAgreementAnalytics$MarkedEvents locationWithAgreementAnalytics$MarkedEvents = new LocationWithAgreementAnalytics$MarkedEvents("Permission", 0);
        Permission = locationWithAgreementAnalytics$MarkedEvents;
        LocationWithAgreementAnalytics$MarkedEvents locationWithAgreementAnalytics$MarkedEvents2 = new LocationWithAgreementAnalytics$MarkedEvents("HttpRequest", 1);
        HttpRequest = locationWithAgreementAnalytics$MarkedEvents2;
        LocationWithAgreementAnalytics$MarkedEvents[] locationWithAgreementAnalytics$MarkedEventsArr = {locationWithAgreementAnalytics$MarkedEvents, locationWithAgreementAnalytics$MarkedEvents2};
        $VALUES = locationWithAgreementAnalytics$MarkedEventsArr;
        $ENTRIES = kotlin.enums.a.a(locationWithAgreementAnalytics$MarkedEventsArr);
    }

    public static LocationWithAgreementAnalytics$MarkedEvents valueOf(String str) {
        return (LocationWithAgreementAnalytics$MarkedEvents) Enum.valueOf(LocationWithAgreementAnalytics$MarkedEvents.class, str);
    }

    public static LocationWithAgreementAnalytics$MarkedEvents[] values() {
        return (LocationWithAgreementAnalytics$MarkedEvents[]) $VALUES.clone();
    }
}
