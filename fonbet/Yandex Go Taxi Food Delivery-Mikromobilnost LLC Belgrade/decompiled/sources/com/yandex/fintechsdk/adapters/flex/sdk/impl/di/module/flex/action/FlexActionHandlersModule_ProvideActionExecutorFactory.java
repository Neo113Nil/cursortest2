package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.action;

import defpackage.hv90;
import defpackage.hy;
import defpackage.q5z;
import defpackage.v7p;
import defpackage.xv;
import defpackage.xvf0;
import java.util.Set;

/* loaded from: classes10.dex */
public final class FlexActionHandlersModule_ProvideActionExecutorFactory implements v7p {
    private final xvf0 actionServiceProvider;
    private final FlexActionHandlersModule module;
    private final xvf0 payloadExtendersProvider;

    private FlexActionHandlersModule_ProvideActionExecutorFactory(FlexActionHandlersModule flexActionHandlersModule, xvf0 xvf0Var, xvf0 xvf0Var2) {
        this.module = flexActionHandlersModule;
        this.actionServiceProvider = xvf0Var;
        this.payloadExtendersProvider = xvf0Var2;
    }

    public static FlexActionHandlersModule_ProvideActionExecutorFactory create(FlexActionHandlersModule flexActionHandlersModule, xvf0 xvf0Var, xvf0 xvf0Var2) {
        return new FlexActionHandlersModule_ProvideActionExecutorFactory(flexActionHandlersModule, xvf0Var, xvf0Var2);
    }

    public static xv provideActionExecutor(FlexActionHandlersModule flexActionHandlersModule, hy hyVar, Set<hv90> set) {
        xv provideActionExecutor = flexActionHandlersModule.provideActionExecutor(hyVar, set);
        q5z.i(provideActionExecutor);
        return provideActionExecutor;
    }

    @Override // defpackage.yvf0
    public xv get() {
        return provideActionExecutor(this.module, (hy) this.actionServiceProvider.get(), (Set) this.payloadExtendersProvider.get());
    }
}
