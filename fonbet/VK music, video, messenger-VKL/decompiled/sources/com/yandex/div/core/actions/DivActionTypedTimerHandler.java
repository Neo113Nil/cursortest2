package com.yandex.div.core.actions;

import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivActionTimer;
import com.yandex.div2.k0;

/* compiled from: DivActionTypedTimerHandler.kt */
/* loaded from: classes7.dex */
public final class DivActionTypedTimerHandler implements DivActionTypedHandler {
    private final void handleTimerAction(DivActionTimer divActionTimer, Div2View div2View, ExpressionResolver expressionResolver) {
        String evaluate = divActionTimer.b.evaluate(expressionResolver);
        DivActionTimer.Action.c cVar = DivActionTimer.Action.Converter;
        DivActionTimer.Action evaluate2 = divActionTimer.a.evaluate(expressionResolver);
        cVar.getClass();
        div2View.applyTimerCommand(evaluate, evaluate2.value);
    }

    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(String str, k0 k0Var, Div2View div2View, ExpressionResolver expressionResolver) {
        if (!(k0Var instanceof k0.s)) {
            return false;
        }
        handleTimerAction(((k0.s) k0Var).b, div2View, expressionResolver);
        return true;
    }
}
