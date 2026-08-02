package com.ybsdk.widgets.common.checkbox;

import com.ybsdk.widgets.common.checkbox.CheckBoxView;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CheckBoxView.Type.values().length];
        try {
            iArr[CheckBoxView.Type.Colored.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CheckBoxView.Type.Dark.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
