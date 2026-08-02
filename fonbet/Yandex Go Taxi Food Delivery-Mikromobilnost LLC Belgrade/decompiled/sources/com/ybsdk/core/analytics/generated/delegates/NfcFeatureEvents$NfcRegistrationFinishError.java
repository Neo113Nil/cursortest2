package com.ybsdk.core.analytics.generated.delegates;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/NfcFeatureEvents$NfcRegistrationFinishError", "", "Lcom/ybsdk/core/analytics/generated/delegates/NfcFeatureEvents$NfcRegistrationFinishError;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", "ALREADY_REGISTERED", "SETUP_NOT_COMPLETED", "SECURITY_ERROR", "NO_DATA_ERROR", "INTERNAL_ERROR", "UNKNOWN", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class NfcFeatureEvents$NfcRegistrationFinishError {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NfcFeatureEvents$NfcRegistrationFinishError[] $VALUES;
    private final String originalValue;
    public static final NfcFeatureEvents$NfcRegistrationFinishError ALREADY_REGISTERED = new NfcFeatureEvents$NfcRegistrationFinishError("ALREADY_REGISTERED", 0, "already_registered");
    public static final NfcFeatureEvents$NfcRegistrationFinishError SETUP_NOT_COMPLETED = new NfcFeatureEvents$NfcRegistrationFinishError("SETUP_NOT_COMPLETED", 1, "setup_not_completed");
    public static final NfcFeatureEvents$NfcRegistrationFinishError SECURITY_ERROR = new NfcFeatureEvents$NfcRegistrationFinishError("SECURITY_ERROR", 2, "security_error");
    public static final NfcFeatureEvents$NfcRegistrationFinishError NO_DATA_ERROR = new NfcFeatureEvents$NfcRegistrationFinishError("NO_DATA_ERROR", 3, "no_data_error");
    public static final NfcFeatureEvents$NfcRegistrationFinishError INTERNAL_ERROR = new NfcFeatureEvents$NfcRegistrationFinishError("INTERNAL_ERROR", 4, "internal_error");
    public static final NfcFeatureEvents$NfcRegistrationFinishError UNKNOWN = new NfcFeatureEvents$NfcRegistrationFinishError("UNKNOWN", 5, "unknown");

    private static final /* synthetic */ NfcFeatureEvents$NfcRegistrationFinishError[] $values() {
        return new NfcFeatureEvents$NfcRegistrationFinishError[]{ALREADY_REGISTERED, SETUP_NOT_COMPLETED, SECURITY_ERROR, NO_DATA_ERROR, INTERNAL_ERROR, UNKNOWN};
    }

    static {
        NfcFeatureEvents$NfcRegistrationFinishError[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private NfcFeatureEvents$NfcRegistrationFinishError(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static NfcFeatureEvents$NfcRegistrationFinishError valueOf(String str) {
        return (NfcFeatureEvents$NfcRegistrationFinishError) Enum.valueOf(NfcFeatureEvents$NfcRegistrationFinishError.class, str);
    }

    public static NfcFeatureEvents$NfcRegistrationFinishError[] values() {
        return (NfcFeatureEvents$NfcRegistrationFinishError[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
