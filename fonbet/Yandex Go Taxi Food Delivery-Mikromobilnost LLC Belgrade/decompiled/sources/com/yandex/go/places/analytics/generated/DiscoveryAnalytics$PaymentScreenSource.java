package com.yandex.go.places.analytics.generated;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/yandex/go/places/analytics/generated/DiscoveryAnalytics$PaymentScreenSource", "", "Lcom/yandex/go/places/analytics/generated/DiscoveryAnalytics$PaymentScreenSource;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "ConfirmCard", "Push", "Tracker", "OrderHistory", "analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DiscoveryAnalytics$PaymentScreenSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DiscoveryAnalytics$PaymentScreenSource[] $VALUES;
    public static final DiscoveryAnalytics$PaymentScreenSource ConfirmCard;
    public static final DiscoveryAnalytics$PaymentScreenSource OrderHistory;
    public static final DiscoveryAnalytics$PaymentScreenSource Push;
    public static final DiscoveryAnalytics$PaymentScreenSource Tracker;
    private final String eventValue;

    static {
        DiscoveryAnalytics$PaymentScreenSource discoveryAnalytics$PaymentScreenSource = new DiscoveryAnalytics$PaymentScreenSource("ConfirmCard", 0, "ConfirmCard");
        ConfirmCard = discoveryAnalytics$PaymentScreenSource;
        DiscoveryAnalytics$PaymentScreenSource discoveryAnalytics$PaymentScreenSource2 = new DiscoveryAnalytics$PaymentScreenSource("Push", 1, "Push");
        Push = discoveryAnalytics$PaymentScreenSource2;
        DiscoveryAnalytics$PaymentScreenSource discoveryAnalytics$PaymentScreenSource3 = new DiscoveryAnalytics$PaymentScreenSource("Tracker", 2, "Tracker");
        Tracker = discoveryAnalytics$PaymentScreenSource3;
        DiscoveryAnalytics$PaymentScreenSource discoveryAnalytics$PaymentScreenSource4 = new DiscoveryAnalytics$PaymentScreenSource("OrderHistory", 3, "OrderHistory");
        OrderHistory = discoveryAnalytics$PaymentScreenSource4;
        DiscoveryAnalytics$PaymentScreenSource[] discoveryAnalytics$PaymentScreenSourceArr = {discoveryAnalytics$PaymentScreenSource, discoveryAnalytics$PaymentScreenSource2, discoveryAnalytics$PaymentScreenSource3, discoveryAnalytics$PaymentScreenSource4};
        $VALUES = discoveryAnalytics$PaymentScreenSourceArr;
        $ENTRIES = a.a(discoveryAnalytics$PaymentScreenSourceArr);
    }

    public DiscoveryAnalytics$PaymentScreenSource(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static DiscoveryAnalytics$PaymentScreenSource valueOf(String str) {
        return (DiscoveryAnalytics$PaymentScreenSource) Enum.valueOf(DiscoveryAnalytics$PaymentScreenSource.class, str);
    }

    public static DiscoveryAnalytics$PaymentScreenSource[] values() {
        return (DiscoveryAnalytics$PaymentScreenSource[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
