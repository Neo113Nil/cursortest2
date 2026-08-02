package com.yandex.go.safety.center.analytics;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/safety/center/analytics/SafetyCenterAnalytics$ShareNotificationButtonType", "", "Lcom/yandex/go/safety/center/analytics/SafetyCenterAnalytics$ShareNotificationButtonType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Cancel", "Repeat", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SafetyCenterAnalytics$ShareNotificationButtonType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SafetyCenterAnalytics$ShareNotificationButtonType[] $VALUES;
    public static final SafetyCenterAnalytics$ShareNotificationButtonType Cancel;
    public static final SafetyCenterAnalytics$ShareNotificationButtonType Repeat;
    private final String eventValue;

    static {
        SafetyCenterAnalytics$ShareNotificationButtonType safetyCenterAnalytics$ShareNotificationButtonType = new SafetyCenterAnalytics$ShareNotificationButtonType("Cancel", 0, "cancel");
        Cancel = safetyCenterAnalytics$ShareNotificationButtonType;
        SafetyCenterAnalytics$ShareNotificationButtonType safetyCenterAnalytics$ShareNotificationButtonType2 = new SafetyCenterAnalytics$ShareNotificationButtonType("Repeat", 1, "repeat");
        Repeat = safetyCenterAnalytics$ShareNotificationButtonType2;
        SafetyCenterAnalytics$ShareNotificationButtonType[] safetyCenterAnalytics$ShareNotificationButtonTypeArr = {safetyCenterAnalytics$ShareNotificationButtonType, safetyCenterAnalytics$ShareNotificationButtonType2};
        $VALUES = safetyCenterAnalytics$ShareNotificationButtonTypeArr;
        $ENTRIES = kotlin.enums.a.a(safetyCenterAnalytics$ShareNotificationButtonTypeArr);
    }

    public SafetyCenterAnalytics$ShareNotificationButtonType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static SafetyCenterAnalytics$ShareNotificationButtonType valueOf(String str) {
        return (SafetyCenterAnalytics$ShareNotificationButtonType) Enum.valueOf(SafetyCenterAnalytics$ShareNotificationButtonType.class, str);
    }

    public static SafetyCenterAnalytics$ShareNotificationButtonType[] values() {
        return (SafetyCenterAnalytics$ShareNotificationButtonType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
