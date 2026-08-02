package com.ybsdk.core.analytics.generated.delegates;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/NfcFeatureEvents$NfcPaymentReceiverResultError", "", "Lcom/ybsdk/core/analytics/generated/delegates/NfcFeatureEvents$NfcPaymentReceiverResultError;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", "TEMP_ERROR", "PERMANENT_ERROR", "NO_TUKS", "NO_CARD", "NO_PIN", "DISCONNECT_LINK_LOSS", "DISCONNECT_DESELECTED", "SECURITY_ERROR", "UNKNOWN", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NfcFeatureEvents$NfcPaymentReceiverResultError {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NfcFeatureEvents$NfcPaymentReceiverResultError[] $VALUES;
    private final String originalValue;
    public static final NfcFeatureEvents$NfcPaymentReceiverResultError TEMP_ERROR = new NfcFeatureEvents$NfcPaymentReceiverResultError("TEMP_ERROR", 0, "temp_error");
    public static final NfcFeatureEvents$NfcPaymentReceiverResultError PERMANENT_ERROR = new NfcFeatureEvents$NfcPaymentReceiverResultError("PERMANENT_ERROR", 1, "permanent_error");
    public static final NfcFeatureEvents$NfcPaymentReceiverResultError NO_TUKS = new NfcFeatureEvents$NfcPaymentReceiverResultError("NO_TUKS", 2, "no_tuks");
    public static final NfcFeatureEvents$NfcPaymentReceiverResultError NO_CARD = new NfcFeatureEvents$NfcPaymentReceiverResultError("NO_CARD", 3, "no_card");
    public static final NfcFeatureEvents$NfcPaymentReceiverResultError NO_PIN = new NfcFeatureEvents$NfcPaymentReceiverResultError("NO_PIN", 4, "no_pin");
    public static final NfcFeatureEvents$NfcPaymentReceiverResultError DISCONNECT_LINK_LOSS = new NfcFeatureEvents$NfcPaymentReceiverResultError("DISCONNECT_LINK_LOSS", 5, "disconnect_link_loss");
    public static final NfcFeatureEvents$NfcPaymentReceiverResultError DISCONNECT_DESELECTED = new NfcFeatureEvents$NfcPaymentReceiverResultError("DISCONNECT_DESELECTED", 6, "disconnect_deselected");
    public static final NfcFeatureEvents$NfcPaymentReceiverResultError SECURITY_ERROR = new NfcFeatureEvents$NfcPaymentReceiverResultError("SECURITY_ERROR", 7, "security_error");
    public static final NfcFeatureEvents$NfcPaymentReceiverResultError UNKNOWN = new NfcFeatureEvents$NfcPaymentReceiverResultError("UNKNOWN", 8, "unknown");

    private static final /* synthetic */ NfcFeatureEvents$NfcPaymentReceiverResultError[] $values() {
        return new NfcFeatureEvents$NfcPaymentReceiverResultError[]{TEMP_ERROR, PERMANENT_ERROR, NO_TUKS, NO_CARD, NO_PIN, DISCONNECT_LINK_LOSS, DISCONNECT_DESELECTED, SECURITY_ERROR, UNKNOWN};
    }

    static {
        NfcFeatureEvents$NfcPaymentReceiverResultError[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private NfcFeatureEvents$NfcPaymentReceiverResultError(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static NfcFeatureEvents$NfcPaymentReceiverResultError valueOf(String str) {
        return (NfcFeatureEvents$NfcPaymentReceiverResultError) Enum.valueOf(NfcFeatureEvents$NfcPaymentReceiverResultError.class, str);
    }

    public static NfcFeatureEvents$NfcPaymentReceiverResultError[] values() {
        return (NfcFeatureEvents$NfcPaymentReceiverResultError[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
