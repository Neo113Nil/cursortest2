package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.action;

import defpackage.b5x;
import defpackage.q5z;
import defpackage.t5x;
import defpackage.u4x;
import defpackage.v7p;
import defpackage.xvf0;

/* loaded from: classes10.dex */
public final class FlexActionHandlersModule_ProvideJasonActorFactory implements v7p {
    private final xvf0 debuggerProvider;
    private final FlexActionHandlersModule module;
    private final xvf0 printerProvider;

    private FlexActionHandlersModule_ProvideJasonActorFactory(FlexActionHandlersModule flexActionHandlersModule, xvf0 xvf0Var, xvf0 xvf0Var2) {
        this.module = flexActionHandlersModule;
        this.debuggerProvider = xvf0Var;
        this.printerProvider = xvf0Var2;
    }

    public static FlexActionHandlersModule_ProvideJasonActorFactory create(FlexActionHandlersModule flexActionHandlersModule, xvf0 xvf0Var, xvf0 xvf0Var2) {
        return new FlexActionHandlersModule_ProvideJasonActorFactory(flexActionHandlersModule, xvf0Var, xvf0Var2);
    }

    public static u4x provideJasonActor(FlexActionHandlersModule flexActionHandlersModule, b5x b5xVar, t5x t5xVar) {
        u4x provideJasonActor = flexActionHandlersModule.provideJasonActor(b5xVar, t5xVar);
        q5z.i(provideJasonActor);
        return provideJasonActor;
    }

    @Override // defpackage.yvf0
    public u4x get() {
        return provideJasonActor(this.module, (b5x) this.debuggerProvider.get(), (t5x) this.printerProvider.get());
    }
}
