package com.yandex.go.taxi.summary.shared.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/go/taxi/summary/shared/analytics/TrapModeCloseReason;", "", "", "analyticsName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "BACK_BUTTON", "ORDER", "UNKNOWN", "shared"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TrapModeCloseReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TrapModeCloseReason[] $VALUES;
    public static final TrapModeCloseReason BACK_BUTTON;
    public static final TrapModeCloseReason ORDER;
    public static final TrapModeCloseReason UNKNOWN;
    private final String analyticsName;

    static {
        TrapModeCloseReason trapModeCloseReason = new TrapModeCloseReason("BACK_BUTTON", 0, "back_button");
        BACK_BUTTON = trapModeCloseReason;
        TrapModeCloseReason trapModeCloseReason2 = new TrapModeCloseReason("ORDER", 1, "order");
        ORDER = trapModeCloseReason2;
        TrapModeCloseReason trapModeCloseReason3 = new TrapModeCloseReason("UNKNOWN", 2, "unknown");
        UNKNOWN = trapModeCloseReason3;
        TrapModeCloseReason[] trapModeCloseReasonArr = {trapModeCloseReason, trapModeCloseReason2, trapModeCloseReason3};
        $VALUES = trapModeCloseReasonArr;
        $ENTRIES = a.a(trapModeCloseReasonArr);
    }

    public TrapModeCloseReason(String str, int i, String str2) {
        this.analyticsName = str2;
    }

    public static TrapModeCloseReason valueOf(String str) {
        return (TrapModeCloseReason) Enum.valueOf(TrapModeCloseReason.class, str);
    }

    public static TrapModeCloseReason[] values() {
        return (TrapModeCloseReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }
}
