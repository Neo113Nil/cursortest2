package com.yandex.passport.api;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class n {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PassportAccountUpgradeStatus.values().length];
        try {
            iArr[PassportAccountUpgradeStatus.NOT_NEEDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PassportAccountUpgradeStatus.NEEDED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PassportAccountUpgradeStatus.SKIPPED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PassportAccountUpgradeStatus.REQUIRED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
