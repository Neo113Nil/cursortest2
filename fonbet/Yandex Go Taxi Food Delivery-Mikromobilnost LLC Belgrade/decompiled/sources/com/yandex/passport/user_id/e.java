package com.yandex.passport.user_id;

import com.yandex.passport.common.web.BridgeMethod;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class e {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BridgeMethod.values().length];
        try {
            iArr[BridgeMethod.Ready.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BridgeMethod.FinishWithUrl.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BridgeMethod.FinishWithItem.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[BridgeMethod.ItemClickCommand.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
