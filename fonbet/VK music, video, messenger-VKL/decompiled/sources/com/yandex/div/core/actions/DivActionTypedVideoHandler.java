package com.yandex.div.core.actions;

import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivActionVideo;
import com.yandex.div2.k0;

/* compiled from: DivActionTypedVideoHandler.kt */
/* loaded from: classes7.dex */
public final class DivActionTypedVideoHandler implements DivActionTypedHandler {
    private final void handleVideoAction(DivActionVideo divActionVideo, Div2View div2View, ExpressionResolver expressionResolver) {
        String evaluate = divActionVideo.b.evaluate(expressionResolver);
        DivActionVideo.Action.c cVar = DivActionVideo.Action.Converter;
        DivActionVideo.Action evaluate2 = divActionVideo.a.evaluate(expressionResolver);
        cVar.getClass();
        div2View.applyVideoCommand(evaluate, evaluate2.value, expressionResolver);
    }

    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(String str, k0 k0Var, Div2View div2View, ExpressionResolver expressionResolver) {
        if (!(k0Var instanceof k0.u)) {
            return false;
        }
        handleVideoAction(((k0.u) k0Var).b, div2View, expressionResolver);
        return true;
    }
}
