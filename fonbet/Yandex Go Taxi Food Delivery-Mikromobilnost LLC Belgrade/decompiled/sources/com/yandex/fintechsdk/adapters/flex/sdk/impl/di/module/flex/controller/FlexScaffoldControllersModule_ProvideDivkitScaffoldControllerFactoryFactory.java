package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.controller;

import com.yandex.div.core.Div2Context;
import defpackage.exy0;
import defpackage.q5z;
import defpackage.ujm0;
import defpackage.v7p;
import defpackage.xvf0;

/* loaded from: classes10.dex */
public final class FlexScaffoldControllersModule_ProvideDivkitScaffoldControllerFactoryFactory implements v7p {
    private final xvf0 div2ContextProvider;
    private final FlexScaffoldControllersModule module;
    private final xvf0 themedColorResolverProvider;

    private FlexScaffoldControllersModule_ProvideDivkitScaffoldControllerFactoryFactory(FlexScaffoldControllersModule flexScaffoldControllersModule, xvf0 xvf0Var, xvf0 xvf0Var2) {
        this.module = flexScaffoldControllersModule;
        this.div2ContextProvider = xvf0Var;
        this.themedColorResolverProvider = xvf0Var2;
    }

    public static FlexScaffoldControllersModule_ProvideDivkitScaffoldControllerFactoryFactory create(FlexScaffoldControllersModule flexScaffoldControllersModule, xvf0 xvf0Var, xvf0 xvf0Var2) {
        return new FlexScaffoldControllersModule_ProvideDivkitScaffoldControllerFactoryFactory(flexScaffoldControllersModule, xvf0Var, xvf0Var2);
    }

    public static ujm0 provideDivkitScaffoldControllerFactory(FlexScaffoldControllersModule flexScaffoldControllersModule, Div2Context div2Context, exy0 exy0Var) {
        ujm0 provideDivkitScaffoldControllerFactory = flexScaffoldControllersModule.provideDivkitScaffoldControllerFactory(div2Context, exy0Var);
        q5z.i(provideDivkitScaffoldControllerFactory);
        return provideDivkitScaffoldControllerFactory;
    }

    @Override // defpackage.yvf0
    public ujm0 get() {
        return provideDivkitScaffoldControllerFactory(this.module, (Div2Context) this.div2ContextProvider.get(), (exy0) this.themedColorResolverProvider.get());
    }
}
