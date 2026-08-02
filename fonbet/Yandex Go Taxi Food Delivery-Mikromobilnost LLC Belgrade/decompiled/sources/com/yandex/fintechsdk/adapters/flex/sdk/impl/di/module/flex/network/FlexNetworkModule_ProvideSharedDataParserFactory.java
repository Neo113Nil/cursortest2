package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network;

import defpackage.enr0;
import defpackage.q5z;
import defpackage.v7p;

/* loaded from: classes10.dex */
public final class FlexNetworkModule_ProvideSharedDataParserFactory implements v7p {
    private final FlexNetworkModule module;

    private FlexNetworkModule_ProvideSharedDataParserFactory(FlexNetworkModule flexNetworkModule) {
        this.module = flexNetworkModule;
    }

    public static FlexNetworkModule_ProvideSharedDataParserFactory create(FlexNetworkModule flexNetworkModule) {
        return new FlexNetworkModule_ProvideSharedDataParserFactory(flexNetworkModule);
    }

    public static enr0 provideSharedDataParser(FlexNetworkModule flexNetworkModule) {
        enr0 provideSharedDataParser = flexNetworkModule.provideSharedDataParser();
        q5z.i(provideSharedDataParser);
        return provideSharedDataParser;
    }

    @Override // defpackage.yvf0
    public enr0 get() {
        return provideSharedDataParser(this.module);
    }
}
