package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.types.DateTime;
import java.util.Collections;
import java.util.List;

/* compiled from: DateTimeFunctions.kt */
/* loaded from: classes7.dex */
public final class GetDayOfWeek extends Function {
    public static final GetDayOfWeek INSTANCE = new GetDayOfWeek();
    private static final String name = "getDayOfWeek";
    private static final List<FunctionArgument> declaredArgs = Collections.singletonList(new FunctionArgument(EvaluableType.DATETIME, false, 2, null));
    private static final EvaluableType resultType = EvaluableType.INTEGER;
    private static final boolean isPure = true;

    private GetDayOfWeek() {
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) throws EvaluableException {
        int i = DateTimeFunctionsKt.toCalendar((DateTime) list.get(0)).get(7) - 1;
        return Long.valueOf(i == 0 ? 7L : i);
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
