package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.action;

import defpackage.d0m;
import defpackage.q5z;
import defpackage.ux;
import defpackage.v7p;
import defpackage.xvf0;

/* loaded from: classes10.dex */
public final class FlexActionHandlersModule_ProvideActionResponseParserFactoryFactory implements v7p {
    private final xvf0 documentJsonProvider;
    private final FlexActionHandlersModule module;

    private FlexActionHandlersModule_ProvideActionResponseParserFactoryFactory(FlexActionHandlersModule flexActionHandlersModule, xvf0 xvf0Var) {
        this.module = flexActionHandlersModule;
        this.documentJsonProvider = xvf0Var;
    }

    public static FlexActionHandlersModule_ProvideActionResponseParserFactoryFactory create(FlexActionHandlersModule flexActionHandlersModule, xvf0 xvf0Var) {
        return new FlexActionHandlersModule_ProvideActionResponseParserFactoryFactory(flexActionHandlersModule, xvf0Var);
    }

    public static ux provideActionResponseParserFactory(FlexActionHandlersModule flexActionHandlersModule, d0m d0mVar) {
        ux provideActionResponseParserFactory = flexActionHandlersModule.provideActionResponseParserFactory(d0mVar);
        q5z.i(provideActionResponseParserFactory);
        return provideActionResponseParserFactory;
    }

    @Override // defpackage.yvf0
    public ux get() {
        return provideActionResponseParserFactory(this.module, (d0m) this.documentJsonProvider.get());
    }
}
