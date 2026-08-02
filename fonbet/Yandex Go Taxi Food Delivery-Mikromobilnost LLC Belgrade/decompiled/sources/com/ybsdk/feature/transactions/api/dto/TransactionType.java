package com.ybsdk.feature.transactions.api.dto;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/ybsdk/feature/transactions/api/dto/TransactionType;", "", "<init>", "(Ljava/lang/String;I)V", "PURCHASE", "TRANSFER_OUT", "REFUND", "TOPUP", "TRANSFER_IN", "CASH_WITHDRAWAL", "UNKNOWN", "feature-transactions-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TransactionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransactionType[] $VALUES;
    public static final TransactionType PURCHASE = new TransactionType("PURCHASE", 0);
    public static final TransactionType TRANSFER_OUT = new TransactionType("TRANSFER_OUT", 1);
    public static final TransactionType REFUND = new TransactionType("REFUND", 2);
    public static final TransactionType TOPUP = new TransactionType("TOPUP", 3);
    public static final TransactionType TRANSFER_IN = new TransactionType("TRANSFER_IN", 4);
    public static final TransactionType CASH_WITHDRAWAL = new TransactionType("CASH_WITHDRAWAL", 5);
    public static final TransactionType UNKNOWN = new TransactionType("UNKNOWN", 6);

    private static final /* synthetic */ TransactionType[] $values() {
        return new TransactionType[]{PURCHASE, TRANSFER_OUT, REFUND, TOPUP, TRANSFER_IN, CASH_WITHDRAWAL, UNKNOWN};
    }

    static {
        TransactionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private TransactionType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static TransactionType valueOf(String str) {
        return (TransactionType) Enum.valueOf(TransactionType.class, str);
    }

    public static TransactionType[] values() {
        return (TransactionType[]) $VALUES.clone();
    }
}
