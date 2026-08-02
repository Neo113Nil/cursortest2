package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network;

import defpackage.cy;
import defpackage.ku;
import defpackage.q5z;
import defpackage.v7p;
import defpackage.xvf0;

/* loaded from: classes10.dex */
public final class FlexParsersModule_ProvideActionSerializerSelectorFactory implements v7p {
    private final xvf0 actionDecoderFactoryProvider;
    private final FlexParsersModule module;

    private FlexParsersModule_ProvideActionSerializerSelectorFactory(FlexParsersModule flexParsersModule, xvf0 xvf0Var) {
        this.module = flexParsersModule;
        this.actionDecoderFactoryProvider = xvf0Var;
    }

    public static FlexParsersModule_ProvideActionSerializerSelectorFactory create(FlexParsersModule flexParsersModule, xvf0 xvf0Var) {
        return new FlexParsersModule_ProvideActionSerializerSelectorFactory(flexParsersModule, xvf0Var);
    }

    public static cy provideActionSerializerSelector(FlexParsersModule flexParsersModule, ku kuVar) {
        cy provideActionSerializerSelector = flexParsersModule.provideActionSerializerSelector(kuVar);
        q5z.i(provideActionSerializerSelector);
        return provideActionSerializerSelector;
    }

    @Override // defpackage.yvf0
    public cy get() {
        return provideActionSerializerSelector(this.module, (ku) this.actionDecoderFactoryProvider.get());
    }
}
