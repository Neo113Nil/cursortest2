package com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/fintechsdk/features/bdui/internal/presentation/customview/cardinput/analytics/DynamicBinInfoAnalyticsResetReason;", "", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "CARD_CLEARED", "PREFIX_CHANGED", "MANUAL_RESET", "TIMEOUT_WAIT_FOR_BIN_INFO", "features-bdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DynamicBinInfoAnalyticsResetReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DynamicBinInfoAnalyticsResetReason[] $VALUES;
    public static final DynamicBinInfoAnalyticsResetReason CARD_CLEARED;
    public static final DynamicBinInfoAnalyticsResetReason MANUAL_RESET;
    public static final DynamicBinInfoAnalyticsResetReason PREFIX_CHANGED;
    public static final DynamicBinInfoAnalyticsResetReason TIMEOUT_WAIT_FOR_BIN_INFO;
    private final String value;

    static {
        DynamicBinInfoAnalyticsResetReason dynamicBinInfoAnalyticsResetReason = new DynamicBinInfoAnalyticsResetReason("CARD_CLEARED", 0, "card_cleared");
        CARD_CLEARED = dynamicBinInfoAnalyticsResetReason;
        DynamicBinInfoAnalyticsResetReason dynamicBinInfoAnalyticsResetReason2 = new DynamicBinInfoAnalyticsResetReason("PREFIX_CHANGED", 1, "prefix_changed");
        PREFIX_CHANGED = dynamicBinInfoAnalyticsResetReason2;
        DynamicBinInfoAnalyticsResetReason dynamicBinInfoAnalyticsResetReason3 = new DynamicBinInfoAnalyticsResetReason("MANUAL_RESET", 2, "manual_reset");
        MANUAL_RESET = dynamicBinInfoAnalyticsResetReason3;
        DynamicBinInfoAnalyticsResetReason dynamicBinInfoAnalyticsResetReason4 = new DynamicBinInfoAnalyticsResetReason("TIMEOUT_WAIT_FOR_BIN_INFO", 3, "timeout_wait_for_bin_info");
        TIMEOUT_WAIT_FOR_BIN_INFO = dynamicBinInfoAnalyticsResetReason4;
        DynamicBinInfoAnalyticsResetReason[] dynamicBinInfoAnalyticsResetReasonArr = {dynamicBinInfoAnalyticsResetReason, dynamicBinInfoAnalyticsResetReason2, dynamicBinInfoAnalyticsResetReason3, dynamicBinInfoAnalyticsResetReason4};
        $VALUES = dynamicBinInfoAnalyticsResetReasonArr;
        $ENTRIES = a.a(dynamicBinInfoAnalyticsResetReasonArr);
    }

    public DynamicBinInfoAnalyticsResetReason(String str, int i, String str2) {
        this.value = str2;
    }

    public static DynamicBinInfoAnalyticsResetReason valueOf(String str) {
        return (DynamicBinInfoAnalyticsResetReason) Enum.valueOf(DynamicBinInfoAnalyticsResetReason.class, str);
    }

    public static DynamicBinInfoAnalyticsResetReason[] values() {
        return (DynamicBinInfoAnalyticsResetReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
