package com.yandex.div.core.actions;

import com.yandex.div.core.view2.Div2View;
import com.yandex.div.data.Variable;
import com.yandex.div.internal.core.VariableMutationHandler;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.k0;
import org.json.JSONObject;
import xsna.izs;
import xsna.kqn;
import xsna.xin;

/* compiled from: DivActionTypedDictSetValueHandler.kt */
/* loaded from: classes7.dex */
public final class DivActionTypedDictSetValueHandler implements DivActionTypedHandler {
    private final void handleSetValue(xin xinVar, final Div2View div2View, ExpressionResolver expressionResolver) {
        String evaluate = xinVar.c.evaluate(expressionResolver);
        final String evaluate2 = xinVar.a.evaluate(expressionResolver);
        kqn kqnVar = xinVar.b;
        final Object evaluate3 = kqnVar != null ? DivActionTypedUtilsKt.evaluate(kqnVar, expressionResolver) : null;
        VariableMutationHandler.Companion.setVariable(div2View, evaluate, expressionResolver, new izs<Variable, Variable>() { // from class: com.yandex.div.core.actions.DivActionTypedDictSetValueHandler$handleSetValue$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public final Variable invoke(Variable variable) {
                JSONObject clone;
                if (!(variable instanceof Variable.DictVariable)) {
                    DivActionTypedUtilsKt.logError(Div2View.this, new IllegalArgumentException("dict_set_value action requires dict variable"));
                    return variable;
                }
                Object value = variable.getValue();
                JSONObject jSONObject = value instanceof JSONObject ? (JSONObject) value : null;
                if (jSONObject == null) {
                    DivActionTypedUtilsKt.logError(Div2View.this, new IllegalArgumentException("Invalid variable value"));
                    return variable;
                }
                clone = DivActionTypedDictSetValueHandlerKt.clone(jSONObject);
                Object obj = evaluate3;
                if (obj != null) {
                    ((Variable.DictVariable) variable).set(clone.put(evaluate2, obj));
                    return variable;
                }
                clone.remove(evaluate2);
                ((Variable.DictVariable) variable).set(clone);
                return variable;
            }
        });
    }

    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(String str, k0 k0Var, Div2View div2View, ExpressionResolver expressionResolver) {
        if (!(k0Var instanceof k0.h)) {
            return false;
        }
        handleSetValue(((k0.h) k0Var).b, div2View, expressionResolver);
        return true;
    }
}
