package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network;

import defpackage.hv90;
import defpackage.jp50;
import defpackage.jse;
import defpackage.l2m;
import defpackage.lu00;
import defpackage.m0m;
import defpackage.q5z;
import defpackage.r2m;
import defpackage.uyg;
import defpackage.v7p;
import defpackage.xvf0;
import java.util.Set;

/* loaded from: classes10.dex */
public final class FlexNetworkModule_ProvideDocumentLoaderFactory implements v7p {
    private final xvf0 coroutineDispatcherProvider;
    private final xvf0 decodingVelocityMonitoringProvider;
    private final xvf0 documentResponseParserFactoryProvider;
    private final xvf0 errorHandlerProvider;
    private final xvf0 mapiClientProvider;
    private final FlexNetworkModule module;
    private final xvf0 networkCachingProvider;
    private final xvf0 payloadExtendersProvider;

    private FlexNetworkModule_ProvideDocumentLoaderFactory(FlexNetworkModule flexNetworkModule, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7) {
        this.module = flexNetworkModule;
        this.coroutineDispatcherProvider = xvf0Var;
        this.decodingVelocityMonitoringProvider = xvf0Var2;
        this.documentResponseParserFactoryProvider = xvf0Var3;
        this.errorHandlerProvider = xvf0Var4;
        this.mapiClientProvider = xvf0Var5;
        this.networkCachingProvider = xvf0Var6;
        this.payloadExtendersProvider = xvf0Var7;
    }

    public static FlexNetworkModule_ProvideDocumentLoaderFactory create(FlexNetworkModule flexNetworkModule, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7) {
        return new FlexNetworkModule_ProvideDocumentLoaderFactory(flexNetworkModule, xvf0Var, xvf0Var2, xvf0Var3, xvf0Var4, xvf0Var5, xvf0Var6, xvf0Var7);
    }

    public static m0m provideDocumentLoader(FlexNetworkModule flexNetworkModule, jse jseVar, uyg uygVar, l2m l2mVar, r2m r2mVar, lu00 lu00Var, jp50 jp50Var, Set<hv90> set) {
        m0m provideDocumentLoader = flexNetworkModule.provideDocumentLoader(jseVar, uygVar, l2mVar, r2mVar, lu00Var, jp50Var, set);
        q5z.i(provideDocumentLoader);
        return provideDocumentLoader;
    }

    @Override // defpackage.yvf0
    public m0m get() {
        return provideDocumentLoader(this.module, (jse) this.coroutineDispatcherProvider.get(), (uyg) this.decodingVelocityMonitoringProvider.get(), (l2m) this.documentResponseParserFactoryProvider.get(), (r2m) this.errorHandlerProvider.get(), (lu00) this.mapiClientProvider.get(), (jp50) this.networkCachingProvider.get(), (Set) this.payloadExtendersProvider.get());
    }
}
