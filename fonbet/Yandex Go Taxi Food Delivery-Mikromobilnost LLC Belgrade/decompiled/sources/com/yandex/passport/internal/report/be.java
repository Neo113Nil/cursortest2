package com.yandex.passport.internal.report;

import com.yandex.passport.internal.upgrader.UpgradeStatusRequestType;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class be {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[UpgradeStatusRequestType.values().length];
        try {
            iArr[UpgradeStatusRequestType.CACHED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UpgradeStatusRequestType.ACTUAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[UpgradeStatusRequestType.RELEVANCE_CHECK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
