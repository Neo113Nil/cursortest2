package com.yandex.go.transfer_requirement.ui.flight_input;

import com.yandex.go.transfer_requirement.ui.flight_input.TransferNumberInputView;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TransferNumberInputView.ValidationMode.values().length];
        try {
            iArr[TransferNumberInputView.ValidationMode.FLIGHT_NUMBER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TransferNumberInputView.ValidationMode.PLAIN_TEXT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
