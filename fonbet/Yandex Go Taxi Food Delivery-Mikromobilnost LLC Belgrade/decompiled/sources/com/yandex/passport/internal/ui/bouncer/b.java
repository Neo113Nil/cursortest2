package com.yandex.passport.internal.ui.bouncer;

import com.yandex.passport.api.PassportScreenOrientation;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class b {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PassportScreenOrientation.values().length];
        try {
            iArr[PassportScreenOrientation.Landscape.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PassportScreenOrientation.Portrait.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PassportScreenOrientation.None.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
