package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.types.Url;
import java.util.List;
import xsna.e43;

/* compiled from: DictFunctions.kt */
/* loaded from: classes7.dex */
public abstract class DictOptUrlWithUrlFallback extends Function {
    private final List<FunctionArgument> declaredArgs;
    private final boolean isPure;
    private final EvaluableType resultType;

    public DictOptUrlWithUrlFallback() {
        EvaluableType evaluableType = EvaluableType.URL;
        this.declaredArgs = e43.l(new FunctionArgument(evaluableType, false, 2, null), new FunctionArgument(EvaluableType.DICT, false, 2, null), new FunctionArgument(EvaluableType.STRING, true));
        this.resultType = evaluableType;
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        String safeConvertToUrl;
        String m201unboximpl = ((Url) list.get(0)).m201unboximpl();
        Object evaluateSafe$default = DictFunctionsKt.evaluateSafe$default(list, Url.m195boximpl(m201unboximpl), false, 4, null);
        String str = evaluateSafe$default instanceof String ? (String) evaluateSafe$default : null;
        return (str == null || (safeConvertToUrl = ArrayFunctionsKt.safeConvertToUrl(str)) == null) ? Url.m195boximpl(m201unboximpl) : Url.m195boximpl(safeConvertToUrl);
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
