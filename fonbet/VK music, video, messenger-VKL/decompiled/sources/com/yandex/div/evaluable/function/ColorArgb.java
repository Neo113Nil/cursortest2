package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.types.Color;
import java.util.List;
import kotlin.KotlinNothingValueException;
import xsna.e43;

/* compiled from: ColorFunctions.kt */
/* loaded from: classes7.dex */
public final class ColorArgb extends Function {
    private static final List<FunctionArgument> declaredArgs;
    private static final boolean isPure;
    private static final EvaluableType resultType;
    public static final ColorArgb INSTANCE = new ColorArgb();
    private static final String name = "argb";

    static {
        EvaluableType evaluableType = EvaluableType.NUMBER;
        declaredArgs = e43.l(new FunctionArgument(evaluableType, false, 2, null), new FunctionArgument(evaluableType, false, 2, null), new FunctionArgument(evaluableType, false, 2, null), new FunctionArgument(evaluableType, false, 2, null));
        resultType = EvaluableType.COLOR;
        isPure = true;
    }

    private ColorArgb() {
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        try {
            return Color.m184boximpl(Color.Companion.m193argbH0kstlE(ColorFunctionsKt.toColorIntComponentValue(((Double) list.get(0)).doubleValue()), ColorFunctionsKt.toColorIntComponentValue(((Double) list.get(1)).doubleValue()), ColorFunctionsKt.toColorIntComponentValue(((Double) list.get(2)).doubleValue()), ColorFunctionsKt.toColorIntComponentValue(((Double) list.get(3)).doubleValue())));
        } catch (IllegalArgumentException unused) {
            EvaluableExceptionKt.throwExceptionOnFunctionEvaluationFailed$default(getName(), list, "Value out of range 0..1.", null, 8, null);
            throw new KotlinNothingValueException();
        }
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
