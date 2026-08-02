package com.ybsdk.screens.changephone.presentation;

import com.ybsdk.screens.changephone.presentation.ChangePhoneStatusScreenParams;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ChangePhoneStatusScreenParams.Status.values().length];
        try {
            iArr[ChangePhoneStatusScreenParams.Status.INITIAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ChangePhoneStatusScreenParams.Status.SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ChangePhoneStatusScreenParams.Status.FAIL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
