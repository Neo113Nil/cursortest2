package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.controller;

import defpackage.lfe;
import defpackage.q5z;
import defpackage.v7p;
import defpackage.vh5;
import defpackage.xvf0;

/* loaded from: classes10.dex */
public final class FlexContentControllersModule_ProvideSkeletonContentControllerFactoryFactory implements v7p {
    private final FlexContentControllersModule module;
    private final xvf0 themeProvider;

    private FlexContentControllersModule_ProvideSkeletonContentControllerFactoryFactory(FlexContentControllersModule flexContentControllersModule, xvf0 xvf0Var) {
        this.module = flexContentControllersModule;
        this.themeProvider = xvf0Var;
    }

    public static FlexContentControllersModule_ProvideSkeletonContentControllerFactoryFactory create(FlexContentControllersModule flexContentControllersModule, xvf0 xvf0Var) {
        return new FlexContentControllersModule_ProvideSkeletonContentControllerFactoryFactory(flexContentControllersModule, xvf0Var);
    }

    public static lfe provideSkeletonContentControllerFactory(FlexContentControllersModule flexContentControllersModule, vh5 vh5Var) {
        lfe provideSkeletonContentControllerFactory = flexContentControllersModule.provideSkeletonContentControllerFactory(vh5Var);
        q5z.i(provideSkeletonContentControllerFactory);
        return provideSkeletonContentControllerFactory;
    }

    @Override // defpackage.yvf0
    public lfe get() {
        return provideSkeletonContentControllerFactory(this.module, (vh5) this.themeProvider.get());
    }
}
