package com.ybsdk.feature.transactions.api.dto;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ybsdk/feature/transactions/api/dto/TransactionStatusCode;", "", "<init>", "(Ljava/lang/String;I)V", "CLEAR", "HOLD", "FAIL", "CANCEL", "feature-transactions-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TransactionStatusCode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransactionStatusCode[] $VALUES;
    public static final TransactionStatusCode CLEAR = new TransactionStatusCode("CLEAR", 0);
    public static final TransactionStatusCode HOLD = new TransactionStatusCode("HOLD", 1);
    public static final TransactionStatusCode FAIL = new TransactionStatusCode("FAIL", 2);
    public static final TransactionStatusCode CANCEL = new TransactionStatusCode("CANCEL", 3);

    private static final /* synthetic */ TransactionStatusCode[] $values() {
        return new TransactionStatusCode[]{CLEAR, HOLD, FAIL, CANCEL};
    }

    static {
        TransactionStatusCode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private TransactionStatusCode(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static TransactionStatusCode valueOf(String str) {
        return (TransactionStatusCode) Enum.valueOf(TransactionStatusCode.class, str);
    }

    public static TransactionStatusCode[] values() {
        return (TransactionStatusCode[]) $VALUES.clone();
    }
}
