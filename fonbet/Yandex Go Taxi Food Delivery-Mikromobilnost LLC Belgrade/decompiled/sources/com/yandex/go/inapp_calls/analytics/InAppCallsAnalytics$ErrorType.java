package com.yandex.go.inapp_calls.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/yandex/go/inapp_calls/analytics/InAppCallsAnalytics$ErrorType", "", "Lcom/yandex/go/inapp_calls/analytics/InAppCallsAnalytics$ErrorType;", "", "analyticsName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "NOT_SUCCEEDED", "DYNAMIC_FEATURE_LOAD", "RESUME_NOT_LOADED_ERROR", "INCOMING_NOT_LOADED_ERROR", "UPDATE_NOTIFICATION_UNAVAILABLE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class InAppCallsAnalytics$ErrorType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ InAppCallsAnalytics$ErrorType[] $VALUES;
    public static final InAppCallsAnalytics$ErrorType DYNAMIC_FEATURE_LOAD;
    public static final InAppCallsAnalytics$ErrorType INCOMING_NOT_LOADED_ERROR;
    public static final InAppCallsAnalytics$ErrorType NOT_SUCCEEDED;
    public static final InAppCallsAnalytics$ErrorType RESUME_NOT_LOADED_ERROR;
    public static final InAppCallsAnalytics$ErrorType UPDATE_NOTIFICATION_UNAVAILABLE;
    private final String analyticsName;

    static {
        InAppCallsAnalytics$ErrorType inAppCallsAnalytics$ErrorType = new InAppCallsAnalytics$ErrorType("NOT_SUCCEEDED", 0, "NotSucceeded");
        NOT_SUCCEEDED = inAppCallsAnalytics$ErrorType;
        InAppCallsAnalytics$ErrorType inAppCallsAnalytics$ErrorType2 = new InAppCallsAnalytics$ErrorType("DYNAMIC_FEATURE_LOAD", 1, "DynamicFeatureLoad");
        DYNAMIC_FEATURE_LOAD = inAppCallsAnalytics$ErrorType2;
        InAppCallsAnalytics$ErrorType inAppCallsAnalytics$ErrorType3 = new InAppCallsAnalytics$ErrorType("RESUME_NOT_LOADED_ERROR", 2, "ResumeNotLoadedError");
        RESUME_NOT_LOADED_ERROR = inAppCallsAnalytics$ErrorType3;
        InAppCallsAnalytics$ErrorType inAppCallsAnalytics$ErrorType4 = new InAppCallsAnalytics$ErrorType("INCOMING_NOT_LOADED_ERROR", 3, "IncomingNotLoadedError");
        INCOMING_NOT_LOADED_ERROR = inAppCallsAnalytics$ErrorType4;
        InAppCallsAnalytics$ErrorType inAppCallsAnalytics$ErrorType5 = new InAppCallsAnalytics$ErrorType("UPDATE_NOTIFICATION_UNAVAILABLE", 4, "UpdateNotificationUnavailable");
        UPDATE_NOTIFICATION_UNAVAILABLE = inAppCallsAnalytics$ErrorType5;
        InAppCallsAnalytics$ErrorType[] inAppCallsAnalytics$ErrorTypeArr = {inAppCallsAnalytics$ErrorType, inAppCallsAnalytics$ErrorType2, inAppCallsAnalytics$ErrorType3, inAppCallsAnalytics$ErrorType4, inAppCallsAnalytics$ErrorType5};
        $VALUES = inAppCallsAnalytics$ErrorTypeArr;
        $ENTRIES = a.a(inAppCallsAnalytics$ErrorTypeArr);
    }

    public InAppCallsAnalytics$ErrorType(String str, int i, String str2) {
        this.analyticsName = str2;
    }

    public static InAppCallsAnalytics$ErrorType valueOf(String str) {
        return (InAppCallsAnalytics$ErrorType) Enum.valueOf(InAppCallsAnalytics$ErrorType.class, str);
    }

    public static InAppCallsAnalytics$ErrorType[] values() {
        return (InAppCallsAnalytics$ErrorType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }
}
