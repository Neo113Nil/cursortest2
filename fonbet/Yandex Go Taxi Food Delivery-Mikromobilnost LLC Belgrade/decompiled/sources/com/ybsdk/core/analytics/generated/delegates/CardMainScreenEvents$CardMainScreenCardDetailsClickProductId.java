package com.ybsdk.core.analytics.generated.delegates;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/CardMainScreenEvents$CardMainScreenCardDetailsClickProductId", "", "Lcom/ybsdk/core/analytics/generated/delegates/CardMainScreenEvents$CardMainScreenCardDetailsClickProductId;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", "WALLET", "PRO", "CREDLIM", "SPLIT", "UNKNOWN", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CardMainScreenEvents$CardMainScreenCardDetailsClickProductId {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CardMainScreenEvents$CardMainScreenCardDetailsClickProductId[] $VALUES;
    private final String originalValue;
    public static final CardMainScreenEvents$CardMainScreenCardDetailsClickProductId WALLET = new CardMainScreenEvents$CardMainScreenCardDetailsClickProductId("WALLET", 0, "wallet");
    public static final CardMainScreenEvents$CardMainScreenCardDetailsClickProductId PRO = new CardMainScreenEvents$CardMainScreenCardDetailsClickProductId("PRO", 1, "pro");
    public static final CardMainScreenEvents$CardMainScreenCardDetailsClickProductId CREDLIM = new CardMainScreenEvents$CardMainScreenCardDetailsClickProductId("CREDLIM", 2, "credlim");
    public static final CardMainScreenEvents$CardMainScreenCardDetailsClickProductId SPLIT = new CardMainScreenEvents$CardMainScreenCardDetailsClickProductId("SPLIT", 3, "split");
    public static final CardMainScreenEvents$CardMainScreenCardDetailsClickProductId UNKNOWN = new CardMainScreenEvents$CardMainScreenCardDetailsClickProductId("UNKNOWN", 4, "unknown");

    private static final /* synthetic */ CardMainScreenEvents$CardMainScreenCardDetailsClickProductId[] $values() {
        return new CardMainScreenEvents$CardMainScreenCardDetailsClickProductId[]{WALLET, PRO, CREDLIM, SPLIT, UNKNOWN};
    }

    static {
        CardMainScreenEvents$CardMainScreenCardDetailsClickProductId[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private CardMainScreenEvents$CardMainScreenCardDetailsClickProductId(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static CardMainScreenEvents$CardMainScreenCardDetailsClickProductId valueOf(String str) {
        return (CardMainScreenEvents$CardMainScreenCardDetailsClickProductId) Enum.valueOf(CardMainScreenEvents$CardMainScreenCardDetailsClickProductId.class, str);
    }

    public static CardMainScreenEvents$CardMainScreenCardDetailsClickProductId[] values() {
        return (CardMainScreenEvents$CardMainScreenCardDetailsClickProductId[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
