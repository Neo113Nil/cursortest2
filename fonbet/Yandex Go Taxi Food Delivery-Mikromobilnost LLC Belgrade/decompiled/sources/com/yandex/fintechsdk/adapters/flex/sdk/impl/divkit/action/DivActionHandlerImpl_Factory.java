package com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.action;

import com.yandex.div.core.expression.variables.a;
import defpackage.v7p;
import defpackage.w6k;
import defpackage.xvf0;
import java.util.Map;

/* loaded from: classes10.dex */
public final class DivActionHandlerImpl_Factory implements v7p {
    private final xvf0 divActionHandlersProvider;
    private final xvf0 variableControllerProvider;

    private DivActionHandlerImpl_Factory(xvf0 xvf0Var, xvf0 xvf0Var2) {
        this.divActionHandlersProvider = xvf0Var;
        this.variableControllerProvider = xvf0Var2;
    }

    public static DivActionHandlerImpl_Factory create(xvf0 xvf0Var, xvf0 xvf0Var2) {
        return new DivActionHandlerImpl_Factory(xvf0Var, xvf0Var2);
    }

    public static DivActionHandlerImpl newInstance(Map<String, w6k> map, a aVar) {
        return new DivActionHandlerImpl(map, aVar);
    }

    @Override // defpackage.yvf0
    public DivActionHandlerImpl get() {
        return newInstance((Map) this.divActionHandlersProvider.get(), (a) this.variableControllerProvider.get());
    }
}
