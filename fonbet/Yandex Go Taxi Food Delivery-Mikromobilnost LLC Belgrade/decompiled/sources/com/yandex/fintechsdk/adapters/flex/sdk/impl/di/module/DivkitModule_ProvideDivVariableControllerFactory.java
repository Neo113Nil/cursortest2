package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module;

import com.yandex.div.core.expression.variables.a;
import defpackage.q5z;
import defpackage.v7p;

/* loaded from: classes10.dex */
public final class DivkitModule_ProvideDivVariableControllerFactory implements v7p {
    private final DivkitModule module;

    private DivkitModule_ProvideDivVariableControllerFactory(DivkitModule divkitModule) {
        this.module = divkitModule;
    }

    public static DivkitModule_ProvideDivVariableControllerFactory create(DivkitModule divkitModule) {
        return new DivkitModule_ProvideDivVariableControllerFactory(divkitModule);
    }

    public static a provideDivVariableController(DivkitModule divkitModule) {
        a provideDivVariableController = divkitModule.provideDivVariableController();
        q5z.i(provideDivVariableController);
        return provideDivVariableController;
    }

    @Override // defpackage.yvf0
    public a get() {
        return provideDivVariableController(this.module);
    }
}
