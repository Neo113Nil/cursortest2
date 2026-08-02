package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network;

import defpackage.p8w;
import defpackage.q5z;
import defpackage.v7p;
import defpackage.xvf0;
import java.util.Set;
import okhttp3.OkHttpClient;

/* loaded from: classes10.dex */
public final class FlexMapiModule_ProvideOkHttpClientFactory implements v7p {
    private final xvf0 interceptorsProvider;
    private final FlexMapiModule module;
    private final xvf0 okHttpClientBuilderProvider;

    private FlexMapiModule_ProvideOkHttpClientFactory(FlexMapiModule flexMapiModule, xvf0 xvf0Var, xvf0 xvf0Var2) {
        this.module = flexMapiModule;
        this.interceptorsProvider = xvf0Var;
        this.okHttpClientBuilderProvider = xvf0Var2;
    }

    public static FlexMapiModule_ProvideOkHttpClientFactory create(FlexMapiModule flexMapiModule, xvf0 xvf0Var, xvf0 xvf0Var2) {
        return new FlexMapiModule_ProvideOkHttpClientFactory(flexMapiModule, xvf0Var, xvf0Var2);
    }

    public static OkHttpClient provideOkHttpClient(FlexMapiModule flexMapiModule, Set<p8w> set, OkHttpClient.a aVar) {
        OkHttpClient provideOkHttpClient = flexMapiModule.provideOkHttpClient(set, aVar);
        q5z.i(provideOkHttpClient);
        return provideOkHttpClient;
    }

    @Override // defpackage.yvf0
    public OkHttpClient get() {
        return provideOkHttpClient(this.module, (Set) this.interceptorsProvider.get(), (OkHttpClient.a) this.okHttpClientBuilderProvider.get());
    }
}
