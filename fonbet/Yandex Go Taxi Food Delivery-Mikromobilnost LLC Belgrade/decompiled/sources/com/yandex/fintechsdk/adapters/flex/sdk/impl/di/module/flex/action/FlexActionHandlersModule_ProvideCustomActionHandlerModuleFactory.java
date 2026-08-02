package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.action;

import defpackage.fw;
import defpackage.kg5;
import defpackage.p85;
import defpackage.q5z;
import defpackage.v7p;
import defpackage.xvf0;
import java.util.List;

/* loaded from: classes10.dex */
public final class FlexActionHandlersModule_ProvideCustomActionHandlerModuleFactory implements v7p {
    private final xvf0 actionsInfoProvider;
    private final xvf0 activityProvider;
    private final FlexActionHandlersModule module;

    private FlexActionHandlersModule_ProvideCustomActionHandlerModuleFactory(FlexActionHandlersModule flexActionHandlersModule, xvf0 xvf0Var, xvf0 xvf0Var2) {
        this.module = flexActionHandlersModule;
        this.actionsInfoProvider = xvf0Var;
        this.activityProvider = xvf0Var2;
    }

    public static FlexActionHandlersModule_ProvideCustomActionHandlerModuleFactory create(FlexActionHandlersModule flexActionHandlersModule, xvf0 xvf0Var, xvf0 xvf0Var2) {
        return new FlexActionHandlersModule_ProvideCustomActionHandlerModuleFactory(flexActionHandlersModule, xvf0Var, xvf0Var2);
    }

    public static fw provideCustomActionHandlerModule(FlexActionHandlersModule flexActionHandlersModule, List<kg5> list, p85 p85Var) {
        fw provideCustomActionHandlerModule = flexActionHandlersModule.provideCustomActionHandlerModule(list, p85Var);
        q5z.i(provideCustomActionHandlerModule);
        return provideCustomActionHandlerModule;
    }

    @Override // defpackage.yvf0
    public fw get() {
        return provideCustomActionHandlerModule(this.module, (List) this.actionsInfoProvider.get(), (p85) this.activityProvider.get());
    }
}
