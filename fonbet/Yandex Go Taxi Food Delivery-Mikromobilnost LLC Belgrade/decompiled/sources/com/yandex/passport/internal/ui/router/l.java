package com.yandex.passport.internal.ui.router;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class l {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RoadSign.values().length];
        try {
            iArr[RoadSign.LOGIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RoadSign.SOCIAL_BIND.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RoadSign.SOCIAL_APPLICATION_BIND.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[RoadSign.AUTHORIZATION_BY_QR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[RoadSign.TURBO_APP_AUTH.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[RoadSign.CONFIRM_QR_AUTHORIZATION.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[RoadSign.LOGOUT.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[RoadSign.SET_CURRENT_ACCOUNT.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[RoadSign.WEB_VIEW.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[RoadSign.NOTIFICATION_BUILDER.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[RoadSign.SHOW_USER_MENU.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[RoadSign.DELETE_ACCOUNT.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        a = iArr;
    }
}
