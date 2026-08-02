package com.ybsdk.core.analytics.generated.delegates;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/TransferEvents$TransferScenarioCloseStatus", "", "Lcom/ybsdk/core/analytics/generated/delegates/TransferEvents$TransferScenarioCloseStatus;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", "SETUP", "PROCESSING", "CHALLENGE", "ERROR", "SUCCESS", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransferEvents$TransferScenarioCloseStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransferEvents$TransferScenarioCloseStatus[] $VALUES;
    private final String originalValue;
    public static final TransferEvents$TransferScenarioCloseStatus SETUP = new TransferEvents$TransferScenarioCloseStatus("SETUP", 0, "setup");
    public static final TransferEvents$TransferScenarioCloseStatus PROCESSING = new TransferEvents$TransferScenarioCloseStatus("PROCESSING", 1, "processing");
    public static final TransferEvents$TransferScenarioCloseStatus CHALLENGE = new TransferEvents$TransferScenarioCloseStatus("CHALLENGE", 2, "challenge");
    public static final TransferEvents$TransferScenarioCloseStatus ERROR = new TransferEvents$TransferScenarioCloseStatus("ERROR", 3, "error");
    public static final TransferEvents$TransferScenarioCloseStatus SUCCESS = new TransferEvents$TransferScenarioCloseStatus("SUCCESS", 4, "success");

    private static final /* synthetic */ TransferEvents$TransferScenarioCloseStatus[] $values() {
        return new TransferEvents$TransferScenarioCloseStatus[]{SETUP, PROCESSING, CHALLENGE, ERROR, SUCCESS};
    }

    static {
        TransferEvents$TransferScenarioCloseStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private TransferEvents$TransferScenarioCloseStatus(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static TransferEvents$TransferScenarioCloseStatus valueOf(String str) {
        return (TransferEvents$TransferScenarioCloseStatus) Enum.valueOf(TransferEvents$TransferScenarioCloseStatus.class, str);
    }

    public static TransferEvents$TransferScenarioCloseStatus[] values() {
        return (TransferEvents$TransferScenarioCloseStatus[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
