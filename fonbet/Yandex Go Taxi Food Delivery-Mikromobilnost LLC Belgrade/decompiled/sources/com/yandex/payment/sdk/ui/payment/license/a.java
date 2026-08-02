package com.yandex.payment.sdk.ui.payment.license;

import com.yandex.payment.sdk.ui.payment.license.LicenseFragment;
import defpackage.wwg;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class a {
    public static LicenseFragment a() {
        LicenseFragment licenseFragment = new LicenseFragment();
        licenseFragment.setArguments(wwg.g(new Pair("ARG_TYPE", LicenseFragment.LicenseType.SBP)));
        return licenseFragment;
    }
}
