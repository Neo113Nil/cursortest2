package com.yandex.passport.internal.ui.sloth.menu;

import com.yandex.passport.common.web.BridgeMethod;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class n {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BridgeMethod.values().length];
        try {
            iArr[BridgeMethod.FinishWithItem.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BridgeMethod.ItemClickCommand.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
