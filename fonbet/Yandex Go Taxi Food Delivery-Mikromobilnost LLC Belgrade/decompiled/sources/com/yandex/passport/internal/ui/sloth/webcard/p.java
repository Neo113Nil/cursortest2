package com.yandex.passport.internal.ui.sloth.webcard;

import com.yandex.passport.sloth.data.PushType;
import com.yandex.passport.sloth.ui.SlothUiWish;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class p {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

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
        int[] iArr2 = new int[PushType.values().length];
        try {
            iArr2[PushType.Notification.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[PushType.Data.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
