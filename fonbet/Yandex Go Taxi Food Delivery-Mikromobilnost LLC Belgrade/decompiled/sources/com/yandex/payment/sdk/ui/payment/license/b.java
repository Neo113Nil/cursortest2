package com.yandex.payment.sdk.ui.payment.license;

import com.yandex.payment.sdk.core.data.Acquirer;
import com.yandex.payment.sdk.ui.payment.license.LicenseFragment;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class b {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[LicenseFragment.LicenseType.values().length];
        try {
            iArr[LicenseFragment.LicenseType.SBP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LicenseFragment.LicenseType.GENERAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[Acquirer.values().length];
        try {
            iArr2[Acquirer.kassa.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        b = iArr2;
    }
}
