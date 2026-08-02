package com.yandex.div.core.expression.variables;

import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.data.Variable;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.List;
import xsna.izs;
import xsna.s3q0;

/* compiled from: VariableAndConstantController.kt */
/* loaded from: classes7.dex */
public final class VariableAndConstantController implements VariableController {
    private final ConstantsProvider constants;
    private final VariableController delegate;

    public VariableAndConstantController(VariableController variableController, ConstantsProvider constantsProvider) {
        this.delegate = variableController;
        this.constants = constantsProvider;
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    public void declare(Variable variable) {
        this.delegate.declare(variable);
    }

    @Override // com.yandex.div.evaluable.VariableProvider
    public Object get(String str) {
        Object wrapVariableValue = VariableControllerKt.wrapVariableValue(this.constants.get(str));
        return wrapVariableValue == null ? this.delegate.get(str) : wrapVariableValue;
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    public Variable getMutableVariable(String str) {
        return this.delegate.getMutableVariable(str);
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    public void setOnAnyVariableChangeCallback(ExpressionResolver expressionResolver, izs<? super Variable, s3q0> izsVar) {
        this.delegate.setOnAnyVariableChangeCallback(expressionResolver, izsVar);
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    public Disposable subscribeToVariableChange(String str, ErrorCollector errorCollector, boolean z, izs<? super Variable, s3q0> izsVar) {
        return this.delegate.subscribeToVariableChange(str, errorCollector, z, izsVar);
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    public Disposable subscribeToVariablesChange(List<String> list, boolean z, izs<? super Variable, s3q0> izsVar) {
        return this.delegate.subscribeToVariablesChange(list, z, izsVar);
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    public Disposable subscribeToVariablesUndeclared(List<String> list, izs<? super Variable, s3q0> izsVar) {
        return Disposable.NULL;
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    public void cleanupSubscriptions() {
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    public void restoreSubscriptions() {
    }
}
