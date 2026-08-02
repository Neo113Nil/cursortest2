package com.ybsdk.feature.transactions.api.entities;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/transactions/api/entities/TransactionsListShimmerType;", "", "<init>", "(Ljava/lang/String;I)V", "SHORT", "FULL", "feature-transactions-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransactionsListShimmerType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransactionsListShimmerType[] $VALUES;
    public static final TransactionsListShimmerType SHORT = new TransactionsListShimmerType("SHORT", 0);
    public static final TransactionsListShimmerType FULL = new TransactionsListShimmerType("FULL", 1);

    private static final /* synthetic */ TransactionsListShimmerType[] $values() {
        return new TransactionsListShimmerType[]{SHORT, FULL};
    }

    static {
        TransactionsListShimmerType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private TransactionsListShimmerType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static TransactionsListShimmerType valueOf(String str) {
        return (TransactionsListShimmerType) Enum.valueOf(TransactionsListShimmerType.class, str);
    }

    public static TransactionsListShimmerType[] values() {
        return (TransactionsListShimmerType[]) $VALUES.clone();
    }
}
