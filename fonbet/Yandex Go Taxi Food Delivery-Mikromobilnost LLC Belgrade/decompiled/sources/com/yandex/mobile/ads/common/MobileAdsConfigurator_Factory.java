package com.yandex.mobile.ads.common;

import android.content.Context;
import com.yandex.go.ads.mobile_ads_sdk.data.a;
import defpackage.ju6;
import defpackage.v7p;
import defpackage.xvf0;

/* loaded from: classes8.dex */
public final class MobileAdsConfigurator_Factory implements v7p {
    private final xvf0 bunchOfUrlsProvider;
    private final xvf0 contextProvider;
    private final xvf0 experimentRepositoryProvider;

    private MobileAdsConfigurator_Factory(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3) {
        this.contextProvider = xvf0Var;
        this.bunchOfUrlsProvider = xvf0Var2;
        this.experimentRepositoryProvider = xvf0Var3;
    }

    public static MobileAdsConfigurator_Factory create(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3) {
        return new MobileAdsConfigurator_Factory(xvf0Var, xvf0Var2, xvf0Var3);
    }

    public static MobileAdsConfigurator newInstance(Context context, ju6 ju6Var, a aVar) {
        return new MobileAdsConfigurator(context, ju6Var, aVar);
    }

    @Override // defpackage.yvf0
    public MobileAdsConfigurator get() {
        return newInstance((Context) this.contextProvider.get(), (ju6) this.bunchOfUrlsProvider.get(), (a) this.experimentRepositoryProvider.get());
    }
}
