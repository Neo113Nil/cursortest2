package com.yandex.payment.sdk.ui.payment.sbp;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/payment/sdk/ui/payment/sbp/SbpViewModel$BankListState", "", "Lcom/yandex/payment/sdk/ui/payment/sbp/SbpViewModel$BankListState;", "None", "Installed", "Full", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SbpViewModel$BankListState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SbpViewModel$BankListState[] $VALUES;
    public static final SbpViewModel$BankListState Full;
    public static final SbpViewModel$BankListState Installed;
    public static final SbpViewModel$BankListState None;

    static {
        SbpViewModel$BankListState sbpViewModel$BankListState = new SbpViewModel$BankListState("None", 0);
        None = sbpViewModel$BankListState;
        SbpViewModel$BankListState sbpViewModel$BankListState2 = new SbpViewModel$BankListState("Installed", 1);
        Installed = sbpViewModel$BankListState2;
        SbpViewModel$BankListState sbpViewModel$BankListState3 = new SbpViewModel$BankListState("Full", 2);
        Full = sbpViewModel$BankListState3;
        SbpViewModel$BankListState[] sbpViewModel$BankListStateArr = {sbpViewModel$BankListState, sbpViewModel$BankListState2, sbpViewModel$BankListState3};
        $VALUES = sbpViewModel$BankListStateArr;
        $ENTRIES = kotlin.enums.a.a(sbpViewModel$BankListStateArr);
    }

    public static SbpViewModel$BankListState valueOf(String str) {
        return (SbpViewModel$BankListState) Enum.valueOf(SbpViewModel$BankListState.class, str);
    }

    public static SbpViewModel$BankListState[] values() {
        return (SbpViewModel$BankListState[]) $VALUES.clone();
    }
}
