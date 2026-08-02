package com.yandex.payment.sdk.ui.view.payment;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/payment/sdk/ui/view/payment/SelectPaymentAdapter$AdapterMode", "", "Lcom/yandex/payment/sdk/ui/view/payment/SelectPaymentAdapter$AdapterMode;", "BankAndPs", "PsOnly", "None", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SelectPaymentAdapter$AdapterMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SelectPaymentAdapter$AdapterMode[] $VALUES;
    public static final SelectPaymentAdapter$AdapterMode BankAndPs;
    public static final SelectPaymentAdapter$AdapterMode None;
    public static final SelectPaymentAdapter$AdapterMode PsOnly;

    static {
        SelectPaymentAdapter$AdapterMode selectPaymentAdapter$AdapterMode = new SelectPaymentAdapter$AdapterMode("BankAndPs", 0);
        BankAndPs = selectPaymentAdapter$AdapterMode;
        SelectPaymentAdapter$AdapterMode selectPaymentAdapter$AdapterMode2 = new SelectPaymentAdapter$AdapterMode("PsOnly", 1);
        PsOnly = selectPaymentAdapter$AdapterMode2;
        SelectPaymentAdapter$AdapterMode selectPaymentAdapter$AdapterMode3 = new SelectPaymentAdapter$AdapterMode("None", 2);
        None = selectPaymentAdapter$AdapterMode3;
        SelectPaymentAdapter$AdapterMode[] selectPaymentAdapter$AdapterModeArr = {selectPaymentAdapter$AdapterMode, selectPaymentAdapter$AdapterMode2, selectPaymentAdapter$AdapterMode3};
        $VALUES = selectPaymentAdapter$AdapterModeArr;
        $ENTRIES = a.a(selectPaymentAdapter$AdapterModeArr);
    }

    public static SelectPaymentAdapter$AdapterMode valueOf(String str) {
        return (SelectPaymentAdapter$AdapterMode) Enum.valueOf(SelectPaymentAdapter$AdapterMode.class, str);
    }

    public static SelectPaymentAdapter$AdapterMode[] values() {
        return (SelectPaymentAdapter$AdapterMode[]) $VALUES.clone();
    }
}
