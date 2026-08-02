package com.yandex.passport.sloth.ui;

import com.yandex.passport.sloth.ui.error.ButtonMode;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class m {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ButtonMode.values().length];
        try {
            iArr[ButtonMode.HIDDEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ButtonMode.CANCEL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ButtonMode.CLOSE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
