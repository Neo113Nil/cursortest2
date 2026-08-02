package com.ybsdk.widgets.common;

import com.ybsdk.widgets.common.DashboardBalanceTextView;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class b {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DashboardBalanceTextView.TextSizeType.values().length];
        try {
            iArr[DashboardBalanceTextView.TextSizeType.SMALL_TEXT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DashboardBalanceTextView.TextSizeType.BIG_TEXT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
