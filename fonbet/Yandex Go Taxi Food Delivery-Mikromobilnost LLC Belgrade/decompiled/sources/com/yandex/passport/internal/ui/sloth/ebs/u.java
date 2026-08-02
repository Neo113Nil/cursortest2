package com.yandex.passport.internal.ui.sloth.ebs;

import com.yandex.passport.sloth.ui.SlothUiWish;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class u {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[EbsState.values().length];
        try {
            iArr[EbsState.ESIA_CONSENT_PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EbsState.ESIA_BIO_CREATION_PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EbsState.RETRYING_SESSION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EbsState.EBS_SDK_BIO_PHOTO_CHECK_PENDING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[EbsState.EBS_SDK_INIT_PENDING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[EbsState.EBS_SDK_BIO_PHOTO_CHECK_OPEN_SETTINGS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[EbsState.EBS_REGISTRATION_PENDING.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
        int[] iArr2 = new int[SlothUiWish.values().length];
        try {
            iArr2[SlothUiWish.BACK.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[SlothUiWish.CANCEL.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[SlothUiWish.FINISH_LOGIN.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        b = iArr2;
    }
}
