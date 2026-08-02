package com.yandex.payment.sdk.ui.common;

import com.yandex.payment.sdk.ui.common.ResultFragment;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class b {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ResultFragment.RESULT.values().length];
        try {
            iArr[ResultFragment.RESULT.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ResultFragment.RESULT.FAILURE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
