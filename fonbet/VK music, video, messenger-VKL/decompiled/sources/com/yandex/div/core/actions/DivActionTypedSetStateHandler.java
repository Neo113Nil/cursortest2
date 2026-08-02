package com.yandex.div.core.actions;

import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.state.PathFormatException;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.k0;
import com.yandex.div2.x;
import xsna.go9;

/* compiled from: DivActionTypedSetStateHandler.kt */
/* loaded from: classes7.dex */
public final class DivActionTypedSetStateHandler implements DivActionTypedHandler {
    private final void handleSetState(x xVar, Div2View div2View, ExpressionResolver expressionResolver) {
        String evaluate = xVar.a.evaluate(expressionResolver);
        try {
            div2View.switchToState(DivStatePath.Companion.parse(evaluate), xVar.b.evaluate(expressionResolver).booleanValue());
        } catch (PathFormatException e) {
            DivActionTypedUtilsKt.logError(div2View, new IllegalArgumentException(go9.b("Invalid format of ", evaluate), e));
        }
    }

    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(String str, k0 k0Var, Div2View div2View, ExpressionResolver expressionResolver) {
        if (!(k0Var instanceof k0.n)) {
            return false;
        }
        handleSetState(((k0.n) k0Var).b, div2View, expressionResolver);
        return true;
    }
}
