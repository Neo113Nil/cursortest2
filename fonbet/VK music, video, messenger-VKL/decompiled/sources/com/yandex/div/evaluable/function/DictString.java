package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.List;
import kotlin.KotlinNothingValueException;
import xsna.e43;

/* compiled from: DictFunctions.kt */
/* loaded from: classes7.dex */
public abstract class DictString extends Function {
    private final List<FunctionArgument> declaredArgs;
    private final boolean isMethod;
    private final boolean isPure;
    private final EvaluableType resultType;

    public DictString() {
        FunctionArgument functionArgument = new FunctionArgument(EvaluableType.DICT, false, 2, null);
        EvaluableType evaluableType = EvaluableType.STRING;
        this.declaredArgs = e43.l(functionArgument, new FunctionArgument(evaluableType, true));
        this.resultType = evaluableType;
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        Object evaluate = DictFunctionsKt.evaluate(getName(), list, isMethod());
        String str = evaluate instanceof String ? (String) evaluate : null;
        if (str != null) {
            return str;
        }
        DictFunctionsKt.throwWrongTypeException(getName(), list, getResultType(), evaluate, isMethod());
        throw new KotlinNothingValueException();
    }

    @Override // com.yandex.div.evaluable.Function
    public List<FunctionArgument> getDeclaredArgs() {
        return this.declaredArgs;
    }

    @Override // com.yandex.div.evaluable.Function
    public EvaluableType getResultType() {
        return this.resultType;
    }

    public boolean isMethod() {
        return this.isMethod;
    }

    @Override // com.yandex.div.evaluable.Function
    public boolean isPure() {
        return this.isPure;
    }
}
