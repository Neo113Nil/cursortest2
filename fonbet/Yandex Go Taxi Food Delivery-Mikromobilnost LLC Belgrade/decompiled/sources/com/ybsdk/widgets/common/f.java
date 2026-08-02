package com.ybsdk.widgets.common;

import com.ybsdk.widgets.common.GradientTextView;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class f {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[GradientTextView.Direction.values().length];
        try {
            iArr[GradientTextView.Direction.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[GradientTextView.Direction.RIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[GradientTextView.Direction.BOTTOM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[GradientTextView.Direction.LEFT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
