package com.yandex.passport.internal.ui.domik;

import com.yandex.passport.internal.network.response.AuthMethod;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AuthMethod.values().length];
        try {
            iArr[AuthMethod.SMS_CODE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
