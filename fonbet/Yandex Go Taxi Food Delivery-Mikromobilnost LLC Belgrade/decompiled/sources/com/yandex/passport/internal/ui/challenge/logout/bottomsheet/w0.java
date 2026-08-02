package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class w0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[LogoutBottomsheetWish.values().length];
        try {
            iArr[LogoutBottomsheetWish.COLLAPSE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LogoutBottomsheetWish.CANCEL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LogoutBottomsheetWish.LOGOUT_THIS_APP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[LogoutBottomsheetWish.LOGOUT_ALL_APPS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[LogoutBottomsheetWish.DELETE_ACCOUNT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
