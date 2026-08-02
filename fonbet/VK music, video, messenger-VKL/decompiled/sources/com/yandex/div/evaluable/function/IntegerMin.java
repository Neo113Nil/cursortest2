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

/* compiled from: IntegerArithmeticFunctions.kt */
/* loaded from: classes7.dex */
public final class IntegerMin extends Function {
    private static final List<FunctionArgument> declaredArgs;
    private static final boolean isPure;
    private static final EvaluableType resultType;
    public static final IntegerMin INSTANCE = new IntegerMin();
    private static final String name = UcumUtils.UCUM_MINUTES;

    static {
        EvaluableType evaluableType = EvaluableType.INTEGER;
        declaredArgs = Collections.singletonList(new FunctionArgument(evaluableType, true));
        resultType = evaluableType;
        isPure = true;
    }

    private IntegerMin() {
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        if (list.isEmpty()) {
            EvaluableExceptionKt.throwExceptionOnFunctionEvaluationFailed$default(getName(), list, "Function requires non empty argument list.", null, 8, null);
            throw new KotlinNothingValueException();
        }
        Long l = Long.MAX_VALUE;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            l = Long.valueOf(Math.min(l.longValue(), ((Long) it.next()).longValue()));
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
