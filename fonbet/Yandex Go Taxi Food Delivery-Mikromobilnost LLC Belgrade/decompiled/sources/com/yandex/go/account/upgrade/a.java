package com.yandex.go.account.upgrade;

import com.yandex.go.account.upgrade.ForceAccountUpgradeExperiment;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ForceAccountUpgradeExperiment.AccountType.values().length];
        try {
            iArr[ForceAccountUpgradeExperiment.AccountType.SOCIAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ForceAccountUpgradeExperiment.AccountType.LITE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
