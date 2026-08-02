package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.controller;

import defpackage.mjm0;
import defpackage.q5z;
import defpackage.sjm0;
import defpackage.ujm0;
import defpackage.v7p;
import defpackage.xvf0;
import java.util.Map;

/* loaded from: classes10.dex */
public final class FlexScaffoldControllersModule_ProvideScaffoldControllerAdapterFactory implements v7p {
    private final xvf0 controllerFactoriesProvider;
    private final FlexScaffoldControllersModule module;

    private FlexScaffoldControllersModule_ProvideScaffoldControllerAdapterFactory(FlexScaffoldControllersModule flexScaffoldControllersModule, xvf0 xvf0Var) {
        this.module = flexScaffoldControllersModule;
        this.controllerFactoriesProvider = xvf0Var;
    }

    public static FlexScaffoldControllersModule_ProvideScaffoldControllerAdapterFactory create(FlexScaffoldControllersModule flexScaffoldControllersModule, xvf0 xvf0Var) {
        return new FlexScaffoldControllersModule_ProvideScaffoldControllerAdapterFactory(flexScaffoldControllersModule, xvf0Var);
    }

    public static sjm0 provideScaffoldControllerAdapter(FlexScaffoldControllersModule flexScaffoldControllersModule, Map<Class<? extends mjm0>, ujm0> map) {
        sjm0 provideScaffoldControllerAdapter = flexScaffoldControllersModule.provideScaffoldControllerAdapter(map);
        q5z.i(provideScaffoldControllerAdapter);
        return provideScaffoldControllerAdapter;
    }

    @Override // defpackage.yvf0
    public sjm0 get() {
        return provideScaffoldControllerAdapter(this.module, (Map) this.controllerFactoriesProvider.get());
    }
}
