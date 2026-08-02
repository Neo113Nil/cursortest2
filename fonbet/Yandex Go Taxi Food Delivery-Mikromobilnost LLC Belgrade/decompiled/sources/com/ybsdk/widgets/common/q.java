package com.ybsdk.widgets.common;

import com.ybsdk.widgets.common.YbButtonViewGroup;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class q {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[YbButtonViewGroup.Orientation.values().length];
        try {
            iArr[YbButtonViewGroup.Orientation.HORIZONTAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[YbButtonViewGroup.Orientation.VERTICAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[YbButtonViewGroup.Orientation.VERTICAL_REVERSE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
