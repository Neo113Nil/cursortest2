package com.ybsdk.core.analytics.generated.delegates;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/CardCommonEvents$CardReissueDeletionScreenResultErrorType", "", "Lcom/ybsdk/core/analytics/generated/delegates/CardCommonEvents$CardReissueDeletionScreenResultErrorType;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", "SET_STATE", "NETWORK_ERROR", "SERVER_ERROR", "ANTIFRAUD", "UNKNOWN", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CardCommonEvents$CardReissueDeletionScreenResultErrorType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CardCommonEvents$CardReissueDeletionScreenResultErrorType[] $VALUES;
    private final String originalValue;
    public static final CardCommonEvents$CardReissueDeletionScreenResultErrorType SET_STATE = new CardCommonEvents$CardReissueDeletionScreenResultErrorType("SET_STATE", 0, "set_state");
    public static final CardCommonEvents$CardReissueDeletionScreenResultErrorType NETWORK_ERROR = new CardCommonEvents$CardReissueDeletionScreenResultErrorType("NETWORK_ERROR", 1, "network_error");
    public static final CardCommonEvents$CardReissueDeletionScreenResultErrorType SERVER_ERROR = new CardCommonEvents$CardReissueDeletionScreenResultErrorType("SERVER_ERROR", 2, "server_error");
    public static final CardCommonEvents$CardReissueDeletionScreenResultErrorType ANTIFRAUD = new CardCommonEvents$CardReissueDeletionScreenResultErrorType("ANTIFRAUD", 3, "antifraud");
    public static final CardCommonEvents$CardReissueDeletionScreenResultErrorType UNKNOWN = new CardCommonEvents$CardReissueDeletionScreenResultErrorType("UNKNOWN", 4, "unknown");

    private static final /* synthetic */ CardCommonEvents$CardReissueDeletionScreenResultErrorType[] $values() {
        return new CardCommonEvents$CardReissueDeletionScreenResultErrorType[]{SET_STATE, NETWORK_ERROR, SERVER_ERROR, ANTIFRAUD, UNKNOWN};
    }

    static {
        CardCommonEvents$CardReissueDeletionScreenResultErrorType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private CardCommonEvents$CardReissueDeletionScreenResultErrorType(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static CardCommonEvents$CardReissueDeletionScreenResultErrorType valueOf(String str) {
        return (CardCommonEvents$CardReissueDeletionScreenResultErrorType) Enum.valueOf(CardCommonEvents$CardReissueDeletionScreenResultErrorType.class, str);
    }

    public static CardCommonEvents$CardReissueDeletionScreenResultErrorType[] values() {
        return (CardCommonEvents$CardReissueDeletionScreenResultErrorType[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
