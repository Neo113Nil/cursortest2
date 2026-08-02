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
public abstract class DictOptInteger extends Function {
    private final List<FunctionArgument> declaredArgs;
    private final boolean isPure;
    private final EvaluableType resultType;

    public DictOptInteger() {
        EvaluableType evaluableType = EvaluableType.INTEGER;
        this.declaredArgs = e43.l(new FunctionArgument(evaluableType, false, 2, null), new FunctionArgument(EvaluableType.DICT, false, 2, null), new FunctionArgument(EvaluableType.STRING, true));
        this.resultType = evaluableType;
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        Long l = (Long) list.get(0);
        long longValue = l.longValue();
        Object evaluateSafe$default = DictFunctionsKt.evaluateSafe$default(list, l, false, 4, null);
        if (evaluateSafe$default instanceof Integer) {
            longValue = ((Number) evaluateSafe$default).intValue();
        } else if (evaluateSafe$default instanceof Long) {
            longValue = ((Number) evaluateSafe$default).longValue();
        }
        return Long.valueOf(longValue);
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
