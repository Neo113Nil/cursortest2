package com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/fintechsdk/features/bdui/internal/presentation/customview/cardinput/analytics/DynamicBinInfoAnalyticsStaticDataReason;", "", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "FEATURE_DISABLED", "NO_REQUEST_MADE", "OTHER", "features-bdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DynamicBinInfoAnalyticsStaticDataReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DynamicBinInfoAnalyticsStaticDataReason[] $VALUES;
    public static final DynamicBinInfoAnalyticsStaticDataReason FEATURE_DISABLED;
    public static final DynamicBinInfoAnalyticsStaticDataReason NO_REQUEST_MADE;
    public static final DynamicBinInfoAnalyticsStaticDataReason OTHER;
    private final String value;

    static {
        DynamicBinInfoAnalyticsStaticDataReason dynamicBinInfoAnalyticsStaticDataReason = new DynamicBinInfoAnalyticsStaticDataReason("FEATURE_DISABLED", 0, "feature_disabled");
        FEATURE_DISABLED = dynamicBinInfoAnalyticsStaticDataReason;
        DynamicBinInfoAnalyticsStaticDataReason dynamicBinInfoAnalyticsStaticDataReason2 = new DynamicBinInfoAnalyticsStaticDataReason("NO_REQUEST_MADE", 1, "no_request_made");
        NO_REQUEST_MADE = dynamicBinInfoAnalyticsStaticDataReason2;
        DynamicBinInfoAnalyticsStaticDataReason dynamicBinInfoAnalyticsStaticDataReason3 = new DynamicBinInfoAnalyticsStaticDataReason("OTHER", 2, "other");
        OTHER = dynamicBinInfoAnalyticsStaticDataReason3;
        DynamicBinInfoAnalyticsStaticDataReason[] dynamicBinInfoAnalyticsStaticDataReasonArr = {dynamicBinInfoAnalyticsStaticDataReason, dynamicBinInfoAnalyticsStaticDataReason2, dynamicBinInfoAnalyticsStaticDataReason3};
        $VALUES = dynamicBinInfoAnalyticsStaticDataReasonArr;
        $ENTRIES = a.a(dynamicBinInfoAnalyticsStaticDataReasonArr);
    }

    public DynamicBinInfoAnalyticsStaticDataReason(String str, int i, String str2) {
        this.value = str2;
    }

    public static DynamicBinInfoAnalyticsStaticDataReason valueOf(String str) {
        return (DynamicBinInfoAnalyticsStaticDataReason) Enum.valueOf(DynamicBinInfoAnalyticsStaticDataReason.class, str);
    }

    public static DynamicBinInfoAnalyticsStaticDataReason[] values() {
        return (DynamicBinInfoAnalyticsStaticDataReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
