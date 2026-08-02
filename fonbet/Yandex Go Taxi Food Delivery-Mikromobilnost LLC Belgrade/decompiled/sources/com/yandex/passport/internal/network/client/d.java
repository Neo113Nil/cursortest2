package com.yandex.passport.internal.network.client;

import com.yandex.passport.api.PassportSocialProviderCode;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class d {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PassportSocialProviderCode.values().length];
        try {
            iArr[PassportSocialProviderCode.TV1001.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
