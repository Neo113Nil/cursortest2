package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.controller;

import com.yandex.div.core.Div2Context;
import defpackage.lfe;
import defpackage.q5z;
import defpackage.v7p;
import defpackage.xvf0;

/* loaded from: classes10.dex */
public final class FlexContentControllersModule_ProvideDivkitContentControllerFactoryFactory implements v7p {
    private final xvf0 div2ContextProvider;
    private final FlexContentControllersModule module;

    private FlexContentControllersModule_ProvideDivkitContentControllerFactoryFactory(FlexContentControllersModule flexContentControllersModule, xvf0 xvf0Var) {
        this.module = flexContentControllersModule;
        this.div2ContextProvider = xvf0Var;
    }

    public static FlexContentControllersModule_ProvideDivkitContentControllerFactoryFactory create(FlexContentControllersModule flexContentControllersModule, xvf0 xvf0Var) {
        return new FlexContentControllersModule_ProvideDivkitContentControllerFactoryFactory(flexContentControllersModule, xvf0Var);
    }

    public static lfe provideDivkitContentControllerFactory(FlexContentControllersModule flexContentControllersModule, Div2Context div2Context) {
        lfe provideDivkitContentControllerFactory = flexContentControllersModule.provideDivkitContentControllerFactory(div2Context);
        q5z.i(provideDivkitContentControllerFactory);
        return provideDivkitContentControllerFactory;
    }

    @Override // defpackage.yvf0
    public lfe get() {
        return provideDivkitContentControllerFactory(this.module, (Div2Context) this.div2ContextProvider.get());
    }
}
