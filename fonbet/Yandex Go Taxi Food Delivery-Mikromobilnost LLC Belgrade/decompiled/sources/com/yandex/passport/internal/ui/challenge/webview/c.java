package com.yandex.passport.internal.ui.challenge.webview;

import com.yandex.passport.internal.ui.common.web.WebUrlChecker$Status;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class c {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[WebUrlChecker$Status.values().length];
        try {
            iArr[WebUrlChecker$Status.ALLOWED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WebUrlChecker$Status.BLOCKED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[WebUrlChecker$Status.EXTERNAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[WebUrlChecker$Status.EXTERNAL_AND_CANCEL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
