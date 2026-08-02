package com.yandex.payment.sdk.ui.payment.sbp;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class b {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SbpViewModel$BankListState.values().length];
        try {
            iArr[SbpViewModel$BankListState.None.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SbpViewModel$BankListState.Installed.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SbpViewModel$BankListState.Full.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
