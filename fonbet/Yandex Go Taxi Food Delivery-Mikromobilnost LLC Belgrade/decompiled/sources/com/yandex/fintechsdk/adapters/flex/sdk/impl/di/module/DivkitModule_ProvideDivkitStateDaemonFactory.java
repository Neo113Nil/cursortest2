package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module;

import core.divkit.state.a;
import defpackage.k6x;
import defpackage.q5z;
import defpackage.v7p;
import defpackage.xvf0;

/* loaded from: classes10.dex */
public final class DivkitModule_ProvideDivkitStateDaemonFactory implements v7p {
    private final xvf0 jasonStateStoreProvider;
    private final DivkitModule module;
    private final xvf0 variableControllerProvider;

    private DivkitModule_ProvideDivkitStateDaemonFactory(DivkitModule divkitModule, xvf0 xvf0Var, xvf0 xvf0Var2) {
        this.module = divkitModule;
        this.jasonStateStoreProvider = xvf0Var;
        this.variableControllerProvider = xvf0Var2;
    }

    public static DivkitModule_ProvideDivkitStateDaemonFactory create(DivkitModule divkitModule, xvf0 xvf0Var, xvf0 xvf0Var2) {
        return new DivkitModule_ProvideDivkitStateDaemonFactory(divkitModule, xvf0Var, xvf0Var2);
    }

    public static a provideDivkitStateDaemon(DivkitModule divkitModule, k6x k6xVar, com.yandex.div.core.expression.variables.a aVar) {
        a provideDivkitStateDaemon = divkitModule.provideDivkitStateDaemon(k6xVar, aVar);
        q5z.i(provideDivkitStateDaemon);
        return provideDivkitStateDaemon;
    }

    @Override // defpackage.yvf0
    public a get() {
        return provideDivkitStateDaemon(this.module, (k6x) this.jasonStateStoreProvider.get(), (com.yandex.div.core.expression.variables.a) this.variableControllerProvider.get());
    }
}
