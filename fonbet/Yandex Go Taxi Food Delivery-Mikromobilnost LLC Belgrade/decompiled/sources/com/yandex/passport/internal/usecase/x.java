package com.yandex.passport.internal.usecase;

import com.yandex.passport.common.core.FrontendUrlType;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class x {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[FrontendUrlType.values().length];
        try {
            iArr[FrontendUrlType.PASSPORT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FrontendUrlType.ID.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
