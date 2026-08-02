package com.yandex.go.places.analytics.generated;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/places/analytics/generated/DiscoveryAnalytics$MapType", "", "Lcom/yandex/go/places/analytics/generated/DiscoveryAnalytics$MapType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "SuperappDiscoveryMap", "PlacesMap", "analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DiscoveryAnalytics$MapType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DiscoveryAnalytics$MapType[] $VALUES;
    public static final DiscoveryAnalytics$MapType PlacesMap;
    public static final DiscoveryAnalytics$MapType SuperappDiscoveryMap;
    private final String eventValue;

    static {
        DiscoveryAnalytics$MapType discoveryAnalytics$MapType = new DiscoveryAnalytics$MapType("SuperappDiscoveryMap", 0, "superapp_discovery_map");
        SuperappDiscoveryMap = discoveryAnalytics$MapType;
        DiscoveryAnalytics$MapType discoveryAnalytics$MapType2 = new DiscoveryAnalytics$MapType("PlacesMap", 1, "places_map");
        PlacesMap = discoveryAnalytics$MapType2;
        DiscoveryAnalytics$MapType[] discoveryAnalytics$MapTypeArr = {discoveryAnalytics$MapType, discoveryAnalytics$MapType2};
        $VALUES = discoveryAnalytics$MapTypeArr;
        $ENTRIES = a.a(discoveryAnalytics$MapTypeArr);
    }

    public DiscoveryAnalytics$MapType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static DiscoveryAnalytics$MapType valueOf(String str) {
        return (DiscoveryAnalytics$MapType) Enum.valueOf(DiscoveryAnalytics$MapType.class, str);
    }

    public static DiscoveryAnalytics$MapType[] values() {
        return (DiscoveryAnalytics$MapType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
