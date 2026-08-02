package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: IntegerArithmeticFunctions.kt */
/* loaded from: classes7.dex */
public final class IntegerMinValue extends Function {
    public static final IntegerMinValue INSTANCE = new IntegerMinValue();
    private static final String name = "minInteger";
    private static final List<FunctionArgument> declaredArgs = EmptyList.b;
    private static final EvaluableType resultType = EvaluableType.INTEGER;
    private static final boolean isPure = true;

    private IntegerMinValue() {
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public /* bridge */ /* synthetic */ Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List list) {
        return mo114evaluateex6DHhM(evaluationContext, evaluable, (List<? extends Object>) list);
    }

    @Override // com.yandex.div.evaluable.Function
    public List<FunctionArgument> getDeclaredArgs() {
        return declaredArgs;
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }

    @Override // com.yandex.div.evaluable.Function
    public EvaluableType getResultType() {
        return resultType;
    }

    @Override // com.yandex.div.evaluable.Function
    public boolean isPure() {
        return isPure;
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public Long mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        return Long.MIN_VALUE;
    }
}
