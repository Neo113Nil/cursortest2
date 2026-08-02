package com.yandex.passport.internal.ui.sloth.menu;

import com.yandex.passport.sloth.ui.SlothUiWish;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class t {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SlothUiWish.values().length];
        try {
            iArr[SlothUiWish.BACK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SlothUiWish.CANCEL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SlothUiWish.FINISH_LOGIN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
