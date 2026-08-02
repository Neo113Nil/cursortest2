package com.yandex.div.core.expression.variables;

import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.data.Variable;
import com.yandex.div.evaluable.VariableProvider;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.izs;
import xsna.s3q0;

/* compiled from: VariableController.kt */
/* loaded from: classes7.dex */
public interface VariableController extends VariableProvider {
    static /* synthetic */ Disposable subscribeToVariablesChange$default(VariableController variableController, List list, boolean z, izs izsVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: subscribeToVariablesChange");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return variableController.subscribeToVariablesChange(list, z, izsVar);
    }

    default List<Variable> captureAll() {
        return EmptyList.b;
    }

    void cleanupSubscriptions();

    void declare(Variable variable);

    Variable getMutableVariable(String str);

    void restoreSubscriptions();

    void setOnAnyVariableChangeCallback(ExpressionResolver expressionResolver, izs<? super Variable, s3q0> izsVar);

    Disposable subscribeToVariableChange(String str, ErrorCollector errorCollector, boolean z, izs<? super Variable, s3q0> izsVar);

    Disposable subscribeToVariablesChange(List<String> list, boolean z, izs<? super Variable, s3q0> izsVar);

    Disposable subscribeToVariablesUndeclared(List<String> list, izs<? super Variable, s3q0> izsVar);
}
