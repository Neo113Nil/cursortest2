package com.yandex.passport.internal.flags.presentation;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class x0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ExperimentsMenuItem.values().length];
        try {
            iArr[ExperimentsMenuItem.OnClearNetworkCache.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ExperimentsMenuItem.OnClearOverrides.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ExperimentsMenuItem.OnUpdateNetworkCache.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
