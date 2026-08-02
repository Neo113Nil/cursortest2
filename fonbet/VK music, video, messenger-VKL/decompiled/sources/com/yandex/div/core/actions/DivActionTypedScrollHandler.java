package com.yandex.div.core.actions;

import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.items.DivViewWithItemsController;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivActionScrollBy;
import com.yandex.div2.k0;
import com.yandex.div2.p;
import com.yandex.div2.u;

/* compiled from: DivActionTypedScrollHandler.kt */
/* loaded from: classes7.dex */
public final class DivActionTypedScrollHandler implements DivActionTypedHandler {
    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(String str, k0 k0Var, Div2View div2View, ExpressionResolver expressionResolver) {
        if (k0Var instanceof k0.l) {
            handleAction(((k0.l) k0Var).b, div2View, expressionResolver);
            return true;
        }
        if (!(k0Var instanceof k0.m)) {
            return false;
        }
        handleAction(((k0.m) k0Var).b, div2View, expressionResolver);
        return true;
    }

    private final void handleAction(DivActionScrollBy divActionScrollBy, Div2View div2View, ExpressionResolver expressionResolver) {
        String evaluate = divActionScrollBy.b.evaluate(expressionResolver);
        int longValue = (int) divActionScrollBy.d.evaluate(expressionResolver).longValue();
        int longValue2 = (int) divActionScrollBy.c.evaluate(expressionResolver).longValue();
        DivActionScrollBy.Overflow.c cVar = DivActionScrollBy.Overflow.Converter;
        DivActionScrollBy.Overflow evaluate2 = divActionScrollBy.e.evaluate(expressionResolver);
        cVar.getClass();
        String str = evaluate2.value;
        boolean booleanValue = divActionScrollBy.a.evaluate(expressionResolver).booleanValue();
        DivViewWithItemsController create$default = DivViewWithItemsController.Companion.create$default(DivViewWithItemsController.Companion, evaluate, div2View, expressionResolver, null, 8, null);
        if (create$default == null) {
            return;
        }
        create$default.changeCurrentItemByStep(str, longValue2, booleanValue);
        create$default.scrollByOffset(str, longValue, booleanValue);
    }

    private final void handleAction(u uVar, Div2View div2View, ExpressionResolver expressionResolver) {
        String evaluate = uVar.c.evaluate(expressionResolver);
        boolean booleanValue = uVar.a.evaluate(expressionResolver).booleanValue();
        DivViewWithItemsController create$default = DivViewWithItemsController.Companion.create$default(DivViewWithItemsController.Companion, evaluate, div2View, expressionResolver, null, 8, null);
        if (create$default == null) {
            return;
        }
        p pVar = uVar.b;
        if (pVar instanceof p.c) {
            create$default.scrollTo((int) ((p.c) pVar).b.a.evaluate(expressionResolver).longValue(), booleanValue);
            return;
        }
        if (pVar instanceof p.b) {
            create$default.setCurrentItem((int) ((p.b) pVar).b.a.evaluate(expressionResolver).longValue(), booleanValue);
        } else if (pVar instanceof p.a) {
            create$default.scrollToEnd(booleanValue);
        } else if (pVar instanceof p.d) {
            create$default.scrollToStart(booleanValue);
        }
    }
}
