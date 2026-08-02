package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.List;
import kotlin.KotlinNothingValueException;
import xsna.e43;
import xsna.j5g;

/* compiled from: IntegerArithmeticFunctions.kt */
/* loaded from: classes7.dex */
public final class IntegerCopySign extends Function {
    private static final List<FunctionArgument> declaredArgs;
    private static final boolean isPure;
    private static final EvaluableType resultType;
    public static final IntegerCopySign INSTANCE = new IntegerCopySign();
    private static final String name = "copySign";

    static {
        EvaluableType evaluableType = EvaluableType.INTEGER;
        declaredArgs = e43.l(new FunctionArgument(evaluableType, false, 2, null), new FunctionArgument(evaluableType, false, 2, null));
        resultType = evaluableType;
        isPure = true;
    }

    private IntegerCopySign() {
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        Long l = (Long) j5g.Y(list);
        long longValue = l.longValue();
        int signum = Long.signum(((Long) j5g.i0(list)).longValue());
        if (signum == 0) {
            return l;
        }
        if (longValue != Long.MIN_VALUE) {
            return Long.valueOf(Math.abs(longValue) * signum);
        }
        if (signum == -1) {
            return l;
        }
        EvaluableExceptionKt.throwExceptionOnFunctionEvaluationFailed$default(getName(), list, "Integer overflow.", null, 8, null);
        throw new KotlinNothingValueException();
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
