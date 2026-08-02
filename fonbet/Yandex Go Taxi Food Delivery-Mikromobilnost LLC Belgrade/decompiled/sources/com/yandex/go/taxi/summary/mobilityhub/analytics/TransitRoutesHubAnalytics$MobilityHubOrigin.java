package com.yandex.go.taxi.summary.mobilityhub.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/taxi/summary/mobilityhub/analytics/TransitRoutesHubAnalytics$MobilityHubOrigin", "", "Lcom/yandex/go/taxi/summary/mobilityhub/analytics/TransitRoutesHubAnalytics$MobilityHubOrigin;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Transport", "Hub", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TransitRoutesHubAnalytics$MobilityHubOrigin {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransitRoutesHubAnalytics$MobilityHubOrigin[] $VALUES;
    public static final TransitRoutesHubAnalytics$MobilityHubOrigin Hub;
    public static final TransitRoutesHubAnalytics$MobilityHubOrigin Transport;
    private final String eventValue;

    static {
        TransitRoutesHubAnalytics$MobilityHubOrigin transitRoutesHubAnalytics$MobilityHubOrigin = new TransitRoutesHubAnalytics$MobilityHubOrigin("Transport", 0, "transport");
        Transport = transitRoutesHubAnalytics$MobilityHubOrigin;
        TransitRoutesHubAnalytics$MobilityHubOrigin transitRoutesHubAnalytics$MobilityHubOrigin2 = new TransitRoutesHubAnalytics$MobilityHubOrigin("Hub", 1, "hub");
        Hub = transitRoutesHubAnalytics$MobilityHubOrigin2;
        TransitRoutesHubAnalytics$MobilityHubOrigin[] transitRoutesHubAnalytics$MobilityHubOriginArr = {transitRoutesHubAnalytics$MobilityHubOrigin, transitRoutesHubAnalytics$MobilityHubOrigin2};
        $VALUES = transitRoutesHubAnalytics$MobilityHubOriginArr;
        $ENTRIES = a.a(transitRoutesHubAnalytics$MobilityHubOriginArr);
    }

    public TransitRoutesHubAnalytics$MobilityHubOrigin(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static TransitRoutesHubAnalytics$MobilityHubOrigin valueOf(String str) {
        return (TransitRoutesHubAnalytics$MobilityHubOrigin) Enum.valueOf(TransitRoutesHubAnalytics$MobilityHubOrigin.class, str);
    }

    public static TransitRoutesHubAnalytics$MobilityHubOrigin[] values() {
        return (TransitRoutesHubAnalytics$MobilityHubOrigin[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
