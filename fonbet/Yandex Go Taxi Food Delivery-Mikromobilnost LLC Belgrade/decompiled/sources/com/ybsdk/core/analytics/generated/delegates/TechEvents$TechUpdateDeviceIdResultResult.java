package com.ybsdk.core.analytics.generated.delegates;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/TechEvents$TechUpdateDeviceIdResultResult", "", "Lcom/ybsdk/core/analytics/generated/delegates/TechEvents$TechUpdateDeviceIdResultResult;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", "FAILED_TO_GET_FROM_METRICA", "USE_METRICA_NO_UID", "USE_FROM_AM_STASH", "USE_FROM_OTHER_APP_PIN", "USE_METRICA", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TechEvents$TechUpdateDeviceIdResultResult {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TechEvents$TechUpdateDeviceIdResultResult[] $VALUES;
    private final String originalValue;
    public static final TechEvents$TechUpdateDeviceIdResultResult FAILED_TO_GET_FROM_METRICA = new TechEvents$TechUpdateDeviceIdResultResult("FAILED_TO_GET_FROM_METRICA", 0, "failed_to_get_from_metrica");
    public static final TechEvents$TechUpdateDeviceIdResultResult USE_METRICA_NO_UID = new TechEvents$TechUpdateDeviceIdResultResult("USE_METRICA_NO_UID", 1, "use_metrica_no_uid");
    public static final TechEvents$TechUpdateDeviceIdResultResult USE_FROM_AM_STASH = new TechEvents$TechUpdateDeviceIdResultResult("USE_FROM_AM_STASH", 2, "use_from_am_stash");
    public static final TechEvents$TechUpdateDeviceIdResultResult USE_FROM_OTHER_APP_PIN = new TechEvents$TechUpdateDeviceIdResultResult("USE_FROM_OTHER_APP_PIN", 3, "use_from_other_app_pin");
    public static final TechEvents$TechUpdateDeviceIdResultResult USE_METRICA = new TechEvents$TechUpdateDeviceIdResultResult("USE_METRICA", 4, "use_metrica");

    private static final /* synthetic */ TechEvents$TechUpdateDeviceIdResultResult[] $values() {
        return new TechEvents$TechUpdateDeviceIdResultResult[]{FAILED_TO_GET_FROM_METRICA, USE_METRICA_NO_UID, USE_FROM_AM_STASH, USE_FROM_OTHER_APP_PIN, USE_METRICA};
    }

    static {
        TechEvents$TechUpdateDeviceIdResultResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private TechEvents$TechUpdateDeviceIdResultResult(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static TechEvents$TechUpdateDeviceIdResultResult valueOf(String str) {
        return (TechEvents$TechUpdateDeviceIdResultResult) Enum.valueOf(TechEvents$TechUpdateDeviceIdResultResult.class, str);
    }

    public static TechEvents$TechUpdateDeviceIdResultResult[] values() {
        return (TechEvents$TechUpdateDeviceIdResultResult[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
