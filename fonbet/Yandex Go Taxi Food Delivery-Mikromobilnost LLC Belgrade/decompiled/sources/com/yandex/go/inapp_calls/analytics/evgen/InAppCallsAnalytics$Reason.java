package com.yandex.go.inapp_calls.analytics.evgen;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/inapp_calls/analytics/evgen/InAppCallsAnalytics$Reason", "", "Lcom/yandex/go/inapp_calls/analytics/evgen/InAppCallsAnalytics$Reason;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "OutgoingCall", "Notification", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class InAppCallsAnalytics$Reason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ InAppCallsAnalytics$Reason[] $VALUES;
    public static final InAppCallsAnalytics$Reason Notification;
    public static final InAppCallsAnalytics$Reason OutgoingCall;
    private final String eventValue;

    static {
        InAppCallsAnalytics$Reason inAppCallsAnalytics$Reason = new InAppCallsAnalytics$Reason("OutgoingCall", 0, "outgoing_call");
        OutgoingCall = inAppCallsAnalytics$Reason;
        InAppCallsAnalytics$Reason inAppCallsAnalytics$Reason2 = new InAppCallsAnalytics$Reason("Notification", 1, "notification");
        Notification = inAppCallsAnalytics$Reason2;
        InAppCallsAnalytics$Reason[] inAppCallsAnalytics$ReasonArr = {inAppCallsAnalytics$Reason, inAppCallsAnalytics$Reason2};
        $VALUES = inAppCallsAnalytics$ReasonArr;
        $ENTRIES = a.a(inAppCallsAnalytics$ReasonArr);
    }

    public InAppCallsAnalytics$Reason(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static InAppCallsAnalytics$Reason valueOf(String str) {
        return (InAppCallsAnalytics$Reason) Enum.valueOf(InAppCallsAnalytics$Reason.class, str);
    }

    public static InAppCallsAnalytics$Reason[] values() {
        return (InAppCallsAnalytics$Reason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
