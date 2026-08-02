package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.types.Url;
import java.util.List;
import kotlin.KotlinNothingValueException;
import xsna.e43;

/* compiled from: DictFunctions.kt */
/* loaded from: classes7.dex */
public abstract class DictOptUrlWithStringFallback extends Function {
    private final List<FunctionArgument> declaredArgs;
    private final boolean isPure;
    private final EvaluableType resultType;

    public DictOptUrlWithStringFallback() {
        EvaluableType evaluableType = EvaluableType.STRING;
        this.declaredArgs = e43.l(new FunctionArgument(evaluableType, false, 2, null), new FunctionArgument(EvaluableType.DICT, false, 2, null), new FunctionArgument(evaluableType, true));
        this.resultType = EvaluableType.URL;
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        String str = (String) list.get(0);
        Object evaluateSafe$default = DictFunctionsKt.evaluateSafe$default(list, str, false, 4, null);
        String safeConvertToUrl = ArrayFunctionsKt.safeConvertToUrl(evaluateSafe$default instanceof String ? (String) evaluateSafe$default : null);
        if (safeConvertToUrl != null) {
            return Url.m195boximpl(safeConvertToUrl);
        }
        String safeConvertToUrl2 = ArrayFunctionsKt.safeConvertToUrl(str);
        if (safeConvertToUrl2 != null) {
            return Url.m195boximpl(safeConvertToUrl2);
        }
        DictFunctionsKt.throwDictException(getName(), list, "Unable to convert value to Url.");
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
