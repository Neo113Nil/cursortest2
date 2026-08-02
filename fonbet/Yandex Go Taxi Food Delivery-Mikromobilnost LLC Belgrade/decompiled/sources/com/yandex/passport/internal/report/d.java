package com.yandex.passport.internal.report;

import com.yandex.passport.api.PassportAutoLoginMode;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class d {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PassportAutoLoginMode.values().length];
        try {
            iArr[PassportAutoLoginMode.EXACTLY_ONE_ACCOUNT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PassportAutoLoginMode.ONE_OR_MORE_ACCOUNT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
