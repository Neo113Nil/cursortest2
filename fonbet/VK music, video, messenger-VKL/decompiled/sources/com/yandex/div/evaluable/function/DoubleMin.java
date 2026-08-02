package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.j5g;

/* compiled from: NumberArithmeticFunctions.kt */
/* loaded from: classes7.dex */
public final class DoubleMin extends Function {
    private static final List<FunctionArgument> declaredArgs;
    private static final boolean isPure;
    private static final EvaluableType resultType;
    public static final DoubleMin INSTANCE = new DoubleMin();
    private static final String name = UcumUtils.UCUM_MINUTES;

    static {
        EvaluableType evaluableType = EvaluableType.NUMBER;
        declaredArgs = Collections.singletonList(new FunctionArgument(evaluableType, true));
        resultType = evaluableType;
        isPure = true;
    }

    private DoubleMin() {
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        if (list.isEmpty()) {
            EvaluableExceptionKt.throwExceptionOnFunctionEvaluationFailed$default(getName(), list, "Function requires non empty argument list.", null, 8, null);
            throw new KotlinNothingValueException();
        }
        Object Y = j5g.Y(list);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Y = Double.valueOf(Math.min(((Double) Y).doubleValue(), ((Double) it.next()).doubleValue()));
        }
        return Y;
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
