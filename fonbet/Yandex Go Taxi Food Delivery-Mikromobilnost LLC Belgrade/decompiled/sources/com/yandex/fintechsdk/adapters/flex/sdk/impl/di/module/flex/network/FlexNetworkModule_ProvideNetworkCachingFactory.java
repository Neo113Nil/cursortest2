package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network;

import defpackage.jp50;
import defpackage.q5z;
import defpackage.v7p;

/* loaded from: classes10.dex */
public final class FlexNetworkModule_ProvideNetworkCachingFactory implements v7p {
    private final FlexNetworkModule module;

    private FlexNetworkModule_ProvideNetworkCachingFactory(FlexNetworkModule flexNetworkModule) {
        this.module = flexNetworkModule;
    }

    public static FlexNetworkModule_ProvideNetworkCachingFactory create(FlexNetworkModule flexNetworkModule) {
        return new FlexNetworkModule_ProvideNetworkCachingFactory(flexNetworkModule);
    }

    public static jp50 provideNetworkCaching(FlexNetworkModule flexNetworkModule) {
        jp50 provideNetworkCaching = flexNetworkModule.provideNetworkCaching();
        q5z.i(provideNetworkCaching);
        return provideNetworkCaching;
    }

    @Override // defpackage.yvf0
    public jp50 get() {
        return provideNetworkCaching(this.module);
    }
}
