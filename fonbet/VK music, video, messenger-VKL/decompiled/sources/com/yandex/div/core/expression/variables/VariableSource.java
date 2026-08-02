package com.yandex.div.core.expression.variables;

import com.yandex.div.data.Variable;
import xsna.izs;
import xsna.s3q0;

/* compiled from: VariableSource.kt */
/* loaded from: classes7.dex */
public interface VariableSource {
    Variable getMutableVariable(String str);

    void observeDeclaration(DeclarationObserver declarationObserver);

    void observeVariables(izs<? super Variable, s3q0> izsVar);

    void receiveVariablesUpdates(izs<? super Variable, s3q0> izsVar);

    void removeDeclarationObserver(DeclarationObserver declarationObserver);

    void removeVariablesObserver(izs<? super Variable, s3q0> izsVar);
}
