package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.types.Color;
import java.util.List;
import kotlin.KotlinNothingValueException;
import xsna.e43;

/* compiled from: DictFunctions.kt */
/* loaded from: classes7.dex */
public abstract class DictOptColorWithStringFallback extends Function {
    private final List<FunctionArgument> declaredArgs;
    private final boolean isPure;
    private final EvaluableType resultType;

    public DictOptColorWithStringFallback() {
        EvaluableType evaluableType = EvaluableType.STRING;
        this.declaredArgs = e43.l(new FunctionArgument(evaluableType, false, 2, null), new FunctionArgument(EvaluableType.DICT, false, 2, null), new FunctionArgument(evaluableType, true));
        this.resultType = EvaluableType.COLOR;
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        String str = (String) list.get(0);
        Object evaluateSafe$default = DictFunctionsKt.evaluateSafe$default(list, str, false, 4, null);
        Color safeConvertToColor = ArrayFunctionsKt.safeConvertToColor(evaluateSafe$default instanceof String ? (String) evaluateSafe$default : null);
        if (safeConvertToColor != null) {
            return safeConvertToColor;
        }
        Color safeConvertToColor2 = ArrayFunctionsKt.safeConvertToColor(str);
        if (safeConvertToColor2 != null) {
            return safeConvertToColor2;
        }
        DictFunctionsKt.throwDictException(getName(), list, "Unable to convert value to Color, expected format #AARRGGBB.");
        throw new KotlinNothingValueException();
    }

    @Override // com.yandex.div.evaluable.Function
    public List<FunctionArgument> getDeclaredArgs() {
        return this.declaredArgs;
    }

    @Override // com.yandex.div.evaluable.Function
    public EvaluableType getResultType() {
        return this.resultType;
    }

    @Override // com.yandex.div.evaluable.Function
    public boolean isPure() {
        return this.isPure;
    }
}
