package com.yandex.go.places.analytics.generated;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import org.webrtc.MediaStreamTrack;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/yandex/go/places/analytics/generated/DiscoveryAnalytics$MapObjectType", "", "Lcom/yandex/go/places/analytics/generated/DiscoveryAnalytics$MapObjectType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Organization", "Poi", "UgcPin", "Video", "Photo", "Communication", "analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DiscoveryAnalytics$MapObjectType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DiscoveryAnalytics$MapObjectType[] $VALUES;
    public static final DiscoveryAnalytics$MapObjectType Communication;
    public static final DiscoveryAnalytics$MapObjectType Organization;
    public static final DiscoveryAnalytics$MapObjectType Photo;
    public static final DiscoveryAnalytics$MapObjectType Poi;
    public static final DiscoveryAnalytics$MapObjectType UgcPin;
    public static final DiscoveryAnalytics$MapObjectType Video;
    private final String eventValue;

    static {
        DiscoveryAnalytics$MapObjectType discoveryAnalytics$MapObjectType = new DiscoveryAnalytics$MapObjectType("Organization", 0, "organization");
        Organization = discoveryAnalytics$MapObjectType;
        DiscoveryAnalytics$MapObjectType discoveryAnalytics$MapObjectType2 = new DiscoveryAnalytics$MapObjectType("Poi", 1, "poi");
        Poi = discoveryAnalytics$MapObjectType2;
        DiscoveryAnalytics$MapObjectType discoveryAnalytics$MapObjectType3 = new DiscoveryAnalytics$MapObjectType("UgcPin", 2, "ugc_pin");
        UgcPin = discoveryAnalytics$MapObjectType3;
        DiscoveryAnalytics$MapObjectType discoveryAnalytics$MapObjectType4 = new DiscoveryAnalytics$MapObjectType("Video", 3, MediaStreamTrack.VIDEO_TRACK_KIND);
        Video = discoveryAnalytics$MapObjectType4;
        DiscoveryAnalytics$MapObjectType discoveryAnalytics$MapObjectType5 = new DiscoveryAnalytics$MapObjectType("Photo", 4, "photo");
        Photo = discoveryAnalytics$MapObjectType5;
        DiscoveryAnalytics$MapObjectType discoveryAnalytics$MapObjectType6 = new DiscoveryAnalytics$MapObjectType("Communication", 5, "communication");
        Communication = discoveryAnalytics$MapObjectType6;
        DiscoveryAnalytics$MapObjectType[] discoveryAnalytics$MapObjectTypeArr = {discoveryAnalytics$MapObjectType, discoveryAnalytics$MapObjectType2, discoveryAnalytics$MapObjectType3, discoveryAnalytics$MapObjectType4, discoveryAnalytics$MapObjectType5, discoveryAnalytics$MapObjectType6};
        $VALUES = discoveryAnalytics$MapObjectTypeArr;
        $ENTRIES = a.a(discoveryAnalytics$MapObjectTypeArr);
    }

    public DiscoveryAnalytics$MapObjectType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static DiscoveryAnalytics$MapObjectType valueOf(String str) {
        return (DiscoveryAnalytics$MapObjectType) Enum.valueOf(DiscoveryAnalytics$MapObjectType.class, str);
    }

    public static DiscoveryAnalytics$MapObjectType[] values() {
        return (DiscoveryAnalytics$MapObjectType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
