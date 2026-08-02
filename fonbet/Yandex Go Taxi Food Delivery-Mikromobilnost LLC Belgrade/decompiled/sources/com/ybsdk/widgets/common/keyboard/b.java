package com.ybsdk.widgets.common.keyboard;

import com.ybsdk.widgets.common.keyboard.NumberKeyboardView;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class b {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[NumberKeyboardView.AdditionalButtonType.values().length];
        try {
            iArr[NumberKeyboardView.AdditionalButtonType.COMMA.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NumberKeyboardView.AdditionalButtonType.BIOMETRIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[NumberKeyboardView.AdditionalButtonType.EMPTY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
