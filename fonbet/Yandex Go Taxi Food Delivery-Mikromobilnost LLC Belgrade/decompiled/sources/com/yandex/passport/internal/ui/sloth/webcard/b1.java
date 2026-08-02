package com.yandex.passport.internal.ui.sloth.webcard;

import com.yandex.passport.sloth.data.PushType;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class b1 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PushType.values().length];
        try {
            iArr[PushType.Notification.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PushType.Data.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
