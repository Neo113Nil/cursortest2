package com.yandex.plus.pay.ui.transactions.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/plus/pay/ui/transactions/api/PlusTransactionScreen;", "", "SUCCESS", "ERROR", "pay-sdk-ui-transactions-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlusTransactionScreen {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlusTransactionScreen[] $VALUES;
    public static final PlusTransactionScreen ERROR;
    public static final PlusTransactionScreen SUCCESS;

    static {
        PlusTransactionScreen plusTransactionScreen = new PlusTransactionScreen("SUCCESS", 0);
        SUCCESS = plusTransactionScreen;
        PlusTransactionScreen plusTransactionScreen2 = new PlusTransactionScreen("ERROR", 1);
        ERROR = plusTransactionScreen2;
        PlusTransactionScreen[] plusTransactionScreenArr = {plusTransactionScreen, plusTransactionScreen2};
        $VALUES = plusTransactionScreenArr;
        $ENTRIES = a.a(plusTransactionScreenArr);
    }

    public static PlusTransactionScreen valueOf(String str) {
        return (PlusTransactionScreen) Enum.valueOf(PlusTransactionScreen.class, str);
    }

    public static PlusTransactionScreen[] values() {
        return (PlusTransactionScreen[]) $VALUES.clone();
    }
}
