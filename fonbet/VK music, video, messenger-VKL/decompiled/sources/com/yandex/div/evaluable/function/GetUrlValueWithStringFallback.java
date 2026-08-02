package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.types.Url;
import java.util.List;
import kotlin.KotlinNothingValueException;
import xsna.e43;

/* compiled from: VariableFunctions.kt */
/* loaded from: classes7.dex */
public final class GetUrlValueWithStringFallback extends Function {
    private static final List<FunctionArgument> declaredArgs;
    private static final boolean isPure = false;
    private static final EvaluableType resultType;
    public static final GetUrlValueWithStringFallback INSTANCE = new GetUrlValueWithStringFallback();
    private static final String name = "getUrlValue";

    static {
        EvaluableType evaluableType = EvaluableType.STRING;
        declaredArgs = e43.l(new FunctionArgument(evaluableType, false, 2, null), new FunctionArgument(evaluableType, false, 2, null));
        resultType = EvaluableType.URL;
    }

    private GetUrlValueWithStringFallback() {
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        String str = (String) list.get(0);
        String str2 = (String) list.get(1);
        Object obj = evaluationContext.getVariableProvider().get(str);
        String m201unboximpl = obj instanceof Url ? ((Url) obj).m201unboximpl() : null;
        if (m201unboximpl != null) {
            return Url.m195boximpl(m201unboximpl);
        }
        String safeConvertToUrl = ArrayFunctionsKt.safeConvertToUrl(str2);
        if (safeConvertToUrl != null) {
            return Url.m195boximpl(safeConvertToUrl);
        }
        EvaluableExceptionKt.throwExceptionOnFunctionEvaluationFailed$default(getName(), list, "Unable to convert value to Url.", null, 8, null);
        throw new KotlinNothingValueException();
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
