package com.yandex.go.safety.center.analytics;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/safety/center/analytics/SafetyCenterAnalytics$EmergencyCallScenario", "", "Lcom/yandex/go/safety/center/analytics/SafetyCenterAnalytics$EmergencyCallScenario;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Emergency", "Accident", "Instructions", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SafetyCenterAnalytics$EmergencyCallScenario {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SafetyCenterAnalytics$EmergencyCallScenario[] $VALUES;
    public static final SafetyCenterAnalytics$EmergencyCallScenario Accident;
    public static final SafetyCenterAnalytics$EmergencyCallScenario Emergency;
    public static final SafetyCenterAnalytics$EmergencyCallScenario Instructions;
    private final String eventValue;

    static {
        SafetyCenterAnalytics$EmergencyCallScenario safetyCenterAnalytics$EmergencyCallScenario = new SafetyCenterAnalytics$EmergencyCallScenario("Emergency", 0, "emergency");
        Emergency = safetyCenterAnalytics$EmergencyCallScenario;
        SafetyCenterAnalytics$EmergencyCallScenario safetyCenterAnalytics$EmergencyCallScenario2 = new SafetyCenterAnalytics$EmergencyCallScenario("Accident", 1, "accident");
        Accident = safetyCenterAnalytics$EmergencyCallScenario2;
        SafetyCenterAnalytics$EmergencyCallScenario safetyCenterAnalytics$EmergencyCallScenario3 = new SafetyCenterAnalytics$EmergencyCallScenario("Instructions", 2, "instructions");
        Instructions = safetyCenterAnalytics$EmergencyCallScenario3;
        SafetyCenterAnalytics$EmergencyCallScenario[] safetyCenterAnalytics$EmergencyCallScenarioArr = {safetyCenterAnalytics$EmergencyCallScenario, safetyCenterAnalytics$EmergencyCallScenario2, safetyCenterAnalytics$EmergencyCallScenario3};
        $VALUES = safetyCenterAnalytics$EmergencyCallScenarioArr;
        $ENTRIES = kotlin.enums.a.a(safetyCenterAnalytics$EmergencyCallScenarioArr);
    }

    public SafetyCenterAnalytics$EmergencyCallScenario(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static SafetyCenterAnalytics$EmergencyCallScenario valueOf(String str) {
        return (SafetyCenterAnalytics$EmergencyCallScenario) Enum.valueOf(SafetyCenterAnalytics$EmergencyCallScenario.class, str);
    }

    public static SafetyCenterAnalytics$EmergencyCallScenario[] values() {
        return (SafetyCenterAnalytics$EmergencyCallScenario[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
