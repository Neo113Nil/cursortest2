package com.yandex.go.places.analytics.generated;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/places/analytics/generated/DiscoveryAnalytics$MapButtonType", "", "Lcom/yandex/go/places/analytics/generated/DiscoveryAnalytics$MapButtonType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "ZoomIn", "ZoomOut", "MyGeo", "analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DiscoveryAnalytics$MapButtonType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DiscoveryAnalytics$MapButtonType[] $VALUES;
    public static final DiscoveryAnalytics$MapButtonType MyGeo;
    public static final DiscoveryAnalytics$MapButtonType ZoomIn;
    public static final DiscoveryAnalytics$MapButtonType ZoomOut;
    private final String eventValue;

    static {
        DiscoveryAnalytics$MapButtonType discoveryAnalytics$MapButtonType = new DiscoveryAnalytics$MapButtonType("ZoomIn", 0, "zoom_in");
        ZoomIn = discoveryAnalytics$MapButtonType;
        DiscoveryAnalytics$MapButtonType discoveryAnalytics$MapButtonType2 = new DiscoveryAnalytics$MapButtonType("ZoomOut", 1, "zoom_out");
        ZoomOut = discoveryAnalytics$MapButtonType2;
        DiscoveryAnalytics$MapButtonType discoveryAnalytics$MapButtonType3 = new DiscoveryAnalytics$MapButtonType("MyGeo", 2, "my_geo");
        MyGeo = discoveryAnalytics$MapButtonType3;
        DiscoveryAnalytics$MapButtonType[] discoveryAnalytics$MapButtonTypeArr = {discoveryAnalytics$MapButtonType, discoveryAnalytics$MapButtonType2, discoveryAnalytics$MapButtonType3};
        $VALUES = discoveryAnalytics$MapButtonTypeArr;
        $ENTRIES = a.a(discoveryAnalytics$MapButtonTypeArr);
    }

    public DiscoveryAnalytics$MapButtonType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static DiscoveryAnalytics$MapButtonType valueOf(String str) {
        return (DiscoveryAnalytics$MapButtonType) Enum.valueOf(DiscoveryAnalytics$MapButtonType.class, str);
    }

    public static DiscoveryAnalytics$MapButtonType[] values() {
        return (DiscoveryAnalytics$MapButtonType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
