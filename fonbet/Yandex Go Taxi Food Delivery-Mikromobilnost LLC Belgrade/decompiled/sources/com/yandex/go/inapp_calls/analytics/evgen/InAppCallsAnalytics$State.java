package com.yandex.go.inapp_calls.analytics.evgen;

import com.yandex.payment.common.result.ResultType;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/inapp_calls/analytics/evgen/InAppCallsAnalytics$State", "", "Lcom/yandex/go/inapp_calls/analytics/evgen/InAppCallsAnalytics$State;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Loading", "Failed", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class InAppCallsAnalytics$State {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ InAppCallsAnalytics$State[] $VALUES;
    public static final InAppCallsAnalytics$State Failed;
    public static final InAppCallsAnalytics$State Loading;
    private final String eventValue;

    static {
        InAppCallsAnalytics$State inAppCallsAnalytics$State = new InAppCallsAnalytics$State("Loading", 0, ResultType.RESULT_TYPE_LOADING);
        Loading = inAppCallsAnalytics$State;
        InAppCallsAnalytics$State inAppCallsAnalytics$State2 = new InAppCallsAnalytics$State("Failed", 1, "failed");
        Failed = inAppCallsAnalytics$State2;
        InAppCallsAnalytics$State[] inAppCallsAnalytics$StateArr = {inAppCallsAnalytics$State, inAppCallsAnalytics$State2};
        $VALUES = inAppCallsAnalytics$StateArr;
        $ENTRIES = a.a(inAppCallsAnalytics$StateArr);
    }

    public InAppCallsAnalytics$State(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static InAppCallsAnalytics$State valueOf(String str) {
        return (InAppCallsAnalytics$State) Enum.valueOf(InAppCallsAnalytics$State.class, str);
    }

    public static InAppCallsAnalytics$State[] values() {
        return (InAppCallsAnalytics$State[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
