package com.yandex.passport.internal.ui.sloth;

import com.yandex.passport.sloth.ui.string.SlothString;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class j {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SlothString.values().length];
        try {
            iArr[SlothString.ERROR_UNEXPECTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SlothString.ERROR_404.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SlothString.ERROR_CONNECTION_LOST.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SlothString.BACK_BUTTON.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SlothString.FATAL_ERROR_DIALOG_TEXT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[SlothString.FATAL_ERROR_DIALOG_BUTTON.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[SlothString.DEBUG_INFORMATION_TITLE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[SlothString.TRY_AGAIN.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[SlothString.BLOCKED_URL.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[SlothString.CLOSE.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        a = iArr;
    }
}
