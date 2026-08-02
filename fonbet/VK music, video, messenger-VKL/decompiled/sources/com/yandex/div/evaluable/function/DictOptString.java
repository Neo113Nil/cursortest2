package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.List;
import xsna.e43;

/* compiled from: DictFunctions.kt */
/* loaded from: classes7.dex */
public abstract class DictOptString extends Function {
    private final List<FunctionArgument> declaredArgs;
    private final boolean isPure;
    private final EvaluableType resultType;

    public DictOptString() {
        EvaluableType evaluableType = EvaluableType.STRING;
        this.declaredArgs = e43.l(new FunctionArgument(evaluableType, false, 2, null), new FunctionArgument(EvaluableType.DICT, false, 2, null), new FunctionArgument(evaluableType, true));
        this.resultType = evaluableType;
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        String str = (String) list.get(0);
        Object evaluateSafe$default = DictFunctionsKt.evaluateSafe$default(list, str, false, 4, null);
        String str2 = evaluateSafe$default instanceof String ? (String) evaluateSafe$default : null;
        return str2 == null ? str : str2;
    }

    @Override // com.yandex.div.evaluable.Function
    public List<FunctionArgument> getDeclaredArgs() {
        return this.declaredArgs;
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
