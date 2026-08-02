package com.yandex.div.core.actions;

import com.yandex.div.core.view2.Div2View;
import com.yandex.div.data.Variable;
import com.yandex.div.internal.core.VariableMutationHandler;
import com.yandex.div.internal.util.JsonUtilsKt;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import xsna.izs;
import xsna.s3q0;

/* compiled from: DivActionTypedArrayMutationHandler.kt */
/* loaded from: classes7.dex */
public final class DivActionTypedArrayMutationHandlerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONArray mutate(JSONArray jSONArray, izs<? super List<Object>, s3q0> izsVar) {
        ArrayList arrayList = new ArrayList(JsonUtilsKt.asList(jSONArray));
        izsVar.invoke(arrayList);
        return new JSONArray((Collection) arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateVariable(final Div2View div2View, String str, ExpressionResolver expressionResolver, final izs<? super JSONArray, ? extends JSONArray> izsVar) {
        VariableMutationHandler.Companion.setVariable(div2View, str, expressionResolver, new izs<Variable, Variable>() { // from class: com.yandex.div.core.actions.DivActionTypedArrayMutationHandlerKt$updateVariable$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // xsna.izs
            public final Variable invoke(Variable variable) {
                if (!(variable instanceof Variable.ArrayVariable)) {
                    DivActionTypedUtilsKt.logError(Div2View.this.getView(), new IllegalArgumentException("Action requires array variable"));
                    return variable;
                }
                Object value = variable.getValue();
                JSONArray jSONArray = value instanceof JSONArray ? (JSONArray) value : null;
                if (jSONArray == null) {
                    DivActionTypedUtilsKt.logError(Div2View.this.getView(), new IllegalArgumentException("Invalid variable value"));
                    return variable;
                }
                ((Variable.ArrayVariable) variable).set(izsVar.invoke(jSONArray));
                return variable;
            }
        });
    }
}
