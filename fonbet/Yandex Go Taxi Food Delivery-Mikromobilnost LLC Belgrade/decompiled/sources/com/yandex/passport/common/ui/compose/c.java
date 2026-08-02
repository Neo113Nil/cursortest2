package com.yandex.passport.common.ui.compose;

import com.yandex.passport.common.ui.AppTheme;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class c {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AppTheme.values().length];
        try {
            iArr[AppTheme.LIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AppTheme.DARK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
