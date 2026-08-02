package com.yandex.passport.internal.ui.webview;

import com.yandex.passport.internal.ui.webview.webcases.WebCaseType;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class c {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[WebCaseType.values().length];
        try {
            iArr[WebCaseType.NATIVE_SOCIAL_AUTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WebCaseType.BIND_SOCIAL_NATIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
