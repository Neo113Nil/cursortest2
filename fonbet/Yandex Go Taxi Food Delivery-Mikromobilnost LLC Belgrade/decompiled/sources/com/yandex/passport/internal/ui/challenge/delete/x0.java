package com.yandex.passport.internal.ui.challenge.delete;

import com.yandex.passport.api.PassportAccountType;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class x0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PassportAccountType.values().length];
        try {
            iArr[PassportAccountType.PHONISH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
