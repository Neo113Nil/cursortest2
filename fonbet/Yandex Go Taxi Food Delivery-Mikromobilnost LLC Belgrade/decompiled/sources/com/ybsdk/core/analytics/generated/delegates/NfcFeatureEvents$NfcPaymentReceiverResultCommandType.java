package com.ybsdk.core.analytics.generated.delegates;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/NfcFeatureEvents$NfcPaymentReceiverResultCommandType", "", "Lcom/ybsdk/core/analytics/generated/delegates/NfcFeatureEvents$NfcPaymentReceiverResultCommandType;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", "SELECT", "READ_RECORD", "GET_DATA", "VERIFY", "PERFORM_TRANSACTION", "GET_PROCESSING_OPTIONS", "GENERATE_AC", "DISCONNECT", "UNSPECIFIED", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NfcFeatureEvents$NfcPaymentReceiverResultCommandType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NfcFeatureEvents$NfcPaymentReceiverResultCommandType[] $VALUES;
    private final String originalValue;
    public static final NfcFeatureEvents$NfcPaymentReceiverResultCommandType SELECT = new NfcFeatureEvents$NfcPaymentReceiverResultCommandType("SELECT", 0, "select");
    public static final NfcFeatureEvents$NfcPaymentReceiverResultCommandType READ_RECORD = new NfcFeatureEvents$NfcPaymentReceiverResultCommandType("READ_RECORD", 1, "read_record");
    public static final NfcFeatureEvents$NfcPaymentReceiverResultCommandType GET_DATA = new NfcFeatureEvents$NfcPaymentReceiverResultCommandType("GET_DATA", 2, "get_data");
    public static final NfcFeatureEvents$NfcPaymentReceiverResultCommandType VERIFY = new NfcFeatureEvents$NfcPaymentReceiverResultCommandType("VERIFY", 3, "verify");
    public static final NfcFeatureEvents$NfcPaymentReceiverResultCommandType PERFORM_TRANSACTION = new NfcFeatureEvents$NfcPaymentReceiverResultCommandType("PERFORM_TRANSACTION", 4, "perform_transaction");
    public static final NfcFeatureEvents$NfcPaymentReceiverResultCommandType GET_PROCESSING_OPTIONS = new NfcFeatureEvents$NfcPaymentReceiverResultCommandType("GET_PROCESSING_OPTIONS", 5, "get_processing_options");
    public static final NfcFeatureEvents$NfcPaymentReceiverResultCommandType GENERATE_AC = new NfcFeatureEvents$NfcPaymentReceiverResultCommandType("GENERATE_AC", 6, "generate_ac");
    public static final NfcFeatureEvents$NfcPaymentReceiverResultCommandType DISCONNECT = new NfcFeatureEvents$NfcPaymentReceiverResultCommandType("DISCONNECT", 7, "disconnect");
    public static final NfcFeatureEvents$NfcPaymentReceiverResultCommandType UNSPECIFIED = new NfcFeatureEvents$NfcPaymentReceiverResultCommandType("UNSPECIFIED", 8, "unspecified");

    private static final /* synthetic */ NfcFeatureEvents$NfcPaymentReceiverResultCommandType[] $values() {
        return new NfcFeatureEvents$NfcPaymentReceiverResultCommandType[]{SELECT, READ_RECORD, GET_DATA, VERIFY, PERFORM_TRANSACTION, GET_PROCESSING_OPTIONS, GENERATE_AC, DISCONNECT, UNSPECIFIED};
    }

    static {
        NfcFeatureEvents$NfcPaymentReceiverResultCommandType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private NfcFeatureEvents$NfcPaymentReceiverResultCommandType(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static NfcFeatureEvents$NfcPaymentReceiverResultCommandType valueOf(String str) {
        return (NfcFeatureEvents$NfcPaymentReceiverResultCommandType) Enum.valueOf(NfcFeatureEvents$NfcPaymentReceiverResultCommandType.class, str);
    }

    public static NfcFeatureEvents$NfcPaymentReceiverResultCommandType[] values() {
        return (NfcFeatureEvents$NfcPaymentReceiverResultCommandType[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
