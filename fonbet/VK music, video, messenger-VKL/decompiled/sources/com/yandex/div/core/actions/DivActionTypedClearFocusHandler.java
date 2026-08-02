package com.yandex.div.core.actions;

import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.k0;

/* compiled from: DivActionTypedClearFocusHandler.kt */
/* loaded from: classes7.dex */
public final class DivActionTypedClearFocusHandler implements DivActionTypedHandler {
    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(String str, k0 k0Var, Div2View div2View, ExpressionResolver expressionResolver) {
        if (!(k0Var instanceof k0.f)) {
            return false;
        }
        div2View.clearFocus();
        DivActionTypedUtilsKt.closeKeyboard(div2View);
        return true;
    }
}
