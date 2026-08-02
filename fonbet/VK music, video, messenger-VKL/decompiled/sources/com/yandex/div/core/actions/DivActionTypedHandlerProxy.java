package com.yandex.div.core.actions;

import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.downloader.DivDownloadActionHandler;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.internal.Assert;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;
import com.yandex.div2.k0;
import xsna.apn;
import xsna.pkn;

/* compiled from: DivActionTypedHandlerProxy.kt */
/* loaded from: classes7.dex */
public final class DivActionTypedHandlerProxy {
    public static final DivActionTypedHandlerProxy INSTANCE = new DivActionTypedHandlerProxy();

    private DivActionTypedHandlerProxy() {
    }

    public static final boolean handleAction(DivAction divAction, DivViewFacade divViewFacade, ExpressionResolver expressionResolver) {
        return INSTANCE.handleAction(divAction.h, divAction.j, divViewFacade, expressionResolver, divAction.a);
    }

    public static final boolean handleVisibilityAction(apn apnVar, DivViewFacade divViewFacade, ExpressionResolver expressionResolver) {
        return INSTANCE.handleAction(apnVar.d(), apnVar.c(), divViewFacade, expressionResolver, apnVar.f());
    }

    private final boolean handleAction(String str, k0 k0Var, DivViewFacade divViewFacade, ExpressionResolver expressionResolver, pkn pknVar) {
        if (k0Var == null) {
            return false;
        }
        if (!(divViewFacade instanceof Div2View)) {
            Assert.fail("Div2View should be used!");
            return false;
        }
        if (k0Var instanceof k0.i) {
            return DivDownloadActionHandler.INSTANCE.handleAction(((k0.i) k0Var).b, pknVar, (Div2View) divViewFacade, expressionResolver);
        }
        Div2View div2View = (Div2View) divViewFacade;
        return div2View.getDiv2Component$div_release().getActionTypedHandlerCombiner().handleAction(str, k0Var, div2View, expressionResolver);
    }
}
