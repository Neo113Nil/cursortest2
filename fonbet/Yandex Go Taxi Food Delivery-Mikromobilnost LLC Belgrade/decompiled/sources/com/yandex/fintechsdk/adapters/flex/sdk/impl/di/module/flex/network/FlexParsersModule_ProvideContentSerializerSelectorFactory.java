package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network;

import defpackage.phe;
import defpackage.q5z;
import defpackage.v7p;

/* loaded from: classes10.dex */
public final class FlexParsersModule_ProvideContentSerializerSelectorFactory implements v7p {
    private final FlexParsersModule module;

    private FlexParsersModule_ProvideContentSerializerSelectorFactory(FlexParsersModule flexParsersModule) {
        this.module = flexParsersModule;
    }

    public static FlexParsersModule_ProvideContentSerializerSelectorFactory create(FlexParsersModule flexParsersModule) {
        return new FlexParsersModule_ProvideContentSerializerSelectorFactory(flexParsersModule);
    }

    public static phe provideContentSerializerSelector(FlexParsersModule flexParsersModule) {
        phe provideContentSerializerSelector = flexParsersModule.provideContentSerializerSelector();
        q5z.i(provideContentSerializerSelector);
        return provideContentSerializerSelector;
    }

    @Override // defpackage.yvf0
    public phe get() {
        return provideContentSerializerSelector(this.module);
    }
}
