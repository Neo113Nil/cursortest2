package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network;

import defpackage.jse;
import defpackage.q5z;
import defpackage.v7p;

/* loaded from: classes10.dex */
public final class FlexNetworkModule_ProvideCoroutineDispatcherFactory implements v7p {
    private final FlexNetworkModule module;

    private FlexNetworkModule_ProvideCoroutineDispatcherFactory(FlexNetworkModule flexNetworkModule) {
        this.module = flexNetworkModule;
    }

    public static FlexNetworkModule_ProvideCoroutineDispatcherFactory create(FlexNetworkModule flexNetworkModule) {
        return new FlexNetworkModule_ProvideCoroutineDispatcherFactory(flexNetworkModule);
    }

    public static jse provideCoroutineDispatcher(FlexNetworkModule flexNetworkModule) {
        jse provideCoroutineDispatcher = flexNetworkModule.provideCoroutineDispatcher();
        q5z.i(provideCoroutineDispatcher);
        return provideCoroutineDispatcher;
    }

    @Override // defpackage.yvf0
    public jse get() {
        return provideCoroutineDispatcher(this.module);
    }
}
