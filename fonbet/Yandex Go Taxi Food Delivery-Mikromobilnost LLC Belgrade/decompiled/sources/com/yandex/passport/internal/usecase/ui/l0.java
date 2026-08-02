package com.yandex.passport.internal.usecase.ui;

import com.yandex.passport.common.core.Environment;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class l0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Environment.values().length];
        try {
            iArr[Environment.PRODUCTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
