package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Evaluator;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.internal.Token;
import java.util.Collections;
import java.util.List;
import xsna.e43;

/* compiled from: IntegerArithmeticFunctions.kt */
/* loaded from: classes7.dex */
public final class IntegerMul extends Function {
    private static final List<FunctionArgument> declaredArgs;
    private static final boolean isPure;
    private static final EvaluableType resultType;
    public static final IntegerMul INSTANCE = new IntegerMul();
    private static final String name = "mul";

    static {
        EvaluableType evaluableType = EvaluableType.INTEGER;
        declaredArgs = Collections.singletonList(new FunctionArgument(evaluableType, true));
        resultType = evaluableType;
        isPure = true;
    }

    private IntegerMul() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [com.yandex.div.evaluable.Evaluator$Companion] */
    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        Long l = 0L;
        int i = 0;
        for (Long l2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            long longValue = l.longValue();
            if (i != 0) {
                l2 = Evaluator.Companion.evalFactor$div_evaluable(Token.Operator.Binary.Factor.Multiplication.INSTANCE, Long.valueOf(longValue), l2);
            }
            l = l2;
            l.longValue();
            i = i2;
        }
        return l;
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
