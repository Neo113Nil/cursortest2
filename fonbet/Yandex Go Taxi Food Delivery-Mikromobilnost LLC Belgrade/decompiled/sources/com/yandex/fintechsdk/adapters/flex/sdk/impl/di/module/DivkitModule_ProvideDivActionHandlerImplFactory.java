package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module;

import com.yandex.div.core.expression.variables.a;
import com.yandex.fintechsdk.adapters.flex.sdk.api.FlexDependencies;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.action.DivActionHandlerImpl;
import defpackage.q5z;
import defpackage.v7p;
import defpackage.xvf0;

/* loaded from: classes10.dex */
public final class DivkitModule_ProvideDivActionHandlerImplFactory implements v7p {
    private final xvf0 divVariableControllerProvider;
    private final xvf0 flexDependenciesProvider;
    private final DivkitModule module;

    private DivkitModule_ProvideDivActionHandlerImplFactory(DivkitModule divkitModule, xvf0 xvf0Var, xvf0 xvf0Var2) {
        this.module = divkitModule;
        this.divVariableControllerProvider = xvf0Var;
        this.flexDependenciesProvider = xvf0Var2;
    }

    public static DivkitModule_ProvideDivActionHandlerImplFactory create(DivkitModule divkitModule, xvf0 xvf0Var, xvf0 xvf0Var2) {
        return new DivkitModule_ProvideDivActionHandlerImplFactory(divkitModule, xvf0Var, xvf0Var2);
    }

    public static DivActionHandlerImpl provideDivActionHandlerImpl(DivkitModule divkitModule, a aVar, FlexDependencies flexDependencies) {
        DivActionHandlerImpl provideDivActionHandlerImpl = divkitModule.provideDivActionHandlerImpl(aVar, flexDependencies);
        q5z.i(provideDivActionHandlerImpl);
        return provideDivActionHandlerImpl;
    }

    @Override // defpackage.yvf0
    public DivActionHandlerImpl get() {
        return provideDivActionHandlerImpl(this.module, (a) this.divVariableControllerProvider.get(), (FlexDependencies) this.flexDependenciesProvider.get());
    }
}
