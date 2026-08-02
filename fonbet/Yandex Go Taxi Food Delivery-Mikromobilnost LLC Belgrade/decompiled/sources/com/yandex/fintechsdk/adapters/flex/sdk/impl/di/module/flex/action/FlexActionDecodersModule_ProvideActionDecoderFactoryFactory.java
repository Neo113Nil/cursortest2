package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.action;

import defpackage.ku;
import defpackage.lu;
import defpackage.q5z;
import defpackage.v7p;
import defpackage.xvf0;
import java.util.Set;

/* loaded from: classes10.dex */
public final class FlexActionDecodersModule_ProvideActionDecoderFactoryFactory implements v7p {
    private final xvf0 actionDecoderModulesProvider;
    private final FlexActionDecodersModule module;

    private FlexActionDecodersModule_ProvideActionDecoderFactoryFactory(FlexActionDecodersModule flexActionDecodersModule, xvf0 xvf0Var) {
        this.module = flexActionDecodersModule;
        this.actionDecoderModulesProvider = xvf0Var;
    }

    public static FlexActionDecodersModule_ProvideActionDecoderFactoryFactory create(FlexActionDecodersModule flexActionDecodersModule, xvf0 xvf0Var) {
        return new FlexActionDecodersModule_ProvideActionDecoderFactoryFactory(flexActionDecodersModule, xvf0Var);
    }

    public static ku provideActionDecoderFactory(FlexActionDecodersModule flexActionDecodersModule, Set<lu> set) {
        ku provideActionDecoderFactory = flexActionDecodersModule.provideActionDecoderFactory(set);
        q5z.i(provideActionDecoderFactory);
        return provideActionDecoderFactory;
    }

    @Override // defpackage.yvf0
    public ku get() {
        return provideActionDecoderFactory(this.module, (Set) this.actionDecoderModulesProvider.get());
    }
}
