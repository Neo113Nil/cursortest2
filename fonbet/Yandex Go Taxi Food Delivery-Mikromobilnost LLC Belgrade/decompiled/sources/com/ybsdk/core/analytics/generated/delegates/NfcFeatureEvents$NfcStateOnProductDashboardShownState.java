package com.ybsdk.core.analytics.generated.delegates;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/NfcFeatureEvents$NfcStateOnProductDashboardShownState", "", "Lcom/ybsdk/core/analytics/generated/delegates/NfcFeatureEvents$NfcStateOnProductDashboardShownState;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", "REQUIRE_PERMISSIONS", "READY_FOR_TOKENIZATION", "TOKENIZATION_IN_PROGRESS", "READY_FOR_PAY", "ENABLE_ADAPTER_FOR_PAY", "ERROR_SDK", "VIOLATED_DEVICE", "FROZEN", "ARRESTED", "HIDDEN", "UPGRADE_SPLIT", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NfcFeatureEvents$NfcStateOnProductDashboardShownState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NfcFeatureEvents$NfcStateOnProductDashboardShownState[] $VALUES;
    private final String originalValue;
    public static final NfcFeatureEvents$NfcStateOnProductDashboardShownState REQUIRE_PERMISSIONS = new NfcFeatureEvents$NfcStateOnProductDashboardShownState("REQUIRE_PERMISSIONS", 0, "require_permissions");
    public static final NfcFeatureEvents$NfcStateOnProductDashboardShownState READY_FOR_TOKENIZATION = new NfcFeatureEvents$NfcStateOnProductDashboardShownState("READY_FOR_TOKENIZATION", 1, "ready_for_tokenization");
    public static final NfcFeatureEvents$NfcStateOnProductDashboardShownState TOKENIZATION_IN_PROGRESS = new NfcFeatureEvents$NfcStateOnProductDashboardShownState("TOKENIZATION_IN_PROGRESS", 2, "tokenization_in_progress");
    public static final NfcFeatureEvents$NfcStateOnProductDashboardShownState READY_FOR_PAY = new NfcFeatureEvents$NfcStateOnProductDashboardShownState("READY_FOR_PAY", 3, "ready_for_pay");
    public static final NfcFeatureEvents$NfcStateOnProductDashboardShownState ENABLE_ADAPTER_FOR_PAY = new NfcFeatureEvents$NfcStateOnProductDashboardShownState("ENABLE_ADAPTER_FOR_PAY", 4, "enable_adapter_for_pay");
    public static final NfcFeatureEvents$NfcStateOnProductDashboardShownState ERROR_SDK = new NfcFeatureEvents$NfcStateOnProductDashboardShownState("ERROR_SDK", 5, "error_sdk");
    public static final NfcFeatureEvents$NfcStateOnProductDashboardShownState VIOLATED_DEVICE = new NfcFeatureEvents$NfcStateOnProductDashboardShownState("VIOLATED_DEVICE", 6, "violated_device");
    public static final NfcFeatureEvents$NfcStateOnProductDashboardShownState FROZEN = new NfcFeatureEvents$NfcStateOnProductDashboardShownState("FROZEN", 7, "frozen");
    public static final NfcFeatureEvents$NfcStateOnProductDashboardShownState ARRESTED = new NfcFeatureEvents$NfcStateOnProductDashboardShownState("ARRESTED", 8, "arrested");
    public static final NfcFeatureEvents$NfcStateOnProductDashboardShownState HIDDEN = new NfcFeatureEvents$NfcStateOnProductDashboardShownState("HIDDEN", 9, "hidden");
    public static final NfcFeatureEvents$NfcStateOnProductDashboardShownState UPGRADE_SPLIT = new NfcFeatureEvents$NfcStateOnProductDashboardShownState("UPGRADE_SPLIT", 10, "upgrade_split");

    private static final /* synthetic */ NfcFeatureEvents$NfcStateOnProductDashboardShownState[] $values() {
        return new NfcFeatureEvents$NfcStateOnProductDashboardShownState[]{REQUIRE_PERMISSIONS, READY_FOR_TOKENIZATION, TOKENIZATION_IN_PROGRESS, READY_FOR_PAY, ENABLE_ADAPTER_FOR_PAY, ERROR_SDK, VIOLATED_DEVICE, FROZEN, ARRESTED, HIDDEN, UPGRADE_SPLIT};
    }

    static {
        NfcFeatureEvents$NfcStateOnProductDashboardShownState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private NfcFeatureEvents$NfcStateOnProductDashboardShownState(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static NfcFeatureEvents$NfcStateOnProductDashboardShownState valueOf(String str) {
        return (NfcFeatureEvents$NfcStateOnProductDashboardShownState) Enum.valueOf(NfcFeatureEvents$NfcStateOnProductDashboardShownState.class, str);
    }

    public static NfcFeatureEvents$NfcStateOnProductDashboardShownState[] values() {
        return (NfcFeatureEvents$NfcStateOnProductDashboardShownState[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
