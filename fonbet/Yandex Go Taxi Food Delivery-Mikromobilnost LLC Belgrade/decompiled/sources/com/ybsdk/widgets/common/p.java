package com.ybsdk.widgets.common;

import com.ybsdk.widgets.common.WidgetWithToggleView;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class p {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[WidgetWithToggleView.ToggleState.values().length];
        try {
            iArr[WidgetWithToggleView.ToggleState.ON.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WidgetWithToggleView.ToggleState.OFF.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
