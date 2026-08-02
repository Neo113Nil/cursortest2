package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network;

import defpackage.gkm0;
import defpackage.q5z;
import defpackage.v7p;

/* loaded from: classes10.dex */
public final class FlexParsersModule_ProvideScaffoldSerializerSelectorFactory implements v7p {
    private final FlexParsersModule module;

    private FlexParsersModule_ProvideScaffoldSerializerSelectorFactory(FlexParsersModule flexParsersModule) {
        this.module = flexParsersModule;
    }

    public static FlexParsersModule_ProvideScaffoldSerializerSelectorFactory create(FlexParsersModule flexParsersModule) {
        return new FlexParsersModule_ProvideScaffoldSerializerSelectorFactory(flexParsersModule);
    }

    public static gkm0 provideScaffoldSerializerSelector(FlexParsersModule flexParsersModule) {
        gkm0 provideScaffoldSerializerSelector = flexParsersModule.provideScaffoldSerializerSelector();
        q5z.i(provideScaffoldSerializerSelector);
        return provideScaffoldSerializerSelector;
    }

    @Override // defpackage.yvf0
    public gkm0 get() {
        return provideScaffoldSerializerSelector(this.module);
    }
}
