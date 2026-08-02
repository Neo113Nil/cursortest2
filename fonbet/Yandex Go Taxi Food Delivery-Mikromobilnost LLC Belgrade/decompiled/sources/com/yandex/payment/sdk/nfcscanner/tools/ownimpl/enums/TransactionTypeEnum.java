package com.yandex.payment.sdk.nfcscanner.tools.ownimpl.enums;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/payment/sdk/nfcscanner/tools/ownimpl/enums/TransactionTypeEnum;", "", "", "", "key", CA20Status.STATUS_USER_I, "a", "()I", "PURCHASE", "CASH_ADVANCE", "CASHBACK", "REFUND", "nfcscanner_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TransactionTypeEnum {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransactionTypeEnum[] $VALUES;
    public static final TransactionTypeEnum CASHBACK;
    public static final TransactionTypeEnum CASH_ADVANCE;
    public static final TransactionTypeEnum PURCHASE;
    public static final TransactionTypeEnum REFUND;
    private final int key;

    static {
        TransactionTypeEnum transactionTypeEnum = new TransactionTypeEnum("PURCHASE", 0, 0);
        PURCHASE = transactionTypeEnum;
        TransactionTypeEnum transactionTypeEnum2 = new TransactionTypeEnum("CASH_ADVANCE", 1, 1);
        CASH_ADVANCE = transactionTypeEnum2;
        TransactionTypeEnum transactionTypeEnum3 = new TransactionTypeEnum("CASHBACK", 2, 9);
        CASHBACK = transactionTypeEnum3;
        TransactionTypeEnum transactionTypeEnum4 = new TransactionTypeEnum("REFUND", 3, 32);
        REFUND = transactionTypeEnum4;
        TransactionTypeEnum[] transactionTypeEnumArr = {transactionTypeEnum, transactionTypeEnum2, transactionTypeEnum3, transactionTypeEnum4};
        $VALUES = transactionTypeEnumArr;
        $ENTRIES = a.a(transactionTypeEnumArr);
    }

    public TransactionTypeEnum(String str, int i, int i2) {
        this.key = i2;
    }

    public static TransactionTypeEnum valueOf(String str) {
        return (TransactionTypeEnum) Enum.valueOf(TransactionTypeEnum.class, str);
    }

    public static TransactionTypeEnum[] values() {
        return (TransactionTypeEnum[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getKey() {
        return this.key;
    }
}
