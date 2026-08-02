package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network;

import defpackage.q5z;
import defpackage.r2m;
import defpackage.v7p;
import defpackage.vg5;
import defpackage.xvf0;

/* loaded from: classes10.dex */
public final class FlexNetworkModule_ProvideDocumentServiceErrorHandlerFactory implements v7p {
    private final xvf0 errorHandlerProvider;
    private final FlexNetworkModule module;

    private FlexNetworkModule_ProvideDocumentServiceErrorHandlerFactory(FlexNetworkModule flexNetworkModule, xvf0 xvf0Var) {
        this.module = flexNetworkModule;
        this.errorHandlerProvider = xvf0Var;
    }

    public static FlexNetworkModule_ProvideDocumentServiceErrorHandlerFactory create(FlexNetworkModule flexNetworkModule, xvf0 xvf0Var) {
        return new FlexNetworkModule_ProvideDocumentServiceErrorHandlerFactory(flexNetworkModule, xvf0Var);
    }

    public static r2m provideDocumentServiceErrorHandler(FlexNetworkModule flexNetworkModule, vg5 vg5Var) {
        r2m provideDocumentServiceErrorHandler = flexNetworkModule.provideDocumentServiceErrorHandler(vg5Var);
        q5z.i(provideDocumentServiceErrorHandler);
        return provideDocumentServiceErrorHandler;
    }

    @Override // defpackage.yvf0
    public r2m get() {
        return provideDocumentServiceErrorHandler(this.module, (vg5) this.errorHandlerProvider.get());
    }
}
