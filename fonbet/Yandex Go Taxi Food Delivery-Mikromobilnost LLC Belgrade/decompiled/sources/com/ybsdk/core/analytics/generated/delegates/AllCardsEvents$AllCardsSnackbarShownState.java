package com.ybsdk.core.analytics.generated.delegates;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/AllCardsEvents$AllCardsSnackbarShownState", "", "Lcom/ybsdk/core/analytics/generated/delegates/AllCardsEvents$AllCardsSnackbarShownState;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", "PROCESSING", "SUCCESS", "ERROR_LINKING", "ERROR_UNLINKING", "UNLINKED", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AllCardsEvents$AllCardsSnackbarShownState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AllCardsEvents$AllCardsSnackbarShownState[] $VALUES;
    private final String originalValue;
    public static final AllCardsEvents$AllCardsSnackbarShownState PROCESSING = new AllCardsEvents$AllCardsSnackbarShownState("PROCESSING", 0, "processing");
    public static final AllCardsEvents$AllCardsSnackbarShownState SUCCESS = new AllCardsEvents$AllCardsSnackbarShownState("SUCCESS", 1, "success");
    public static final AllCardsEvents$AllCardsSnackbarShownState ERROR_LINKING = new AllCardsEvents$AllCardsSnackbarShownState("ERROR_LINKING", 2, "error_linking");
    public static final AllCardsEvents$AllCardsSnackbarShownState ERROR_UNLINKING = new AllCardsEvents$AllCardsSnackbarShownState("ERROR_UNLINKING", 3, "error_unlinking");
    public static final AllCardsEvents$AllCardsSnackbarShownState UNLINKED = new AllCardsEvents$AllCardsSnackbarShownState("UNLINKED", 4, "unlinked");

    private static final /* synthetic */ AllCardsEvents$AllCardsSnackbarShownState[] $values() {
        return new AllCardsEvents$AllCardsSnackbarShownState[]{PROCESSING, SUCCESS, ERROR_LINKING, ERROR_UNLINKING, UNLINKED};
    }

    static {
        AllCardsEvents$AllCardsSnackbarShownState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private AllCardsEvents$AllCardsSnackbarShownState(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static AllCardsEvents$AllCardsSnackbarShownState valueOf(String str) {
        return (AllCardsEvents$AllCardsSnackbarShownState) Enum.valueOf(AllCardsEvents$AllCardsSnackbarShownState.class, str);
    }

    public static AllCardsEvents$AllCardsSnackbarShownState[] values() {
        return (AllCardsEvents$AllCardsSnackbarShownState[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
