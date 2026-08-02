package com.yandex.go.safety.center.analytics;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/safety/center/analytics/SafetyCenterAnalytics$EmergencyCallStatus", "", "Lcom/yandex/go/safety/center/analytics/SafetyCenterAnalytics$EmergencyCallStatus;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "WaitForAnswer", "Connected", "Ended", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SafetyCenterAnalytics$EmergencyCallStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SafetyCenterAnalytics$EmergencyCallStatus[] $VALUES;
    public static final SafetyCenterAnalytics$EmergencyCallStatus Connected;
    public static final SafetyCenterAnalytics$EmergencyCallStatus Ended;
    public static final SafetyCenterAnalytics$EmergencyCallStatus WaitForAnswer;
    private final String eventValue;

    static {
        SafetyCenterAnalytics$EmergencyCallStatus safetyCenterAnalytics$EmergencyCallStatus = new SafetyCenterAnalytics$EmergencyCallStatus("WaitForAnswer", 0, "wait_for_answer");
        WaitForAnswer = safetyCenterAnalytics$EmergencyCallStatus;
        SafetyCenterAnalytics$EmergencyCallStatus safetyCenterAnalytics$EmergencyCallStatus2 = new SafetyCenterAnalytics$EmergencyCallStatus("Connected", 1, "connected");
        Connected = safetyCenterAnalytics$EmergencyCallStatus2;
        SafetyCenterAnalytics$EmergencyCallStatus safetyCenterAnalytics$EmergencyCallStatus3 = new SafetyCenterAnalytics$EmergencyCallStatus("Ended", 2, "ended");
        Ended = safetyCenterAnalytics$EmergencyCallStatus3;
        SafetyCenterAnalytics$EmergencyCallStatus[] safetyCenterAnalytics$EmergencyCallStatusArr = {safetyCenterAnalytics$EmergencyCallStatus, safetyCenterAnalytics$EmergencyCallStatus2, safetyCenterAnalytics$EmergencyCallStatus3};
        $VALUES = safetyCenterAnalytics$EmergencyCallStatusArr;
        $ENTRIES = kotlin.enums.a.a(safetyCenterAnalytics$EmergencyCallStatusArr);
    }

    public SafetyCenterAnalytics$EmergencyCallStatus(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static SafetyCenterAnalytics$EmergencyCallStatus valueOf(String str) {
        return (SafetyCenterAnalytics$EmergencyCallStatus) Enum.valueOf(SafetyCenterAnalytics$EmergencyCallStatus.class, str);
    }

    public static SafetyCenterAnalytics$EmergencyCallStatus[] values() {
        return (SafetyCenterAnalytics$EmergencyCallStatus[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
