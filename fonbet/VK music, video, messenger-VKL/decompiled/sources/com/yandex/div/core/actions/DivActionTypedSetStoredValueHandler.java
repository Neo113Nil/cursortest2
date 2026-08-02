package com.yandex.div.core.actions;

import com.yandex.div.core.expression.storedvalues.StoredValuesActionHandler;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.data.StoredValue;
import com.yandex.div.evaluable.types.Color;
import com.yandex.div.evaluable.types.Url;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.k0;
import kotlin.NoWhenBranchMatchedException;
import xsna.kqn;
import xsna.rjn;

/* compiled from: DivActionTypedSetStoredValueHandler.kt */
/* loaded from: classes7.dex */
public final class DivActionTypedSetStoredValueHandler implements DivActionTypedHandler {
    private final StoredValue createStoredValue(kqn kqnVar, String str, ExpressionResolver expressionResolver) {
        if (kqnVar instanceof kqn.g) {
            return new StoredValue.StringStoredValue(str, ((kqn.g) kqnVar).b.a.evaluate(expressionResolver));
        }
        if (kqnVar instanceof kqn.e) {
            return new StoredValue.IntegerStoredValue(str, ((kqn.e) kqnVar).b.a.evaluate(expressionResolver).longValue());
        }
        if (kqnVar instanceof kqn.b) {
            return new StoredValue.BooleanStoredValue(str, ((kqn.b) kqnVar).b.a.evaluate(expressionResolver).booleanValue());
        }
        if (kqnVar instanceof kqn.f) {
            return new StoredValue.DoubleStoredValue(str, ((kqn.f) kqnVar).b.a.evaluate(expressionResolver).doubleValue());
        }
        if (kqnVar instanceof kqn.c) {
            return new StoredValue.ColorStoredValue(str, Color.m185constructorimpl(((kqn.c) kqnVar).b.a.evaluate(expressionResolver).intValue()), null);
        }
        if (kqnVar instanceof kqn.h) {
            return new StoredValue.UrlStoredValue(str, Url.Companion.m202fromVcSV9u8(((kqn.h) kqnVar).b.a.evaluate(expressionResolver).toString()), null);
        }
        if (kqnVar instanceof kqn.a) {
            return new StoredValue.ArrayStoredValue(str, ((kqn.a) kqnVar).b.a.evaluate(expressionResolver));
        }
        if (kqnVar instanceof kqn.d) {
            return new StoredValue.DictStoredValue(str, ((kqn.d) kqnVar).b.a.evaluate(expressionResolver));
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(String str, k0 k0Var, Div2View div2View, ExpressionResolver expressionResolver) {
        if (!(k0Var instanceof k0.o)) {
            return false;
        }
        handleAction(((k0.o) k0Var).b, div2View, expressionResolver);
        return true;
    }

    private final void handleAction(rjn rjnVar, Div2View div2View, ExpressionResolver expressionResolver) {
        String evaluate = rjnVar.b.evaluate(expressionResolver);
        long longValue = rjnVar.a.evaluate(expressionResolver).longValue();
        StoredValuesActionHandler.INSTANCE.executeAction(createStoredValue(rjnVar.c, evaluate, expressionResolver), longValue, div2View);
    }
}
