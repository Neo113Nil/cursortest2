package com.yandex.go.taxi.summary.mobilityhub.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/taxi/summary/mobilityhub/analytics/TransitRoutesHubAnalytics$PresentationType", "", "Lcom/yandex/go/taxi/summary/mobilityhub/analytics/TransitRoutesHubAnalytics$PresentationType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "List", "Table", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TransitRoutesHubAnalytics$PresentationType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransitRoutesHubAnalytics$PresentationType[] $VALUES;
    public static final TransitRoutesHubAnalytics$PresentationType List;
    public static final TransitRoutesHubAnalytics$PresentationType Table;
    private final String eventValue;

    static {
        TransitRoutesHubAnalytics$PresentationType transitRoutesHubAnalytics$PresentationType = new TransitRoutesHubAnalytics$PresentationType("List", 0, "list");
        List = transitRoutesHubAnalytics$PresentationType;
        TransitRoutesHubAnalytics$PresentationType transitRoutesHubAnalytics$PresentationType2 = new TransitRoutesHubAnalytics$PresentationType("Table", 1, "table");
        Table = transitRoutesHubAnalytics$PresentationType2;
        TransitRoutesHubAnalytics$PresentationType[] transitRoutesHubAnalytics$PresentationTypeArr = {transitRoutesHubAnalytics$PresentationType, transitRoutesHubAnalytics$PresentationType2};
        $VALUES = transitRoutesHubAnalytics$PresentationTypeArr;
        $ENTRIES = a.a(transitRoutesHubAnalytics$PresentationTypeArr);
    }

    public TransitRoutesHubAnalytics$PresentationType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static TransitRoutesHubAnalytics$PresentationType valueOf(String str) {
        return (TransitRoutesHubAnalytics$PresentationType) Enum.valueOf(TransitRoutesHubAnalytics$PresentationType.class, str);
    }

    public static TransitRoutesHubAnalytics$PresentationType[] values() {
        return (TransitRoutesHubAnalytics$PresentationType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
