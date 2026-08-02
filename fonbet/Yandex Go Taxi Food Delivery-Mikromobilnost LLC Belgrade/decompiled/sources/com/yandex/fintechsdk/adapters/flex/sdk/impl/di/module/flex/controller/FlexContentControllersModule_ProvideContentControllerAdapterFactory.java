package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.controller;

import defpackage.jfe;
import defpackage.lfe;
import defpackage.q5z;
import defpackage.see;
import defpackage.v7p;
import defpackage.xvf0;
import java.util.Map;

/* loaded from: classes10.dex */
public final class FlexContentControllersModule_ProvideContentControllerAdapterFactory implements v7p {
    private final xvf0 controllerFactoriesProvider;
    private final FlexContentControllersModule module;

    private FlexContentControllersModule_ProvideContentControllerAdapterFactory(FlexContentControllersModule flexContentControllersModule, xvf0 xvf0Var) {
        this.module = flexContentControllersModule;
        this.controllerFactoriesProvider = xvf0Var;
    }

    public static FlexContentControllersModule_ProvideContentControllerAdapterFactory create(FlexContentControllersModule flexContentControllersModule, xvf0 xvf0Var) {
        return new FlexContentControllersModule_ProvideContentControllerAdapterFactory(flexContentControllersModule, xvf0Var);
    }

    public static jfe provideContentControllerAdapter(FlexContentControllersModule flexContentControllersModule, Map<Class<? extends see>, lfe> map) {
        jfe provideContentControllerAdapter = flexContentControllersModule.provideContentControllerAdapter(map);
        q5z.i(provideContentControllerAdapter);
        return provideContentControllerAdapter;
    }

    @Override // defpackage.yvf0
    public jfe get() {
        return provideContentControllerAdapter(this.module, (Map) this.controllerFactoriesProvider.get());
    }
}
