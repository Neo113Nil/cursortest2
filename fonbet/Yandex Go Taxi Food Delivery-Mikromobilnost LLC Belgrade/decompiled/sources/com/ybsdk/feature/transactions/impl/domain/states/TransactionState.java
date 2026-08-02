package com.ybsdk.feature.transactions.impl.domain.states;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/ybsdk/feature/transactions/impl/domain/states/TransactionState;", "", "<init>", "(Ljava/lang/String;I)V", "NORMAL", "SUCCESS", "ERROR", "PROCESSING", "CANCEL", "feature-transactions-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransactionState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransactionState[] $VALUES;
    public static final TransactionState NORMAL = new TransactionState("NORMAL", 0);
    public static final TransactionState SUCCESS = new TransactionState("SUCCESS", 1);
    public static final TransactionState ERROR = new TransactionState("ERROR", 2);
    public static final TransactionState PROCESSING = new TransactionState("PROCESSING", 3);
    public static final TransactionState CANCEL = new TransactionState("CANCEL", 4);

    private static final /* synthetic */ TransactionState[] $values() {
        return new TransactionState[]{NORMAL, SUCCESS, ERROR, PROCESSING, CANCEL};
    }

    static {
        TransactionState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private TransactionState(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static TransactionState valueOf(String str) {
        return (TransactionState) Enum.valueOf(TransactionState.class, str);
    }

    public static TransactionState[] values() {
        return (TransactionState[]) $VALUES.clone();
    }
}
