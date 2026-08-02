package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex;

import defpackage.h3y;
import defpackage.i5m;
import defpackage.q5z;
import defpackage.r3l0;
import defpackage.v7p;
import defpackage.xvf0;

/* loaded from: classes10.dex */
public final class FlexNavigationModule_ProvideRouteHandlerProviderFactory implements v7p {
    private final FlexNavigationModule module;
    private final xvf0 routeHandlerProvider;

    private FlexNavigationModule_ProvideRouteHandlerProviderFactory(FlexNavigationModule flexNavigationModule, xvf0 xvf0Var) {
        this.module = flexNavigationModule;
        this.routeHandlerProvider = xvf0Var;
    }

    public static FlexNavigationModule_ProvideRouteHandlerProviderFactory create(FlexNavigationModule flexNavigationModule, xvf0 xvf0Var) {
        return new FlexNavigationModule_ProvideRouteHandlerProviderFactory(flexNavigationModule, xvf0Var);
    }

    public static r3l0 provideRouteHandlerProvider(FlexNavigationModule flexNavigationModule, h3y h3yVar) {
        r3l0 provideRouteHandlerProvider = flexNavigationModule.provideRouteHandlerProvider(h3yVar);
        q5z.i(provideRouteHandlerProvider);
        return provideRouteHandlerProvider;
    }

    @Override // defpackage.yvf0
    public r3l0 get() {
        return provideRouteHandlerProvider(this.module, i5m.a(this.routeHandlerProvider));
    }
}
