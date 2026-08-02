package com.yandex.go.taxi.summary.mobilityhub.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/taxi/summary/mobilityhub/analytics/TransitRoutesHubAnalytics$HubGeneration", "", "Lcom/yandex/go/taxi/summary/mobilityhub/analytics/TransitRoutesHubAnalytics$HubGeneration;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "First", "Second", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TransitRoutesHubAnalytics$HubGeneration {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransitRoutesHubAnalytics$HubGeneration[] $VALUES;
    public static final TransitRoutesHubAnalytics$HubGeneration First;
    public static final TransitRoutesHubAnalytics$HubGeneration Second;
    private final String eventValue;

    static {
        TransitRoutesHubAnalytics$HubGeneration transitRoutesHubAnalytics$HubGeneration = new TransitRoutesHubAnalytics$HubGeneration("First", 0, "first");
        First = transitRoutesHubAnalytics$HubGeneration;
        TransitRoutesHubAnalytics$HubGeneration transitRoutesHubAnalytics$HubGeneration2 = new TransitRoutesHubAnalytics$HubGeneration("Second", 1, "second");
        Second = transitRoutesHubAnalytics$HubGeneration2;
        TransitRoutesHubAnalytics$HubGeneration[] transitRoutesHubAnalytics$HubGenerationArr = {transitRoutesHubAnalytics$HubGeneration, transitRoutesHubAnalytics$HubGeneration2};
        $VALUES = transitRoutesHubAnalytics$HubGenerationArr;
        $ENTRIES = a.a(transitRoutesHubAnalytics$HubGenerationArr);
    }

    public TransitRoutesHubAnalytics$HubGeneration(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static TransitRoutesHubAnalytics$HubGeneration valueOf(String str) {
        return (TransitRoutesHubAnalytics$HubGeneration) Enum.valueOf(TransitRoutesHubAnalytics$HubGeneration.class, str);
    }

    public static TransitRoutesHubAnalytics$HubGeneration[] values() {
        return (TransitRoutesHubAnalytics$HubGeneration[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
