package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network;

import defpackage.dh5;
import defpackage.p8w;
import defpackage.q5z;
import defpackage.v7p;
import defpackage.xvf0;

/* loaded from: classes10.dex */
public final class FlexInterceptorsModule_ProvideExtraQueryInterceptorFactory implements v7p {
    private final xvf0 extraQueriesProvider;
    private final FlexInterceptorsModule module;

    private FlexInterceptorsModule_ProvideExtraQueryInterceptorFactory(FlexInterceptorsModule flexInterceptorsModule, xvf0 xvf0Var) {
        this.module = flexInterceptorsModule;
        this.extraQueriesProvider = xvf0Var;
    }

    public static FlexInterceptorsModule_ProvideExtraQueryInterceptorFactory create(FlexInterceptorsModule flexInterceptorsModule, xvf0 xvf0Var) {
        return new FlexInterceptorsModule_ProvideExtraQueryInterceptorFactory(flexInterceptorsModule, xvf0Var);
    }

    public static p8w provideExtraQueryInterceptor(FlexInterceptorsModule flexInterceptorsModule, dh5 dh5Var) {
        p8w provideExtraQueryInterceptor = flexInterceptorsModule.provideExtraQueryInterceptor(dh5Var);
        q5z.i(provideExtraQueryInterceptor);
        return provideExtraQueryInterceptor;
    }

    @Override // defpackage.yvf0
    public p8w get() {
        return provideExtraQueryInterceptor(this.module, (dh5) this.extraQueriesProvider.get());
    }
}
