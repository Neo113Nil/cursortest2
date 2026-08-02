package com.ybsdk.widgets.common;

import com.ybsdk.widgets.common.YbSdkScalableTextView;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class r {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[YbSdkScalableTextView.TextSizeType.values().length];
        try {
            iArr[YbSdkScalableTextView.TextSizeType.SMALL_TEXT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[YbSdkScalableTextView.TextSizeType.BIG_TEXT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
