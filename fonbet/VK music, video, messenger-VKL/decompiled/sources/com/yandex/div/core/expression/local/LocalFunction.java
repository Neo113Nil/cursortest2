package com.yandex.div.core.expression.local;

import com.yandex.div.core.expression.variables.ConstantsProvider;
import com.yandex.div.core.expression.variables.VariableAndConstantController;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Evaluator;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.LinkedHashMap;
import java.util.List;
import xsna.e43;

/* compiled from: LocalFunction.kt */
/* loaded from: classes7.dex */
public final class LocalFunction extends Function {
    private final List<String> argNames;
    private final List<FunctionArgument> declaredArgs;
    private final Evaluable evaluable;
    private final boolean isPure;
    private final String name;
    private final EvaluableType resultType;

    public LocalFunction(String str, List<FunctionArgument> list, EvaluableType evaluableType, List<String> list2, String str2) {
        this.name = str;
        this.declaredArgs = list;
        this.resultType = evaluableType;
        this.argNames = list2;
        this.evaluable = Evaluable.Companion.lazy(str2);
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM, reason: not valid java name */
    public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        for (Object obj : this.argNames) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            linkedHashMap.put((String) obj, list.get(i));
            i = i2;
        }
        return new Evaluator(new EvaluationContext(new VariableAndConstantController((VariableController) evaluationContext.getVariableProvider(), new ConstantsProvider(linkedHashMap)), evaluationContext.getStoredValueProvider(), evaluationContext.getFunctionProvider(), evaluationContext.getWarningSender())).eval(this.evaluable);
    }

    @Override // com.yandex.div.evaluable.Function
    public List<FunctionArgument> getDeclaredArgs() {
        return this.declaredArgs;
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return this.name;
    }

    @Override // com.yandex.div.evaluable.Function
    public EvaluableType getResultType() {
        return this.resultType;
    }

    @Override // com.yandex.div.evaluable.Function
    public boolean isPure() {
        return this.isPure;
    }
}
