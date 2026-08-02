package com.ybsdk.feature.transactions.api.entities;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/feature/transactions/api/entities/TransactionsState;", "", "<init>", "(Ljava/lang/String;I)V", "IDLE", "ERROR", "LOADING", "feature-transactions-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransactionsState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransactionsState[] $VALUES;
    public static final TransactionsState IDLE = new TransactionsState("IDLE", 0);
    public static final TransactionsState ERROR = new TransactionsState("ERROR", 1);
    public static final TransactionsState LOADING = new TransactionsState("LOADING", 2);

    private static final /* synthetic */ TransactionsState[] $values() {
        return new TransactionsState[]{IDLE, ERROR, LOADING};
    }

    static {
        TransactionsState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private TransactionsState(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static TransactionsState valueOf(String str) {
        return (TransactionsState) Enum.valueOf(TransactionsState.class, str);
    }

    public static TransactionsState[] values() {
        return (TransactionsState[]) $VALUES.clone();
    }
}
