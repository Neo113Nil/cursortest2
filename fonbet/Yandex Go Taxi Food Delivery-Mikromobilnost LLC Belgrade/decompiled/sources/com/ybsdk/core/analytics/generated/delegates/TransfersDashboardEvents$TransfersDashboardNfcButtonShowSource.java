package com.ybsdk.core.analytics.generated.delegates;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/TransfersDashboardEvents$TransfersDashboardNfcButtonShowSource", "", "Lcom/ybsdk/core/analytics/generated/delegates/TransfersDashboardEvents$TransfersDashboardNfcButtonShowSource;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", "PRO", "WALLET", "CORP_CARD", "CREDIT_LIMIT", "UNKNOWN", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransfersDashboardEvents$TransfersDashboardNfcButtonShowSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransfersDashboardEvents$TransfersDashboardNfcButtonShowSource[] $VALUES;
    private final String originalValue;
    public static final TransfersDashboardEvents$TransfersDashboardNfcButtonShowSource PRO = new TransfersDashboardEvents$TransfersDashboardNfcButtonShowSource("PRO", 0, "pro");
    public static final TransfersDashboardEvents$TransfersDashboardNfcButtonShowSource WALLET = new TransfersDashboardEvents$TransfersDashboardNfcButtonShowSource("WALLET", 1, "wallet");
    public static final TransfersDashboardEvents$TransfersDashboardNfcButtonShowSource CORP_CARD = new TransfersDashboardEvents$TransfersDashboardNfcButtonShowSource("CORP_CARD", 2, "corp_card");
    public static final TransfersDashboardEvents$TransfersDashboardNfcButtonShowSource CREDIT_LIMIT = new TransfersDashboardEvents$TransfersDashboardNfcButtonShowSource("CREDIT_LIMIT", 3, "credit_limit");
    public static final TransfersDashboardEvents$TransfersDashboardNfcButtonShowSource UNKNOWN = new TransfersDashboardEvents$TransfersDashboardNfcButtonShowSource("UNKNOWN", 4, "unknown");

    private static final /* synthetic */ TransfersDashboardEvents$TransfersDashboardNfcButtonShowSource[] $values() {
        return new TransfersDashboardEvents$TransfersDashboardNfcButtonShowSource[]{PRO, WALLET, CORP_CARD, CREDIT_LIMIT, UNKNOWN};
    }

    static {
        TransfersDashboardEvents$TransfersDashboardNfcButtonShowSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private TransfersDashboardEvents$TransfersDashboardNfcButtonShowSource(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static TransfersDashboardEvents$TransfersDashboardNfcButtonShowSource valueOf(String str) {
        return (TransfersDashboardEvents$TransfersDashboardNfcButtonShowSource) Enum.valueOf(TransfersDashboardEvents$TransfersDashboardNfcButtonShowSource.class, str);
    }

    public static TransfersDashboardEvents$TransfersDashboardNfcButtonShowSource[] values() {
        return (TransfersDashboardEvents$TransfersDashboardNfcButtonShowSource[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
