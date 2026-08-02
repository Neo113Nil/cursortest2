package com.yandex.go.payments.cards.ui;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/cards/ui/AddCardStatus;", "", "SUCCESS", "FAILED", "FAILED_CVV_MISSING", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AddCardStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AddCardStatus[] $VALUES;
    public static final AddCardStatus FAILED;
    public static final AddCardStatus FAILED_CVV_MISSING;
    public static final AddCardStatus SUCCESS;

    static {
        AddCardStatus addCardStatus = new AddCardStatus("SUCCESS", 0);
        SUCCESS = addCardStatus;
        AddCardStatus addCardStatus2 = new AddCardStatus("FAILED", 1);
        FAILED = addCardStatus2;
        AddCardStatus addCardStatus3 = new AddCardStatus("FAILED_CVV_MISSING", 2);
        FAILED_CVV_MISSING = addCardStatus3;
        AddCardStatus[] addCardStatusArr = {addCardStatus, addCardStatus2, addCardStatus3};
        $VALUES = addCardStatusArr;
        $ENTRIES = kotlin.enums.a.a(addCardStatusArr);
    }

    public static AddCardStatus valueOf(String str) {
        return (AddCardStatus) Enum.valueOf(AddCardStatus.class, str);
    }

    public static AddCardStatus[] values() {
        return (AddCardStatus[]) $VALUES.clone();
    }
}
