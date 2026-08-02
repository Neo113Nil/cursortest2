package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network;

import defpackage.ah5;
import defpackage.lu00;
import defpackage.osu;
import defpackage.p85;
import defpackage.q5z;
import defpackage.tse;
import defpackage.v7p;
import defpackage.xvf0;
import okhttp3.OkHttpClient;

/* loaded from: classes10.dex */
public final class FlexMapiModule_ProvideMapiClientFactory implements v7p {
    private final xvf0 activityProvider;
    private final xvf0 coroutineScopeProvider;
    private final xvf0 extraHeadersProvider;
    private final xvf0 hostUrlProvider;
    private final FlexMapiModule module;
    private final xvf0 okHttpClientProvider;

    private FlexMapiModule_ProvideMapiClientFactory(FlexMapiModule flexMapiModule, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5) {
        this.module = flexMapiModule;
        this.activityProvider = xvf0Var;
        this.coroutineScopeProvider = xvf0Var2;
        this.extraHeadersProvider = xvf0Var3;
        this.hostUrlProvider = xvf0Var4;
        this.okHttpClientProvider = xvf0Var5;
    }

    public static FlexMapiModule_ProvideMapiClientFactory create(FlexMapiModule flexMapiModule, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5) {
        return new FlexMapiModule_ProvideMapiClientFactory(flexMapiModule, xvf0Var, xvf0Var2, xvf0Var3, xvf0Var4, xvf0Var5);
    }

    public static lu00 provideMapiClient(FlexMapiModule flexMapiModule, p85 p85Var, tse tseVar, ah5 ah5Var, osu osuVar, OkHttpClient okHttpClient) {
        lu00 provideMapiClient = flexMapiModule.provideMapiClient(p85Var, tseVar, ah5Var, osuVar, okHttpClient);
        q5z.i(provideMapiClient);
        return provideMapiClient;
    }

    @Override // defpackage.yvf0
    public lu00 get() {
        return provideMapiClient(this.module, (p85) this.activityProvider.get(), (tse) this.coroutineScopeProvider.get(), (ah5) this.extraHeadersProvider.get(), (osu) this.hostUrlProvider.get(), (OkHttpClient) this.okHttpClientProvider.get());
    }
}
