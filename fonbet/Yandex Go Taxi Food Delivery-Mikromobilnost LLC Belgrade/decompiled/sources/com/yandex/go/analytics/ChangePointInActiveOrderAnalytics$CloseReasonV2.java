package com.yandex.go.analytics;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/yandex/go/analytics/ChangePointInActiveOrderAnalytics$CloseReasonV2", "", "Lcom/yandex/go/analytics/ChangePointInActiveOrderAnalytics$CloseReasonV2;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "CheckFailed", "CheckUnavailable", "ConfirmUnavailable", "PollingStarted", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ChangePointInActiveOrderAnalytics$CloseReasonV2 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChangePointInActiveOrderAnalytics$CloseReasonV2[] $VALUES;
    public static final ChangePointInActiveOrderAnalytics$CloseReasonV2 CheckFailed;
    public static final ChangePointInActiveOrderAnalytics$CloseReasonV2 CheckUnavailable;
    public static final ChangePointInActiveOrderAnalytics$CloseReasonV2 ConfirmUnavailable;
    public static final ChangePointInActiveOrderAnalytics$CloseReasonV2 PollingStarted;
    private final String eventValue;

    static {
        ChangePointInActiveOrderAnalytics$CloseReasonV2 changePointInActiveOrderAnalytics$CloseReasonV2 = new ChangePointInActiveOrderAnalytics$CloseReasonV2("CheckFailed", 0, "check_failed");
        CheckFailed = changePointInActiveOrderAnalytics$CloseReasonV2;
        ChangePointInActiveOrderAnalytics$CloseReasonV2 changePointInActiveOrderAnalytics$CloseReasonV22 = new ChangePointInActiveOrderAnalytics$CloseReasonV2("CheckUnavailable", 1, "check_unavailable");
        CheckUnavailable = changePointInActiveOrderAnalytics$CloseReasonV22;
        ChangePointInActiveOrderAnalytics$CloseReasonV2 changePointInActiveOrderAnalytics$CloseReasonV23 = new ChangePointInActiveOrderAnalytics$CloseReasonV2("ConfirmUnavailable", 2, "confirm_unavailable");
        ConfirmUnavailable = changePointInActiveOrderAnalytics$CloseReasonV23;
        ChangePointInActiveOrderAnalytics$CloseReasonV2 changePointInActiveOrderAnalytics$CloseReasonV24 = new ChangePointInActiveOrderAnalytics$CloseReasonV2("PollingStarted", 3, "polling_started");
        PollingStarted = changePointInActiveOrderAnalytics$CloseReasonV24;
        ChangePointInActiveOrderAnalytics$CloseReasonV2[] changePointInActiveOrderAnalytics$CloseReasonV2Arr = {changePointInActiveOrderAnalytics$CloseReasonV2, changePointInActiveOrderAnalytics$CloseReasonV22, changePointInActiveOrderAnalytics$CloseReasonV23, changePointInActiveOrderAnalytics$CloseReasonV24};
        $VALUES = changePointInActiveOrderAnalytics$CloseReasonV2Arr;
        $ENTRIES = kotlin.enums.a.a(changePointInActiveOrderAnalytics$CloseReasonV2Arr);
    }

    public ChangePointInActiveOrderAnalytics$CloseReasonV2(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ChangePointInActiveOrderAnalytics$CloseReasonV2 valueOf(String str) {
        return (ChangePointInActiveOrderAnalytics$CloseReasonV2) Enum.valueOf(ChangePointInActiveOrderAnalytics$CloseReasonV2.class, str);
    }

    public static ChangePointInActiveOrderAnalytics$CloseReasonV2[] values() {
        return (ChangePointInActiveOrderAnalytics$CloseReasonV2[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
