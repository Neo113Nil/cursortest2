package com.yandex.div.core.expression.variables;

import com.yandex.div.data.Variable;
import xsna.izs;
import xsna.s3q0;

/* compiled from: MultiVariableSource.kt */
/* loaded from: classes7.dex */
public class MultiVariableSource implements VariableSource {
    private final DivVariableController variableController;
    private final izs<String, s3q0> variableRequestObserver;

    /* JADX WARN: Multi-variable type inference failed */
    public MultiVariableSource(DivVariableController divVariableController, izs<? super String, s3q0> izsVar) {
        this.variableController = divVariableController;
        this.variableRequestObserver = izsVar;
    }

    @Override // com.yandex.div.core.expression.variables.VariableSource
    public Variable getMutableVariable(String str) {
        this.variableRequestObserver.invoke(str);
        return this.variableController.get(str);
    }

    @Override // com.yandex.div.core.expression.variables.VariableSource
    public void observeDeclaration(DeclarationObserver declarationObserver) {
        this.variableController.addDeclarationObserver$div_release(declarationObserver);
    }

    @Override // com.yandex.div.core.expression.variables.VariableSource
    public void observeVariables(izs<? super Variable, s3q0> izsVar) {
        this.variableController.addVariableObserver$div_release(izsVar);
    }

    @Override // com.yandex.div.core.expression.variables.VariableSource
    public void receiveVariablesUpdates(izs<? super Variable, s3q0> izsVar) {
        this.variableController.receiveVariablesUpdates$div_release(izsVar);
    }

    @Override // com.yandex.div.core.expression.variables.VariableSource
    public void removeDeclarationObserver(DeclarationObserver declarationObserver) {
        this.variableController.removeDeclarationObserver$div_release(declarationObserver);
    }

    @Override // com.yandex.div.core.expression.variables.VariableSource
    public void removeVariablesObserver(izs<? super Variable, s3q0> izsVar) {
        this.variableController.removeVariablesObserver$div_release(izsVar);
    }
}
