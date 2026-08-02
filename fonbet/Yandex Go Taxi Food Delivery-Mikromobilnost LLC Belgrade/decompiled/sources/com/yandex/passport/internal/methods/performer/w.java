package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.internal.methods.FlagName;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class w {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[FlagName.values().length];
        try {
            iArr[FlagName.COMPOSE_MANAGING_DEVICES_SCREEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FlagName.PARTIAL_BINDING_SERVICE_IMPL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
