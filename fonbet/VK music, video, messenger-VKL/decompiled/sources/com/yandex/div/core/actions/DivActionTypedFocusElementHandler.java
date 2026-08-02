package com.yandex.div.core.actions;

import android.view.View;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.widgets.DivInputView;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.k0;
import xsna.hjn;

/* compiled from: DivActionTypedFocusElementHandler.kt */
/* loaded from: classes7.dex */
public final class DivActionTypedFocusElementHandler implements DivActionTypedHandler {
    private final void handleRequestFocus(hjn hjnVar, Div2View div2View, ExpressionResolver expressionResolver) {
        String evaluate = hjnVar.a.evaluate(expressionResolver);
        View findViewWithTag = div2View.findViewWithTag(evaluate);
        if (findViewWithTag == null && (findViewWithTag = div2View.getViewComponent$div_release().getDivTooltipController().findViewWithTag(evaluate)) == null) {
            return;
        }
        findViewWithTag.requestFocus();
        if (findViewWithTag instanceof DivInputView) {
            DivActionTypedUtilsKt.openKeyboard((DivInputView) findViewWithTag);
        }
    }

    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(String str, k0 k0Var, Div2View div2View, ExpressionResolver expressionResolver) {
        if (!(k0Var instanceof k0.j)) {
            return false;
        }
        handleRequestFocus(((k0.j) k0Var).b, div2View, expressionResolver);
        return true;
    }
}
