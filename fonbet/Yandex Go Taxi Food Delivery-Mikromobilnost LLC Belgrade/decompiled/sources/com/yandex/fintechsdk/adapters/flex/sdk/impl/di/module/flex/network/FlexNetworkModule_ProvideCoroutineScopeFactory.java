package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network;

import defpackage.q5z;
import defpackage.tse;
import defpackage.v7p;

/* loaded from: classes10.dex */
public final class FlexNetworkModule_ProvideCoroutineScopeFactory implements v7p {
    private final FlexNetworkModule module;

    private FlexNetworkModule_ProvideCoroutineScopeFactory(FlexNetworkModule flexNetworkModule) {
        this.module = flexNetworkModule;
    }

    public static FlexNetworkModule_ProvideCoroutineScopeFactory create(FlexNetworkModule flexNetworkModule) {
        return new FlexNetworkModule_ProvideCoroutineScopeFactory(flexNetworkModule);
    }

    public static tse provideCoroutineScope(FlexNetworkModule flexNetworkModule) {
        tse provideCoroutineScope = flexNetworkModule.provideCoroutineScope();
        q5z.i(provideCoroutineScope);
        return provideCoroutineScope;
    }

    @Override // defpackage.yvf0
    public tse get() {
        return provideCoroutineScope(this.module);
    }
}
