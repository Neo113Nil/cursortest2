package com.yandex.go.safety.center.analytics;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/yandex/go/safety/center/analytics/SafetyCenterEventsReporter$AntifraudEvent", "", "Lcom/yandex/go/safety/center/analytics/SafetyCenterEventsReporter$AntifraudEvent;", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "TrustedContactsShareTapped", "ShareRouteShown", "ShareRouteContactTapped", "EmergencyShown", "EmergencyCallTapped", "EmergencyAlertContactsSwitch", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final class SafetyCenterEventsReporter$AntifraudEvent {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SafetyCenterEventsReporter$AntifraudEvent[] $VALUES;
    public static final SafetyCenterEventsReporter$AntifraudEvent EmergencyAlertContactsSwitch;
    public static final SafetyCenterEventsReporter$AntifraudEvent EmergencyCallTapped;
    public static final SafetyCenterEventsReporter$AntifraudEvent EmergencyShown;
    public static final SafetyCenterEventsReporter$AntifraudEvent ShareRouteContactTapped;
    public static final SafetyCenterEventsReporter$AntifraudEvent ShareRouteShown;
    public static final SafetyCenterEventsReporter$AntifraudEvent TrustedContactsShareTapped;
    private final String value;

    static {
        SafetyCenterEventsReporter$AntifraudEvent safetyCenterEventsReporter$AntifraudEvent = new SafetyCenterEventsReporter$AntifraudEvent("TrustedContactsShareTapped", 0, "SafetyCenter.TrustedContacts.ShareTapped");
        TrustedContactsShareTapped = safetyCenterEventsReporter$AntifraudEvent;
        SafetyCenterEventsReporter$AntifraudEvent safetyCenterEventsReporter$AntifraudEvent2 = new SafetyCenterEventsReporter$AntifraudEvent("ShareRouteShown", 1, "SafetyCenter.ShareRoute.Shown");
        ShareRouteShown = safetyCenterEventsReporter$AntifraudEvent2;
        SafetyCenterEventsReporter$AntifraudEvent safetyCenterEventsReporter$AntifraudEvent3 = new SafetyCenterEventsReporter$AntifraudEvent("ShareRouteContactTapped", 2, "SafetyCenter.ShareRoute.ContactTapped");
        ShareRouteContactTapped = safetyCenterEventsReporter$AntifraudEvent3;
        SafetyCenterEventsReporter$AntifraudEvent safetyCenterEventsReporter$AntifraudEvent4 = new SafetyCenterEventsReporter$AntifraudEvent("EmergencyShown", 3, "SafetyCenter.Emergency.Shown");
        EmergencyShown = safetyCenterEventsReporter$AntifraudEvent4;
        SafetyCenterEventsReporter$AntifraudEvent safetyCenterEventsReporter$AntifraudEvent5 = new SafetyCenterEventsReporter$AntifraudEvent("EmergencyCallTapped", 4, "SafetyCenter.Emergency.CallTapped");
        EmergencyCallTapped = safetyCenterEventsReporter$AntifraudEvent5;
        SafetyCenterEventsReporter$AntifraudEvent safetyCenterEventsReporter$AntifraudEvent6 = new SafetyCenterEventsReporter$AntifraudEvent("EmergencyAlertContactsSwitch", 5, "SafetyCenter.Emergency.AlertContactsSwitch");
        EmergencyAlertContactsSwitch = safetyCenterEventsReporter$AntifraudEvent6;
        SafetyCenterEventsReporter$AntifraudEvent[] safetyCenterEventsReporter$AntifraudEventArr = {safetyCenterEventsReporter$AntifraudEvent, safetyCenterEventsReporter$AntifraudEvent2, safetyCenterEventsReporter$AntifraudEvent3, safetyCenterEventsReporter$AntifraudEvent4, safetyCenterEventsReporter$AntifraudEvent5, safetyCenterEventsReporter$AntifraudEvent6};
        $VALUES = safetyCenterEventsReporter$AntifraudEventArr;
        $ENTRIES = kotlin.enums.a.a(safetyCenterEventsReporter$AntifraudEventArr);
    }

    public SafetyCenterEventsReporter$AntifraudEvent(String str, int i, String str2) {
        this.value = str2;
    }

    public static SafetyCenterEventsReporter$AntifraudEvent valueOf(String str) {
        return (SafetyCenterEventsReporter$AntifraudEvent) Enum.valueOf(SafetyCenterEventsReporter$AntifraudEvent.class, str);
    }

    public static SafetyCenterEventsReporter$AntifraudEvent[] values() {
        return (SafetyCenterEventsReporter$AntifraudEvent[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
