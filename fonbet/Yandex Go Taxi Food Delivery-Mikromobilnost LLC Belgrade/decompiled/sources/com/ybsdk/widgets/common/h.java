package com.ybsdk.widgets.common;

import com.ybsdk.widgets.common.LoadableInput;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class h {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[LoadableInput.LabelState.values().length];
        try {
            iArr[LoadableInput.LabelState.COLLAPSED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LoadableInput.LabelState.EXPANDED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
