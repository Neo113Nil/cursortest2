package com.yandex.passport.internal.ui.challenge.delete;

import com.yandex.passport.api.PassportAccountType;
import com.yandex.passport.sloth.ui.SlothUiWish;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class i {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[PassportAccountType.values().length];
        try {
            iArr[PassportAccountType.PHONISH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
        int[] iArr2 = new int[SlothUiWish.values().length];
        try {
            iArr2[SlothUiWish.BACK.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[SlothUiWish.CANCEL.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[SlothUiWish.FINISH_LOGIN.ordinal()] = 3;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
    }
}
