package com.yandex.div.core.actions;

import android.view.View;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.ViewLocator;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.k0;
import java.util.List;
import xsna.j5g;

/* compiled from: DivAnimatorTypedActionHandler.kt */
/* loaded from: classes7.dex */
public final class DivAnimatorTypedActionHandler implements DivActionTypedHandler {
    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(String str, k0 k0Var, Div2View div2View, ExpressionResolver expressionResolver) {
        if (!(k0Var instanceof k0.a)) {
            if (!(k0Var instanceof k0.b)) {
                return false;
            }
            if (str == null) {
                return true;
            }
            div2View.getViewComponent$div_release().getAnimatorController().stopAnimator(str, ((k0.b) k0Var).b.a);
            return true;
        }
        if (str == null) {
            return true;
        }
        List<View> findViewsWithTag = ViewLocator.findViewsWithTag(div2View, str);
        if (findViewsWithTag.size() != 1) {
            return true;
        }
        div2View.getViewComponent$div_release().getAnimatorController().startAnimator(str, (View) j5g.Y(findViewsWithTag), ((k0.a) k0Var).b, expressionResolver);
        return true;
    }
}
