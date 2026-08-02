package com.yandex.go.scooters.analytics;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import org.webrtc.PeerConnectionFactory;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/scooters/analytics/ScootersOfferCardAnalytics$SubscriptionPromoblockToggleState", "", "Lcom/yandex/go/scooters/analytics/ScootersOfferCardAnalytics$SubscriptionPromoblockToggleState;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", PeerConnectionFactory.TRIAL_ENABLED, "Disabled", "go-client-android.features.scooters:analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersOfferCardAnalytics$SubscriptionPromoblockToggleState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersOfferCardAnalytics$SubscriptionPromoblockToggleState[] $VALUES;
    public static final ScootersOfferCardAnalytics$SubscriptionPromoblockToggleState Disabled;
    public static final ScootersOfferCardAnalytics$SubscriptionPromoblockToggleState Enabled;
    private final String eventValue;

    static {
        ScootersOfferCardAnalytics$SubscriptionPromoblockToggleState scootersOfferCardAnalytics$SubscriptionPromoblockToggleState = new ScootersOfferCardAnalytics$SubscriptionPromoblockToggleState(PeerConnectionFactory.TRIAL_ENABLED, 0, BackendConfig.Restrictions.ENABLED);
        Enabled = scootersOfferCardAnalytics$SubscriptionPromoblockToggleState;
        ScootersOfferCardAnalytics$SubscriptionPromoblockToggleState scootersOfferCardAnalytics$SubscriptionPromoblockToggleState2 = new ScootersOfferCardAnalytics$SubscriptionPromoblockToggleState("Disabled", 1, BackendConfig.Restrictions.DISABLED);
        Disabled = scootersOfferCardAnalytics$SubscriptionPromoblockToggleState2;
        ScootersOfferCardAnalytics$SubscriptionPromoblockToggleState[] scootersOfferCardAnalytics$SubscriptionPromoblockToggleStateArr = {scootersOfferCardAnalytics$SubscriptionPromoblockToggleState, scootersOfferCardAnalytics$SubscriptionPromoblockToggleState2};
        $VALUES = scootersOfferCardAnalytics$SubscriptionPromoblockToggleStateArr;
        $ENTRIES = a.a(scootersOfferCardAnalytics$SubscriptionPromoblockToggleStateArr);
    }

    public ScootersOfferCardAnalytics$SubscriptionPromoblockToggleState(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ScootersOfferCardAnalytics$SubscriptionPromoblockToggleState valueOf(String str) {
        return (ScootersOfferCardAnalytics$SubscriptionPromoblockToggleState) Enum.valueOf(ScootersOfferCardAnalytics$SubscriptionPromoblockToggleState.class, str);
    }

    public static ScootersOfferCardAnalytics$SubscriptionPromoblockToggleState[] values() {
        return (ScootersOfferCardAnalytics$SubscriptionPromoblockToggleState[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
