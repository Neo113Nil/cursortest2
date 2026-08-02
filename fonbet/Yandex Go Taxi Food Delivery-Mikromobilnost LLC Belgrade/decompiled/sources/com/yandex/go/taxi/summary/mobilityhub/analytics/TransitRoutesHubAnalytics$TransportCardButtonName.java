package com.yandex.go.taxi.summary.mobilityhub.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/taxi/summary/mobilityhub/analytics/TransitRoutesHubAnalytics$TransportCardButtonName", "", "Lcom/yandex/go/taxi/summary/mobilityhub/analytics/TransitRoutesHubAnalytics$TransportCardButtonName;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "TopUp", "Manage", "AddCard", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TransitRoutesHubAnalytics$TransportCardButtonName {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransitRoutesHubAnalytics$TransportCardButtonName[] $VALUES;
    public static final TransitRoutesHubAnalytics$TransportCardButtonName AddCard;
    public static final TransitRoutesHubAnalytics$TransportCardButtonName Manage;
    public static final TransitRoutesHubAnalytics$TransportCardButtonName TopUp;
    private final String eventValue;

    static {
        TransitRoutesHubAnalytics$TransportCardButtonName transitRoutesHubAnalytics$TransportCardButtonName = new TransitRoutesHubAnalytics$TransportCardButtonName("TopUp", 0, "top_up");
        TopUp = transitRoutesHubAnalytics$TransportCardButtonName;
        TransitRoutesHubAnalytics$TransportCardButtonName transitRoutesHubAnalytics$TransportCardButtonName2 = new TransitRoutesHubAnalytics$TransportCardButtonName("Manage", 1, "manage");
        Manage = transitRoutesHubAnalytics$TransportCardButtonName2;
        TransitRoutesHubAnalytics$TransportCardButtonName transitRoutesHubAnalytics$TransportCardButtonName3 = new TransitRoutesHubAnalytics$TransportCardButtonName("AddCard", 2, "add_card");
        AddCard = transitRoutesHubAnalytics$TransportCardButtonName3;
        TransitRoutesHubAnalytics$TransportCardButtonName[] transitRoutesHubAnalytics$TransportCardButtonNameArr = {transitRoutesHubAnalytics$TransportCardButtonName, transitRoutesHubAnalytics$TransportCardButtonName2, transitRoutesHubAnalytics$TransportCardButtonName3};
        $VALUES = transitRoutesHubAnalytics$TransportCardButtonNameArr;
        $ENTRIES = a.a(transitRoutesHubAnalytics$TransportCardButtonNameArr);
    }

    public TransitRoutesHubAnalytics$TransportCardButtonName(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static TransitRoutesHubAnalytics$TransportCardButtonName valueOf(String str) {
        return (TransitRoutesHubAnalytics$TransportCardButtonName) Enum.valueOf(TransitRoutesHubAnalytics$TransportCardButtonName.class, str);
    }

    public static TransitRoutesHubAnalytics$TransportCardButtonName[] values() {
        return (TransitRoutesHubAnalytics$TransportCardButtonName[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
