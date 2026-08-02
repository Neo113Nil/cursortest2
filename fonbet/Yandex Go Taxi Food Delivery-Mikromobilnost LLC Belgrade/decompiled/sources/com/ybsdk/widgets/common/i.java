package com.ybsdk.widgets.common;

import com.ybsdk.widgets.common.MoneyAmountTextView;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class i {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MoneyAmountTextView.State.values().length];
        try {
            iArr[MoneyAmountTextView.State.NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MoneyAmountTextView.State.SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MoneyAmountTextView.State.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[MoneyAmountTextView.State.PROCESSING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
