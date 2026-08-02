package com.yandex.payment.divkit.bind.view;

import com.yandex.payment.divkit.bind.view.DKCardNumberInput;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class b {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DKCardNumberInput.State.values().length];
        try {
            iArr[DKCardNumberInput.State.FULL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DKCardNumberInput.State.MASKED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
