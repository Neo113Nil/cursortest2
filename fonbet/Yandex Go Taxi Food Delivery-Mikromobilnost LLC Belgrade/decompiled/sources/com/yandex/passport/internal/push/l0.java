package com.yandex.passport.internal.push;

import com.yandex.passport.api.PushPlatform;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class l0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PushPlatform.values().length];
        try {
            iArr[PushPlatform.FCM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PushPlatform.HMS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PushPlatform.RuStore.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
