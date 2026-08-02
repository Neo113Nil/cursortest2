package com.yandex.passport.internal.report;

import com.yandex.passport.internal.upgrader.UpgradeStatusRequestSource;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class ae {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[UpgradeStatusRequestSource.values().length];
        try {
            iArr[UpgradeStatusRequestSource.REGULAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UpgradeStatusRequestSource.RELEVANCE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[UpgradeStatusRequestSource.REQUEST.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
