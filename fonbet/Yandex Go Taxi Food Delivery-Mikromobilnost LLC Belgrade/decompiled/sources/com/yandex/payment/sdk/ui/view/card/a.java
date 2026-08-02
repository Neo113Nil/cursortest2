package com.yandex.payment.sdk.ui.view.card;

import com.yandex.payment.sdk.ui.view.card.CardNumberInput;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CardNumberInput.State.values().length];
        try {
            iArr[CardNumberInput.State.FULL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CardNumberInput.State.MASKED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
