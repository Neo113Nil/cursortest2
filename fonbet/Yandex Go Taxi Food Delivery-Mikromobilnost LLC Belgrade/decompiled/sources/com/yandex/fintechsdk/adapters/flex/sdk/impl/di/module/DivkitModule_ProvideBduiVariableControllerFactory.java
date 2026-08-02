package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module;

import com.yandex.div.core.expression.variables.a;
import defpackage.q5z;
import defpackage.v7p;
import defpackage.xvf0;
import defpackage.zh5;

/* loaded from: classes10.dex */
public final class DivkitModule_ProvideBduiVariableControllerFactory implements v7p {
    private final xvf0 divVariableControllerProvider;
    private final DivkitModule module;

    private DivkitModule_ProvideBduiVariableControllerFactory(DivkitModule divkitModule, xvf0 xvf0Var) {
        this.module = divkitModule;
        this.divVariableControllerProvider = xvf0Var;
    }

    public static DivkitModule_ProvideBduiVariableControllerFactory create(DivkitModule divkitModule, xvf0 xvf0Var) {
        return new DivkitModule_ProvideBduiVariableControllerFactory(divkitModule, xvf0Var);
    }

    public static zh5 provideBduiVariableController(DivkitModule divkitModule, a aVar) {
        zh5 provideBduiVariableController = divkitModule.provideBduiVariableController(aVar);
        q5z.i(provideBduiVariableController);
        return provideBduiVariableController;
    }

    @Override // defpackage.yvf0
    public zh5 get() {
        return provideBduiVariableController(this.module, (a) this.divVariableControllerProvider.get());
    }
}
