package com.yandex.div.core.actions;

import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.k0;
import xsna.bkn;

/* compiled from: DivActionTypedShowTooltipHandler.kt */
/* loaded from: classes7.dex */
public final class DivActionTypedShowTooltipHandler implements DivActionTypedHandler {
    private final void handleShowTooltip(bkn bknVar, Div2View div2View, ExpressionResolver expressionResolver) {
        String evaluate = bknVar.a.evaluate(expressionResolver);
        Expression<Boolean> expression = bknVar.b;
        Boolean evaluate2 = expression != null ? expression.evaluate(expressionResolver) : null;
        if (evaluate2 != null) {
            div2View.showTooltip(evaluate, evaluate2.booleanValue());
        } else {
            div2View.showTooltip(evaluate);
        }
    }

    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(String str, k0 k0Var, Div2View div2View, ExpressionResolver expressionResolver) {
        if (!(k0Var instanceof k0.q)) {
            return false;
        }
        handleShowTooltip(((k0.q) k0Var).b, div2View, expressionResolver);
        return true;
    }
}
