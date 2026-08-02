package com.yandex.go.taxi.summary.mobilityhub.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/taxi/summary/mobilityhub/analytics/TransitRoutesHubAnalytics$TransportCardStatus", "", "Lcom/yandex/go/taxi/summary/mobilityhub/analytics/TransitRoutesHubAnalytics$TransportCardStatus;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", CA20Status.STATUS_USER_DESCRIPTION_A, "Blocked", "Advertisement", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TransitRoutesHubAnalytics$TransportCardStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransitRoutesHubAnalytics$TransportCardStatus[] $VALUES;
    public static final TransitRoutesHubAnalytics$TransportCardStatus Active;
    public static final TransitRoutesHubAnalytics$TransportCardStatus Advertisement;
    public static final TransitRoutesHubAnalytics$TransportCardStatus Blocked;
    private final String eventValue;

    static {
        TransitRoutesHubAnalytics$TransportCardStatus transitRoutesHubAnalytics$TransportCardStatus = new TransitRoutesHubAnalytics$TransportCardStatus(CA20Status.STATUS_USER_DESCRIPTION_A, 0, ClidProvider.APP_ACTIVE);
        Active = transitRoutesHubAnalytics$TransportCardStatus;
        TransitRoutesHubAnalytics$TransportCardStatus transitRoutesHubAnalytics$TransportCardStatus2 = new TransitRoutesHubAnalytics$TransportCardStatus("Blocked", 1, "blocked");
        Blocked = transitRoutesHubAnalytics$TransportCardStatus2;
        TransitRoutesHubAnalytics$TransportCardStatus transitRoutesHubAnalytics$TransportCardStatus3 = new TransitRoutesHubAnalytics$TransportCardStatus("Advertisement", 2, "advertisement");
        Advertisement = transitRoutesHubAnalytics$TransportCardStatus3;
        TransitRoutesHubAnalytics$TransportCardStatus[] transitRoutesHubAnalytics$TransportCardStatusArr = {transitRoutesHubAnalytics$TransportCardStatus, transitRoutesHubAnalytics$TransportCardStatus2, transitRoutesHubAnalytics$TransportCardStatus3};
        $VALUES = transitRoutesHubAnalytics$TransportCardStatusArr;
        $ENTRIES = a.a(transitRoutesHubAnalytics$TransportCardStatusArr);
    }

    public TransitRoutesHubAnalytics$TransportCardStatus(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static TransitRoutesHubAnalytics$TransportCardStatus valueOf(String str) {
        return (TransitRoutesHubAnalytics$TransportCardStatus) Enum.valueOf(TransitRoutesHubAnalytics$TransportCardStatus.class, str);
    }

    public static TransitRoutesHubAnalytics$TransportCardStatus[] values() {
        return (TransitRoutesHubAnalytics$TransportCardStatus[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
