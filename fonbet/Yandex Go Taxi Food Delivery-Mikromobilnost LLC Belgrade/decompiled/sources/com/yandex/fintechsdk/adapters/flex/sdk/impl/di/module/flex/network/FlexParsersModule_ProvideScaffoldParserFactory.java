package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network;

import defpackage.ekm0;
import defpackage.gkm0;
import defpackage.q5z;
import defpackage.v7p;
import defpackage.xvf0;

/* loaded from: classes10.dex */
public final class FlexParsersModule_ProvideScaffoldParserFactory implements v7p {
    private final FlexParsersModule module;
    private final xvf0 serializerSelectorProvider;

    private FlexParsersModule_ProvideScaffoldParserFactory(FlexParsersModule flexParsersModule, xvf0 xvf0Var) {
        this.module = flexParsersModule;
        this.serializerSelectorProvider = xvf0Var;
    }

    public static FlexParsersModule_ProvideScaffoldParserFactory create(FlexParsersModule flexParsersModule, xvf0 xvf0Var) {
        return new FlexParsersModule_ProvideScaffoldParserFactory(flexParsersModule, xvf0Var);
    }

    public static ekm0 provideScaffoldParser(FlexParsersModule flexParsersModule, gkm0 gkm0Var) {
        ekm0 provideScaffoldParser = flexParsersModule.provideScaffoldParser(gkm0Var);
        q5z.i(provideScaffoldParser);
        return provideScaffoldParser;
    }

    @Override // defpackage.yvf0
    public ekm0 get() {
        return provideScaffoldParser(this.module, (gkm0) this.serializerSelectorProvider.get());
    }
}
