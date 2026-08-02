package com.yandex.passport.internal.ui.webview.webcases;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class m {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[WebCaseType.values().length];
        try {
            iArr[WebCaseType.WEB_RESTORE_PASSWORD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WebCaseType.WEB_LOGIN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[WebCaseType.SOCIAL_AUTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[WebCaseType.MAIL_OAUTH.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[WebCaseType.NATIVE_SOCIAL_AUTH.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[WebCaseType.BIND_SOCIAL_NATIVE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[WebCaseType.BIND_SOCIAL_WEB.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[WebCaseType.WEB_SHOW_AUTH_CODE.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[WebCaseType.WEB_EXTERNAL_ACTION.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[WebCaseType.VIEW_LEGAL.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[WebCaseType.CHANGE_PASSWORD.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[WebCaseType.AUTH_ON_TV.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        a = iArr;
    }
}
