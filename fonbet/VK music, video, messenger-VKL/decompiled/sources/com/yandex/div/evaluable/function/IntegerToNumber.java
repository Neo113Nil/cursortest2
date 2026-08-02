package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.Collections;
import java.util.List;
import xsna.j5g;

/* compiled from: ToNumber.kt */
/* loaded from: classes7.dex */
public final class IntegerToNumber extends Function {
    public static final IntegerToNumber INSTANCE = new IntegerToNumber();
    private static final String name = "toNumber";
    private static final List<FunctionArgument> declaredArgs = Collections.singletonList(new FunctionArgument(EvaluableType.INTEGER, false, 2, null));
    private static final EvaluableType resultType = EvaluableType.NUMBER;
    private static final boolean isPure = true;

    private IntegerToNumber() {
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        return Double.valueOf(((Long) j5g.Y(list)).longValue());
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
}
