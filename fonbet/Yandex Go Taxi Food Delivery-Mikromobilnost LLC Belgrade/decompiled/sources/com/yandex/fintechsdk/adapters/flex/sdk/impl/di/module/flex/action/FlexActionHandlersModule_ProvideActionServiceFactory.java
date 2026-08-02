package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.action;

import defpackage.hy;
import defpackage.iy;
import defpackage.jse;
import defpackage.lu00;
import defpackage.q5z;
import defpackage.ux;
import defpackage.v7p;
import defpackage.xvf0;

/* loaded from: classes10.dex */
public final class FlexActionHandlersModule_ProvideActionServiceFactory implements v7p {
    private final xvf0 actionServiceErrorHandlerProvider;
    private final xvf0 mapiClientProvider;
    private final FlexActionHandlersModule module;
    private final xvf0 networkDispatcherProvider;
    private final xvf0 parserFactoryProvider;

    private FlexActionHandlersModule_ProvideActionServiceFactory(FlexActionHandlersModule flexActionHandlersModule, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4) {
        this.module = flexActionHandlersModule;
        this.mapiClientProvider = xvf0Var;
        this.parserFactoryProvider = xvf0Var2;
        this.networkDispatcherProvider = xvf0Var3;
        this.actionServiceErrorHandlerProvider = xvf0Var4;
    }

    public static FlexActionHandlersModule_ProvideActionServiceFactory create(FlexActionHandlersModule flexActionHandlersModule, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4) {
        return new FlexActionHandlersModule_ProvideActionServiceFactory(flexActionHandlersModule, xvf0Var, xvf0Var2, xvf0Var3, xvf0Var4);
    }

    public static hy provideActionService(FlexActionHandlersModule flexActionHandlersModule, lu00 lu00Var, ux uxVar, jse jseVar, iy iyVar) {
        hy provideActionService = flexActionHandlersModule.provideActionService(lu00Var, uxVar, jseVar, iyVar);
        q5z.i(provideActionService);
        return provideActionService;
    }

    @Override // defpackage.yvf0
    public hy get() {
        return provideActionService(this.module, (lu00) this.mapiClientProvider.get(), (ux) this.parserFactoryProvider.get(), (jse) this.networkDispatcherProvider.get(), (iy) this.actionServiceErrorHandlerProvider.get());
    }
}
