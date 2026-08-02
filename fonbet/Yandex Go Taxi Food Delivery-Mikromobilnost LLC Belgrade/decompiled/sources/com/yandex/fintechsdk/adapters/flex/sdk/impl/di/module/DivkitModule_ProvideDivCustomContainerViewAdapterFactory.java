package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module;

import defpackage.plk;
import defpackage.q5z;
import defpackage.qmf;
import defpackage.v7p;
import defpackage.xvf0;
import defpackage.zh5;
import java.util.Map;

/* loaded from: classes10.dex */
public final class DivkitModule_ProvideDivCustomContainerViewAdapterFactory implements v7p {
    private final xvf0 bduiVariableControllerProvider;
    private final xvf0 customViewConfigurationsProvider;
    private final xvf0 customViewFactoryDelegateCreatorProvider;
    private final DivkitModule module;

    private DivkitModule_ProvideDivCustomContainerViewAdapterFactory(DivkitModule divkitModule, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3) {
        this.module = divkitModule;
        this.customViewFactoryDelegateCreatorProvider = xvf0Var;
        this.customViewConfigurationsProvider = xvf0Var2;
        this.bduiVariableControllerProvider = xvf0Var3;
    }

    public static DivkitModule_ProvideDivCustomContainerViewAdapterFactory create(DivkitModule divkitModule, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3) {
        return new DivkitModule_ProvideDivCustomContainerViewAdapterFactory(divkitModule, xvf0Var, xvf0Var2, xvf0Var3);
    }

    public static plk provideDivCustomContainerViewAdapter(DivkitModule divkitModule, qmf qmfVar, Map<String, Object> map, zh5 zh5Var) {
        plk provideDivCustomContainerViewAdapter = divkitModule.provideDivCustomContainerViewAdapter(qmfVar, map, zh5Var);
        q5z.i(provideDivCustomContainerViewAdapter);
        return provideDivCustomContainerViewAdapter;
    }

    @Override // defpackage.yvf0
    public plk get() {
        return provideDivCustomContainerViewAdapter(this.module, (qmf) this.customViewFactoryDelegateCreatorProvider.get(), (Map) this.customViewConfigurationsProvider.get(), (zh5) this.bduiVariableControllerProvider.get());
    }
}
