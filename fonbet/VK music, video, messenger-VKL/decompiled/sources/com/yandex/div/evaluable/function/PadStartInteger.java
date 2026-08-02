package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.List;
import xsna.e43;
import xsna.i5s;

/* compiled from: StringFunctions.kt */
/* loaded from: classes7.dex */
public final class PadStartInteger extends Function {
    private static final List<FunctionArgument> declaredArgs;
    private static final boolean isPure;
    private static final EvaluableType resultType;
    public static final PadStartInteger INSTANCE = new PadStartInteger();
    private static final String name = "padStart";

    static {
        EvaluableType evaluableType = EvaluableType.INTEGER;
        FunctionArgument functionArgument = new FunctionArgument(evaluableType, false, 2, null);
        FunctionArgument functionArgument2 = new FunctionArgument(evaluableType, false, 2, null);
        EvaluableType evaluableType2 = EvaluableType.STRING;
        declaredArgs = e43.l(functionArgument, functionArgument2, new FunctionArgument(evaluableType2, false, 2, null));
        resultType = evaluableType2;
        isPure = true;
    }

    private PadStartInteger() {
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        return i5s.a(new StringBuilder(), StringFunctionsKt.m154buildRepeatableStringzbMA7A(evaluationContext, evaluable, (int) (((Long) list.get(1)).longValue() - r0.length()), (String) list.get(2)), String.valueOf(((Long) list.get(0)).longValue()));
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
