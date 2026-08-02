package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.types.Color;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Result;
import xsna.e43;

/* compiled from: DictFunctions.kt */
/* loaded from: classes7.dex */
public abstract class ColorFromDict extends Function {
    private final boolean isMethod;
    private final boolean isPure;
    private final List<FunctionArgument> declaredArgs = e43.l(new FunctionArgument(EvaluableType.DICT, false, 2, null), new FunctionArgument(EvaluableType.STRING, true));
    private final EvaluableType resultType = EvaluableType.COLOR;

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        Object failure;
        Object evaluate = DictFunctionsKt.evaluate(getName(), list, isMethod());
        if (!(evaluate instanceof String)) {
            DictFunctionsKt.throwWrongTypeException(getName(), list, getResultType(), evaluate, isMethod());
            throw new KotlinNothingValueException();
        }
        try {
            failure = Color.m184boximpl(Color.Companion.m194parseC4zCDoM((String) evaluate));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (Result.a(failure) == null) {
            return failure;
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

    public boolean isMethod() {
        return this.isMethod;
    }

    @Override // com.yandex.div.evaluable.Function
    public boolean isPure() {
        return this.isPure;
    }
}
