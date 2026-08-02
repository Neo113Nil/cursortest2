package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network;

import defpackage.d0m;
import defpackage.l2m;
import defpackage.q5z;
import defpackage.v7p;
import defpackage.xvf0;

/* loaded from: classes10.dex */
public final class FlexNetworkModule_ProvideDocumentResponseParserFactoryFactory implements v7p {
    private final xvf0 documentJsonProvider;
    private final FlexNetworkModule module;

    private FlexNetworkModule_ProvideDocumentResponseParserFactoryFactory(FlexNetworkModule flexNetworkModule, xvf0 xvf0Var) {
        this.module = flexNetworkModule;
        this.documentJsonProvider = xvf0Var;
    }

    public static FlexNetworkModule_ProvideDocumentResponseParserFactoryFactory create(FlexNetworkModule flexNetworkModule, xvf0 xvf0Var) {
        return new FlexNetworkModule_ProvideDocumentResponseParserFactoryFactory(flexNetworkModule, xvf0Var);
    }

    public static l2m provideDocumentResponseParserFactory(FlexNetworkModule flexNetworkModule, d0m d0mVar) {
        l2m provideDocumentResponseParserFactory = flexNetworkModule.provideDocumentResponseParserFactory(d0mVar);
        q5z.i(provideDocumentResponseParserFactory);
        return provideDocumentResponseParserFactory;
    }

    @Override // defpackage.yvf0
    public l2m get() {
        return provideDocumentResponseParserFactory(this.module, (d0m) this.documentJsonProvider.get());
    }
}
