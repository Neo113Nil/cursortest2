package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.List;
import xsna.e43;
import xsna.fw3;

/* compiled from: StringFunctions.kt */
/* loaded from: classes7.dex */
public final class PadEndInteger extends Function {
    private static final List<FunctionArgument> declaredArgs;
    private static final boolean isPure;
    private static final EvaluableType resultType;
    public static final PadEndInteger INSTANCE = new PadEndInteger();
    private static final String name = "padEnd";

    static {
        EvaluableType evaluableType = EvaluableType.INTEGER;
        FunctionArgument functionArgument = new FunctionArgument(evaluableType, false, 2, null);
        FunctionArgument functionArgument2 = new FunctionArgument(evaluableType, false, 2, null);
        EvaluableType evaluableType2 = EvaluableType.STRING;
        declaredArgs = e43.l(functionArgument, functionArgument2, new FunctionArgument(evaluableType2, false, 2, null));
        resultType = evaluableType2;
        isPure = true;
    }

    private PadEndInteger() {
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        String valueOf = String.valueOf(((Long) list.get(0)).longValue());
        long longValue = ((Long) list.get(1)).longValue();
        String str = (String) list.get(2);
        long length = longValue - valueOf.length();
        StringBuilder e = fw3.e(valueOf);
        e.append(StringFunctionsKt.m154buildRepeatableStringzbMA7A(evaluationContext, evaluable, (int) length, str));
        return e.toString();
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
