package com.yandex.go.permission.location_with_agreement.analytics;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/permission/location_with_agreement/analytics/LocationPermissionPrimingAnalytics$ButtonName", "", "Lcom/yandex/go/permission/location_with_agreement/analytics/LocationPermissionPrimingAnalytics$ButtonName;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Skip", "Share", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class LocationPermissionPrimingAnalytics$ButtonName {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LocationPermissionPrimingAnalytics$ButtonName[] $VALUES;
    public static final LocationPermissionPrimingAnalytics$ButtonName Share;
    public static final LocationPermissionPrimingAnalytics$ButtonName Skip;
    private final String eventValue;

    static {
        LocationPermissionPrimingAnalytics$ButtonName locationPermissionPrimingAnalytics$ButtonName = new LocationPermissionPrimingAnalytics$ButtonName("Skip", 0, "skip");
        Skip = locationPermissionPrimingAnalytics$ButtonName;
        LocationPermissionPrimingAnalytics$ButtonName locationPermissionPrimingAnalytics$ButtonName2 = new LocationPermissionPrimingAnalytics$ButtonName("Share", 1, "share");
        Share = locationPermissionPrimingAnalytics$ButtonName2;
        LocationPermissionPrimingAnalytics$ButtonName[] locationPermissionPrimingAnalytics$ButtonNameArr = {locationPermissionPrimingAnalytics$ButtonName, locationPermissionPrimingAnalytics$ButtonName2};
        $VALUES = locationPermissionPrimingAnalytics$ButtonNameArr;
        $ENTRIES = kotlin.enums.a.a(locationPermissionPrimingAnalytics$ButtonNameArr);
    }

    public LocationPermissionPrimingAnalytics$ButtonName(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static LocationPermissionPrimingAnalytics$ButtonName valueOf(String str) {
        return (LocationPermissionPrimingAnalytics$ButtonName) Enum.valueOf(LocationPermissionPrimingAnalytics$ButtonName.class, str);
    }

    public static LocationPermissionPrimingAnalytics$ButtonName[] values() {
        return (LocationPermissionPrimingAnalytics$ButtonName[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
