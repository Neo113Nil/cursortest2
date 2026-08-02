package com.yandex.div.core.actions;

import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.k0;
import xsna.mjn;

/* compiled from: DivActionTypedHideTooltipHandler.kt */
/* loaded from: classes7.dex */
public final class DivActionTypedHideTooltipHandler implements DivActionTypedHandler {
    private final void handleHideTooltip(mjn mjnVar, Div2View div2View, ExpressionResolver expressionResolver) {
        div2View.hideTooltip(mjnVar.a.evaluate(expressionResolver));
    }

    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(String str, k0 k0Var, Div2View div2View, ExpressionResolver expressionResolver) {
        if (!(k0Var instanceof k0.k)) {
            return false;
        }
        handleHideTooltip(((k0.k) k0Var).b, div2View, expressionResolver);
        return true;
    }
}
