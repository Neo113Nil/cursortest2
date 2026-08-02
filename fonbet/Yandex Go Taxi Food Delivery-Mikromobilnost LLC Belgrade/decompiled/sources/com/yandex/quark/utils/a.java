package com.yandex.quark.utils;

import com.yandex.quark.utils.CircleOutlineProvider;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CircleOutlineProvider.DiameterSource.values().length];
        try {
            iArr[CircleOutlineProvider.DiameterSource.WIDTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CircleOutlineProvider.DiameterSource.HEIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
