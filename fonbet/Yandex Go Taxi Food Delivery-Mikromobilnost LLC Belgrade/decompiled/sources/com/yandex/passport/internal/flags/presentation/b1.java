package com.yandex.passport.internal.flags.presentation;

import androidx.compose.material3.SnackbarResult;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class b1 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SnackbarResult.values().length];
        try {
            iArr[SnackbarResult.Dismissed.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SnackbarResult.ActionPerformed.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
