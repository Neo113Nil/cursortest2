package com.yandex.passport.internal.ui.bouncer.roundabout;

import com.yandex.passport.api.AccountListShowMode;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class t {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AccountListShowMode.values().length];
        try {
            iArr[AccountListShowMode.BOTTOM_SHEET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AccountListShowMode.FULLSCREEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
