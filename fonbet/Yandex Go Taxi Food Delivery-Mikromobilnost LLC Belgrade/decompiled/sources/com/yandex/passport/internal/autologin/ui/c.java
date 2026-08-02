package com.yandex.passport.internal.autologin.ui;

import com.yandex.passport.api.PassportTheme;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class c {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PassportTheme.values().length];
        try {
            iArr[PassportTheme.DARK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
