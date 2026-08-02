package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.types.Url;
import java.util.List;
import xsna.e43;

/* compiled from: VariableFunctions.kt */
/* loaded from: classes7.dex */
public final class GetUrlValueWithUrlFallback extends Function {
    private static final List<FunctionArgument> declaredArgs;
    private static final boolean isPure = false;
    private static final EvaluableType resultType;
    public static final GetUrlValueWithUrlFallback INSTANCE = new GetUrlValueWithUrlFallback();
    private static final String name = "getUrlValue";

    static {
        FunctionArgument functionArgument = new FunctionArgument(EvaluableType.STRING, false, 2, null);
        EvaluableType evaluableType = EvaluableType.URL;
        declaredArgs = e43.l(functionArgument, new FunctionArgument(evaluableType, false, 2, null));
        resultType = evaluableType;
    }

    private GetUrlValueWithUrlFallback() {
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        Object obj = evaluationContext.getVariableProvider().get((String) list.get(0));
        String m201unboximpl = obj instanceof Url ? ((Url) obj).m201unboximpl() : null;
        return m201unboximpl != null ? Url.m195boximpl(m201unboximpl) : (Url) list.get(1);
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
