package com.yandex.go.payments.payment;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/payments/payment/CardPayment$VerifyStrategy", "", "Lcom/yandex/go/payments/payment/CardPayment$VerifyStrategy;", "ANTIFRAUD", "UNKNOWN", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CardPayment$VerifyStrategy {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CardPayment$VerifyStrategy[] $VALUES;
    public static final CardPayment$VerifyStrategy ANTIFRAUD;
    public static final CardPayment$VerifyStrategy UNKNOWN;

    static {
        CardPayment$VerifyStrategy cardPayment$VerifyStrategy = new CardPayment$VerifyStrategy("ANTIFRAUD", 0);
        ANTIFRAUD = cardPayment$VerifyStrategy;
        CardPayment$VerifyStrategy cardPayment$VerifyStrategy2 = new CardPayment$VerifyStrategy("UNKNOWN", 1);
        UNKNOWN = cardPayment$VerifyStrategy2;
        CardPayment$VerifyStrategy[] cardPayment$VerifyStrategyArr = {cardPayment$VerifyStrategy, cardPayment$VerifyStrategy2};
        $VALUES = cardPayment$VerifyStrategyArr;
        $ENTRIES = a.a(cardPayment$VerifyStrategyArr);
    }

    public static CardPayment$VerifyStrategy valueOf(String str) {
        return (CardPayment$VerifyStrategy) Enum.valueOf(CardPayment$VerifyStrategy.class, str);
    }

    public static CardPayment$VerifyStrategy[] values() {
        return (CardPayment$VerifyStrategy[]) $VALUES.clone();
    }
}
