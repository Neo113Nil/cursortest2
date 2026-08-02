package com.yandex.go.places.analytics.generated;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/places/analytics/generated/DiscoveryAnalytics$TabbarType", "", "Lcom/yandex/go/places/analytics/generated/DiscoveryAnalytics$TabbarType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Places", "Messenger", "analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DiscoveryAnalytics$TabbarType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DiscoveryAnalytics$TabbarType[] $VALUES;
    public static final DiscoveryAnalytics$TabbarType Messenger;
    public static final DiscoveryAnalytics$TabbarType Places;
    private final String eventValue;

    static {
        DiscoveryAnalytics$TabbarType discoveryAnalytics$TabbarType = new DiscoveryAnalytics$TabbarType("Places", 0, "places");
        Places = discoveryAnalytics$TabbarType;
        DiscoveryAnalytics$TabbarType discoveryAnalytics$TabbarType2 = new DiscoveryAnalytics$TabbarType("Messenger", 1, "messenger");
        Messenger = discoveryAnalytics$TabbarType2;
        DiscoveryAnalytics$TabbarType[] discoveryAnalytics$TabbarTypeArr = {discoveryAnalytics$TabbarType, discoveryAnalytics$TabbarType2};
        $VALUES = discoveryAnalytics$TabbarTypeArr;
        $ENTRIES = a.a(discoveryAnalytics$TabbarTypeArr);
    }

    public DiscoveryAnalytics$TabbarType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static DiscoveryAnalytics$TabbarType valueOf(String str) {
        return (DiscoveryAnalytics$TabbarType) Enum.valueOf(DiscoveryAnalytics$TabbarType.class, str);
    }

    public static DiscoveryAnalytics$TabbarType[] values() {
        return (DiscoveryAnalytics$TabbarType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
