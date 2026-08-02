package com.yandex.go.payments.api.interactor;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/payments/api/interactor/BankPaymentsDepositType;", "", "EXACT_AMOUNT", "ORDER_AMOUNT", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BankPaymentsDepositType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BankPaymentsDepositType[] $VALUES;
    public static final BankPaymentsDepositType EXACT_AMOUNT;
    public static final BankPaymentsDepositType ORDER_AMOUNT;

    static {
        BankPaymentsDepositType bankPaymentsDepositType = new BankPaymentsDepositType("EXACT_AMOUNT", 0);
        EXACT_AMOUNT = bankPaymentsDepositType;
        BankPaymentsDepositType bankPaymentsDepositType2 = new BankPaymentsDepositType("ORDER_AMOUNT", 1);
        ORDER_AMOUNT = bankPaymentsDepositType2;
        BankPaymentsDepositType[] bankPaymentsDepositTypeArr = {bankPaymentsDepositType, bankPaymentsDepositType2};
        $VALUES = bankPaymentsDepositTypeArr;
        $ENTRIES = a.a(bankPaymentsDepositTypeArr);
    }

    public static BankPaymentsDepositType valueOf(String str) {
        return (BankPaymentsDepositType) Enum.valueOf(BankPaymentsDepositType.class, str);
    }

    public static BankPaymentsDepositType[] values() {
        return (BankPaymentsDepositType[]) $VALUES.clone();
    }
}
