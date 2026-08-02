package com.ybsdk.widgets.common;

import com.ybsdk.widgets.common.PinCodeDotsView;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class n {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PinCodeDotsView.State.values().length];
        try {
            iArr[PinCodeDotsView.State.INPUT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PinCodeDotsView.State.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PinCodeDotsView.State.SHIMMER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PinCodeDotsView.State.SUCCESS_INFLATE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[PinCodeDotsView.State.SUCCESS_DEFLATE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
