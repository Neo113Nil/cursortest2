package com.yandex.go.inapp_calls.analytics.evgen;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"com/yandex/go/inapp_calls/analytics/evgen/InAppCallsAnalytics$PhoneCallFallbackReason", "", "Lcom/yandex/go/inapp_calls/analytics/evgen/InAppCallsAnalytics$PhoneCallFallbackReason;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "EnabledGeProxyProvisionExperiment", "DisabledInappCallsExperiment", "EmptyForwardingId", "EmptyInappCallEndpoint", "EmptyUserId", "EmptyAuthToken", "CallGoPluginTriggered", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class InAppCallsAnalytics$PhoneCallFallbackReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ InAppCallsAnalytics$PhoneCallFallbackReason[] $VALUES;
    public static final InAppCallsAnalytics$PhoneCallFallbackReason CallGoPluginTriggered;
    public static final InAppCallsAnalytics$PhoneCallFallbackReason DisabledInappCallsExperiment;
    public static final InAppCallsAnalytics$PhoneCallFallbackReason EmptyAuthToken;
    public static final InAppCallsAnalytics$PhoneCallFallbackReason EmptyForwardingId;
    public static final InAppCallsAnalytics$PhoneCallFallbackReason EmptyInappCallEndpoint;
    public static final InAppCallsAnalytics$PhoneCallFallbackReason EmptyUserId;
    public static final InAppCallsAnalytics$PhoneCallFallbackReason EnabledGeProxyProvisionExperiment;
    private final String eventValue;

    static {
        InAppCallsAnalytics$PhoneCallFallbackReason inAppCallsAnalytics$PhoneCallFallbackReason = new InAppCallsAnalytics$PhoneCallFallbackReason("EnabledGeProxyProvisionExperiment", 0, "enabled_ge_proxy_provision_experiment");
        EnabledGeProxyProvisionExperiment = inAppCallsAnalytics$PhoneCallFallbackReason;
        InAppCallsAnalytics$PhoneCallFallbackReason inAppCallsAnalytics$PhoneCallFallbackReason2 = new InAppCallsAnalytics$PhoneCallFallbackReason("DisabledInappCallsExperiment", 1, "disabled_inapp_calls_experiment");
        DisabledInappCallsExperiment = inAppCallsAnalytics$PhoneCallFallbackReason2;
        InAppCallsAnalytics$PhoneCallFallbackReason inAppCallsAnalytics$PhoneCallFallbackReason3 = new InAppCallsAnalytics$PhoneCallFallbackReason("EmptyForwardingId", 2, "empty_forwarding_id");
        EmptyForwardingId = inAppCallsAnalytics$PhoneCallFallbackReason3;
        InAppCallsAnalytics$PhoneCallFallbackReason inAppCallsAnalytics$PhoneCallFallbackReason4 = new InAppCallsAnalytics$PhoneCallFallbackReason("EmptyInappCallEndpoint", 3, "empty_inapp_call_endpoint");
        EmptyInappCallEndpoint = inAppCallsAnalytics$PhoneCallFallbackReason4;
        InAppCallsAnalytics$PhoneCallFallbackReason inAppCallsAnalytics$PhoneCallFallbackReason5 = new InAppCallsAnalytics$PhoneCallFallbackReason("EmptyUserId", 4, "empty_user_id");
        EmptyUserId = inAppCallsAnalytics$PhoneCallFallbackReason5;
        InAppCallsAnalytics$PhoneCallFallbackReason inAppCallsAnalytics$PhoneCallFallbackReason6 = new InAppCallsAnalytics$PhoneCallFallbackReason("EmptyAuthToken", 5, "empty_auth_token");
        EmptyAuthToken = inAppCallsAnalytics$PhoneCallFallbackReason6;
        InAppCallsAnalytics$PhoneCallFallbackReason inAppCallsAnalytics$PhoneCallFallbackReason7 = new InAppCallsAnalytics$PhoneCallFallbackReason("CallGoPluginTriggered", 6, "call_go_plugin_triggered");
        CallGoPluginTriggered = inAppCallsAnalytics$PhoneCallFallbackReason7;
        InAppCallsAnalytics$PhoneCallFallbackReason[] inAppCallsAnalytics$PhoneCallFallbackReasonArr = {inAppCallsAnalytics$PhoneCallFallbackReason, inAppCallsAnalytics$PhoneCallFallbackReason2, inAppCallsAnalytics$PhoneCallFallbackReason3, inAppCallsAnalytics$PhoneCallFallbackReason4, inAppCallsAnalytics$PhoneCallFallbackReason5, inAppCallsAnalytics$PhoneCallFallbackReason6, inAppCallsAnalytics$PhoneCallFallbackReason7};
        $VALUES = inAppCallsAnalytics$PhoneCallFallbackReasonArr;
        $ENTRIES = a.a(inAppCallsAnalytics$PhoneCallFallbackReasonArr);
    }

    public InAppCallsAnalytics$PhoneCallFallbackReason(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static InAppCallsAnalytics$PhoneCallFallbackReason valueOf(String str) {
        return (InAppCallsAnalytics$PhoneCallFallbackReason) Enum.valueOf(InAppCallsAnalytics$PhoneCallFallbackReason.class, str);
    }

    public static InAppCallsAnalytics$PhoneCallFallbackReason[] values() {
        return (InAppCallsAnalytics$PhoneCallFallbackReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
